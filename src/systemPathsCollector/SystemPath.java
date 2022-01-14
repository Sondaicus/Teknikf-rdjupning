package systemPathsCollector;



import java.io.File;
import java.util.Locale;



public class SystemPath extends SystemPath_Alpha
{
    protected boolean
    isHidden;
    
    
    
    protected SystemPath()
    {}
    
    SystemPath(File file)
    {
        setVariables(file);
        
    }
    
    SystemPath(String filePath)
    {
        setVariables(filePath);
        
    }
    
    
    
    protected void setVariables(File file)
    {
        setVariables_Alpha(file);
        setVariables_Beta();
        
    }
    
    protected void setVariables(String filePath)
    {
        setVariables_Alpha(filePath);
        setVariables_Beta();
        
    }
    
    
    
    protected void setVariables_Beta()
    {
        setIsHidden();
        
    }
    
    
    
    private void setIsHidden()
    {
        if(absoluteFile.isHidden())
        {
            this.isHidden = true;
            
        }
        else
        {
            this.isHidden = false;
            
        }
        
    }
    
    
    
    boolean getIsHidden()
    {
        return isHidden;
        
    }
    
}