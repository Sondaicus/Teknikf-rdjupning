package systemPathsCollector;



import java.util.*;



abstract interface ContainerAndOptions
{
    default List<SystemPath> sendAndReceive_Alpha()
    {
        OptionSettingsCalculation_Alpha
        opc_A;
        
        List<SystemPath>
        results;
    
    
    
        opc_A = new OptionSettingsCalculation_Alpha();
        opc_A.collectSystemPaths();
        results = opc_A.returnSystemPaths();
        
        
        
        return results;
        
    }
    
    default List<SystemPath> sendAndReceive_Beta(List<List> systemPathOptions_Beta)
    {
        OptionSettingsCalculation_Beta
        opc_B;
        
        List<SystemPath>
        results;
    
    
    
        opc_B = new OptionSettingsCalculation_Beta(systemPathOptions_Beta);
        opc_B.collectSystemPaths();
        results = opc_B.returnSystemPaths();
        
        
        
        return results;
        
    }
    
    default List<SystemPath> sendAndReceive(List<List> systemPathOptions_Beta, int threadNumbers)
    {
        OptionSettingsCalculation
        opc;
        
        List<SystemPath>
        results;
        
        
        
        opc = new OptionSettingsCalculation(systemPathOptions_Beta, threadNumbers);
        opc.collectSystemPaths();
        results = opc.returnSystemPaths();
        
        
        
        return results;
        
    }
    
}