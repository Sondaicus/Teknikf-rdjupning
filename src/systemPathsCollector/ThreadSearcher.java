package systemPathsCollector;


import java.io.*;

class ThreadSearcher implements Runnable
{
	protected SystemPath
	currentSystemPath;
	
	protected File[]
	currentDirectoryChildren;
	
	
	
	ThreadSearcher(SystemPath currentSystemPath)
	{
		setCurrentSystemPath(currentSystemPath);
		
	}
	
	
	
	
	protected void setCurrentSystemPath(SystemPath currentSystemPath)
	{
		this.currentSystemPath = currentSystemPath;
		
	}
	
	public void run()
	{
		boolean
		proceedWithSystemPath,
		currentFileIsDirectory;
		
		File[]
		currentDirectoryChildren;
		
		
		
		proceedWithSystemPath = checkApprovedSystemPath(currentSystemPath);
		
		
		
		if(proceedWithSystemPath)
		{
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
						searchFolder(child);
						
					}
					
				}
				catch(NullPointerException e)
				{}
				
			}
			
		}
		
	}
}
