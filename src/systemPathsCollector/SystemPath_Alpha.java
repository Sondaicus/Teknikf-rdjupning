package systemPathsCollector;



import java.io.*;
import java.util.Locale;



public class SystemPath_Alpha
{
    protected File
    absoluteFile;
    
    protected String
    absoluteString,
    fileName,
    fileNameWithoutExtension,
    fileExtension,
    filePathWithoutExtension,
    fileNameLowerCase,
    fileNameWithoutExtensionLowerCase,
    fileExtensionLowerCase;
    
    protected boolean
    isDirectory,
    isFile,
    hasExtension;
    
    
    
    protected SystemPath_Alpha()
    {}
    
    SystemPath_Alpha(File file)
    {
        setVariables(file);
        
    }
    
    SystemPath_Alpha(String filePath)
    {
        setVariables(filePath);
        
    }
    
    protected void setVariables(File file)
    {
        setVariables_Alpha(file);
        
    }
    
    protected void setVariables(String filePath)
    {
        setVariables_Alpha(filePath);
        
    }
    
    
    
    protected void setVariables_Alpha(File file)
    {
        setAbsoluteFile(file);
        setAbsoluteString();
        setFileName();
        setIsDirectory();
        setIsFile();
        setHasExtension();
        setFileNameWithoutExtension();
        setFileExtension();
        setFilePathWithoutExtension();
        setFileNameLowerCase();
        setFileNameWithoutExtensionLowerCase();
        setFileExtensionLowerCase();
        
    }
    
    protected void setVariables_Alpha(String filePath)
    {
        File
        file;
    
    
    
        file = new File(filePath);
    
    
    
        setVariables_Alpha(file);
        
    }
    
    
    
    private void setAbsoluteFile(File file)
    {
        this.absoluteFile = file;
        
    }
    
    private void setAbsoluteString()
    {
        this.absoluteString = absoluteFile.getAbsolutePath();
        
    }
    
    private void setFileName()
    {
        String
        result;
    
    
    
        result = absoluteFile.getName();
        
        
        
        this.fileName = result;
        
    }
    
    private void setIsDirectory()
    {
        this.isDirectory = absoluteFile.isDirectory();
    
    }
    
    private void setIsFile()
    {
        this.isFile = absoluteFile.isFile();
        
    }
    
    private void setHasExtension()
    {
        if(isFile)
        {
            int
            indexOfFileExtension;
            
            
            indexOfFileExtension = fileName.lastIndexOf(".");
            
            
            
            if(indexOfFileExtension == -1)
            {
                this.hasExtension = false;
                
            }
            else
            {
                this.hasExtension = true;
                
            }
            
        }
        else
        {
            this.hasExtension = false;
            
        }
        
    }
    
    private void setFileNameWithoutExtension()
    {
        if(hasExtension)
        {
            String
            result;
            
            int
            indexOfFileExtension;
            
            
            
            indexOfFileExtension = fileName.lastIndexOf(".");
            result = fileName.substring(0, indexOfFileExtension);
            
            
            
            this.fileNameWithoutExtension = result;
            
        }
        else
        {
            this.fileNameWithoutExtension = fileName;
            
        }
        
    }
    
    private void setFileExtension()
    {
        if(hasExtension)
        {
            String
            result;
            
            int
            indexOfFileExtension,
            lengthOfFileName;
            
            
            
            indexOfFileExtension = fileName.lastIndexOf(".");
            lengthOfFileName = fileName.length();
            result = fileName.substring(indexOfFileExtension, lengthOfFileName);
            
            
            
            this.fileExtension = result;
            
        }
        else
        {
            this.fileExtension = null;
            
        }
        
    }
    
    private void setFilePathWithoutExtension()
    {
        if(hasExtension)
        {
            String
            result;
            
            int
            indexOfFileExtension;
            
            
            
            indexOfFileExtension = absoluteString.lastIndexOf(".");
            result = absoluteString.substring(0, indexOfFileExtension);
            
            
            
            this.filePathWithoutExtension = result;
            
        }
        else
        {
            this.filePathWithoutExtension = absoluteString;
            
        }
        
    }
    
    private void setFileNameLowerCase()
    {
        String
        result;
        
        
        
        result = fileName.toLowerCase(Locale.ROOT);
        
        
        
        this.fileNameLowerCase = result;
        
    }
    
    private void setFileNameWithoutExtensionLowerCase()
    {
        String
        result;
        
        
        
        result = fileNameWithoutExtension.toLowerCase(Locale.ROOT);
        
        
        
        this.fileNameWithoutExtensionLowerCase = result;
        
    }
    
    private void setFileExtensionLowerCase()
    {
        if(hasExtension)
        {
            String result;
    
    
            result = fileExtension.toLowerCase(Locale.ROOT);
    
    
            this.fileExtensionLowerCase = result;
            
        }
        else
        {
            this.fileExtensionLowerCase = null;
            
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
    
    String getFileName()
    {
        return fileName;
        
    }
    
    String getFileNameWithoutExtension()
    {
        return fileNameWithoutExtension;
        
    }
    
    String getFileExtension()
    {
        return fileExtension;
        
    }
    
    String getFilePathWithoutExtension()
    {
        return filePathWithoutExtension;
        
    }
    
    String getFileNameLowerCase()
    {
        return fileNameLowerCase;
        
    }
    
    String getFileNameWithoutExtensionLowerCase()
    {
        return fileNameWithoutExtensionLowerCase;
        
    }
    
    String getFileExtensionLowerCase()
    {
        return fileExtensionLowerCase;
        
    }
    
    boolean getIsDirectory()
    {
        return isDirectory;
        
    }
    
    boolean getIsFile()
    {
        return isFile;
        
    }
    
    boolean getHasExtension()
    {
        return hasExtension;
        
    }
    
}