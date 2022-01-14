package systemPathsCollector;



import java.util.*;
import java.io.*;



abstract interface OptionsAndSearch
{
    default File[] getChildren(SystemPath_Alpha currentPath)
    {
        CollectChildrenPaths
        ccpffi;
    
        File[]
        results;
    
    
    
        ccpffi = new CollectChildrenPaths(currentPath);
        results = ccpffi.getChildren();
        
        
        
        return results;
        
    }
    
    default File[] getChildren(File currentPath)
    {
        CollectChildrenPaths
        ccpffi;
        
        File[]
        results;
        
        
        
        ccpffi = new CollectChildrenPaths(currentPath);
        results = ccpffi.getChildren();
        
        
        
        return results;
        
    }

}
