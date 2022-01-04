package Java;



import java.io.*;



public class Printer
{
    private String
    fileName,
    fileLocation,
    fileExtension,
    fullFilePath;
    
    
    
    public Printer()
    {
        setFileExtension();
        
    }
    
    public Printer(String fileName)
    {
        setFileExtension();
        setPaths(fileName);
        
    }
    
    
    
    public void print(String content, boolean append) throws IOException
    {
        PrintWriter
        outStream;
    
        
    
        outStream = new PrintWriter (new BufferedWriter(new FileWriter(fullFilePath, append)));
    
        outStream.println(content);
    
        outStream.close();
        
    }
    
    public void setPaths(String fileName)
    {
        setFileName(fileName);
        setFileLocation();
        setFullFilePath();
        
    }
    
    private void setFileExtension()
    {
        this.fileExtension = ".txt";
        
    }
    
    private void setFileName(String fileName)
    {
        this.fileName = fileName;
        
    }
    
    private void setFileLocation()
    {
        String
        folderPath;
        
        
        
        folderPath = "C:\\Users\\axel\\IdeaProjects\\Nackademin\\Kursuppgifter\\Teknikfördjupning\\Projektmapp\\Teknikf-rdjupning\\";
        
        
        
        this.fileLocation = folderPath + fileName;
        
    }
    
    private void setFullFilePath()
    {
        String
        filePathCheck;
        
        boolean
        fileHasExtension;
    
    
        
        fileHasExtension = fileLocation.endsWith(fileExtension);
        
        
        
        if(fileHasExtension)
        {
            this.fullFilePath = fileLocation;
            
        }
        else
        {
            filePathCheck = fileLocation + fileExtension;
    
    
    
            this.fullFilePath = filePathCheck;
            
        }
        
    }
    
}