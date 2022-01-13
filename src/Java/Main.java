package Java;



import systemPathsCollector.*;




public class Main
{
<<<<<<< Updated upstream
    public static void main(String[] args)
=======
    public static void main(String[] args) throws IOException, SystemPathsCollectorException
>>>>>>> Stashed changes
    {
        SystemFilesContainer
        sfc;
        
        
        
	    sfc = new SystemFilesContainer();
        sfc.readFromSystem();
        sfc.returnAllResultsAsList("systemPathsCollector");
        
<<<<<<< Updated upstream
=======
        int
        arraySize;
    
    
    
        lft = new LogForTesting();
	    sfcA = new SystemFilesContainer_Alpha();
    
        test = new String[2];
        test[0] = "JAVA";
        test[1] = ".txt";
    
        sfcA.readFromSystem();
    
        results = sfcA.stringArrayFiles_IgnoreCase_CompareFileExtensions(test);
    
        lft.printListLog(results, "results", "ass");
  
>>>>>>> Stashed changes
        
    }
}
