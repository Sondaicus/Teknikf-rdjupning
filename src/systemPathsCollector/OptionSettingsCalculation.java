package systemPathsCollector;



import java.io.*;
import java.util.*;



class OptionSettingsCalculation
{
    /*Start: global variables.*/
        protected ArrayList <SystemPath>
        allCollectedSystemPaths;
        
        List<String>
        startDirectoriesValues;
    
        protected List<File>
        startDirectories;
        
        protected Timer
        processToUser;
        
        protected SystemPathTimerTask
        systemPathTimerTask;
    
        protected CheckApprovedSystemPath
        casp;
        
        protected boolean
        useTimer,
        specifiedStartDirectories;
    
        protected int
        maximumThreadNumbers,
        systemThreadNumbers,
        allocatedProcessors;
    /*End: global variables.*/
    

    
    
    /*Start: constructors.*/
        OptionSettingsCalculation()
        {}
    
        OptionSettingsCalculation(List<List> settings)
        {
            initializeStartValues_OptionSettingsCalculation(settings);
        
        }
    /*End: constructors.*/
    
    
    
    /*Start: outside of object usable methods.*/
        protected List<SystemPath> returnSystemPaths()
        {
            return allCollectedSystemPaths;
            
        }
    /*End: outside of object usable methods.*/
    
   
    
    /*Start: constant methods.*/
        /*Start: add to main collection lists.*/
            protected void addToAllCollectedSystemPaths(SystemPath systemPath)
            {
                allCollectedSystemPaths.add(systemPath);
            
            }
        /*End: add to main collection lists.*/
    
        /*Start: get system roots.*/
            protected void getSystemRoots()
            {
                File[]
                roots;
        
        
        
                roots = File.listRoots();
                startDirectories = ArrayAndListConversions.fileArrayToListArray(roots);
                
            }
        /*End: get system roots.*/
    
        /*Start: initialize start values for global variables.*/
            protected void initializeStartValues_OptionSettingsCalculation(List<List> settings)
            {
                initializeStartValues_MainCollectionLists();
                initializeStartValues_Threads(settings);
                initializeStartValues_Timers(settings);
                initializeStartValues_SearchSettings(settings);
                setStartDirectories();
        
            }
            
            protected void initializeStartValues_MainCollectionLists()
            {
                allCollectedSystemPaths = new ArrayList<SystemPath>();
                startDirectories = new ArrayList<File>();
                
            }
        
            protected void initializeStartValues_Threads(List<List> settings)
            {
                int
                allocatedProcessors;
                
                ExtraSystemCollectionThreads
                esct;
                
                List<ExtraSystemCollectionThreads>
                esctList;
                
     
        
                esctList = (List<ExtraSystemCollectionThreads>) settings.get(0);
                esct = esctList.get(0);
                
                
                
                this.maximumThreadNumbers = esct.getThreadsNumber();
                this.systemThreadNumbers = Runtime.getRuntime().availableProcessors();
        
                
                
                allocatedProcessors = 0;
        
                for(int i = 0; i < maximumThreadNumbers && i < systemThreadNumbers; i++)
                {
                    ++allocatedProcessors;
            
                }
        
                this.allocatedProcessors = allocatedProcessors;
                
            }
        
            protected void initializeStartValues_Timers(List<List> settings)
            {
                this.useTimer = (boolean) settings.get(1).get(0);
                
                if(useTimer)
                {
                    boolean
                    usingExtraThreads;
    
    
    
                    if(allocatedProcessors > 1)
                    {
                        usingExtraThreads = true;
        
                    }
                    else
                    {
                        usingExtraThreads = false;
        
                    }
    
    
    
                    processToUser = new Timer();
                    systemPathTimerTask = new SystemPathTimerTask(usingExtraThreads, allocatedProcessors);
                    processToUser.scheduleAtFixedRate(systemPathTimerTask, 10000, 10000);
                    
                }
                
            }
            
            protected void initializeStartValues_SearchSettings(List<List> settings)
            {
                List<List>
                systemPathOptions;
        
        
        
                systemPathOptions = settings.get(2);
                startDirectoriesValues = (List<String>) systemPathOptions.get(0);
                specifiedStartDirectories = InputAndReturnTypes.checkVariableValueToBoolean(startDirectoriesValues, 0);
                casp = new CheckApprovedSystemPath(systemPathOptions);
                
            }
    
            protected void setStartDirectories()
            {
                if(!specifiedStartDirectories)
                {
                    getSystemRoots();
                    
                }
                else
                {
                    startDirectories = ArrayAndListConversions.listStringToListFile(startDirectoriesValues);
                    
                }
                
            }
        /*End: initialize start values for global variables.*/
    
        /*Start: check approved system paths.*/
            protected boolean checkApprovedSystemPath(SystemPath currentPath)
            {
                Object[]
                results;
                
                boolean
                proceed;
                
                
                
                proceed = true;
                results = casp.checkApprovedPath(currentPath, proceed);
                proceed = (Boolean) results[0];
                
                
                return proceed;
                
            }
        /*End: check approved system paths.*/
    /*End: constant methods.*/

}