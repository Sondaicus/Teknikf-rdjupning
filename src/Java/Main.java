package Java;



import systemPathsCollector.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;



public class Main
{
    public static void main(String[] args) throws SystemPathsCollectorException, IOException
    {
        LogForTesting
        lft;
    
        Printer
        prn;
    
        SystemFilesContainer_Beta
        sfcB;
    
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
        sfcB = new SystemFilesContainer_Beta();
    
    
    
        sfcB.addStartDirectory(ideaProjectsFolder);
        
     
        sfcB.addExcludedFileTypesIgnoreCase("xml");
        sfcB.addExcludedFileTypesIgnoreCase(".FXML");
        sfcB.addExcludedFileTypes(".JAVA");
        sfcB.addExcludedDirectory("Nackademin");
        results = sfcB.getExcludedFileTypesIgnoreCaseArray();
        prn.printToConsoleForEach(results);
        results = sfcB.getExcludedFileTypesArray();
        prn.printToConsoleForEach(results);
     
        sfcB.readFromSystem();
        results = sfcB.stringArrayAllPaths();
    
    
        lft.printListLog(results, "results.txt", "test");
        
    }
    
}