package systemPathsCollector;



import java.io.*;
import java.nio.file.*;
import java.util.*;



class OptionSettingsCalculation implements OptionsAndSearch
{
    private static ArrayList <SystemPath>
    allCollectedSystemPaths;
    
   /* private static SystemPath[]
    systemPartitionsPaths;*/
    
    private static File[]
    rootFiles;
    
    
    
    OptionSettingsCalculation()
    {
        allCollectedSystemPaths = new ArrayList<SystemPath>();
    
    }
    
    
    
    List<SystemPath> returnSystemPaths()
    {
        return allCollectedSystemPaths;
        
    }
    
    
    
    void collectSystemPaths()
    {
        getSystemRoots();
        startFolderSearching();
    
    }
    
    
    private void getSystemRoots()
    {
        rootFiles = File.listRoots();
        
    }
    
  
    
    private void addToAllCollectedSystemPaths(SystemPath systemPath)
    {
        allCollectedSystemPaths.add(systemPath);
        
    }
    
    
    
    private void startFolderSearching()
    {
        int
        rootFilesLength;
    
    
        
        rootFilesLength = rootFiles.length;
        
        for(int i = 0; i < rootFilesLength; i++)
        {
            SystemPath
            currentRootSystemPath;
        
            File
            currentRootFile;
        
        
        
            currentRootFile = rootFiles[i];
            currentRootSystemPath = new SystemPath(currentRootFile);
        
        
        
            searchFolder(currentRootSystemPath);
        
        }
        
    }
   
    
    private void searchFolder(SystemPath currentPath)
    {
        boolean
        currentFolderIsDirectoryValue;
    
        File[]
        currentFolderChildren;
    
    
    
       
        addToAllCollectedSystemPaths(currentPath);
        currentFolderIsDirectoryValue = currentPath.getIsDirectory();
            
        if(currentFolderIsDirectoryValue)
        {
            currentFolderChildren = getChildren(currentPath);
            
            
            
            try
            {
                for(File folderChild : currentFolderChildren)
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
    
    
    void clearList()
    {
        allCollectedSystemPaths.clear();
        rootFiles = new File[0];
        
    }

}