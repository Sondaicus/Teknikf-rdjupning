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
    isFile,
    isHidden,
    isRoot;
    
    
    
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
        setIsHidden(file);
        setIsRoot(file);
        
    }
    
    private void setAbsoluteFile(File file)
    {
        this.absoluteFile = file;
        
    }
    
    private void setAbsoluteString(File file)
    {
        this.absoluteString = file.getAbsolutePath();
        System.out.println(absoluteString);
        
    }
    
    private void setAbsolutePath(File file)
    {
        String
        pathValue;
        
    
    
        pathValue = file.getAbsolutePath();
        this.absolutePath = FileSystems.getDefault().getPath(pathValue);
        System.out.println(absoluteString);
        
    }
    
    private void setIsDirectory(File file)
    {
        this.isDirectory = file.isDirectory();
        
    }
    
    private void setIsFile(File file)
    {
        this.isFile = file.isFile();
        
    }
    
    private void setIsHidden(File file)
    {
        this.isHidden = file.isHidden();
        
    }
    
    private void setIsRoot(File file)
    {
        File
        parentFile;
    
    
    
        parentFile = file.getParentFile();
        
        if(parentFile == null)
        {
            this.isRoot = true;
            
        }
        else
        {
            this.isRoot = false;
        
        }
        
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
    
    boolean getIsHidden()
    {
        return isHidden;
        
    }
    
    boolean getIsRoot()
    {
        return isRoot;
        
    }
    
}
