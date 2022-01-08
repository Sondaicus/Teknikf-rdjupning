package systemPathsCollector;



import java.io.File;
import java.util.*;



public class SystemFilesContainer implements ContainerAndOptions
{
    /*Start: global variables.*/
        protected static List <SystemPath>
        allSystemPaths,
        allSystemPathsFolder,
        allSystemPathsFile;
    /*End: global variables.*/
    
    
    
    /*Start: constructors.*/
        public SystemFilesContainer()
        {}
    /*End: constructors.*/
    
    
    
    /*Start: public methods.*/
        /*Start: setting global variables.*/
            public void readFromSystem()
            {
                allSystemPaths = sendAndReceive();
                setSubLists();
            
            }
            
            public void clearLists()
            {
                allSystemPaths.clear();
                allSystemPathsFolder.clear();
                allSystemPathsFile.clear();
            
            }
        /*End: setting global variables.*/
    
        /*Start: get class List results.*/
            /*Start: all types.*/
                /*Start: String[]s.*/
                    public String[] stringArrayAllPaths()
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths(String target)
                    {
                        String[]
                        results;
                    
                    
                    
                        results = returnListContentAsStringArray(target, allSystemPaths, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths(String[] targets)
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(targets, allSystemPaths, true, true);
                        
                        
                        
                        return results;
                        
                    }
            
                    public String[] stringArrayAllPaths(String target, boolean useFileExtension)
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(target, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths(String[] targets, boolean useFileExtension)
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(targets, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                /*End: String[]s.*/
    
                /*Start: File[]s.*/
                    public File[] fileArrayAllPaths()
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String target)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(target, allSystemPaths, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String[] targets)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(targets, allSystemPaths, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String target, boolean useFileExtension)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(target, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String[] targets, boolean useFileExtension)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(targets, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                /*End: File[]s.*/
            /*End: all types.*/
        
            /*Start: folders.*/
                /*Start: String[]s.*/
                    public String[] stringArrayFolders()
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(allSystemPathsFolder);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFolders(String target)
                    {
                        String[]
                        results;
                    
                    
                    
                        results = returnListContentAsStringArray(target, allSystemPathsFolder, false, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFolders(String[] targets)
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(targets, allSystemPathsFolder, false, true);
                        
                        
                        
                        return results;
                        
                    }
                /*End: String[]s.*/
    
                /*Start: File[]s.*/
                    public File[] fileArrayFolders()
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(allSystemPathsFolder);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFolders(String target)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(target, allSystemPathsFolder, false, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFolders(String[] targets)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(targets, allSystemPathsFolder, false, true);
                        
                        
                        
                        return results;
                        
                    }
                /*End: File[]s.*/
            /*End: folders.*/
        
            /*Start: files.*/
                /*Start: String[]s.*/
                    public String[] stringArrayFiles()
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String target)
                    {
                        String[]
                        results;
                    
                    
                    
                        results = returnListContentAsStringArray(target, allSystemPathsFile, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String[] targets)
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(targets, allSystemPathsFile, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String target, boolean useFileExtension)
                    {
                        String[]
                        results;
                        
                        
                        
                        results = returnListContentAsStringArray(target, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String[] targets, boolean useFileExtension)
                    {
                        String[]
                        results;
    
    
    
                        results = returnListContentAsStringArray(targets, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                /*End: String[]s.*/
    
                /*Start: File[]s.*/
                    public File[] fileArrayFiles()
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String target)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(target, allSystemPathsFile, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String[] targets)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(targets, allSystemPathsFile, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String target, boolean useFileExtension)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(target, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String[] targets, boolean useFileExtension)
                    {
                        File[]
                        results;
                        
                        
                        
                        results = returnListContentAsFileArray(targets, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                /*End: File[]s.*/
            /*End: files.*/
        /*End: get class List results.*/
    /*End: public methods.*/
    
    
    
    /*Start: protected methods.*/
        /*Start: initialize global variables.*/
            protected void setSubLists()
            {
                setSubListsSystemFilesContainer();
                
            }
            
            protected void setSubListsSystemFilesContainer()
            {
                setListOnlyFolders();
                setListOnlyFiles();
                
            }
        /*End: initialize global variables.*/
    
        /*Start: return List contents.*/
            /*Start: String[]s.*/
                protected String[] returnListContentAsStringArray(List<SystemPath> inputList)
                {
                    String[]
                    results;
               
                    
           
                    results = convertListContentAsStringArray(inputList);
                    
                    
                    
                    return results;
                    
                }
            
                protected String[] returnListContentAsStringArray(String inputString, List<SystemPath> inputList,
                                                                  boolean searchForFile, boolean useFileExtension)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
            
            
            
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray(String[] inputStrings, List<SystemPath> inputList,
                                                                  boolean searchForFile, boolean useFileExtension)
                {
                    String[]
                    results;
            
                    List<SystemPath>
                    listResults;
            
            
            
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension);
                    results = convertListContentAsStringArray(listResults);
            
            
            
                    return results;
                    
                }
            /*End: String[]s.*/
    
            /*Start: File[]s.*/
                protected File[] returnListContentAsFileArray(List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    
                    
                    results = convertListContentAsFileArray(inputList);
                    
                    
                    
                    return results;
                    
                }
            
                protected File[] returnListContentAsFileArray(String inputString, List<SystemPath> inputList,
                                                              boolean searchForFile, boolean useFileExtension)
                {
                    File[]
                    results;
            
                    List<SystemPath>
                    listResults;
            
            
            
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension);
                    results = convertListContentAsFileArray(listResults);
            
            
                    
            
                    return results;
                    
                }
            
                protected File[] returnListContentAsFileArray(String[] inputStrings, List<SystemPath> inputList,
                                                              boolean searchForFile, boolean useFileExtension)
                {
                    File[]
                    results;
            
                    List<SystemPath>
                    listResults;
            
            
            
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension);
                    results = convertListContentAsFileArray(listResults);
            
            
            
                    return results;
                    
                }
            /*End: File[]s.*/
    
            /*Start: List<String>s.*/
                protected List<String> returnListContentAsStringList(List<SystemPath> inputList)
                {
                    List<String>
                    results;
    
    
    
                    results = convertListContentAsListString(inputList);
    
    
    
                    return results;
                
                }
    
                protected List<String> returnListContentAsStringList(String inputString, List<SystemPath> inputList,
                                                                     boolean searchForFile, boolean useFileExtension)
                {
                    List<String>
                    results;
    
                    List<SystemPath>
                    listResults;
    
    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension);
                    results = convertListContentAsListString(listResults);
    
    
    
                    return results;
                    
                }
    
                protected List<String> returnListContentAsStringList(String[] inputStrings, List<SystemPath> inputList,
                                                                     boolean searchForFile, boolean useFileExtension)
                {
                    List<String>
                    results;
    
                    List<SystemPath>
                    listResults;
    
    
    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension);
                    results = convertListContentAsListString(listResults);
    
    
    
                    return results;
                    
                    
                }
            /*End: List<String>s.*/
    
            /*Start: List<File>s.*/
                protected List<File> returnListContentAsFileList(List<SystemPath> inputList)
                {
                    List<File>
                    results;
    
    
    
                    results = convertListContentAsListFile(inputList);
    
    
    
                    return results;
                
                }
    
                protected List<File> returnListContentAsFileList(String inputString, List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension)
                {
                    List<File>
                    results;
    
                    List<SystemPath>
                    listResults;
    
    
    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension);
                    results = convertListContentAsListFile(listResults);
    
    
    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList(String[] inputStrings, List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension)
                {
                    List<File>
                    results;
    
                    List<SystemPath>
                    listResults;
    
    
    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension);
                    results = convertListContentAsListFile(listResults);
    
    
    
                    return results;
                    
                }
            /*End: List<File>s.*/
        /*End: return List contents.*/
    /*End: protected methods.*/
    
    
    
    /*Start: private methods.*/
        /*Start: set global Lists.*/
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
        /*End: set global Lists.*/
    
        /*Start: conversions of Lists.*/
            protected String[] convertListContentAsStringArray(List<SystemPath> inputList)
            {
                String[]
                results;
                
                int
                inputListSize;
    
    
    
                inputListSize = inputList.size();
                results = new String[inputListSize];
                
                
                
                for(int i = 0; i < inputListSize; i++)
                {
                    String
                    currentPathString;
                    
                    SystemPath
                    currentPathSP;
                    
                    
                    
                    currentPathSP = inputList.get(i);
                    currentPathString = currentPathSP.getAbsoluteString();
                    
                    
                    
                    results[i] = currentPathString;
                    
                }
                
                
                
                return results;
                
            }
            
            protected File[] convertListContentAsFileArray(List<SystemPath> inputList)
            {
                File[]
                results;
                
                int
                inputListSize;
    
    
    
                inputListSize = inputList.size();
                results = new File[inputListSize];
                
                
                
                for(int i = 0; i < inputListSize; i++)
                {
                    File
                    currentPathFile;
                    
                    SystemPath
                    currentPathSP;
                    
                    
                    
                    currentPathSP = inputList.get(i);
                    currentPathFile = currentPathSP.getAbsoluteFile();
                    
                    
                    
                    results[i] = currentPathFile;
                    
                }
                
                
                
                return results;
                
            }
    
            protected List<String> convertListContentAsListString(List<SystemPath> inputList)
            {
                List<String>
                results;
    
    
    
                results = new ArrayList<String>();
                
                
                
                inputList.stream()
                .forEach(sp -> results.add(sp.getAbsoluteString()));
    
    
                
                return results;
                
            }
    
            protected List<File> convertListContentAsListFile(List<SystemPath> inputList)
            {
                List<File>
                results;
    
    
    
                results = new ArrayList<File>();
    
    
    
                inputList.stream()
                .forEach(sp -> results.add(sp.getAbsoluteFile()));
    
    
    
                return results;
                
            }
        /*End: conversions of Lists.*/
    
        /*Start: searching List for matches.*/
            private List<SystemPath> searchListForMatch(String inputString, List<SystemPath> inputList,
                                                        boolean searchForFile, boolean useFileExtension)
            {
                List<SystemPath>
                returnResults,
                sortDistinct;
                
                
                
                returnResults = new ArrayList<SystemPath>();
                sortDistinct = new ArrayList<SystemPath>();
                
                
                
                inputList.stream()
                .filter(sp -> sp.getFileNameString().equals(inputString))
                .forEach(sp -> sortDistinct.add(sp));
                
                
                
                if(searchForFile && !useFileExtension)
                {
                    List<SystemPath>
                    inputListWithoutFileExtensions;
                    
                    
                    
                    inputListWithoutFileExtensions = compareFilesWithoutExtension(inputString, inputList);
                    
                    
                    
                    sortDistinct.addAll(inputListWithoutFileExtensions);
                    
                }
                
                
                
                sortDistinct.stream()
                .distinct()
                .forEach(sp -> returnResults.add(sp));
                
                
                
                return returnResults;
                
            }
            
            private List<SystemPath> searchListForMatch(String[] inputStrings, List<SystemPath> inputList,
                                                        boolean searchForFile, boolean useFileExtension)
            {
                List<SystemPath>
                results;
                
                int
                inputStringsLength;
                
                
                
                results = new ArrayList<SystemPath>();
                inputStringsLength = inputStrings.length;
                
                
                
                for(int i1 = 0; i1 < inputStringsLength; i1++)
                {
                    String
                    currentInputString;
                    
                    int
                    currentMatchListSize;
                    
                    List<SystemPath>
                    currentMatchList;
                    
                    
                    
                    currentInputString = inputStrings[i1];
                    currentMatchList = searchListForMatch(currentInputString, inputList, searchForFile, useFileExtension);
                    currentMatchListSize = currentMatchList.size();
                    
                    
                    
                    for(int i2 = 0; i2 < currentMatchListSize; i2++)
                    {
                        SystemPath
                        currentSystemPath;
                        
                        
                        
                        currentSystemPath = currentMatchList.get(i2);
                        results.add(currentSystemPath);
                        
                    }
                    
                }
                
                
                
                return results;
                
            }
        /*End: searching List for matches.*/
        
        /*Start: String management.*/
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
        
            private String[] collectPotentialFileAndExtension(String currentFileName)
            {
                String[]
                results;
                
                String
                resultFileName,
                resultFileExtension;
                
                int
                indexOfFileExtension;
                
                
                
                results = new String[2];
                indexOfFileExtension = currentFileName.lastIndexOf(".");
                
                
                
                if(indexOfFileExtension == -1)
                {
                    resultFileName = currentFileName;
                    resultFileExtension = "";
                    
                }
                else
                {
                    int
                    lengthOfFileName;
                    
                    
                    
                    lengthOfFileName = currentFileName.length();
                    
                    resultFileName = currentFileName.substring(0, indexOfFileExtension);
                    resultFileExtension = currentFileName.substring(indexOfFileExtension, lengthOfFileName);
                    
                }
                
                results[0] = resultFileName;
                results[1] = resultFileExtension;
                
                
                
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
            
            private List<SystemPath> compareFilesWithoutExtension(String inputString, List<SystemPath> inputList)
            {
                List<SystemPath>
                filesWithExtensions,
                filesWithoutExtensions,
                matchedFilesWithoutExtensions,
                matchedFilesWithExtensions;
            
                List<Object[]>
                filesAndExtensions;
            
                int
                filesWithExtensionsSize,
                matchedFilesWithoutExtensionsSize,
                filesAndExtensionsSize;
            
            
                
                filesWithExtensions = new ArrayList<SystemPath>();
                filesWithoutExtensions = new ArrayList<SystemPath>();
                matchedFilesWithoutExtensions = new ArrayList<SystemPath>();
                matchedFilesWithExtensions = new ArrayList<SystemPath>();
                filesAndExtensions = new ArrayList<Object[]>();
                
            
            
                inputList.stream()
                .filter(sp -> sp.getIsFile())
                .filter(sp -> checkPotentialFileExtension(sp.getFileNameString()))
                .forEach(sp -> filesWithExtensions.add(sp));
            
                filesWithExtensionsSize = filesWithExtensions.size();
                
            
            
                for(int i = 0; i < filesWithExtensionsSize; i++)
                {
                    SystemPath
                    currentSystemPath,
                    newSystemPath;
                
                    String
                    currentFileAdress,
                    newFileAdress,
                    newFileExtension;
                
                    String[]
                    newFileAndExtension;
                    
                
                    
                    currentSystemPath = filesWithExtensions.get(i);
                    currentFileAdress = currentSystemPath.getAbsoluteString();
                    newFileAndExtension = collectPotentialFileAndExtension(currentFileAdress);
                
                    newFileAdress = newFileAndExtension[0];
                    newFileExtension = newFileAndExtension[1];
                
                
                
                    newSystemPath = new SystemPath(newFileAdress);
                
                
                
                    if(newFileExtension.length() > 0)
                    {
                        Object[]
                        fileAndExtension;
                    
                    
                    
                        fileAndExtension = new Object[2];
                    
                    
                    
                        fileAndExtension[0] = newSystemPath;
                        fileAndExtension[1] = newFileExtension;
                    
                    
                    
                        filesAndExtensions.add(fileAndExtension);
                    
                    }
            
            
            
                    filesWithoutExtensions.add(newSystemPath);
                
                }
            
                filesAndExtensionsSize = filesAndExtensions.size();
            
            
            
                filesWithoutExtensions.stream()
                .filter(sp -> sp.getFileNameString().equals(inputString))
                .forEach(sp -> matchedFilesWithoutExtensions.add(sp));
            
            
            
                matchedFilesWithoutExtensionsSize = matchedFilesWithoutExtensions.size();
                
                
            
                for(int i1 = 0; i1 < filesAndExtensionsSize; i1++)
                {
                    Object[]
                    currentIndexObject;
                
                    SystemPath
                    currentSystemPath_FAE;
                
                    String
                    currentAbsoluteString_FAE,
                    currentFileExtension_FAE;
            
            
            
                    currentIndexObject = filesAndExtensions.get(i1);
                    currentSystemPath_FAE = (SystemPath) currentIndexObject[0];
                    currentAbsoluteString_FAE = currentSystemPath_FAE.getAbsoluteString();
                    currentFileExtension_FAE = (String) currentIndexObject[1];
                    
                
                
                    for(int i2 = 0; i2 < matchedFilesWithoutExtensionsSize; i2++)
                    {
                        SystemPath
                        currentSystemPath_MFWE;
                    
                        String
                        currentAbsoluteString_MFWE;
                    
                    
                    
                        currentSystemPath_MFWE = matchedFilesWithoutExtensions.get(i2);
                        currentAbsoluteString_MFWE = currentSystemPath_MFWE.getAbsoluteString();
                    
                    
                    
                        if(currentAbsoluteString_MFWE.equals(currentAbsoluteString_FAE))
                        {
                            String
                            fullPathWithFileExtension;
                        
                            SystemPath
                            addSystemPath;
                        
                        
                        
                            fullPathWithFileExtension =
                            currentAbsoluteString_MFWE + currentFileExtension_FAE;
                            
                            addSystemPath = new SystemPath(fullPathWithFileExtension);
            
            
            
                            matchedFilesWithExtensions.add(addSystemPath);
                        
                        }
                    
                    }
                
                }
                
                
                
                return matchedFilesWithExtensions;
                
            }
        /*End: String management.*/
    /*End: private methods.*/

}