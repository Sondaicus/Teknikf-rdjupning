package Java;



import systemPathsCollector.*;
import java.io.*;
import java.nio.*;
import java.nio.file.LinkOption;


public class Main
{
    public static void main(String[] args) throws SystemPathsCollectorException, IOException, InterruptedException
    {
        LogForTesting
        lft;
    
        Printer
        prn;
    
        SystemFilesContainer
        sfc;
    
        String
        input,
        ideaProjectsFolder;
    
        String[]
        inputs,
        results;
        
        File[]
        roots;
        
        int
        rootsLength;
    
        LinkOption
        lo;
    
        
        
        ideaProjectsFolder = "D:\\Users\\Hårddisken\\IdeaProjects";
        lft = new LogForTesting();
        prn = new Printer();
        sfc = new SystemFilesContainer();
    
    
        
        lft.startTimer("reading from system");
        sfc.readFromSystem();
        lft.endTimer("reading from system", "readTime");
        
   
        
        results = sfc.stringArrayAllPaths();
        lft.printListLog(results, "allPaths", "printing all paths");
        
    
    }
    
}