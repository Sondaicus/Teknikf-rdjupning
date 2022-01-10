package Java;



import systemPathsCollector.*;
import java.io.IOException;


public class Main
{
    public static void main(String[] args) throws IOException, SystemNotReadException
    {
        SystemFilesContainer_Alpha
        sfcA;
        
        String[]
        results,
        resultsFiles,
        resultsFolders,
        test;
    
        LogForTesting
        lft;
        
        int
        arraySize;
    
    
    
        lft = new LogForTesting();
	    sfcA = new SystemFilesContainer_Alpha();
    
    
    
        sfcA.readFromSystem();
    
        results = sfcA.stringArrayFiles_ExcludeFileExtension_IgnoreCase("main");
    
        lft.printListLog(results, "results", "ass");
  
        
    }
    
}