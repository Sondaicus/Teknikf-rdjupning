package Java;



import systemPathsCollector.*;
import java.io.IOException;



public class Main
{
    public static void main(String[] args) throws SystemPathsCollectorException, IOException
    {
        LogForTesting
        lft;
    
        Printer
        prn;
    
        SystemFilesContainer_Alpha
        sfcA;
    
        String
        input;
    
        String[]
        inputs,
        results;
    
    
    
        lft = new LogForTesting();
        prn = new Printer();
        
        
        
        sfcA = new SystemFilesContainer_Alpha();
        sfcA.readFromSystem();
        results = sfcA.stringArrayAllPaths_CompareFileExtensions("txt");
    
    
    
        lft.printListLog(results, "results", "log");
        
        
    
    }
    
 
}