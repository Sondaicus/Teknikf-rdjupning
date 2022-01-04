package systemPathsCollector;



import systemPathsCollector.OptionsAndSearch;
import java.nio.file.*;
import java.util.*;
import java.io.*;



class CollectChildrenPathsFromFolderInput
{
    private File
    pathValueFile;
    
    CollectChildrenPathsFromFolderInput()
    {}
    
    CollectChildrenPathsFromFolderInput(SystemPath input)
    {
        setFile(input);
        
    }
    
    CollectChildrenPathsFromFolderInput(File input)
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
