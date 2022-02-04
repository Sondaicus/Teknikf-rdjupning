package systemPathsCollector;



import java.io.*;
import java.util.*;



class OptionSettingsCalculation_Alpha implements OptionsAndSearch
{
    /*Start: global variables.*/
        protected ArrayList <SystemPath>
        allCollectedSystemPaths;
        
        protected List<File>
        startDirectories;
        
        protected Timer
        processToUser;
        
        protected SystemPathTimerTask
        systemPathTimerTask;
        
        protected boolean
        useTimer;
    
        protected int
        maximumThreadNumbers,
        systemThreadNumbers,
        allocatedProcessors;
    /*End: global variables.*/
    
    
    
    /*Start: constructors.*/
        OptionSettingsCalculation_Alpha(List<List> settings)
        {
            initializeStartValues(settings);
        
        }
    /*End: constructors.*/
    
    
    
    /*Start: outside of object usable methods.*/
        protected List<SystemPath> returnSystemPaths()
        {
            return allCollectedSystemPaths;
            
        }
        
        protected void collectSystemPaths()
        {
            setStartDirectories();
            startSystemSearching();
            
        }
        
        protected void clearList()
        {
            allCollectedSystemPaths.clear();
            startDirectories.clear();
            
        }
    /*End: outside of object usable methods.*/
    
   
    
    /*Start: constant methods.*/
        protected void getSystemRoots()
        {
            File[]
            roots;
    
    
    
            roots = File.listRoots();
            startDirectories = ArrayAndListConversions.fileArrayToListArray(roots);
            
        }
    
        protected void addToAllCollectedSystemPaths(SystemPath systemPath)
        {
            allCollectedSystemPaths.add(systemPath);
            
        }
    
        protected void initializeStartValues_Alpha(List<List> settings)
        {
            int
            allocatedProcessors;
            
            allCollectedSystemPaths = new ArrayList<SystemPath>();
            startDirectories = new ArrayList<File>();
    
    
    
            this.useTimer = (boolean) settings.get(0).get(0);
            this.maximumThreadNumbers = (int) settings.get(1).get(0);
            this.systemThreadNumbers = Runtime.getRuntime().availableProcessors();
    
            
            
            allocatedProcessors = 0;
    
            for(int i = 0; i < maximumThreadNumbers && i < systemThreadNumbers; i++)
            {
                ++allocatedProcessors;
        
            }
    
            this.allocatedProcessors = allocatedProcessors;
            
            
    
            if(useTimer)
            {
                setTimers(allocatedProcessors);
                
            }
            
        }
    /*End: constant methods.*/
    
    
    
    /*Start: overriding methods.*/
        protected void initializeStartValues(List<List> settings)
        {
            initializeStartValues_Alpha(settings);
        
        }
        
        protected void setStartDirectories()
        {
            getSystemRoots();
            
        }
    
        protected void startSystemSearching()
        {
            int
            startDirectoriesSize;
    
    
            
            startDirectoriesSize = startDirectories.size();
            
            for(int i = 0; i < startDirectoriesSize; i++)
            {
                SystemPath
                startDirectorySystemPath;
            
                File
                startDirectoryFile;
                
                
                
                startDirectoryFile = startDirectories.get(i);
                startDirectorySystemPath = new SystemPath(startDirectoryFile);
                
                
                
                searchFolder(startDirectorySystemPath);
                
            }
            
        }
    
        protected void searchFolder(SystemPath currentPath)
        {
            boolean
            proceedWithSystemPath;
        
            File[]
            currentDirectoryChildren;
    
    
    
            systemPathTimerTask.setListSize(allCollectedSystemPaths.size());
            
            
            
            proceedWithSystemPath = checkApprovedSystemPath(currentPath);
            
            
            
            if(proceedWithSystemPath)
            {
                boolean
                currentFileIsDirectory;
                
                
                
                addToAllCollectedSystemPaths(currentPath);
                currentFileIsDirectory = currentPath.getIsDirectory();
        
                if(currentFileIsDirectory)
                {
                    currentDirectoryChildren = getChildren(currentPath);
            
            
                    try
                    {
                        for(File folderChild : currentDirectoryChildren)
                        {
                            SystemPath
                            child;
                    
                            
                    
                            child = new SystemPath(folderChild);
                            searchFolder(child);
                       
                        }
                        
                    }
                    catch(NullPointerException e)
                    {}
                    
                }
                
            }
            
        }
        
        protected boolean checkApprovedSystemPath(SystemPath currentPath)
        {
            return true;
            
        }
    
        protected void setTimers(int allocatedProcessors)
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
            
        }
    /*End: overriding methods.*/

}