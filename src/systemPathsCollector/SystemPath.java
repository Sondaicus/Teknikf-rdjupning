package systemPathsCollector;



import java.nio.file.*;
import java.util.*;
import java.io.*;



public class SystemPath
{
    private String
    absoluteString;
    
    private Path
    absolutePath;
    
    private File
    absoluteFile;
    
    private boolean
    isDirectory,
    isFile;
    
    
    
    SystemPath(File file)
    {
        setVariables(file);
        
    }
    
    
    
    private void setVariables(File file)
    {
        setAbsoluteFile(file);
        setAbsoluteString(file);
        setAbsolutePath(file);
        setIsDirectory(file);
        setIsFile(file);
        
    }
    
    private void setAbsoluteFile(File file)
    {
        this.absoluteFile = file;
        
    }
    
    private void setAbsoluteString(File file)
    {
        this.absoluteString = file.getAbsolutePath();
        
    }
    
    private void setAbsolutePath(File file)
    {
        String
        pathValue;
        
    
    
        pathValue = file.getAbsolutePath();
        this.absolutePath = FileSystems.getDefault().getPath(pathValue);
        
    }
    
    private void setIsDirectory(File file)
    {
        this.isDirectory = file.isDirectory();
        
    }
    
    private void setIsFile(File file)
    {
        this.isFile = file.isFile();
        
    }
    
    
    
    File getAbsoluteFile()
    {
        return absoluteFile;
        
    }
    
    String getAbsoluteString()
    {
        return absoluteString;
        
    }
    
    Path getAbsolutePath()
    {
        return absolutePath;
        
    }
    
    boolean getIsDirectory()
    {
        return isDirectory;
        
    }
    
    boolean getIsFile()
    {
        return isFile;
        
    }
    
}