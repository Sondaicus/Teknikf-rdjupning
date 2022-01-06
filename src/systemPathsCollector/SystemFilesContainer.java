package systemPathsCollector;



import java.io.File;
import java.util.*;



public class SystemFilesContainer implements ContainerAndOptions
{
    private static List <SystemPath>
    allSystemPaths,
    allSystemPathsFolder,
    allSystemPathsFile;
    
    
    
    public SystemFilesContainer()
    {}
    
    
    
    public void readFromSystem()
    {
        allSystemPaths = sendAndReceive();
        setSubLists();
    
    }
    
    public void clearLists()
    {
    
    }
    
    
    
    /*Start: get class List results.*/
        /*Start: all types.*/
            /*Start: String[]s.*/
                public String[] returnAllResultsAsStringArray()
                {
                    String[]
                    results;
                    
                    
                    
                    results = returnListContentAsStringArray(allSystemPaths);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllResultsAsStringArray(String target)
                {
                    String[]
                    results;
                
                
                
                    results = convertListSearchToStringArray(target, allSystemPaths, true, true);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllResultsAsStringArray(String[] targets)
                {
                    String[]
                    results;
                    
                    
                    
                    results = convertListSearchToStringArray(targets, allSystemPaths, true, true);
                    
                    
                    
                    return results;
                    
                }
        
                public String[] returnAllResultsAsStringArray(String target, boolean useFileExtension)
                {
                    String[]
                    results;
                    
                    
                    
                    results = convertListSearchToStringArray(target, allSystemPaths, true, useFileExtension);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllResultsAsStringArray(String[] targets, boolean useFileExtension)
                {
                    String[]
                    results;
                    
                    
                    
                    results = convertListSearchToStringArray(targets, allSystemPaths, true, useFileExtension);
                    
                    
                    
                    return results;
                    
                }
            /*End: String[]s.*/
        /*End: all types.*/
    
        /*Start: folders.*/
            /*Start: String[]s.*/
                public String[] returnAllFoldersAsStringArray()
                {
                    String[]
                    results;
                    
                    
                    
                    results = returnListContentAsStringArray(allSystemPathsFolder);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllFoldersAsStringArray(String target)
                {
                    String[]
                    results;
                
                
                
                    results = convertListSearchToStringArray(target, allSystemPathsFolder, false, true);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllFoldersAsStringArray(String[] targets)
                {
                    String[]
                    results;
                    
                    
                    
                    results = convertListSearchToStringArray(targets, allSystemPathsFolder, false, true);
                    
                    
                    
                    return results;
                    
                }
            /*End: String[]s.*/
        /*End: folders.*/
    
        /*Start: files.*/
            /*Start: String[]s.*/
                public String[] returnAllFilesAsStringArray()
                {
                    String[]
                    results;
                    
                    
                    
                    results = returnListContentAsStringArray(allSystemPathsFile);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllFilesAsStringArray(String target)
                {
                    String[]
                    results;
                
                
                
                    results = convertListSearchToStringArray(target, allSystemPathsFile, true, true);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllFilesAsStringArray(String[] targets)
                {
                    String[]
                    results;
                    
                    
                    
                    results = convertListSearchToStringArray(targets, allSystemPathsFile, true, true);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllFilesAsStringArray(String target, boolean useFileExtension)
                {
                    String[]
                    results;
                    
                    
                    
                    results = convertListSearchToStringArray(target, allSystemPathsFile, true, useFileExtension);
                    
                    
                    
                    return results;
                    
                }
                
                public String[] returnAllFilesAsStringArray(String[] targets, boolean useFileExtension)
                {
                    String[]
                    results;
                    
                    
                    
                    results = convertListSearchToStringArray(targets, allSystemPathsFile, true, useFileExtension);
                    
                    
                    
                    return results;
                    
                }
            /*End: String[]s.*/
        /*End: files.*/
    /*End: get class List results.*/
    
    
    
    private void setSubLists()
    {
        setListOnlyFolders();
        setListOnlyFiles();
        
    }
    
    private void setListOnlyFolders()
    {
        allSystemPathsFolder = new ArrayList<SystemPath>();
        
        
    
        allSystemPaths.stream()
        .filter(sp -> sp.getIsDirectory() == true)
        .forEach(sp -> allSystemPathsFolder.add(sp));
        
    }
    
    private void setListOnlyFiles()
    {
        allSystemPathsFile = new ArrayList<SystemPath>();
        
    
    
        allSystemPaths.stream()
        .filter(sp -> sp.getIsFile() == true)
        .forEach(sp -> allSystemPathsFile.add(sp));
    
    }
    
    private String[] returnListContentAsStringArray(List<SystemPath> input)
    {
        int
        listSize;
    
        String[]
        results;
    
    
        
        listSize = input.size();
        results = new String[listSize];
    
    
    
        for(int i = 0; i < listSize; i++)
        {
            String
            currentPathString;
        
            SystemPath
            currentPathSP;
        
        
        
            currentPathSP = input.get(i);
            currentPathString = currentPathSP.getAbsoluteString();
        
        
        
            results[i] = currentPathString;
        
        }
    
    
    
        return results;
        
    }
    
    private List<SystemPath> searchListForMatch(String inputString, List<SystemPath> inputList,
                                                     boolean searchForFile, boolean useFileExtension)
    {
        List<SystemPath>
        results,
        inputListHolder;
        
        int
        inputListSize;
    
    
    
        results = new ArrayList<SystemPath>();
        inputListHolder = inputList;
    
    
        if(searchForFile && !useFileExtension)
        {
            inputList.stream()
            .filter(sp -> checkPotentialFileExtension(sp.getFileNameString()))
            .forEach(sp -> inputListHolder.add(sp));
            
            
        }
    
    
    
    
        inputList.stream()
        .filter(sp -> sp.getFileNameString().equals(inputString))
        .forEach(sp -> results.add(sp));
    
    
        inputList.stream()
        .forEach(sp -> removePotentialFileExtension(sp.getFileNameString()));
        
        
        
        
        for(int i = 0; i < inputListSize; i++)
        {
            SystemPath
            currentSystemPath;
            
            File
            currentFile;
            
            String
            currentFileName,
            resultFileName;
    
    
    
            currentSystemPath = inputList.get(i);
            currentFile = currentSystemPath.getAbsoluteFile();
            currentFileName = currentFile.getName();
            
            
            
            if(searchForFile && !useFileExtension)
            {
                int
                indexOfFileExtension;
    
    
                
                indexOfFileExtension = currentFileName.lastIndexOf(".");
                
                
                
                if(indexOfFileExtension == -1)
                {
                    resultFileName = currentFileName;
                    
                }
                else
                {
                    resultFileName = currentFileName.substring(0, indexOfFileExtension);
                    
                }
            
            }
            else
            {
                resultFileName = currentFileName;
                
            }
            
            
            
            if(resultFileName.equals(inputString))
            {
                SystemPath
                resultSystemPath;
                
                
                
                resultSystemPath = new SystemPath(currentFile);
    
                results.add(resultSystemPath);
                
            }
            
        }
        
        
        return results;
        
    }
    
    private boolean checkPotentialFileExtension(String currentFileName)
    {
        String
        resultFileName;
        
        boolean
        result;
    
    
    
        resultFileName = removePotentialFileExtension(currentFileName);
        
        
        
        if(resultFileName.equals(currentFileName))
        {
            result = false;
            
        }
        else
        {
            result = true;
            
        }
        
        
        
        return result;
        
    }
    
    private String removePotentialFileExtension(String currentFileName)
    {
        String
        resultFileName;
        
        int
        indexOfFileExtension;
    
    
    
        indexOfFileExtension = currentFileName.lastIndexOf(".");
    
    
    
        if(indexOfFileExtension == -1)
        {
            resultFileName = currentFileName;
        
        }
        else
        {
            resultFileName = currentFileName.substring(0, indexOfFileExtension);
        
        }
        
        
        
        return resultFileName;
        
    }
 
    private String[] convertListSearchToStringArray(String inputString, List<SystemPath> inputList,
                                                    boolean searchForFile, boolean useFileExtension)
    {
        String[]
        results;
    
        List<SystemPath>
        resultList;
    
    
    
        resultList = searchListForMatch(inputString, inputList, searchForFile, useFileExtension);
        results = returnListContentAsStringArray(resultList);
    
    
    
        return results;
        
    }
    
    private String[] convertListSearchToStringArray(String[] inputStrings, List<SystemPath> inputList,
                                                    boolean searchForFile, boolean useFileExtension)
    {
        String[]
        results,
        resultsCounterHolder;
        
        List<String[]>
        resultList;
        
        int
        inputStringsLength,
        resultsLength,
        resultsListLength,
        resultsIndexCounter;
    
        
    
        inputStringsLength = inputStrings.length;
        resultList = new ArrayList<String[]>();
        resultsIndexCounter = 0;
        resultsLength = 0;
        
        
        
        for(int i = 0; i < inputStringsLength; i++)
        {
            String
            currentString;
            
            int
            resultsCounterHolderLength;
    
    
    
            currentString = inputStrings[i];
    
    
    
            resultsCounterHolder = convertListSearchToStringArray(currentString, inputList, searchForFile,
                                                          useFileExtension);
            resultsCounterHolderLength = resultsCounterHolder.length;
            resultsLength = resultsLength + resultsCounterHolderLength;
            
            resultList.add(resultsCounterHolder);
            
        }
        
        
    
        resultsListLength = resultList.size();
        results = new String[resultsLength];
        
        
        
        for(int i1 = 0; i1 < resultsListLength; i1++)
        {
            String[]
            resultsListIndexArray;
            
            int
            resultsListIndexArrayLength;
    
    
    
            resultsListIndexArray = resultList.get(i1);
            resultsListIndexArrayLength = resultsListIndexArray.length;
            
            
            
            
            for(int i2 = 0; i2 < resultsListIndexArrayLength; i2++)
            {
                String
                resultsListIndexString;
    
    
    
                resultsListIndexString = resultsListIndexArray[i2];
    
    
    
                results[resultsIndexCounter] = resultsListIndexString;
                ++resultsIndexCounter;
                
            }
        }
        
        
        
        return results;
        
    }
    
  
    
 /*   public void returnAllResultsAsList(String target)
    {
        int
        listSize;
        
        List
        result;
    
    
    
        listSize = allSystemPaths.size();
    
    
    
       
        
        for(int i = 0; i < listSize; i++)
        {
            int iteration = i;
    
          result = allSystemPaths.stream().distinct().findAny(allSystemPaths -> ));
    
    
            result = allSystemPaths.stream().distinct().filter(fuck -> allSystemPaths.get(iteration));
    
            String f;
            
            f = allSystemPaths.get(iteration);
    
            result = allSystemPaths.stream().distinct().filter(allSystemPaths -> target.contains(f)).toList();
    
    
            System.out.println(result);
            System.out.println();
            
    
        }
        
        
        
        return result;
    
    
 
        
    }*/
    
  /*  public void returnAllResultsAsList(Path target)
    {
    
    }
    */
    /*
    public String returnAllResultsAsString(String target)
    {
    
    }
    */
    

}