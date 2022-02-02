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
			searchDirectoriesMultiThread();
			
		}
	/*End: constructors.*/
	
	
	
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
		processToUser.scheduleAtFixedRate(systemPathTimerTask, 0, 10000);
		
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
	
	
	
	protected void searchDirectoriesMultiThread() throws InterruptedException
	{
		int
		unfinishedParentDirectoriesSize,
		allActiveThreadSearchesSize,
		allCollectedSystemPathsSize;
		
		List<ThreadSearcher>
		allActiveThreadSearches;
		
		
		
		
		
		allActiveThreadSearches = new ArrayList<ThreadSearcher>();
		unfinishedParentDirectoriesSize = unfinishedParentDirectories.size();
		

		
		for(int i = 0; i < unfinishedParentDirectoriesSize && i < allocatedProcessors; i++)
		{
			SystemPath
			currentParentDirectory;
			
			ThreadSearcher
			currentThreadSearcher;
			
			
			
			currentParentDirectory = unfinishedParentDirectories.get(i);
			
			
			
			
			
			currentThreadSearcher = new ThreadSearcher(currentParentDirectory);
			
			allActiveThreadSearches.add(currentThreadSearcher);
		
		}
		
		
		
		allActiveThreadSearchesSize = allActiveThreadSearches.size();

		
		
		for(int i = 0; i < allActiveThreadSearchesSize; i++)
		{
			unfinishedParentDirectories.remove(0);
			
		}
		
		
		
		for(int i = 0; i < allActiveThreadSearchesSize; i++)
		{
			allActiveThreadSearches.get(i).start();
		
		}
		
		
		
		for(int i1 = 0; i1 < allActiveThreadSearchesSize; i1++)
		{
			List<SystemPath>
			childrenPaths;
			
			int
			childrenPathsSize;
			
			
			
			allActiveThreadSearches.get(i1).join();
			childrenPaths = allActiveThreadSearches.get(i1).getChildren();
			allActiveThreadSearches.get(i1).interrupt();
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
		
		
		
		unfinishedParentDirectoriesSize = unfinishedParentDirectories.size();

		if(unfinishedParentDirectoriesSize > 0)
		{
			searchDirectoriesMultiThread();
			
		}
		
		
		
	}
	
}