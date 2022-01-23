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
    /*End: global variables.*/
    
    
    
    /*Start: constructors.*/
        OptionSettingsCalculation_Alpha()
        {
            initializeStartLists();
        
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
            startDirectories = arrayAndListConversions.fileArrayToListArray(roots);
            
        }
    
        protected void addToAllCollectedSystemPaths(SystemPath systemPath)
        {
            allCollectedSystemPaths.add(systemPath);
            
        }
    
        protected void initializeStartLists_Alpha()
        {
            allCollectedSystemPaths = new ArrayList<SystemPath>();
            startDirectories = new ArrayList<File>();
            
        }
    /*End: constant methods.*/
    
    
    
    /*Start: overriding methods.*/
        protected void initializeStartLists()
        {
            initializeStartLists_Alpha();
        
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
            proceedWithSystemPath,
            currentFileIsDirectory;
        
            File[]
            currentDirectoryChildren;
            
            
            
            proceedWithSystemPath = checkApprovedSystemPath(currentPath);
            
            
            
            if(proceedWithSystemPath)
            {
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
    /*End: overriding methods.*/

}