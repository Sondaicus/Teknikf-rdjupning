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
    
        SystemFilesContainer_Alpha
        sfcA;
    
        String
        input;
    
        String[]
        inputs,
        results;
        
        File[]
        roots;
        
        int
        rootsLength;
    
        LinkOption
        lo;
        
    
        
    
        lft = new LogForTesting();
        prn = new Printer();
        
        
        /*
        sfcA = new SystemFilesContainer_Alpha();
        sfcA.readFromSystem();
        results = sfcA.stringArrayAllPaths_CompareFileExtensions("txt");
    
    
    
        lft.printListLog(results, "results", "log");
        */
        
        
        
        roots = File.listRoots();
        rootsLength = roots.length;
    
        System.out.println(rootsLength);
        
        
        for(int i = 0; i < rootsLength; i++)
        {
            File
            currentFile;
            
            boolean
            isRegularFile;
            
            String
            absolutePath;
            
            Path
            currentPath,
            dir,
            symPath,
            tempFile;
    
    
    
            absolutePath = "C:\\Windows\\mib.bin";
            
    /*
            currentFile = roots[i];
            absolutePath = currentFile.getAbsolutePath();
            currentPath = currentFile.toPath();
    */
    
            currentFile = new File(absolutePath);
            currentPath = currentFile.toPath();
            
    
        
            
    
            
            dir = Files.createTempDirectory("test-dir");
            tempFile = Files.createTempFile(dir, "test-file", ".txt");
            symPath = Files.createSymbolicLink(dir.resolve("sym-" + currentPath.getFileName()), currentPath);
            isRegularFile = Files.isRegularFile(symPath);
    
    
            System.out.println(absolutePath);
            System.out.println(currentFile.exists());
            System.out.println(isRegularFile);
           
           
        
          
        }
    
    }
    
 
}