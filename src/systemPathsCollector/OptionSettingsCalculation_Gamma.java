package systemPathsCollector;



import java.io.File;
import java.util.*;



public class OptionSettingsCalculation_Gamma extends OptionSettingsCalculation_Beta implements ContainerAndOptions
{
	/*Start: global variables.*/
		protected int
		maximumThreadNumbers,
		systemThreadNumbers,
		allocatedProcessors;
	
		protected ArrayList<SystemPath>
		unfinishedParentDirectories;
		
		protected List<ThreadSearcher>
		allActiveThreadSearches;
	/*End: global variables.*/
	
	
	
	/*Start: constructors.*/
		OptionSettingsCalculation_Gamma()
		{}
		
		OptionSettingsCalculation_Gamma(List<List> systemPathOptions_Beta, int maximumThreadNumbers)  throws InterruptedException
		{
			allCollectedSystemPaths = new ArrayList<SystemPath>();
			setGlobalSettingVariables_Beta(systemPathOptions_Beta);
			setStartDirectories();
			setGlobalSettingVariables_Gamma(maximumThreadNumbers);
			setTimers();
			setThreads();
			checkStillEmptyParentDirectories();
			
		}
	/*End: constructors.*/
	
	
	protected void setThreads()
	{
		allActiveThreadSearches = new ArrayList<ThreadSearcher>();
		
		
		
		for(int i = 0; i < allocatedProcessors; i++)
		{
			ThreadSearcher
			currentThreadSearcher;
			
			
			
			currentThreadSearcher = new ThreadSearcher();
			
			allActiveThreadSearches.add(currentThreadSearcher);
			
		}
		
	}
	
	protected void setTimers()
	{
		boolean
		usingExtraThreads;
		
		
		
		if(allocatedProcessors > 1)
		{
			usingExtraThreads = true;
			
		}
		else
		{
			usingExtraThreads = false;
			
		}
		
		
		
		processToUser = new Timer();
		systemPathTimerTask = new SystemPathTimerTask(usingExtraThreads, allocatedProcessors);
		processToUser.scheduleAtFixedRate(systemPathTimerTask, 10000, 10000);
		
	}
	
	
	
	protected void setGlobalSettingVariables_Gamma(int maximumThreadNumbers)
	{
		int
		allocatedProcessors;
		
		
		
		this.maximumThreadNumbers = maximumThreadNumbers;
		this.systemThreadNumbers = Runtime.getRuntime().availableProcessors();
		
		allocatedProcessors = 0;
		
		for(int i = 0; i < maximumThreadNumbers && i < systemThreadNumbers; i++)
		{
			++allocatedProcessors;
			
		}
		
		this.allocatedProcessors = allocatedProcessors;
		unfinishedParentDirectories = new ArrayList <SystemPath>();

		
		
		for(int i = 0; i < startDirectories.size(); i++)
		{
			SystemPath
			currentSystemPath;
			
			File
			currentFile;
			
			boolean
			proceedWithSystemPath;
			
			
			
			currentFile = startDirectories.get(i);
			currentSystemPath = new SystemPath(currentFile);
			proceedWithSystemPath = checkApprovedSystemPath(currentSystemPath);
			
			if(proceedWithSystemPath)
			{
				addToAllCollectedSystemPaths(currentSystemPath);
				
				if(currentSystemPath.getIsDirectory())
				{
					unfinishedParentDirectories.add(currentSystemPath);
					
				}
				
			}
			
		}
		
	}
	
	
	
	protected void checkStillEmptyParentDirectories() throws InterruptedException
	{
		int
		unfinishedParentDirectoriesSize;
		
		
		
		unfinishedParentDirectoriesSize = unfinishedParentDirectories.size();
		
		
		
		while(unfinishedParentDirectoriesSize != 0)
		{
			setThreads();
			searchDirectoriesMultiThread();
			unfinishedParentDirectoriesSize = unfinishedParentDirectories.size();
			
		}
		
		
		
		processToUser.cancel();
		
	}
	
	protected void searchDirectoriesMultiThread() throws InterruptedException
	{
		int
		unfinishedParentDirectoriesSize,
		addedThreadSearches,
		allCollectedSystemPathsSize;
		
		
		
		unfinishedParentDirectoriesSize = unfinishedParentDirectories.size();
		addedThreadSearches = 0;
		

		
		for(int i = 0; i < unfinishedParentDirectoriesSize && i < allocatedProcessors; i++)
		{
			SystemPath
			currentParentDirectory;
			
			
			
			currentParentDirectory = unfinishedParentDirectories.get(i);
			allActiveThreadSearches.get(i).setParentDirectory(currentParentDirectory);
			
			
			
			++addedThreadSearches;
		
		}
		
		
		
		for(int i = 0; i < addedThreadSearches; i++)
		{
			unfinishedParentDirectories.remove(0);
			
		}
		
		
		
		for(int i = 0; i < addedThreadSearches; i++)
		{
			allActiveThreadSearches.get(i).start();
			
		}
		
		
		
		for(int i1 = 0; i1 < addedThreadSearches; i1++)
		{
			List<SystemPath>
			childrenPaths;
			
			int
			childrenPathsSize;
			
			
			
			allActiveThreadSearches.get(i1).join();
			childrenPaths = allActiveThreadSearches.get(i1).getChildren();
			childrenPathsSize = childrenPaths.size();
			
			
			
			for(int i2 = 0; i2 < childrenPathsSize; i2++)
			{
				SystemPath
				currentChildPath;
				
				boolean
				proceedWithSystemPath;
				
				
				
				currentChildPath = childrenPaths.get(i2);
				proceedWithSystemPath = checkApprovedSystemPath(currentChildPath);
				
				if(proceedWithSystemPath)
				{
					boolean
					currentFileIsDirectory;
					
					
					
					addToAllCollectedSystemPaths(currentChildPath);
					currentFileIsDirectory = currentChildPath.getIsDirectory();
					
			
					
					if(currentFileIsDirectory)
					{
						unfinishedParentDirectories.add(currentChildPath);

					}
					
				}
				
			}
			
		}
		
		
		allCollectedSystemPathsSize = allCollectedSystemPaths.size();
		systemPathTimerTask.setListSize(allCollectedSystemPathsSize);
		
	}
	
}