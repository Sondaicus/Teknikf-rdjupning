package systemPathsCollector;



import java.util.*;



abstract interface ContainerAndOptions
{
    default List<SystemPath> sendAndReceive()
    {
        OptionSettingsCalculation_Alpha
        opc;
        
        List
        results;
    
        
        
        opc = new OptionSettingsCalculation_Alpha();
        opc.collectSystemPaths();
        results = opc.returnSystemPaths();
        
        
        
        return results;
        
    }
    
    
    
}
