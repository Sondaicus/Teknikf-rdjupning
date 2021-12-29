package systemPathsCollector;




import java.nio.file.*;
import java.util.*;



public class SystemFilesContainer implements ContainerAndOptions
{
    private static List <String>
    allSystemPaths,
    allFolderPaths,
    allFilePaths;
    
    
    String fuck = "f";
    
    
    
    public SystemFilesContainer()
    {}
    
    
    
    public void readFromSystem()
    {
        allSystemPaths = sendAndReceive();
    
    }
    
    public void clearLists()
    {
    
    }
    
    
    
    public /*List*/ void returnAllResultsAsList(String target)
    {
        int
        listSize;
        
        List
        result;
    
    
    
        listSize = allSystemPaths.size();
    
    
    
       
        
        for(int i = 0; i < listSize; i++)
        {
            int iteration = i;
    
         /*   result = allSystemPaths.stream().distinct().findAny(allSystemPaths -> ));*/
    
    
      //      result = allSystemPaths.stream().distinct().filter(fuck -> allSystemPaths.get(iteration));
    
            String f;
            
            f = allSystemPaths.get(iteration);
    
            result = allSystemPaths.stream().distinct().filter(allSystemPaths -> target.contains(f)).toList();
    
    
            System.out.println(result);
            System.out.println();
            
    
        }
        
        
        
       // return result;
    
    
       
        
    }
    
    public /*List*/ void returnAllResultsAsList(Path target)
    {
    
    }
    
    
    
    

}
