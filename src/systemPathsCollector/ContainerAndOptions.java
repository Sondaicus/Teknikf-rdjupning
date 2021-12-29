package systemPathsCollector;



import java.nio.file.*;
import java.util.*;



abstract interface ContainerAndOptions
{
    default List sendAndReceive()
    {
        OptionSettingsCalculation
        opc;
        
        List
        results;
    
        
        
        opc = new OptionSettingsCalculation();
        opc.collectSystemPaths();
        results = opc.returnSystemPaths();
        
        
        
        return results;
        
    }
    
    
    
}
