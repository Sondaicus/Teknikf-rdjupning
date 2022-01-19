package systemPathsCollector;



import java.util.*;



abstract interface ContainerAndOptions
{
    default List<SystemPath> sendAndReceive_Alpha()
    {
        OptionSettingsCalculation_Alpha
        opc;
        
        List<SystemPath>
        results;
    
        
        
        opc = new OptionSettingsCalculation_Alpha();
        opc.collectSystemPaths();
        results = opc.returnSystemPaths();
        
        
        
        return results;
        
    }
    
    default List<SystemPath> sendAndReceive_Beta()
    {
        OptionSettingsCalculation_Alpha
        opc;
        
        List<SystemPath>
        results;
        
        
        
        opc = new OptionSettingsCalculation_Alpha();
        opc.collectSystemPaths();
        results = opc.returnSystemPaths();
        
        
        
        return results;
        
    }
    
    
    
}
