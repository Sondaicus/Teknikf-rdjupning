package systemPathsCollector;



import java.io.*;
import java.util.*;



class ThreadSearcher extends Thread implements Runnable, OptionsAndSearch
{
	protected SystemPath
	parentDirectory;
	
	protected File[]
	childrenDirectoryFileArray;
	
	protected List<SystemPath>
	childrenDirectorySystemPathList;
	
	
	
	ThreadSearcher(SystemPath parentDirectory)
	{
		setParentDirectory(parentDirectory);
		
	}
	
	
	
	
	protected void setParentDirectory(SystemPath parentDirectory)
	{
		this.parentDirectory = parentDirectory;
		
	}
	
	protected List<SystemPath> getChildren()
	{
		return childrenDirectorySystemPathList;
		
	}

	public void run()
	{
		childrenDirectoryFileArray = getChildren(parentDirectory);
		childrenDirectorySystemPathList = ArrayAndListConversions.fileArrayToListSystemPath(childrenDirectoryFileArray);
	
	}
}
