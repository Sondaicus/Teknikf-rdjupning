package systemPathsCollector;



import java.io.*;



class CollectChildrenPaths
{
    private File
    pathValueFile;
    
    CollectChildrenPaths()
    {}
    
    CollectChildrenPaths(SystemPath input)
    {
        setFile(input);
        
    }
    
    CollectChildrenPaths(File input)
    {
        setFile(input);
        
    }
    
    
    
    void setFile(SystemPath input)
    {
        this.pathValueFile = input.getAbsoluteFile();
        
    }
    
    void setFile(File input)
    {
        this.pathValueFile = input;
        
    }
    
    void clearFile()
    {
        this.pathValueFile = null;
        
    }
    
    File[] getChildren()
    {
        File[]
        children;
    
    
    
        children = pathValueFile.listFiles();
        
        
        
        return children;
        
    }
}
