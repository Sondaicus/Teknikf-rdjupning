package systemPathsCollector;



import java.io.*;
import java.nio.file.*;
import java.util.*;



class OptionSettingsCalculation_Alpha implements OptionsAndSearch
{
    protected static ArrayList <SystemPath>
    allCollectedSystemPaths;
    
    protected static File[]
    startDirectories;
    
    
    
    OptionSettingsCalculation_Alpha()
    {
        allCollectedSystemPaths = new ArrayList<SystemPath>();
    
    }
    
    
    
    protected List<SystemPath> returnSystemPaths()
    {
        return allCollectedSystemPaths;
        
    }
    
    
    
    protected void collectSystemPaths()
    {
        String
        filePathTest;
    
        
        
        setStartDirectories();
    
    
        
        startSystemSearching();
        
    }
    
    protected void setStartDirectories()
    {
        getSystemRoots();
        
    }
    


    protected void getSystemRoots()
    {
        startDirectories = File.listRoots();
        
    }
    
    
    
    protected void addToAllCollectedSystemPaths(SystemPath systemPath)
    {
        allCollectedSystemPaths.add(systemPath);
        
    }
   
   
   
    protected void startSystemSearching()
    {
        int
        startDirectoriesLength;
    
    
    
        startDirectoriesLength = startDirectories.length;
        
        for(int i = 0; i < startDirectoriesLength; i++)
        {
            SystemPath
            startDirectorySystemPath;
        
            File
            startDirectoryFile;
    
    
    
            startDirectoryFile = startDirectories[i];
            startDirectorySystemPath = new SystemPath(startDirectoryFile);
        
        
        
            searchFolder(startDirectorySystemPath);
        
        }
        
    }
    

    protected void searchFolder(SystemPath currentPath)
    {
        boolean
        proceedWithSystemPath,
        currentFileIsDirectory;
    
        File[]
        currentDirectoryChildren;
    
    

        proceedWithSystemPath = checkApprovedSystemPath(currentPath);
        
        
        
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
                
                        if(child.getIsFile())
                        {
                            addToAllCollectedSystemPaths(child);
                            
                        }
                
                        if(child.getIsDirectory())
                        {
                            searchFolder(child);
                    
                        }
                
                    }
                    
                }
                catch(NullPointerException e)
                {}
                
            }
            
        }
        
    }
    
    protected boolean checkApprovedSystemPath(SystemPath currentPath)
    {
        return true;
        
    }
    
    protected void clearList()
    {
        allCollectedSystemPaths.clear();
        startDirectories = new File[0];
        
    }

}