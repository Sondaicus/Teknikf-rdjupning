package systemPathsCollector;


import java.util.ArrayList;
import java.util.List;

public class SystemFilesContainer_Beta extends SystemFilesContainer_Alpha
{
    /*Start: global variables.*/
        protected static List<SystemPath>
        allSystemPathsHidden,
        allSystemPathsVisible,
        allSystemPathsDirectoryHidden,
        allSystemPathsDirectoryVisible,
        allSystemPathsFileHidden,
        allSystemPathsFileVisible;
    /*End: global variables.*/
    
    protected void setSubLists()
    {
        setSubLists_Alpha();
        setSubLists_Beta();
        
    }
    
    protected void setSubLists_Beta()
    {
        setListAllSystemPathsHidden();
        setListAllSystemPathsVisible();
        setListOnlyDirectoriesHidden();
        setListOnlyDirectoriesVisible();
        setListOnlyFilesHidden();
        setListOnlyFilesVisible();
        
    }
    
    /*Start: private methods.*/
        /*Start: set global Lists.*/
            private void setListAllSystemPathsHidden()
            {
                allSystemPathsHidden = new ArrayList<SystemPath>();
            
            
            
                allSystemPaths.stream()
                .filter(sp -> sp.getIsHidden() == true)
                .forEach(sp -> allSystemPathsHidden.add(sp));
            
            }
    
            private void setListAllSystemPathsVisible()
            {
                allSystemPathsVisible = new ArrayList<SystemPath>();
    
    
    
                allSystemPaths.stream()
                .filter(sp -> sp.getIsHidden() == false)
                .forEach(sp -> allSystemPathsHidden.add(sp));
                
            }
    
            private void setListOnlyDirectoriesHidden()
            {
                allSystemPathsDirectoryHidden = new ArrayList<SystemPath>();
    
    
    
                allSystemPathsDirectory.stream()
                .filter(sp -> sp.getIsHidden() == true)
                .forEach(sp -> allSystemPathsDirectoryHidden.add(sp));
                
            }
    
            private void setListOnlyDirectoriesVisible()
            {
                allSystemPathsDirectoryVisible = new ArrayList<SystemPath>();
    
    
    
                allSystemPathsDirectory.stream()
                .filter(sp -> sp.getIsHidden() == false)
                .forEach(sp -> allSystemPathsDirectoryVisible.add(sp));
                
            }
            
            private void setListOnlyFilesHidden()
            {
                allSystemPathsFileHidden = new ArrayList<SystemPath>();
    
    
    
                allSystemPathsFile.stream()
                .filter(sp -> sp.getIsHidden() == true)
                .forEach(sp -> allSystemPathsFileHidden.add(sp));
                
            }
    
            private void setListOnlyFilesVisible()
            {
                allSystemPathsFileVisible = new ArrayList<SystemPath>();
    
    
    
                allSystemPathsFile.stream()
                .filter(sp -> sp.getIsHidden() == false)
                .forEach(sp -> allSystemPathsFileVisible.add(sp));
                
                
            }
        /*End: set global Lists.*/
    /*End: private methods.*/
    
}