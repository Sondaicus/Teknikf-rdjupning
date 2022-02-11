package systemPathsCollector;



import java.io.*;
import java.util.*;



public class OptionSettingsCalculation_SingleThread extends OptionSettingsCalculation implements OptionsAndSearch
{
	/*Start: constructors.*/
		OptionSettingsCalculation_SingleThread()
		{}
		
		OptionSettingsCalculation_SingleThread(List<List> settings)
		{
			initializeStartValues_OptionSettingsCalculation(settings);
			searchSystem();
			
		}
	/*End: constructors.*/
	
	
	/*Start: class unique methods.*/
		/*Start: searching the system.*/
			protected void searchSystem()
			{
				int
				startDirectoriesSize;
				
				
				
				startDirectoriesSize = startDirectories.size();
				
				for(int i = 0; i < startDirectoriesSize; i++)
				{
					SystemPath
					startDirectorySystemPath;
					
					File
					startDirectoryFile;
					
					
					
					startDirectoryFile = startDirectories.get(i);
					startDirectorySystemPath = new SystemPath(startDirectoryFile);
					
					
					
					searchDirectory(startDirectorySystemPath);
					
				}
				
				
				
				if(useTimer)
				{
					processToUser.cancel();
					
				}
				
			}
			
			protected void searchDirectory(SystemPath currentPath)
			{
				boolean
				proceedWithSystemPath;
				
				File[]
				currentDirectoryChildren;
				
				
				
				systemPathTimerTask.setListSize(allCollectedSystemPaths.size());
				
				
				
				proceedWithSystemPath = checkApprovedSystemPath(currentPath);
				
				
				
				if(proceedWithSystemPath)
				{
					boolean
					currentFileIsDirectory;
					
					
					
					addToAllCollectedSystemPaths(currentPath);
					currentFileIsDirectory = currentPath.getIsDirectory();
					
					if(currentFileIsDirectory)
					{
						currentDirectoryChildren = getChildren(currentPath);
						
						
						try
						{
							for(File folderChild : currentDirectoryChildren)
							{
								SystemPath
								child;
								
								
								
								child = new SystemPath(folderChild);
								searchDirectory(child);
								
							}
							
						}
						catch(NullPointerException e)
						{}
						
					}
					
				}
				
			}
		/*End: searching the system.*/
	/*End: class unique methods.*/
}