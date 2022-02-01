package systemPathsCollector;



import java.io.*;
import java.util.*;



class ThreadSearcher implements Runnable
{
	protected SystemPath
	currentSystemPath;
	
	protected CheckApprovedSystemPath
	casp;
	
	protected File[]
	currentDirectoryChildren;
	
	protected ArrayList <SystemPath>
	allCollectedSystemPaths;
	
	
	
	ThreadSearcher(SystemPath currentSystemPath, List<List> systemPathOptions)
	{
		setCurrentSystemPath(currentSystemPath);
		setCasp(systemPathOptions);
		
	}
	
	
	
	
	protected void setCurrentSystemPath(SystemPath currentSystemPath)
	{
		this.currentSystemPath = currentSystemPath;
		
	}
	
	protected void setAllCollectedSystemPaths(ArrayList <SystemPath> allCollectedSystemPaths)
	{
		this.allCollectedSystemPaths = allCollectedSystemPaths;
		
	}
	
	protected void setCasp(List<List> systemPathOptions)
	{
		casp = new CheckApprovedSystemPath(systemPathOptions);
		
	}
	
	
	protected Object[] checkApprovedPath(SystemPath currentPath, boolean proceed)
	{
		Object[]
		results;

		
		
		results = casp.checkApprovedPath(currentPath, proceed);
		
		
		
		return results;
		
	}
	
	protected Object[] checkApplicableDirectory(boolean proceed, List<List> excludedDirectories)
	{
		Object[]
		results;
		
		
		
		results = casp.checkApplicableDirectory(currentSystemPath, proceed, excludedDirectories);
		
		
		
		return results;
		
	}
	
	protected void findApplicableDirectory(List<List> excludedDirectories, ArrayList<SystemPath> unfinishedParentDirectories)
	{
	
	
	}
	
	
	
	public void run()
	{
	
	
	}
}
