package Java;



import systemPathsCollector.*;
import java.io.IOException;
import java.util.*;



public class Main
{
    public static void main(String[] args) throws IOException
    {
        SystemFilesContainer
        sfc;
        
        String[]
        results,
        resultsFiles,
        resultsFolders;
    
        LogForTesting
        lft;
    
    
    
        lft = new LogForTesting();
	    sfc = new SystemFilesContainer();
    
    
    
        lft.startTimer("reading files.");
        sfc.readFromSystem();
        lft.endTimer("reading files.", "readingLog");
    
    
    
        lft.startTimer("collecting all paths.");
        results = sfc.returnAllResultsAsString();
        lft.endTimer("collecting all paths.", "fetchingAllPaths");
    
        lft.startTimer("collecting all files.");
        resultsFiles = sfc.returnAllFilesAsString();
        lft.endTimer("collecting all files.", "fetchingAllFiles");
    
        lft.startTimer("collecting all folders.");
        resultsFolders = sfc.returnAllFoldersAsString();
        lft.endTimer("collecting all folders.", "fetchingAllFolders");
    
    
        
        lft.printListLog(results, "results", "printing all paths.");
        
        lft.printListLog(resultsFiles, "resultsFiles", "printing all files.");
        
        lft.printListLog(resultsFolders, "resultsFolders", "printing all folders.");
        
    }
    
}