package systemPathsCollector;



import java.util.*;
import java.io.*;



abstract interface OptionsAndSearch
{
    default File[] getChildren(SystemPath currentPath)
    {
        CollectChildrenPathsFromFolderInput
        ccpffi;
    
        File[]
        results;
    
    
    
        ccpffi = new CollectChildrenPathsFromFolderInput(currentPath);
        results = ccpffi.getChildren();
        
        
        
        return results;
        
    }
    
    default File[] getChildren(File currentPath)
    {
        CollectChildrenPathsFromFolderInput
        ccpffi;
        
        File[]
        results;
        
        
        
        ccpffi = new CollectChildrenPathsFromFolderInput(currentPath);
        results = ccpffi.getChildren();
        
        
        
        return results;
        
    }

}
