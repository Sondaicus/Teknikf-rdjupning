package systemPathsCollector;



import java.io.*;
import java.nio.file.*;
import java.util.*;



class OptionSettingsCalculation
{
    private static List <SystemPath>
    allCollectedSystemPaths;
    
    private static SystemPath[]
    systemPartitionsPaths;
    
    private static File[]
    rootFiles;
    
    
    
    OptionSettingsCalculation()
    {}
    
    
    
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
        int
        systemPartitions,
        allCollectedSystemPathsSize,
        currentPartitionIndex;
    
    
    
        systemPartitions = 0;
        rootFiles = File.listRoots();
    
    
        
        for(File root : rootFiles)
        {
            boolean
            isPartition;
    
            SystemPath
            currentAbsolutePath;
            
            
            
            currentAbsolutePath = new SystemPath(root);
            isPartition = currentAbsolutePath.getIsDirectory();
            
            if(isPartition)
            {
                ++systemPartitions;
                
            }
            
        }
    
    
    
        allCollectedSystemPathsSize = allCollectedSystemPaths.size();
        systemPartitionsPaths = new SystemPath[systemPartitions];
        currentPartitionIndex = 0;
        
        for(int i = 0; i < allCollectedSystemPathsSize; i++)
        {
            boolean
            isPartition;
    
            SystemPath
            currentAbsolutePath;
            
            
            
            currentAbsolutePath = allCollectedSystemPaths.get(i);
            isPartition = currentAbsolutePath.getIsDirectory();
    
            if(isPartition)
            {
                systemPartitionsPaths[currentPartitionIndex] = currentAbsolutePath;
                ++currentPartitionIndex;
                
            }
            
        }
        
    }
    
    private void addRootsToList()
    {
        int
        rootNumbers;
        
        
        
        rootNumbers = rootFiles.length;
        for(int i = 0; i < rootNumbers; i++)
        {
            File
            currentRootFile;
    
            SystemPath
            currentRootSystemPath;
    
    
    
            currentRootFile = rootFiles[i];
            currentRootSystemPath = new SystemPath(currentRootFile);
    
    
    
            addToAllCollectedSystemPaths(currentRootSystemPath);
            
        }
        
    }
    
    private void addToAllCollectedSystemPaths(SystemPath systemPath)
    {
        allCollectedSystemPaths.add(systemPath);
        
    }
    
    private void startFolderSearching()
    {
        int
        systemPartitionsPathsLength;
    
    
    
        systemPartitionsPathsLength = systemPartitionsPaths.length;
        
        
        
        for(int i = 0; i < systemPartitionsPathsLength; i++)
        {
            SystemPath
            currentPartition;
    
    
    
            currentPartition = systemPartitionsPaths[i];
            searchFolder(currentPartition);
            
        }
    
        
        
    }
    
    private void searchFolder(SystemPath currentFolder)
    {
        File
        currentFolderFileValue;
        
        boolean
        currentFolderIsRoot,
        currentFolderIsDirectoryValue;
    
        File[]
        currentFolderChildren;
    
    
    
        currentFolderIsRoot = currentFolder.getIsRoot();
        
        if(!currentFolderIsRoot)
        {
            addToAllCollectedSystemPaths(currentFolder);
            
            currentFolderIsDirectoryValue = currentFolder.getIsDirectory();
            
            if(currentFolderIsDirectoryValue)
            {
                currentFolderFileValue = currentFolder.getAbsoluteFile();
                currentFolderChildren =
                currentFolderFileValue.listFiles();
                
                
                
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
    
    }
    
    
    void clearList()
    {
        allCollectedSystemPaths.clear();
        rootFiles = new File[0];
        systemPartitionsPaths = new SystemPath[0];
        
    }

}