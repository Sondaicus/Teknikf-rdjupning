package systemPathsCollector;



import java.io.File;
import java.util.*;



public class SystemFilesContainer_Alpha implements ContainerAndOptions
{
    /*Start: global variables.*/
        protected List <SystemPath>
            allSystemPaths,
            allSystemPathsDirectory,
            allSystemPathsFile;
        
        protected List<List>
        settings;
        
        protected boolean
            systemIsRead;
    /*End: global variables.*/
    
    
    
    /*Start: constructors.*/
        public SystemFilesContainer_Alpha()
        {
            setSystemIsRead(false);
            
        }
    /*End: constructors.*/
    
    
    
    /*Start: public methods.*/
        /*Start: setting global variables.*/
            public void readFromSystem() throws InterruptedException
            {
                collectMainList();
                setSubLists();
                setSystemIsRead(true);
            
            }
            
            public void clearLists()
            {
                clearSubLists();
                setSystemIsRead(false);
            
            }
            
            public boolean systemIsRead()
            {
                return systemIsRead;
                
            }
        /*End: setting global variables.*/
    
        /*Start: get class List results.*/
            /*Start: all types.*/
                /*Start: String[]s.*/
                    public String[] stringArrayAllPaths() throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
            
                    public String[] stringArrayAllPaths(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(target, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(target, allSystemPaths, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPaths, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths(String target, boolean useFileExtension, boolean ignoreCase
                    , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
                        
                        String
                        targetType;
                        
                        
                        
                        checkSystemIsRead();
                        targetType = compareFileExtensions(compareFileExtensions, target);
                        results = returnListContentAsStringArray(targetType, allSystemPaths, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths(String[] targets, boolean useFileExtension,
                                                        boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        targetsType;
                        
                        
                        
                        checkSystemIsRead();
                        targetsType = compareFileExtensions(compareFileExtensions, targets);
                        results = returnListContentAsStringArray(targetsType, allSystemPaths, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_IgnoreCase(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(target, allSystemPaths,
                        true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPaths, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
    
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget,
                        allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
    
                        String
                        fileExtensionTarget;
    
    
    
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayAllPaths_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayAllPaths_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                /*End: String[]s.*/
    
                /*Start: File[]s.*/
                    public File[] fileArrayAllPaths() throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(target, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(targets, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(target, allSystemPaths, true, useFileExtension,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[] results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(targets , allSystemPaths , true ,
                        useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths(String target, boolean useFileExtension, boolean ignoreCase
                    , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        targetType;
                        
                        
                        
                        checkSystemIsRead();
                        targetType = compareFileExtensions(compareFileExtensions, target);
                        results = returnListContentAsFileArray(targetType, allSystemPaths, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths(String[] targets, boolean useFileExtension,
                                                        boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;

                        String[]
                        targetsType;
                        
                        
                        
                        checkSystemIsRead();
                        targetsType = compareFileExtensions(compareFileExtensions, targets);
                        results = returnListContentAsFileArray(targetsType, allSystemPaths, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[] results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_IgnoreCase(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(target, allSystemPaths, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        File[] results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPaths, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[]  fileArrayAllPaths_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget,
                        allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[]  fileArrayAllPaths_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets,
                        allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
    
                        String
                        fileExtensionTarget;
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        File[] results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets , allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        File[] results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets , allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayAllPaths_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayAllPaths_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                /*End: File[]s.*/
    
                /*Start: List<String>s.*/
                    public List<String> stringListAllPaths() throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(allSystemPaths);
        
        
        
                        return results;
        
                    }
        
                    public List<String> stringListAllPaths(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(target, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(targets, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(target, allSystemPaths, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths(String[] targets, boolean useFileExtension,
                                                           boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(targets, allSystemPaths, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListAllPaths(String target, boolean useFileExtension, boolean ignoreCase
                    , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        targetType;
                        
                        
                        
                        checkSystemIsRead();
                        targetType = compareFileExtensions(compareFileExtensions, target);
                        results = returnListContentAsStringList(targetType, allSystemPaths, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths(String[] targets, boolean useFileExtension,
                                                    boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        targetsType;
                        
                        
                        
                        checkSystemIsRead();
                        targetsType = compareFileExtensions(compareFileExtensions, targets);
                        results = returnListContentAsStringList(targetsType, allSystemPaths, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(target, allSystemPaths, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(targets, allSystemPaths, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String>  stringListAllPaths_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                        allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String>  stringListAllPaths_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets,
                        allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListAllPaths_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                        allSystemPaths,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets,
                        allSystemPaths,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListAllPaths_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListAllPaths_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListAllPaths_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListAllPaths_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListAllPaths_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListAllPaths_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                /*End: List<String>s.*/
    
                /*Start: List<File>s.*/
                    public List<File> fileListAllPaths() throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(allSystemPaths);
        
        
        
                        return results;
        
                    }
        
                    public List<File> fileListAllPaths(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(target, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(targets, allSystemPaths, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(target, allSystemPaths, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(targets, allSystemPaths, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListAllPaths(String target, boolean useFileExtension, boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        targetType;
    
    
                        checkSystemIsRead();
                        targetType = compareFileExtensions(compareFileExtensions, target);
                        results = returnListContentAsFileList(targetType, allSystemPaths, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths(String[] targets, boolean useFileExtension, boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        targetsType;
    
                        
    
                        checkSystemIsRead();
                        targetsType = compareFileExtensions(compareFileExtensions, targets);
                        results = returnListContentAsFileList(targetsType, allSystemPaths, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPaths, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(target, allSystemPaths, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(targets, allSystemPaths, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListAllPaths_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                        allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListAllPaths_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets,
                        allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                        allSystemPaths,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets,
                        allSystemPaths,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListAllPaths_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListAllPaths_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListAllPaths_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListAllPaths_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListAllPaths_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListAllPaths_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPaths);
                        
                        
                        
                        return results;
                        
                    }
                /*End: List<File>s.*/
            /*End: all types.*/
        
            /*Start: directories.*/
                /*Start: String[]s.*/
                    public String[] stringArrayDirectories() throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayDirectories(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(target, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayDirectories(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayDirectories(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(target, allSystemPathsDirectory, false, true, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayDirectories(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPathsDirectory, false, true, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayDirectories_IgnoreCase(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayDirectories_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                /*End: String[]s.*/
    
                /*Start: File[]s.*/
                    public File[] fileArrayDirectories() throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayDirectories(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(target, allSystemPathsDirectory, false, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayDirectories(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(targets, allSystemPathsDirectory, false, true);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayDirectories(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(target, allSystemPathsDirectory, false, true, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayDirectories(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(targets, allSystemPathsDirectory, false, true, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayDirectories_IgnoreCase(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayDirectories_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                /*End: File[]s.*/
    
                /*Start: List<String>s.*/
                    public List<String> stringListDirectories() throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListDirectories(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(target, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListDirectories(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(targets, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListDirectories(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(target, allSystemPathsDirectory, false, false,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListDirectories(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(targets, allSystemPathsDirectory, false, false,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListDirectories_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListDirectories_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                /*End: List<String>s.*/
                
                /*Start: List<File>s.*/
                    public List<File> fileListDirectories() throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListDirectories(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(target, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListDirectories(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(targets, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListDirectories(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(target, allSystemPathsDirectory, false, true,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListDirectories(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(targets, allSystemPathsDirectory, false, true,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListDirectories_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListDirectories_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
                        
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsDirectory);
                        
                        
                        
                        return results;
                        
                    }
                /*End: List<File>s.*/
            /*End: directories.*/
        
            /*Start: files.*/
                /*Start: String[]s.*/
                    public String[] stringArrayFiles() throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(target, allSystemPathsFile, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPathsFile, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(target, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(target, allSystemPathsFile, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPathsFile, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles(String target, boolean useFileExtension, boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
                        
                        String
                        targetType;
                        
                        
                        
                        checkSystemIsRead();
                        targetType = compareFileExtensions(compareFileExtensions, target);
                        results = returnListContentAsStringArray(targetType, allSystemPathsFile, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles(String[] targets, boolean useFileExtension, boolean ignoreCase,
                                                        boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        targetsType;
                        
                        
                        
                        checkSystemIsRead();
                        targetsType = compareFileExtensions(compareFileExtensions, targets);
                        results = returnListContentAsStringArray(targetsType, allSystemPathsFile, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_IgnoreCase(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsFile, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsFile, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget,
                        allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets,
                        allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        String[]
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        String[]
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public String[] stringArrayFiles_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public String[] stringArrayFiles_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        String[]
                        results,
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                /*End: String[]s.*/
    
                /*Start: File[]s.*/
                    public File[] fileArrayFiles() throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(target, allSystemPathsFile, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(targets, allSystemPathsFile, true, true);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(target, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(targets, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(target, allSystemPathsFile, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray(targets, allSystemPathsFile, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles(String target, boolean useFileExtension, boolean ignoreCase,
                     boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        targetType;
                        
                        
                        
                        checkSystemIsRead();
                        targetType = compareFileExtensions(compareFileExtensions, target);
                        results = returnListContentAsFileArray(targetType, allSystemPathsFile, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles(String[] targets, boolean useFileExtension, boolean ignoreCase,
                                                        boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        targetsType;
                        
                        
                        
                        checkSystemIsRead();
                        targetsType = compareFileExtensions(compareFileExtensions, targets);
                        results = returnListContentAsFileArray(targetsType, allSystemPathsFile, true,
                        useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_IgnoreCase(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsFile, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsFile, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException,
                                                                                              FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget,
                        allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        File[]
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        File[]
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public File[] fileArrayFiles_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public File[] fileArrayFiles_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        File[]
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                /*End: File[]s.*/
    
                /*Start: List<String>s.*/
                    public List<String> stringListFiles() throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(target, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(targets, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(target, allSystemPathsFile, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList(targets, allSystemPathsFile, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles(String target, boolean useFileExtension, boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        targetType;
                        
                        
                        
                        checkSystemIsRead();
                        targetType = compareFileExtensions(compareFileExtensions, target);
                        results = returnListContentAsStringList(targetType, allSystemPathsFile, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles(String[] targets, boolean useFileExtension, boolean ignoreCase,
                                                   boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        targetsType;
                        
                        
                        
                        checkSystemIsRead();
                        targetsType = compareFileExtensions(compareFileExtensions, targets);
                        results = returnListContentAsStringList(targetsType, allSystemPathsFile, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsFile, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsFile, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                        allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets,
                        allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                        allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets,
                        allSystemPathsFile,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        List<String>
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        List<String>
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<String> stringListFiles_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<String> stringListFiles_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<String>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                /*End: List<String>s.*/
                
                /*Start: List<File>s.*/
                    public List<File> fileListFiles() throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(target, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(targets, allSystemPathsFile, true, useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(target, allSystemPathsFile, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList(targets, allSystemPathsFile, true, useFileExtension, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListFiles(String target, boolean useFileExtension, boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        targetType;
                        
                        
                        
                        checkSystemIsRead();
                        targetType = compareFileExtensions(compareFileExtensions, target);
                        results = returnListContentAsFileList(targetType, allSystemPathsFile, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles(String[] targets, boolean useFileExtension, boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        targetsType;
                        
                        
                        
                        checkSystemIsRead();
                        targetsType = compareFileExtensions(compareFileExtensions, targets);
                        results = returnListContentAsFileList(targetsType, allSystemPathsFile, true, useFileExtension,
                        ignoreCase, compareFileExtensions);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsFile, ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsFile, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsFile, true,
                        useFileExtension);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListFiles_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                        allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListFiles_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets,
                        allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                        allSystemPathsFile,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets,
                        allSystemPathsFile,
                        ignoreCase);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListFiles_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                    {
                        List<File>
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
    
    
    
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListFiles_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                    {
                        List<File>
                        results;
                        
                        
                        
                        checkSystemIsRead();
                        results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListFiles_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListFiles_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String
                        fileExtensionTarget;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTarget = checkFileExtension(target);
                        results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                    
                    public List<File> fileListFiles_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
    
                    public List<File> fileListFiles_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                    {
                        List<File>
                        results;
                        
                        String[]
                        fileExtensionTargets;
                        
                        
                        
                        checkSystemIsRead();
                        fileExtensionTargets = checkFileExtension(targets);
                        results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFile);
                        
                        
                        
                        return results;
                        
                    }
                /*End: List<File>s.*/
            /*End: files.*/
        /*End: get class List results.*/
    /*End: public methods.*/
    
    
    
    /*Start: protected methods.*/
        /*Start: initialize global variables.*/
            protected void collectMainList() throws InterruptedException
            {
                collectMainList_Alpha();
                
            }
    
            protected void collectMainList_Alpha()
            {
                allSystemPaths = sendAndReceive_Alpha();
                
            }
            
            protected void setSubLists()
            {
                setSubLists_Alpha();
                
            }
            
            protected void setSubLists_Alpha()
            {
                setListOnlyDirectories();
                setListOnlyFiles();
                
            }
    
            protected void clearSubLists()
            {
                clearSubLists_Alpha();
                
            }
    
            protected void clearSubLists_Alpha()
            {
                allSystemPaths.clear();
                allSystemPathsDirectory.clear();
                allSystemPathsFile.clear();
                
            }
            
            protected void setSystemIsRead(boolean status)
            {
                this.systemIsRead = status;
                
            }
        /*End: initialize global variables.*/
    
        /*Start: Exceptions.*/
            protected void checkSystemIsRead() throws SystemNotReadException
            {
                if(!systemIsRead)
                {
                    throw new SystemNotReadException();
                    
                }
        
            }
    
            protected String checkFileExtension(String fileExtension) throws FileExtensionNotApprovedException
            {
                String
                returnString;
                
                int
                indexOfFirstDot,
                indexOfLastDot;
    
    
    
                indexOfFirstDot = fileExtension.indexOf(".");
                indexOfLastDot = fileExtension.lastIndexOf(".");
                
                
                
                if(indexOfFirstDot == -1)
                {
                    returnString = "." + fileExtension;
                    
                }
                else
                {
                    if(!fileExtension.startsWith("."))
                    {
                        throw new FileExtensionNotApprovedException();
                        
                    }
                    else if(indexOfFirstDot != indexOfLastDot)
                    {
                        throw new FileExtensionNotApprovedException();
                        
                    }
                    else
                    {
                        returnString = fileExtension;
                        
                    }
                    
                }
                
                
                
                return returnString;
                
            }
    
            protected String[] checkFileExtension(String[] fileExtensions) throws FileExtensionNotApprovedException
            {
                String[]
                returnStrings;
                
                int
                fileExtensionsLength;
    
                
                
                fileExtensionsLength = fileExtensions.length;
                returnStrings = new String[fileExtensionsLength];
                
                
                
                for(int i = 0; i <  fileExtensionsLength; i++)
                {
                    String
                    currentFileExtension,
                    checkedFileExtension;
    
    
    
                    currentFileExtension = fileExtensions[i];
                    checkedFileExtension = checkFileExtension(currentFileExtension);
                    returnStrings[i] = checkedFileExtension;
    
                }
                
                
                
                return returnStrings;
                
            }
        /*End: Exceptions.*/
    
        /*Start: return List contents.*/
            /*Start: String[]s.*/
                protected String[] returnListContentAsStringArray(List<SystemPath> inputList)
                {
                    String[]
                    results;
               
                    
           
                    results = convertListContentAsStringArray(inputList);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray(String inputString, List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, false, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray(String[] inputStrings, List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, false, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray(String inputString, List<SystemPath> inputList,
                                                                  boolean ignoreCase)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, ignoreCase,
                    false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray(String[] inputStrings, List<SystemPath> inputList,
                                                                  boolean ignoreCase)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, ignoreCase,
                    false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
            
                protected String[] returnListContentAsStringArray(String inputString, List<SystemPath> inputList,
                                                                  boolean searchForFile, boolean useFileExtension)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
            
            
            
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, false, false);
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
            
            
            
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, false, false);
                    results = convertListContentAsStringArray(listResults);
            
            
            
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray(String inputString, List<SystemPath> inputList,
                                                                  boolean searchForFile, boolean useFileExtension,
                                                                  boolean ignoreCase)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, ignoreCase, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray(String[] inputStrings, List<SystemPath> inputList,
                                                                  boolean searchForFile, boolean useFileExtension,
                                                                  boolean ignoreCase)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, ignoreCase, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray(String inputString, List<SystemPath> inputList,
                                                              boolean searchForFile, boolean useFileExtension,
                                                              boolean ignoreCase,
                                                              boolean compareFileExtensions)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, ignoreCase, compareFileExtensions);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray(String[] inputStrings,
                                                              List<SystemPath> inputList,
                                                              boolean searchForFile, boolean useFileExtension,
                                                              boolean ignoreCase,
                                                              boolean compareFileExtensions)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, ignoreCase, compareFileExtensions);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray_ExcludeFileExtension(String inputString,
                                                                                       List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, false, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_ExcludeFileExtension(String[] inputStrings,
                                                                                       List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, false, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray_ExcludeFileExtension(String inputString,
                                                                                       List<SystemPath> inputList, boolean ignoreCase)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, ignoreCase, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_ExcludeFileExtension(String[] inputStrings,
                                                                                       List<SystemPath> inputList, boolean ignoreCase)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, ignoreCase, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_CompareFileExtensions(String inputString,
                                                                                           List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, false, true);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_CompareFileExtensions(String[] inputStrings,
                                                                                           List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, false, true);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_CompareFileExtensions(String inputString,
                                                                                           List<SystemPath> inputList, boolean ignoreCase)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, ignoreCase, true);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_CompareFileExtensions(String[] inputStrings,
                                                                                           List<SystemPath> inputList, boolean ignoreCase)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, ignoreCase, true);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray_IgnoreCase(String inputString,
                                                                             List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, true, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_IgnoreCase(String[] inputStrings,
                                                                             List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, true, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_IgnoreCase(String inputString,
                                                                             List<SystemPath> inputList,
                                                                            boolean searchForFile, boolean useFileExtension)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, true, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_IgnoreCase(String[] inputStrings,
                                                                            List<SystemPath> inputList,
                                                                            boolean searchForFile, boolean useFileExtension)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, true, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(String inputString,
                                                                                                  List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, true, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(String[] inputStrings,
                                                                             List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, true, false);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected String[] returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(String inputString,
                                                                                               List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, true, true);
                    results = convertListContentAsStringArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected String[] returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(String[] inputStrings,
                                                                                               List<SystemPath> inputList)
                {
                    String[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, true, true);
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
    
                protected File[] returnListContentAsFileArray(String inputString, List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, false, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray(String[] inputStrings, List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, false, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray(String inputString, List<SystemPath> inputList,
                                                                  boolean ignoreCase)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, ignoreCase,
                    false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray(String[] inputStrings, List<SystemPath> inputList,
                                                              boolean ignoreCase)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, ignoreCase,
                    false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray(String inputString, List<SystemPath> inputList,
                                                              boolean searchForFile, boolean useFileExtension)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, false, false);
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
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, false, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray(String inputString, List<SystemPath> inputList,
                                                              boolean searchForFile, boolean useFileExtension, boolean ignoreCase)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, ignoreCase, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray(String[] inputStrings, List<SystemPath> inputList,
                                                              boolean searchForFile, boolean useFileExtension, boolean ignoreCase)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, ignoreCase, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray(String inputString, List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension,
                                                                 boolean ignoreCase,
                                                                 boolean compareFileExtensions)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, ignoreCase, compareFileExtensions);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray(String[] inputStrings,
                                                                 List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension,
                                                                 boolean ignoreCase,
                                                                 boolean compareFileExtensions)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, ignoreCase, compareFileExtensions);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray_ExcludeFileExtension(String inputString,
                                                                                  List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, false, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_ExcludeFileExtension(String[] inputStrings,
                                                                                  List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, false, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray_ExcludeFileExtension(String inputString,
                                                                                   List<SystemPath> inputList,
                                                                                   boolean ignoreCase)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, ignoreCase, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_ExcludeFileExtension(String[] inputStrings,
                                                                                   List<SystemPath> inputList,
                                                                                   boolean ignoreCase)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, ignoreCase, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray_IgnoreCase(String inputString,
                                                                         List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, true, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_IgnoreCase(String[] inputStrings,
                                                                         List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, true, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_IgnoreCase(String inputString,
                                                                         List<SystemPath> inputList,
                                                                        boolean searchForFile, boolean useFileExtension)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, true, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_IgnoreCase(String[] inputStrings,
                                                                         List<SystemPath> inputList,
                                                                        boolean searchForFile, boolean useFileExtension)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, true, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_CompareFileExtensions(String inputString,
                                                                                       List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, false, true);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_CompareFileExtensions(String[] inputStrings,
                                                                                       List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, false, true);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_CompareFileExtensions(String inputString,
                                                                                       List<SystemPath> inputList, boolean ignoreCase)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, ignoreCase, true);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_CompareFileExtensions(String[] inputStrings,
                                                                                       List<SystemPath> inputList, boolean ignoreCase)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, ignoreCase, true);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(String inputString,
                                                                         List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, true, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(String[] inputStrings,
                                                                         List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, true, false);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected File[] returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(String inputString,
                                                                                                  List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, true, true);
                    results = convertListContentAsFileArray(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected File[] returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(String[] inputStrings,
                                                                                                  List<SystemPath> inputList)
                {
                    File[]
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, true, true);
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
    
                protected List<String> returnListContentAsStringList(String inputString, List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, false, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<String> returnListContentAsStringList(String[] inputStrings, List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, false, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                    
                }
    
                protected List<String> returnListContentAsStringList(String inputString, List<SystemPath> inputList,
                                                              boolean ignoreCase)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, ignoreCase,
                    false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<String> returnListContentAsStringList(String[] inputStrings, List<SystemPath> inputList,
                                                                     boolean ignoreCase)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, ignoreCase,
                    false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<String> returnListContentAsStringList(String inputString, List<SystemPath> inputList,
                                                                     boolean searchForFile, boolean useFileExtension)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, false, false);
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
    
    
    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, false, false);
                    results = convertListContentAsListString(listResults);
    
    
    
                    return results;
                    
                    
                }
    
                protected List<String> returnListContentAsStringList(String inputString, List<SystemPath> inputList,
                                                                     boolean searchForFile, boolean useFileExtension,  boolean ignoreCase)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, ignoreCase, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList(String[] inputStrings, List<SystemPath> inputList,
                                                                     boolean searchForFile, boolean useFileExtension,
                                                                     boolean ignoreCase)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, ignoreCase, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                    
                }
    
                protected List<String> returnListContentAsStringList(String inputString, List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension,
                                                                 boolean ignoreCase,
                                                                 boolean compareFileExtensions)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, ignoreCase, compareFileExtensions);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList(String[] inputStrings,
                                                                 List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension,
                                                                 boolean ignoreCase,
                                                                 boolean compareFileExtensions)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, ignoreCase, compareFileExtensions);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<String> returnListContentAsStringList_ExcludeFileExtension(String inputString,
                                                                                         List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, false, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList_ExcludeFileExtension(String[] inputStrings,
                                                                                          List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, false, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                    
                }
    
                protected List<String> returnListContentAsStringList_ExcludeFileExtension(String inputString,
                                                                                          List<SystemPath> inputList,
                                                                                          boolean ignoreCase)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, ignoreCase, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList_ExcludeFileExtension(String[] inputStrings,
                                                                                          List<SystemPath> inputList,
                                                                                          boolean ignoreCase)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, ignoreCase, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                    
                }
    
                protected List<String> returnListContentAsStringList_IgnoreCase(String inputString,
                                                                                List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, true, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList_IgnoreCase(String[] inputStrings,
                                                                                List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, true, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                    
                }
    
                protected List<String> returnListContentAsStringList_IgnoreCase(String inputString,
                                                                                List<SystemPath> inputList,
                                                                                boolean searchForFile, boolean useFileExtension)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, true, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList_IgnoreCase(String[] inputStrings,
                                                                                List<SystemPath> inputList,
                                                                                boolean searchForFile, boolean useFileExtension)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, true, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                    
                }
    
                protected List<String> returnListContentAsStringList_CompareFileExtensions(String inputString,
                                                                                       List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, false, true);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList_CompareFileExtensions(String[] inputStrings,
                                                                                       List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, false, true);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<String> returnListContentAsStringList_CompareFileExtensions(String inputString,
                                                                                       List<SystemPath> inputList, boolean ignoreCase)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, ignoreCase, true);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList_CompareFileExtensions(String[] inputStrings,
                                                                                       List<SystemPath> inputList, boolean ignoreCase)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, ignoreCase, true);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<String> returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(String inputString,
                                                                                                     List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, true, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(String[] inputStrings,
                                                                                                     List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, true, false);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                    
                }
    
                protected List<String> returnListContentAsStringList_IgnoreCase_CompareFileExtensions(String inputString,
                                                                                                  List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, true, true);
                    results = convertListContentAsListString(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<String> returnListContentAsStringList_IgnoreCase_CompareFileExtensions(String[] inputStrings,
                                                                                                  List<SystemPath> inputList)
                {
                    List<String>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, true, true);
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
    
                protected List<File> returnListContentAsFileList(String inputString, List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, false, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList(String[] inputStrings, List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, false, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList(String inputString, List<SystemPath> inputList,
                                                                     boolean ignoreCase)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, ignoreCase,
                    false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList(String[] inputStrings, List<SystemPath> inputList,
                                                                 boolean ignoreCase)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, ignoreCase,
                    false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList(String inputString, List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, false, false);
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
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, false, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList(String inputString, List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension,
                                                                 boolean ignoreCase)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, ignoreCase, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList(String[] inputStrings,
                                                                  List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension,
                                                                 boolean ignoreCase)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, ignoreCase, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList(String inputString, List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension,
                                                                 boolean ignoreCase,
                                                                 boolean compareFileExtensions)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, ignoreCase, compareFileExtensions);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList(String[] inputStrings,
                                                                 List<SystemPath> inputList,
                                                                 boolean searchForFile, boolean useFileExtension,
                                                                 boolean ignoreCase,
                                                                 boolean compareFileExtensions)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, ignoreCase, compareFileExtensions);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_ExcludeFileExtension(String inputString,
                                                                                      List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, false, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_ExcludeFileExtension(String inputString,
                                                                                      List<SystemPath> inputList, boolean ignoreCase)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, ignoreCase, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList_ExcludeFileExtension(String[] inputStrings,
                                                                                      List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, false, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_ExcludeFileExtension(String[] inputStrings,
                                                                                     List<SystemPath> inputList, boolean ignoreCase)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, ignoreCase, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_IgnoreCase(String inputString,
                                                                            List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, true, true, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList_IgnoreCase(String[] inputStrings,
                                                                            List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, true, true, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList_IgnoreCase(String inputString,
                                                                            List<SystemPath> inputList,
                                                                           boolean searchForFile, boolean useFileExtension)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, searchForFile, useFileExtension, true, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList_IgnoreCase(String[] inputStrings,
                                                                            List<SystemPath> inputList,
                                                                           boolean searchForFile, boolean useFileExtension)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, searchForFile, useFileExtension, true, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_CompareFileExtensions(String inputString,
                                                                                       List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, false, true);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_CompareFileExtensions(String[] inputStrings,
                                                                                       List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, false, true);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_CompareFileExtensions(String inputString,
                                                                                       List<SystemPath> inputList, boolean ignoreCase)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, ignoreCase, true);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList_CompareFileExtensions(String[] inputStrings,
                                                                                       List<SystemPath> inputList, boolean ignoreCase)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, ignoreCase, true);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(String inputString,
                                                                            List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, true, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(String[] inputStrings,
                                                                            List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, true, false);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
    
                protected List<File> returnListContentAsFileList_IgnoreCase_CompareFileExtensions(String inputString,
                                                                                       List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputString, inputList, true, false, true, true);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
                
                protected List<File> returnListContentAsFileList_IgnoreCase_CompareFileExtensions(String[] inputStrings,
                                                                                       List<SystemPath> inputList)
                {
                    List<File>
                    results;
                    
                    List<SystemPath>
                    listResults;
                    
                    
                    
                    listResults = searchListForMatch(inputStrings, inputList, true, false, true, true);
                    results = convertListContentAsListFile(listResults);
                    
                    
                    
                    return results;
                    
                }
            /*End: List<File>s.*/
        /*End: return List contents.*/
    
        /*Start: get variable-search-options.*/
            protected String compareFileExtensions(boolean compareFileExtensions, String target) throws FileExtensionNotApprovedException
            {
                String
                result;
                
                
                
                if(compareFileExtensions)
                {
                    result = checkFileExtension(target);
        
                }
                else
                {
                    result = target;
        
                }
                
                
                return result;
                
            }
    
            protected String[] compareFileExtensions(boolean compareFileExtensions, String[] targets) throws FileExtensionNotApprovedException
            {
                String[]
                result;
                
                
                
                if(compareFileExtensions)
                {
                    result = checkFileExtension(targets);
                    
                }
                else
                {
                    result = targets;
                    
                }
                
                
                return result;
                
            }
        /*End: get variable-search-options.*/
    /*End: protected methods.*/
    
    
    
    /*Start: private methods.*/
        /*Start: set global Lists.*/
            private void setListOnlyDirectories()
            {
                allSystemPathsDirectory = new ArrayList<SystemPath>();
                
                
                
                allSystemPaths.stream()
                .filter(sp -> sp.getIsDirectory() == true)
                .forEach(sp -> allSystemPathsDirectory.add(sp));
                
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
            private String[] convertListContentAsStringArray(List<SystemPath> inputList)
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
    
            private File[] convertListContentAsFileArray(List<SystemPath> inputList)
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
    
            private List<String> convertListContentAsListString(List<SystemPath> inputList)
            {
                List<String>
                results;
    
    
    
                results = new ArrayList<String>();
                
                
                
                inputList.stream()
                .forEach(sp -> results.add(sp.getAbsoluteString()));
    
    
                
                return results;
                
            }
    
            private List<File> convertListContentAsListFile(List<SystemPath> inputList)
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
                                                        boolean searchForFile, boolean useFileExtension,
                                                              boolean ignoreCase, boolean compareFileExtensions)
            {
                List<SystemPath>
                returnResults,
                sortDistinct;
                
                
                
                returnResults = new ArrayList<SystemPath>();
                sortDistinct = new ArrayList<SystemPath>();
                
                
                
                inputList.stream()
                .filter(sp -> sp.getFileName().equals(inputString))
                .forEach(sp -> sortDistinct.add(sp));
                
                
                
                if(searchForFile && !useFileExtension)
                {
                    List<SystemPath>
                    matchedListWithoutFileExtensions;
    
    
    
                    matchedListWithoutFileExtensions = compareFilesWithoutExtension(inputString, inputList, false);
                    
                    
                    
                    sortDistinct.addAll(matchedListWithoutFileExtensions);
                    
                }
                if(ignoreCase)
                {
                    List<SystemPath>
                    matchedListIgnoreCase;
    
    
    
                    matchedListIgnoreCase = compareFilesIgnoreCase(inputString, inputList, searchForFile,
                    useFileExtension);
    
    
    
                    sortDistinct.addAll(matchedListIgnoreCase);
                    
                }
                if(compareFileExtensions)
                {
                    List<SystemPath>
                    matchedListFileExtensions;
                    
                    
                    
                    matchedListFileExtensions = compareFileExtensions(inputString, inputList, ignoreCase);
    
    
    
                    sortDistinct.addAll(matchedListFileExtensions);
                    
                }
                
                
                
                sortDistinct.stream()
                .distinct()
                .forEach(sp -> returnResults.add(sp));
                
                
                
                return returnResults;
                
            }
            
            private List<SystemPath> searchListForMatch(String[] inputStrings, List<SystemPath> inputList,
                                                        boolean searchForFile, boolean useFileExtension,
                                                              boolean ignoreCase, boolean compareFileExtensions)
            {
                List<SystemPath>
                sortingMatches,
                results;
                
                int
                inputStringsLength;
    
    
    
                sortingMatches = new ArrayList<SystemPath>();
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
                    currentMatchList = searchListForMatch(currentInputString, inputList, searchForFile,
                    useFileExtension, ignoreCase, compareFileExtensions);
                    currentMatchListSize = currentMatchList.size();
                    
                    
                    
                    for(int i2 = 0; i2 < currentMatchListSize; i2++)
                    {
                        SystemPath
                        currentSystemPath;
                        
                        
                        
                        currentSystemPath = currentMatchList.get(i2);
                        sortingMatches.add(currentSystemPath);
                        
                    }
                    
                }
    
    
    
                sortingMatches.stream()
                .distinct()
                .forEach(sp -> results.add(sp));
                
                
                
                return results;
                
            }
    
            private List<SystemPath> compareFilesWithoutExtension(String inputString, List<SystemPath> inputList,
                                                                        boolean ignoreCase)
            {
                List<SystemPath>
                matchedFileNames;
                
                
                
                matchedFileNames = new ArrayList<SystemPath>();
                
                
                
                if(!ignoreCase)
                {
                    inputList.stream()
                    .filter(sp -> sp.getIsFile())
                    .filter(sp -> sp.getHasExtension())
                    .filter(sp -> sp.getFileNameWithoutExtension().equals(inputString))
                    .forEach(sp -> matchedFileNames.add(sp));
                    
                }
                else
                {
                    inputList.stream()
                    .filter(sp -> sp.getIsFile())
                    .filter(sp -> sp.getHasExtension())
                    .filter(sp -> sp.getFileNameWithoutExtensionLowerCase().equals(inputString))
                    .forEach(sp -> matchedFileNames.add(sp));
    
                }
                
                
                
                return matchedFileNames;
            
            }
    
            private List<SystemPath> compareFilesIgnoreCase(String inputString, List<SystemPath> inputList,
                                                                  boolean searchForFile, boolean useFileExtension)
            {
                List<SystemPath>
                matchedFileNames;
                
                String
                inputStringLowerCase;
    
    
    
                inputStringLowerCase = inputString.toLowerCase(Locale.ROOT);
                matchedFileNames = new ArrayList<SystemPath>();
    
    
    
                inputList.stream()
                .filter(sp -> sp.getFileNameLowerCase().equals(inputStringLowerCase))
                .forEach(sp -> matchedFileNames.add(sp));
                
    
                
                if(searchForFile && !useFileExtension)
                {
                    List<SystemPath>
                    matchedListWithoutFileExtensions;
    
    
    
                    matchedListWithoutFileExtensions = compareFilesWithoutExtension(inputStringLowerCase, inputList,
                    true);
    
    
    
                    matchedFileNames.addAll(matchedListWithoutFileExtensions);
                    
                }
         
                return matchedFileNames;
                
            }
    
            private List<SystemPath> compareFileExtensions(String inputString,
                                                                     List<SystemPath> inputList, boolean ignoreCase)
            {
                List<SystemPath>
                matchedFileExtensions;
                
                
                
                matchedFileExtensions = new ArrayList<SystemPath>();
                
                
                
                inputList.stream()
                .filter(sp -> sp.getHasExtension())
                .filter(sp -> sp.getFileExtension().equals(inputString))
                .forEach(sp -> matchedFileExtensions.add(sp));
                
                
                
                if(ignoreCase)
                {
                    List<SystemPath>
                    matchedListWithoutFileExtensions;
                    
                    
                    
                    matchedListWithoutFileExtensions = compareFileExtensionsIgnoreCase(inputString, inputList);
    
    
    
                    matchedFileExtensions.addAll(matchedListWithoutFileExtensions);
                    
                }
                
                return matchedFileExtensions;
                
            }
    
            private List<SystemPath> compareFileExtensionsIgnoreCase(String inputString,
                                                                 List<SystemPath> inputList)
            {
                List<SystemPath>
                matchedFileExtensionsIgnoreCase;
                
                String
                inputStringLowerCase;
                
                
                
                inputStringLowerCase = inputString.toLowerCase(Locale.ROOT);
                matchedFileExtensionsIgnoreCase = new ArrayList<SystemPath>();
                
                
                
                inputList.stream()
                .filter(sp -> sp.getHasExtension())
                .filter(sp -> sp.getFileExtensionLowerCase().equals(inputStringLowerCase))
                .forEach(sp -> matchedFileExtensionsIgnoreCase.add(sp));
                
                
                
               
                
                return matchedFileExtensionsIgnoreCase;
                
            }
        /*End: searching List for matches.*/
    /*End: private methods.*/

}