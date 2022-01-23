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
    
    default List<SystemPath> sendAndReceive_Beta(List<List> systemPathOptions_Beta)
    {
        OptionSettingsCalculation_Alpha
        opc;
        
        List<SystemPath>
        results;
        
        
        
        opc = new OptionSettingsCalculation_Beta(systemPathOptions_Beta);
        opc.collectSystemPaths();
        results = opc.returnSystemPaths();
        
        
        
        return results;
        
    }
    
    
    
}
