package systemPathsCollector;



import java.util.*;



abstract interface OptionsAndSearch
{
    default SystemPath[] getChildren()
    {
        CollectChildrenPathsFromFolderInput
        ccpffi;
        
        List
        results;
        
        
        
        opc = new OptionSettingsCalculation();
        opc.collectSystemPaths();
        results = opc.returnSystemPaths();
        
        
        
        return results;
        
    }

}
