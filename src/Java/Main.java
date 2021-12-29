package Java;



import systemPathsCollector.*;



public class Main
{
    public static void main(String[] args)
    {
        SystemFilesContainer
        sfc;
        
        
        
	    sfc = new SystemFilesContainer();
        sfc.readFromSystem();
        sfc.returnAllResultsAsList("systemPathsCollector");
        
        
    }
}
