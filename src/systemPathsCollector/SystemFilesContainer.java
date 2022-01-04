package systemPathsCollector;




import java.nio.file.*;
import java.util.*;



public class SystemFilesContainer implements ContainerAndOptions
{
    private static List <SystemPath>
    allSystemPaths;
    
    private static ArrayList <SystemPath>
    allSystemPathsFolder,
    allSystemPathsFile;
    
    
    
    public SystemFilesContainer()
    {}
    
    
    
    public void readFromSystem()
    {
        allSystemPaths = sendAndReceive();
        setSubLists();
    
    }
    
    public void clearLists()
    {
    
    }
    
    
    
    private void setSubLists()
    {
        setListOnlyFolders();
        setListOnlyFiles();
    
    
    }
    
    private void setListOnlyFolders()
    {
        allSystemPathsFolder = new ArrayList<SystemPath>();
        
        
    
        allSystemPaths.stream()
        .filter(sp -> sp.getIsDirectory() == true)
        .forEach(sp -> allSystemPathsFolder.add(sp));
        
    }
    
    private void setListOnlyFiles()
    {
        allSystemPathsFile = new ArrayList<SystemPath>();
    
    
    
    
        allSystemPaths.stream()
        .filter(sp -> sp.getIsFile() == true)
        .forEach(sp -> allSystemPathsFile.add(sp));
    
    }
    
    private String[] returnListContentAsStringArray(List input)
    {
        int
        listSize;
    
        String[]
        results;
    
    
        
        listSize = input.size();
        results = new String[listSize];
    
    
    
        for(int i = 0; i < listSize; i++)
        {
            String
            currentPathString;
        
            SystemPath
            currentPathSP;
        
        
        
            currentPathSP = (SystemPath) input.get(i);
            currentPathString = currentPathSP.getAbsoluteString();
        
        
        
            results[i] = currentPathString;
        
        }
    
    
    
        return results;
        
    }
    
  
    
 /*   public void returnAllResultsAsList(String target)
    {
        int
        listSize;
        
        List
        result;
    
    
    
        listSize = allSystemPaths.size();
    
    
    
       
        
        for(int i = 0; i < listSize; i++)
        {
            int iteration = i;
    
          result = allSystemPaths.stream().distinct().findAny(allSystemPaths -> ));
    
    
            result = allSystemPaths.stream().distinct().filter(fuck -> allSystemPaths.get(iteration));
    
            String f;
            
            f = allSystemPaths.get(iteration);
    
            result = allSystemPaths.stream().distinct().filter(allSystemPaths -> target.contains(f)).toList();
    
    
            System.out.println(result);
            System.out.println();
            
    
        }
        
        
        
        return result;
    
    
 
        
    }*/
    
  /*  public void returnAllResultsAsList(Path target)
    {
    
    }
    */
    /*
    public String returnAllResultsAsString(String target)
    {
    
    }
    */
    
    
    public String[] returnAllResultsAsString()
    {
        String[]
        results;
    
    
        
        results = returnListContentAsStringArray(allSystemPaths);
        
        
        
        return results;
        
    }
    
    public String[] returnAllFoldersAsString()
    {
        String[]
        results;
        
        
        
        results = returnListContentAsStringArray(allSystemPathsFolder);
        
        
        
        return results;
        
    }
    
    public String[] returnAllFilesAsString()
    {
        String[]
        results;
        
        
        
        results = returnListContentAsStringArray(allSystemPathsFile);
        
        
        
        return results;
        
    }

}