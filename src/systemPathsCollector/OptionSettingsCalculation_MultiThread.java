package systemPathsCollector;



import java.io.*;
import java.util.*;



public class OptionSettingsCalculation_MultiThread extends OptionSettingsCalculation implements OptionsAndSearch
{
	/*Start: global variables.*/
		protected List <SystemPath>
		unfinishedParentDirectories;
		
		protected List <ThreadSearcher>
		allActiveThreadSearches;
	/*End: global variables.*/
	
	
	/*Start: constructors.*/
		OptionSettingsCalculation_MultiThread()
		{}
		
		OptionSettingsCalculation_MultiThread(List<List> settings) throws InterruptedException
		{
			initializeStartValues_OptionSettingsCalculation(settings);
			initializeStartValues_multiThread();
			searchSystem();
			
		}
	/*End: constructors.*/
	
	
	/*Start: class unique methods.*/
		/*Start: initializing new variables.*/
			protected void initializeStartValues_multiThread()
			{
				setUnfinishedParentDirectories();
				
			}
		/*End: initializing new variables.*/
	
		/*Start: searching the system.*/
			protected void setUnfinishedParentDirectories()
			{
				int startDirectoriesSize;
				
				
				startDirectoriesSize = startDirectories.size();
				unfinishedParentDirectories = new ArrayList <SystemPath>();
				
				
				for(int i = 0; i < startDirectoriesSize; i++)
				{
					SystemPath currentSystemPath;
					
					File currentFile;
					
					boolean proceedWithSystemPath;
					
					
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
			
			protected void setThreads()
			{
				allActiveThreadSearches = new ArrayList <ThreadSearcher>();
				
				
				for(int i = 0; i < allocatedProcessors; i++)
				{
					ThreadSearcher currentThreadSearcher;
					
					
					currentThreadSearcher = new ThreadSearcher();
					
					allActiveThreadSearches.add(currentThreadSearcher);
					
				}
				
			}
			
			protected void searchDirectories() throws InterruptedException
			{
				int unfinishedParentDirectoriesSize, addedThreadSearches, allCollectedSystemPathsSize;
				
				
				unfinishedParentDirectoriesSize = unfinishedParentDirectories.size();
				addedThreadSearches = 0;
				
				
				for(int i = 0; i < unfinishedParentDirectoriesSize && i < allocatedProcessors; i++)
				{
					SystemPath currentParentDirectory;
					
					
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
					List <SystemPath> childrenPaths;
					
					int childrenPathsSize;
					
					
					allActiveThreadSearches.get(i1).join();
					childrenPaths = allActiveThreadSearches.get(i1).getChildren();
					childrenPathsSize = childrenPaths.size();
					
					
					for(int i2 = 0; i2 < childrenPathsSize; i2++)
					{
						SystemPath currentChildPath;
						
						boolean proceedWithSystemPath;
						
						
						currentChildPath = childrenPaths.get(i2);
						proceedWithSystemPath = checkApprovedSystemPath(currentChildPath);
						
						if(proceedWithSystemPath)
						{
							boolean currentFileIsDirectory;
							
							
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
	
			protected void searchSystem() throws InterruptedException
			{
				int
				unfinishedParentDirectoriesSize;
				
				
				
				unfinishedParentDirectoriesSize = unfinishedParentDirectories.size();
				
				
				
				while(unfinishedParentDirectoriesSize != 0)
				{
					setThreads();
					searchDirectories();
					unfinishedParentDirectoriesSize = unfinishedParentDirectories.size();
					
				}
				
				
				
				if(useTimer)
				{
					processToUser.cancel();
					
				}
				
			}
		/*End: searching the system.*/
	/*End: class unique methods.*/
	
}