package systemPathsCollector;



import java.util.*;



abstract interface ContainerAndOptions
{
    default List<SystemPath> sendAndReceive(List<List> allSettings) throws InterruptedException
    {
        OptionSettingsCalculation
        opc;
    
        List<SystemPath>
        results;
        
        List<ExtraSystemCollectionThreads>
        esctList;
    
        ExtraSystemCollectionThreads
        esct;
        
        boolean
        useMultiThreads;
    
    
    
        esctList = (List<ExtraSystemCollectionThreads>) allSettings.get(0);
        esct = esctList.get(0);
        useMultiThreads = (Boolean) esct.getExtraThreadsUse();
        
        
        
        if(useMultiThreads)
        {
            opc = new OptionSettingsCalculation_MultiThread(allSettings);
            
        }
        else
        {
            opc = new OptionSettingsCalculation_SingleThread(allSettings);
            
        }
        
        
        
        results = opc.returnSystemPaths();
        
        
        
        return results;
        
    }
    
}