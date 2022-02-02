package systemPathsCollector;



import java.util.*;
import java.io.*;



abstract interface OptionsAndSearch
{
    default File[] getChildren(SystemPath currentPath)
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
