package systemPathsCollector;


import java.io.File;
import java.util.*;


public class SystemFilesContainer_Beta extends SystemFilesContainer_Alpha
{
    /*Start: global variables.*/
        protected static List<SystemPath>
        allSystemPathsHidden,
        allSystemPathsVisible,
        allSystemPathsDirectoryHidden,
        allSystemPathsDirectoryVisible,
        allSystemPathsFileHidden,
        allSystemPathsFileVisible;
    /*End: global variables.*/

    /*Start: public methods.*/
        /*Start: get class List results.*/
            /*Start: all types.*/
                /*Start: String[]s.*/
                    /*Start: visibility by parameter variable.*/
                        public String[] stringArrayAllPaths(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            String[]
                            results;
                        
                            List<SystemPath>
                            listToSearch;
                        
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray(listToSearch);
                        
                        
                        
                            return results;
                        
                        }
    
                        public String[] stringArrayAllPaths(String target, boolean useFileExtension,
                                                            boolean ignoreCase, boolean compareFileExtensions,
                                                            boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            String
                            targetType;
                    
                            List<SystemPath>
                            listToSearch;
                    
                    
                            
                            checkSystemIsRead();
                            targetType = compareFileExtensions(compareFileExtensions, target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray(targetType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                    
                    
                    
                            return results;
                    
                        }
        
                        public String[] stringArrayAllPaths(String[] targets, boolean useFileExtension,
                                                            boolean ignoreCase, boolean compareFileExtensions,
                                                            boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results,
                            targetsType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetsType = compareFileExtensions(compareFileExtensions, targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray(targetsType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_ExcludeFileExtension(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
    
                            List<SystemPath>
                            listToSearch;
    
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_ExcludeFileExtension(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_ExcludeFileExtension(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
    
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_ExcludeFileExtension(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_IgnoreCase(String target, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
    
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_IgnoreCase(target, listToSearch,
                            true, useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_IgnoreCase(String[] targets, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
    
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_IgnoreCase(targets, listToSearch, true,
                            useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_CompareFileExtensions(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            String
                            fileExtensionTarget;
    
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget,
                            listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_CompareFileExtensions(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results,
                            fileExtensionTargets;
    
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_ExcludeFileExtension_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
        
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_IgnoreCase_ExcludeFileExtension(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
        
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_ExcludeFileExtension_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
        
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_IgnoreCase_ExcludeFileExtension(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
        
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_IgnoreCase_CompareFileExtensions(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            String
                            fileExtensionTarget;
        
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_CompareFileExtensions_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            String
                            fileExtensionTarget;
        
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_IgnoreCase_CompareFileExtensions(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results,
                            fileExtensionTargets;
        
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayAllPaths_CompareFileExtensions_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results,
                            fileExtensionTargets;
        
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
    
                    /*Start: visibility by method name.*/
                        /*Start: visible.*/
                            public String[] stringArrayAllPathsVisible() throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
    
                            public String[] stringArrayAllPathsVisible(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsStringArray(targetType, allSystemPathsVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible(String[] targets, boolean useFileExtension,
                                                                boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsStringArray(targetsType, allSystemPathsVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsVisible,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
    
                            public String[] stringArrayAllPathsVisible_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsVisible, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
    
                            public String[] stringArrayAllPathsVisible_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsVisible_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
    
                        /*Start: hidden.*/
                            public String[] stringArrayAllPathsHidden() throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsStringArray(targetType, allSystemPathsHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden(String[] targets, boolean useFileExtension,
                                                                      boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsStringArray(targetsType, allSystemPathsHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsHidden,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsHidden, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayAllPathsHidden_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                     /*End: visibility by method name.*/
                /*End: String[]s.*/
            
                /*Start: File[]s.*/
                    /*Start: visibility by parameter variable.*/
                        public File[] fileArrayAllPaths(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            File[]
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray(listToSearch);
            
            
            
                            return results;
            
                        }
                
                        public File[] fileArrayAllPaths(String target, boolean useFileExtension,
                                                            boolean ignoreCase, boolean compareFileExtensions,
                                                            boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
            
                            String
                            targetType;
            
                            List<SystemPath>
                            listToSearch;
            
            
            
                            checkSystemIsRead();
                            targetType = compareFileExtensions(compareFileExtensions, target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray(targetType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
            
            
            
                            return results;
            
                        }
            
                        public File[] fileArrayAllPaths(String[] targets, boolean useFileExtension,
                                                            boolean ignoreCase, boolean compareFileExtensions,
                                                            boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
    
                            String[]
                            targetsType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetsType = compareFileExtensions(compareFileExtensions, targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray(targetsType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_ExcludeFileExtension(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_ExcludeFileExtension(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_ExcludeFileExtension(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_ExcludeFileExtension(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_IgnoreCase(String target, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_IgnoreCase(target, listToSearch,
                            true, useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_IgnoreCase(String[] targets, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_IgnoreCase(targets, listToSearch, true,
                            useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_CompareFileExtensions(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget,
                            listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_CompareFileExtensions(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
    
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_ExcludeFileExtension_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_IgnoreCase_ExcludeFileExtension(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_ExcludeFileExtension_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_IgnoreCase_ExcludeFileExtension(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_IgnoreCase_CompareFileExtensions(String target,
                                                                                         boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_CompareFileExtensions_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_IgnoreCase_CompareFileExtensions(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
    
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayAllPaths_CompareFileExtensions_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
    
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                
                    /*Start: visibility by method name.*/
                        /*Start: visible.*/
                            public File[] fileArrayAllPathsVisible() throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsFileArray(targetType, allSystemPathsVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible(String[] targets, boolean useFileExtension,
                                                                       boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
    
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsFileArray(targetsType, allSystemPathsVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsVisible,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsVisible, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
    
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
    
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
    
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsVisible_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
    
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                        
                        /*Start: hidden.*/
                            public File[] fileArrayAllPathsHidden() throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsFileArray(targetType, allSystemPathsHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden(String[] targets, boolean useFileExtension,
                                                                      boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;

                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsFileArray(targetsType, allSystemPathsHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsHidden,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsHidden, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;

                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;

                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;

                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayAllPathsHidden_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;

                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: File[]s.*/
    
                /*Start: List<String>s.*/
                    /*Start: visibility by parameter variable.*/
                        public List<String> stringListAllPaths(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            List<String>
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList(listToSearch);
            
            
            
                            return results;
            
                        }
                
                        public List<String> stringListAllPaths(String target, boolean useFileExtension,
                                                            boolean ignoreCase, boolean compareFileExtensions,
                                                            boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String
                            targetType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetType = compareFileExtensions(compareFileExtensions, target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList(targetType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths(String[] targets, boolean useFileExtension,
                                                            boolean ignoreCase, boolean compareFileExtensions,
                                                            boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
    
                            String[]
                            targetsType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetsType = compareFileExtensions(compareFileExtensions, targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList(targetsType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_ExcludeFileExtension(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_ExcludeFileExtension(target, listToSearch,
                            ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_ExcludeFileExtension(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_ExcludeFileExtension(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_IgnoreCase(String target, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_IgnoreCase(target, listToSearch,
                            true, useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_IgnoreCase(String[] targets, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_IgnoreCase(targets, listToSearch, true,
                            useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_CompareFileExtensions(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                            listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_CompareFileExtensions(String[] targets,
                                                                                      boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;

                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_ExcludeFileExtension_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_IgnoreCase_ExcludeFileExtension(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_ExcludeFileExtension_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_IgnoreCase_ExcludeFileExtension(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_IgnoreCase_CompareFileExtensions(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_CompareFileExtensions_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_IgnoreCase_CompareFileExtensions(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
    
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListAllPaths_CompareFileExtensions_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;

                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
    
                    /*Start: visibility by method name.*/
                        /*Start: visible.*/
                            public List<String> stringListAllPathsVisible() throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsStringList(targetType, allSystemPathsVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible(String[] targets, boolean useFileExtension,
                                                                       boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;

                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsStringList(targetsType, allSystemPathsVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsVisible,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsVisible, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;

                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;

                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;

                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsVisible_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;

                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                                
                        /*Start: hidden.*/
                            public List<String> stringListAllPathsHidden() throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsStringList(targetType, allSystemPathsHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden(String[] targets, boolean useFileExtension,
                                                                      boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
    
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsStringList(targetsType, allSystemPathsHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(target,
                                allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsHidden,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsHidden, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
    
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
    
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
    
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListAllPathsHidden_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: List<String>s.*/
    
                /*Start: List<File>s.*/
                    /*Start: visibility by parameter variable.*/
                        public List<File> fileListAllPaths(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            List<File>
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList(listToSearch);
            
            
            
                            return results;
            
                        }
                
                        public List<File> fileListAllPaths(String target, boolean useFileExtension,
                                                        boolean ignoreCase, boolean compareFileExtensions,
                                                        boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String
                            targetType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetType = compareFileExtensions(compareFileExtensions, target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList(targetType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths(String[] targets, boolean useFileExtension,
                                                        boolean ignoreCase, boolean compareFileExtensions,
                                                        boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String[]
                            targetsType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetsType = compareFileExtensions(compareFileExtensions, targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList(targetsType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_ExcludeFileExtension(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_ExcludeFileExtension(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_ExcludeFileExtension(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_ExcludeFileExtension(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_IgnoreCase(String target, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_IgnoreCase(target, listToSearch,
                            true, useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_IgnoreCase(String[] targets, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_IgnoreCase(targets, listToSearch, true,
                            useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_CompareFileExtensions(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                            listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_CompareFileExtensions(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_ExcludeFileExtension_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_IgnoreCase_ExcludeFileExtension(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_ExcludeFileExtension_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_IgnoreCase_ExcludeFileExtension(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_IgnoreCase_CompareFileExtensions(String target,
                                                                                         boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_CompareFileExtensions_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_IgnoreCase_CompareFileExtensions(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListAllPaths_CompareFileExtensions_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "all");
                            results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                    
                    /*Start: visibility by method name.*/
                        /*Start: visible.*/
                            public List<File> fileListAllPathsVisible() throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsFileList(targetType, allSystemPathsVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible(String[] targets, boolean useFileExtension,
                                                                   boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsFileList(targetsType, allSystemPathsVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsVisible,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsVisible, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsVisible_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                    
                        /*Start: hidden.*/
                            public List<File> fileListAllPathsHidden() throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsFileList(targetType, allSystemPathsHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden(String[] targets, boolean useFileExtension,
                                                                  boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsFileList(targetsType, allSystemPathsHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsHidden,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsHidden, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListAllPathsHidden_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results =
                                returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets,
                                allSystemPathsHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: List<File>s.*/
            /*End: all types.*/
        
            /*Start: directories.*/
                /*Start: String[]s.*/
                    /*Start: visibility by parameter variable.*/
                        public String[] stringArrayDirectories(boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                
                            List<SystemPath>
                            listToSearch;
                
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringArray(listToSearch);
                
                
                
                            return results;
                
                        }
            
                        public String[] stringArrayDirectories(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
    
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringArray(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
    
                        public String[] stringArrayDirectories(String[] targets, boolean ignoreCase,
                                                               boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringArray(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayDirectories_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
    
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringArray_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
    
                        public String[] stringArrayDirectories_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringArray_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
    
                    /*Start visibility by method name.*/
                        /*Start: visible.*/
                            public String[] stringArrayDirectoriesVisible() throws SystemNotReadException
                            {
                                String[]
                                results;
            
            
            
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(allSystemPathsDirectoryVisible);
            
            
            
                                return results;
            
                            }
    
                            public String[] stringArrayDirectoriesVisible(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayDirectoriesVisible(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                    
                            public String[] stringArrayDirectoriesVisible(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
            
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsDirectoryVisible,
                                ignoreCase);
            
            
            
                                return results;
            
                            }
            
                            public String[] stringArrayDirectoriesVisible(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsDirectoryVisible,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayDirectoriesVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayDirectoriesVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
    
                        /*Start: hidden.*/
                            public String[] stringArrayDirectoriesHidden() throws SystemNotReadException
                            {
                                String[]
                                results;
        
        
        
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(allSystemPathsDirectoryHidden);
        
        
        
                                return results;
        
                            }
        
                            public String[] stringArrayDirectoriesHidden(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayDirectoriesHidden(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayDirectoriesHidden(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsDirectoryHidden,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayDirectoriesHidden(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsDirectoryHidden,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayDirectoriesHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayDirectoriesHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: String[]s.*/
            
                /*Start: File[]s.*/
                    /*Start: visibility by parameter variable.*/
                        public File[] fileArrayDirectories(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            File[]
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileArray(listToSearch);
            
            
            
                            return results;
            
                        }
            
                        public File[] fileArrayDirectories(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileArray(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayDirectories(String[] targets, boolean ignoreCase,
                                                               boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileArray(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayDirectories_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileArray_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayDirectories_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileArray_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                    
                    /*Start visibility by method name.*/
                        /*Start: visible.*/
                            public File[] fileArrayDirectoriesVisible() throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesVisible(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesVisible(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesVisible(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsDirectoryVisible,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesVisible(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsDirectoryVisible,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                    
                        /*Start: hidden.*/
                            public File[] fileArrayDirectoriesHidden() throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesHidden(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesHidden(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesHidden(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsDirectoryHidden,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesHidden(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsDirectoryHidden,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayDirectoriesHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsDirectoryHidden);
    
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: File[]s.*/
            
                /*Start: List<String>s.*/
                    /*Start: visibility by parameter variable.*/
                        public List<String> stringListDirectories(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            List<String>
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringList(listToSearch);
            
            
            
                            return results;
            
                        }
            
                        public List<String> stringListDirectories(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringList(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListDirectories(String[] targets, boolean ignoreCase,
                                                           boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringList(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListDirectories_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringList_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListDirectories_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsStringList_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                
                    /*Start visibility by method name.*/
                        /*Start: visible.*/
                            public List<String> stringListDirectoriesVisible() throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesVisible(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesVisible(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesVisible(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsDirectoryVisible,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesVisible(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsDirectoryVisible,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                
                        /*Start: hidden.*/
                            public List<String> stringListDirectoriesHidden() throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesHidden(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesHidden(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesHidden(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsDirectoryHidden,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesHidden(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsDirectoryHidden,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target,
                                allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListDirectoriesHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets,
                                allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: List<String>s.*/
            
                /*Start: List<File>s.*/
                    /*Start: visibility by parameter variable.*/
                        public List<File> fileListDirectories(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            List<File>
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileList(listToSearch);
            
            
            
                            return results;
            
                        }
    
                        public List<File> fileListDirectories(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileList(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListDirectories(String[] targets, boolean ignoreCase,
                                                                  boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileList(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListDirectories_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileList_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListDirectories_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "directory");
                            results = returnListContentAsFileList_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                    
                    /*Start visibility by method name.*/
                        /*Start: visible.*/
                            public List<File> fileListDirectoriesVisible() throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesVisible(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesVisible(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesVisible(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsDirectoryVisible,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesVisible(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsDirectoryVisible,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsDirectoryVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                        
                        /*Start: hidden.*/
                            public List<File> fileListDirectoriesHidden() throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesHidden(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesHidden(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesHidden(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsDirectoryHidden,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesHidden(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsDirectoryHidden,
                                ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target,
                                allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListDirectoriesHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets,
                                allSystemPathsDirectoryHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: List<File>s.*/
            /*End: directories.*/
        
            /*Start: files.*/
                /*Start: String[]s.*/
                    /*Start: visibility by parameter variable.*/
                        public String[] stringArrayFiles(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            String[]
                            results;
                
                            List<SystemPath>
                            listToSearch;
                
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray(listToSearch);
                
                
                
                            return results;
                
                        }
            
                        public String[] stringArrayFiles(String target, boolean useFileExtension,
                                                            boolean ignoreCase, boolean compareFileExtensions,
                                                            boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            String
                            targetType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetType = compareFileExtensions(compareFileExtensions, target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray(targetType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles(String[] targets, boolean useFileExtension,
                                                            boolean ignoreCase, boolean compareFileExtensions,
                                                            boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results,
                            targetsType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetsType = compareFileExtensions(compareFileExtensions, targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray(targetsType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_ExcludeFileExtension(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_ExcludeFileExtension(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_ExcludeFileExtension(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_ExcludeFileExtension(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_IgnoreCase(String target, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_IgnoreCase(target, listToSearch,
                            true, useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_IgnoreCase(String[] targets, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_IgnoreCase(targets, listToSearch, true,
                            useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_CompareFileExtensions(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget,
                            listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_CompareFileExtensions(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results,
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_ExcludeFileExtension_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_IgnoreCase_ExcludeFileExtension(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_ExcludeFileExtension_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_IgnoreCase_ExcludeFileExtension(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_IgnoreCase_CompareFileExtensions(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_CompareFileExtensions_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_IgnoreCase_CompareFileExtensions(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results,
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public String[] stringArrayFiles_CompareFileExtensions_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            String[]
                            results,
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                    
                    /*Start: visibility by method name.*/
                        /*Start: visible.*/
                            public String[] stringArrayFilesVisible() throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsFileVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsFileVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsFileVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsFileVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsStringArray(targetType, allSystemPathsFileVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible(String[] targets, boolean useFileExtension,
                                                                       boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsStringArray(targetsType, allSystemPathsFileVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsFileVisible,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsFileVisible, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results =
                                returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesVisible_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                    
                        /*Start: hidden.*/
                            public String[] stringArrayFilesHidden() throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsFileHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsFileHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(target, allSystemPathsFileHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray(targets, allSystemPathsFileHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsStringArray(targetType, allSystemPathsFileHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden(String[] targets, boolean useFileExtension,
                                                                      boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsStringArray(targetsType, allSystemPathsFileHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(target, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension(targets, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(target, allSystemPathsFileHidden,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_IgnoreCase(targets, allSystemPathsFileHidden, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                String[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public String[] stringArrayFilesHidden_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                String[]
                                results,
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: String[]s.*/
                
                /*Start: File[]s.*/
                    /*Start: visibility by parameter variable.*/
                        public File[] fileArrayFiles(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            File[]
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray(listToSearch);
            
            
            
                            return results;
            
                        }
                
                        public File[] fileArrayFiles(String target, boolean useFileExtension,
                                                        boolean ignoreCase, boolean compareFileExtensions,
                                                        boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String
                            targetType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetType = compareFileExtensions(compareFileExtensions, target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray(targetType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles(String[] targets, boolean useFileExtension,
                                                        boolean ignoreCase, boolean compareFileExtensions,
                                                        boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String[]
                            targetsType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetsType = compareFileExtensions(compareFileExtensions, targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray(targetsType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_ExcludeFileExtension(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_ExcludeFileExtension(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_ExcludeFileExtension(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_ExcludeFileExtension(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_IgnoreCase(String target, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_IgnoreCase(target, listToSearch,
                            true, useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_IgnoreCase(String[] targets, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_IgnoreCase(targets, listToSearch, true,
                            useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_CompareFileExtensions(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget,
                            listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_CompareFileExtensions(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_ExcludeFileExtension_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_IgnoreCase_ExcludeFileExtension(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_ExcludeFileExtension_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_IgnoreCase_ExcludeFileExtension(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_IgnoreCase_CompareFileExtensions(String target,
                                                                                         boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_CompareFileExtensions_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_IgnoreCase_CompareFileExtensions(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public File[] fileArrayFiles_CompareFileExtensions_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            File[]
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                
                    /*Start: visibility by method name.*/
                        /*Start: visible.*/
                            public File[] fileArrayFilesVisible() throws SystemNotReadException
                            {
                                File[]
                                results;
    
    
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsFileVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsFileVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsFileVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsFileVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible(String target, boolean useFileExtension,
                                                                boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsFileArray(targetType, allSystemPathsFileVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible(String[] targets, boolean useFileExtension,
                                                                   boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsFileArray(targetsType, allSystemPathsFileVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsFileVisible,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsFileVisible, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results =
                                returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesVisible_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                    
                        /*Start: hidden.*/
                            public File[] fileArrayFilesHidden() throws SystemNotReadException
                            {
                                File[]
                                results;
    
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsFileHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsFileHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(target, allSystemPathsFileHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray(targets, allSystemPathsFileHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsFileArray(targetType, allSystemPathsFileHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden(String[] targets, boolean useFileExtension,
                                                                  boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsFileArray(targetsType, allSystemPathsFileHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(target, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension(targets, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(target, allSystemPathsFileHidden,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_IgnoreCase(targets, allSystemPathsFileHidden, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                File[]
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileArray_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public File[] fileArrayFilesHidden_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                File[]
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileArray_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: File[]s.*/
                
                /*Start: List<String>s.*/
                    /*Start: visibility by parameter variable.*/
                        public List<String> stringListFiles(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            List<String>
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList(listToSearch);
            
            
            
                            return results;
            
                        }
                
                        public List<String> stringListFiles(String target, boolean useFileExtension,
                                                               boolean ignoreCase, boolean compareFileExtensions,
                                                               boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String
                            targetType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetType = compareFileExtensions(compareFileExtensions, target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList(targetType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles(String[] targets, boolean useFileExtension,
                                                               boolean ignoreCase, boolean compareFileExtensions,
                                                               boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String[]
                            targetsType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetsType = compareFileExtensions(compareFileExtensions, targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList(targetsType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_ExcludeFileExtension(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_ExcludeFileExtension(target, listToSearch,
                            ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_ExcludeFileExtension(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_ExcludeFileExtension(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_IgnoreCase(String target, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_IgnoreCase(target, listToSearch,
                            true, useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_IgnoreCase(String[] targets, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_IgnoreCase(targets, listToSearch, true,
                            useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_CompareFileExtensions(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                            listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_CompareFileExtensions(String[] targets,
                                                                                     boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_ExcludeFileExtension_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_IgnoreCase_ExcludeFileExtension(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_ExcludeFileExtension_IgnoreCase(String[] targets,
                                                                                            boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_IgnoreCase_ExcludeFileExtension(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_IgnoreCase_CompareFileExtensions(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_CompareFileExtensions_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_IgnoreCase_CompareFileExtensions(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<String> stringListFiles_CompareFileExtensions_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<String>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                    
                    /*Start: visibility by method name.*/
                        /*Start: visible.*/
                            public List<String> stringListFilesVisible() throws SystemNotReadException
                            {
                                List<String>
                                results;
    
    
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsFileVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsFileVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsFileVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsFileVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsStringList(targetType, allSystemPathsFileVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible(String[] targets, boolean useFileExtension,
                                                                          boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsStringList(targetsType, allSystemPathsFileVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsFileVisible,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsFileVisible, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesVisible_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                        
                        /*Start: hidden.*/
                            public List<String> stringListFilesHidden() throws SystemNotReadException
                            {
                                List<String>
                                results;
    
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsFileHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsFileHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(target, allSystemPathsFileHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList(targets, allSystemPathsFileHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsStringList(targetType, allSystemPathsFileHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden(String[] targets, boolean useFileExtension,
                                                                         boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsStringList(targetsType, allSystemPathsFileHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(target,
                                allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension(targets, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(target, allSystemPathsFileHidden,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_IgnoreCase(targets, allSystemPathsFileHidden, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<String>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsStringList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<String> stringListFilesHidden_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<String>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsStringList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: List<String>s.*/
                
                /*Start: List<File>s.*/
                    /*Start: visibility by parameter variable.*/
                        public List<File> fileListFiles(boolean useHiddenOrNot) throws SystemNotReadException,
                        IncorrectPathTypeException
                        {
                            List<File>
                            results;
            
                            List<SystemPath>
                            listToSearch;
            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList(listToSearch);
            
            
            
                            return results;
            
                        }
                
                        public List<File> fileListFiles(String target, boolean useFileExtension,
                                                           boolean ignoreCase, boolean compareFileExtensions,
                                                           boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String
                            targetType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetType = compareFileExtensions(compareFileExtensions, target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList(targetType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles(String[] targets, boolean useFileExtension,
                                                           boolean ignoreCase, boolean compareFileExtensions,
                                                           boolean useHiddenOrNot) throws SystemNotReadException,
                        FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String[]
                            targetsType;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            targetsType = compareFileExtensions(compareFileExtensions, targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList(targetsType, listToSearch, true, useFileExtension,
                            ignoreCase, compareFileExtensions);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_ExcludeFileExtension(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_ExcludeFileExtension(target, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_ExcludeFileExtension(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_ExcludeFileExtension(targets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_IgnoreCase(String target, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_IgnoreCase(target, listToSearch,
                            true, useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_IgnoreCase(String[] targets, boolean useFileExtension, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_IgnoreCase(targets, listToSearch, true,
                            useFileExtension);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_CompareFileExtensions(String target, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                            listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_CompareFileExtensions(String[] targets, boolean ignoreCase, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, listToSearch, ignoreCase);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_ExcludeFileExtension_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_IgnoreCase_ExcludeFileExtension(String target, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_ExcludeFileExtension_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_IgnoreCase_ExcludeFileExtension(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_IgnoreCase_CompareFileExtensions(String target,
                                                                                            boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_CompareFileExtensions_IgnoreCase(String target, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String
                            fileExtensionTarget;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTarget = checkFileExtension(target);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_IgnoreCase_CompareFileExtensions(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                        
                        public List<File> fileListFiles_CompareFileExtensions_IgnoreCase(String[] targets, boolean useHiddenOrNot) throws SystemNotReadException, FileExtensionNotApprovedException, IncorrectPathTypeException
                        {
                            List<File>
                            results;
                            
                            String[]
                            fileExtensionTargets;
                            
                            List<SystemPath>
                            listToSearch;
                            
                            
                            
                            checkSystemIsRead();
                            fileExtensionTargets = checkFileExtension(targets);
                            listToSearch = hiddenOrNot(useHiddenOrNot, "file");
                            results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, listToSearch);
                            
                            
                            
                            return results;
                            
                        }
                    /*End: visibility by parameter variable.*/
                    
                    /*Start: visibility by method name.*/
                        /*Start: visible.*/
                            public List<File> fileListFilesVisible() throws SystemNotReadException
                            {
                                List<File>
                                results;
    
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsFileVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsFileVisible, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsFileVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsFileVisible, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsFileList(targetType, allSystemPathsFileVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible(String[] targets, boolean useFileExtension,
                                                                      boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsFileList(targetsType, allSystemPathsFileVisible, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsFileVisible,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsFileVisible, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesVisible_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileVisible);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: visible.*/
                        
                        /*Start: hidden.*/
                            public List<File> fileListFilesHidden() throws SystemNotReadException
                            {
                                List<File>
                                results;
    
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsFileHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsFileHidden, true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden(String target, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(target, allSystemPathsFileHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden(String[] targets, boolean useFileExtension, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList(targets, allSystemPathsFileHidden, true, useFileExtension, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden(String target, boolean useFileExtension, boolean ignoreCase
                            , boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                targetType;
                                
                                
                                
                                checkSystemIsRead();
                                targetType = compareFileExtensions(compareFileExtensions, target);
                                results = returnListContentAsFileList(targetType, allSystemPathsFileHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden(String[] targets, boolean useFileExtension,
                                                                     boolean ignoreCase, boolean compareFileExtensions) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                targetsType;
                                
                                
                                
                                checkSystemIsRead();
                                targetsType = compareFileExtensions(compareFileExtensions, targets);
                                results = returnListContentAsFileList(targetsType, allSystemPathsFileHidden, true, useFileExtension,
                                ignoreCase, compareFileExtensions);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_ExcludeFileExtension(String target, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(target, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_ExcludeFileExtension(String[] targets, boolean ignoreCase) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension(targets, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_IgnoreCase(String target, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(target, allSystemPathsFileHidden,
                                true, useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_IgnoreCase(String[] targets, boolean useFileExtension) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_IgnoreCase(targets, allSystemPathsFileHidden, true,
                                useFileExtension);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_CompareFileExtensions(String target, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTarget,
                                allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_CompareFileExtensions(String[] targets, boolean ignoreCase) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden, ignoreCase);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_ExcludeFileExtension_IgnoreCase(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_IgnoreCase_ExcludeFileExtension(String target) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(target,
                                allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_ExcludeFileExtension_IgnoreCase(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_IgnoreCase_ExcludeFileExtension(String[] targets) throws SystemNotReadException
                            {
                                List<File>
                                results;
                                
                                
                                
                                checkSystemIsRead();
                                results = returnListContentAsFileList_ExcludeFileExtension_IgnoreCase(targets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_IgnoreCase_CompareFileExtensions(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_CompareFileExtensions_IgnoreCase(String target) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String
                                fileExtensionTarget;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTarget = checkFileExtension(target);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTarget, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_IgnoreCase_CompareFileExtensions(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results = returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets, allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                            
                            public List<File> fileListFilesHidden_CompareFileExtensions_IgnoreCase(String[] targets) throws SystemNotReadException, FileExtensionNotApprovedException
                            {
                                List<File>
                                results;
                                
                                String[]
                                fileExtensionTargets;
                                
                                
                                
                                checkSystemIsRead();
                                fileExtensionTargets = checkFileExtension(targets);
                                results =
                                returnListContentAsFileList_IgnoreCase_CompareFileExtensions(fileExtensionTargets,
                                allSystemPathsFileHidden);
                                
                                
                                
                                return results;
                                
                            }
                        /*End: hidden.*/
                    /*End: visibility by method name.*/
                /*End: List<File>s.*/
            /*End: files.*/
        /*End: get class List results.*/
    /*End: public methods.*/



    /*Start: protected methods.*/
        /*Start: initialize global variables.*/
            protected void collectMainList()
            {
                allSystemPaths = sendAndReceive_Beta();
            
            }
            
            protected void setSubLists()
            {
                setSubLists_Alpha();
                setSubLists_Beta();
                
            }
            
            protected void setSubLists_Beta()
            {
                setListAllSystemPathsHidden();
                setListAllSystemPathsVisible();
                setListOnlyDirectoriesHidden();
                setListOnlyDirectoriesVisible();
                setListOnlyFilesHidden();
                setListOnlyFilesVisible();
                
            }
        /*End: initialize global variables.*/
    
        /*Start: get List options.*/
            protected List<SystemPath> hiddenOrNot(boolean useHiddenOrNot, String pathType) throws IncorrectPathTypeException
            {
                List<SystemPath>
                listToSearch,
                hiddenPath,
                visiblePath;
    
    
    
                listToSearch = new ArrayList<SystemPath>();
                hiddenPath = new ArrayList<SystemPath>();
                visiblePath = new ArrayList<SystemPath>();
                
                
                
                switch(pathType)
                {
                    case "all":
                    {
                        hiddenPath.addAll(allSystemPathsHidden);
                        visiblePath.addAll(allSystemPathsVisible);
                        
                        break;
                        
                    }
    
                    case "directory":
                    {
                        hiddenPath.addAll(allSystemPathsDirectoryHidden);
                        visiblePath.addAll(allSystemPathsDirectoryVisible);
        
                        break;
        
                    }
                    
                    case "file":
                    {
                        hiddenPath.addAll(allSystemPathsFileHidden);
                        visiblePath.addAll(allSystemPathsFileVisible);
    
                        break;
                        
                    }
                    
                    default:
                    {
                        throw new IncorrectPathTypeException();
                        
                    }
                    
                }
                
                
                
                if(useHiddenOrNot)
                {
                    listToSearch.addAll(hiddenPath);
        
                }
                else
                {
                    listToSearch.addAll(visiblePath);
        
                }
                
                
                
                return listToSearch;
                
            }
        /*End: get List options.*/
    /*End: protected methods.*/

    /*Start: private methods.*/
        /*Start: set global Lists.*/
            private void setListAllSystemPathsHidden()
            {
                allSystemPathsHidden = new ArrayList<SystemPath>();
                
            
                allSystemPaths.stream()
                .filter(sp -> sp.getIsHidden() == true)
                .forEach(sp -> allSystemPathsHidden.add(sp));
            
            }
    
            private void setListAllSystemPathsVisible()
            {
                allSystemPathsVisible = new ArrayList<SystemPath>();
    
                
                allSystemPaths.stream()
                .filter(sp -> sp.getIsHidden() == false)
                .forEach(sp -> allSystemPathsHidden.add(sp));
                
            }
    
            private void setListOnlyDirectoriesHidden()
            {
                allSystemPathsDirectoryHidden = new ArrayList<SystemPath>();
    
                
                allSystemPathsDirectory.stream()
                .filter(sp -> sp.getIsHidden() == true)
                .forEach(sp -> allSystemPathsDirectoryHidden.add(sp));
                
            }
    
            private void setListOnlyDirectoriesVisible()
            {
                allSystemPathsDirectoryVisible = new ArrayList<SystemPath>();
                
    
                allSystemPathsDirectory.stream()
                .filter(sp -> sp.getIsHidden() == false)
                .forEach(sp -> allSystemPathsDirectoryVisible.add(sp));
                
            }
            
            private void setListOnlyFilesHidden()
            {
                allSystemPathsFileHidden = new ArrayList<SystemPath>();
                
    
                allSystemPathsFile.stream()
                .filter(sp -> sp.getIsHidden() == true)
                .forEach(sp -> allSystemPathsFileHidden.add(sp));
                
            }
    
            private void setListOnlyFilesVisible()
            {
                allSystemPathsFileVisible = new ArrayList<SystemPath>();
                
    
                allSystemPathsFile.stream()
                .filter(sp -> sp.getIsHidden() == false)
                .forEach(sp -> allSystemPathsFileVisible.add(sp));
                
                
            }
        /*End: set global Lists.*/
    /*End: private methods.*/

}