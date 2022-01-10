package systemPathsCollector;



import java.io.*;
import java.nio.file.*;
import java.util.*;



class OptionSettingsCalculation_Alpha implements OptionsAndSearch
{
    protected static ArrayList <SystemPath_Alpha>
    allCollectedSystemPaths;
    
    protected static File[]
    startDirectories;
    
    
    
    OptionSettingsCalculation_Alpha()
    {
        allCollectedSystemPaths = new ArrayList<SystemPath_Alpha>();
    
    }
    
    
    
    protected List<SystemPath_Alpha> returnSystemPaths()
    {
        return allCollectedSystemPaths;
        
    }
    
    
    
    protected void collectSystemPaths()
    {
        String
        filePathTest;
    
        
    
        filePathTest = "C:\\Users\\axel\\IdeaProjects";
        setStartDirectories();
      
        
    
        startFolderSearchingTest(filePathTest);
    
    }
    
    
    
    protected void startFolderSearchingTest(String startPath)
    {
        SystemPath_Alpha
        thisSystemPath;
        
        
        
        thisSystemPath = new SystemPath_Alpha(startPath);
        searchFolder(thisSystemPath);
        
    }
    
    
    
    
    protected void setStartDirectories()
    {
        getSystemRoots();
        
    }
    
    
    protected void getSystemRoots()
    {
        startDirectories = File.listRoots();
        
    }
    
    
    
    protected void addToAllCollectedSystemPaths(SystemPath_Alpha systemPath)
    {
        allCollectedSystemPaths.add(systemPath);
        
    }
    
    
    protected void startSystemSearching()
    {
        int
        rootFilesLength;
    
    
        
        rootFilesLength = startDirectories.length;
        
        for(int i = 0; i < rootFilesLength; i++)
        {
            SystemPath_Alpha
            currentRootSystemPath;
        
            File
            currentRootFile;
        
        
        
            currentRootFile = startDirectories[i];
            currentRootSystemPath = new SystemPath_Alpha(currentRootFile);
        
        
        
            searchFolder(currentRootSystemPath);
        
        }
        
    }
    
    
    protected void searchFolder(SystemPath_Alpha currentPath)
    {
        boolean
        currentFileIsDirectory;
    
        File[]
        currentDirectoryChildren;
    
    
    
       
        addToAllCollectedSystemPaths(currentPath);
        currentFileIsDirectory = currentPath.getIsDirectory();
            
        if(currentFileIsDirectory)
        {
            currentDirectoryChildren = getChildren(currentPath);
            
            
            
            try
            {
                for(File folderChild : currentDirectoryChildren)
                {
                    SystemPath_Alpha
                    child;
                    
                    
                    
                    child = new SystemPath_Alpha(folderChild);
                    
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
    
    protected void clearList()
    {
        allCollectedSystemPaths.clear();
        startDirectories = new File[0];
        
    }

}