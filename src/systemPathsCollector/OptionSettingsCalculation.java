package systemPathsCollector;



import systemPathsCollector.ContainerAndOptions;
import systemPathsCollector.OptionsAndSearch;
import systemPathsCollector.OptionsAndRoots;
import java.io.*;
import java.nio.file.*;
import java.util.*;



class OptionSettingsCalculation
{
    private static List <File>
    allCollectedSystemPaths;
    
    private static File[]
    rootFiles,
    systemPartitionsPaths;
    
    
    
    OptionSettingsCalculation()
    {}
    
    
    
    List returnSystemPaths()
    {
        return allCollectedSystemPaths;
        
    }
    
    
    
    void collectSystemPaths()
    {
        setSystemRootsToList();
        startFolderSearching();
    
    }
    
    
    private void setSystemRootsToList()
    {
        int
        systemPartitions;
        
        Path
        partitionPath;
        
        String
        partitionString;
    
    
    
        systemPartitions = 0;
        rootFiles = File.listRoots();
    
    
        
        for(File root : rootFiles)
        {
            allCollectedSystemPaths.add(root);
            partitionString = root.getAbsolutePath();
            partitionPath = Path.of(partitionString);
            
            if(Files.isDirectory(partitionPath))
            {
                ++systemPartitions;
            }
            
        }
    
        
        
        systemPartitionsPaths = new File[systemPartitions];
        
        for(int i = 0; i < systemPartitions; i++)
        {
            File root = allCollectedSystemPaths.get(i);
            partitionString = root.getAbsolutePath();
            partitionPath = Path.of(partitionString);
    
            if(Files.isDirectory(partitionPath))
            {
                systemPartitionsPaths[i] = root;
            }
            
        }
        
    }
    
    private void startFolderSearching()
    {
    
        
        
    }
    
    private void searchFolder()
    {
    
    }
    
    
    void clearList()
    {
        allCollectedSystemPaths.clear();
        
    }

}