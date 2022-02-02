package systemPathsCollector;



import java.util.ArrayList;
import java.util.List;



class CheckApprovedSystemPath
{
	/*Start: global variables.*/
		List <String>
		excludedDirectories,
		excludedFileNames,
		excludedFileTypes,
		excludedDirectoriesIgnoreCase,
		excludedFileNamesIgnoreCase,
		excludedFileTypesIgnoreCase;
		
		boolean
		useHiddenPaths,
		useVisiblePaths,
		specifiedExcludedDirectories,
		specifiedExcludedFileNames,
		specifiedExcludedFileTypes,
		specifiedExcludedDirectoriesIgnoreCase,
		specifiedExcludedFileNamesIgnoreCase,
		specifiedExcludedFileTypesIgnoreCase;
	/*End: global variables.*/
	
	
	
	/*Start: constructors.*/
		CheckApprovedSystemPath(List<List> systemPathOptions)
		{
			setGlobalSettingVariables_Beta(systemPathOptions);
			
		}
	/*End: constructors.*/
	
	
	
	/*Start: variable methods.*/
		void setGlobalSettingVariables_Beta(List<List> systemPathOptions)
		{
			excludedDirectories = (List<String>) systemPathOptions.get(1);
			excludedFileNames = (List<String>) systemPathOptions.get(2);
			excludedFileTypes =  (List<String>) systemPathOptions.get(3);
			excludedDirectoriesIgnoreCase = (List<String>) systemPathOptions.get(4);
			excludedFileNamesIgnoreCase = (List<String>) systemPathOptions.get(5);
			excludedFileTypesIgnoreCase =  (List<String>) systemPathOptions.get(6);
			useHiddenPaths = (boolean) systemPathOptions.get(7).get(0);
			useVisiblePaths = (boolean) systemPathOptions.get(7).get(1);
			
			
			
			specifiedExcludedDirectories = InputAndReturnTypes.checkVariableValueToBoolean(excludedDirectories, 0);
			specifiedExcludedFileNames =  InputAndReturnTypes.checkVariableValueToBoolean(excludedFileNames, 0);
			specifiedExcludedFileTypes =  InputAndReturnTypes.checkVariableValueToBoolean(excludedFileTypes, 0);
			specifiedExcludedDirectoriesIgnoreCase = InputAndReturnTypes.checkVariableValueToBoolean(excludedDirectoriesIgnoreCase, 0);
			specifiedExcludedFileNamesIgnoreCase =  InputAndReturnTypes.checkVariableValueToBoolean(excludedFileNamesIgnoreCase, 0);
			specifiedExcludedFileTypesIgnoreCase =  InputAndReturnTypes.checkVariableValueToBoolean(excludedFileTypesIgnoreCase, 0);
			
		}
	/*End: variable methods.*/
	
	
	
	/*Start: return methods.*/
		Object[] checkApprovedPath(SystemPath currentPath, boolean proceed)
		{
			Object[]
			result;
			
			int
			failedCheck;
			
			
			
			result = new Object[2];
			failedCheck = 0;
			
			
			
			if(proceed && !useHiddenPaths)
			{
				if(currentPath.getIsHidden())
				{
					proceed = false;
					failedCheck = 1;
					
				}
				
			}
			
			if(proceed && !useVisiblePaths)
			{
				if(!currentPath.getIsHidden())
				{
					proceed = false;
					failedCheck = 2;
					
				}
				
			}
			
			if(proceed && specifiedExcludedDirectories)
			{
				if(currentPath.getIsDirectory())
				{
					boolean
					notApproved;
					
					
					
					notApproved = excludedDirectories.stream()
					.anyMatch(s -> s.equals(currentPath.getFileName()));
					
					
					
					if(notApproved)
					{
						proceed = false;
						failedCheck = 3;
						
					}
					
				}
				
			}
			
			if(proceed && specifiedExcludedFileNames)
			{
				if(currentPath.getIsFile())
				{
					boolean
					notApproved1,
					notApproved2;
					
					
					
					notApproved1 = excludedFileNames.stream()
					.anyMatch(s -> s.equals(currentPath.getFileName()));
					
					notApproved2 = excludedFileNames.stream()
					.anyMatch(s -> s.equals(currentPath.getFileNameWithoutExtension()));
					
					
					
					if(notApproved1 || notApproved2)
					{
						proceed = false;
						failedCheck = 4;
						
					}
					
				}
				
			}
			
			if(proceed && specifiedExcludedFileTypes)
			{
				if(currentPath.getIsFile())
				{
					boolean
					notApproved;
					
					
					
					notApproved = excludedFileTypes.stream()
					.anyMatch(s -> s.equals(currentPath.getFileExtension()));
					
					
					
					if(notApproved)
					{
						proceed = false;
						failedCheck = 5;
						
					}
					
				}
				
			}
			
			if(proceed && specifiedExcludedDirectoriesIgnoreCase)
			{
				if(currentPath.getIsDirectory())
				{
					boolean
					notApproved;
					
					
					
					notApproved = excludedDirectoriesIgnoreCase.stream()
					.anyMatch(s -> s.equals(currentPath.getFileNameLowerCase()));
					
					
					
					if(notApproved)
					{
						proceed = false;
						failedCheck = 6;
						
					}
					
				}
				
			}
			
			if(proceed && specifiedExcludedFileNamesIgnoreCase)
			{
				if(currentPath.getIsFile())
				{
					boolean
					notApproved1,
					notApproved2;
					
					
					
					notApproved1 = excludedFileNamesIgnoreCase.stream()
					.anyMatch(s -> s.equals(currentPath.getFileNameLowerCase()));
					
					notApproved2 = excludedFileNamesIgnoreCase.stream()
					.anyMatch(s -> s.equals(currentPath.getFileNameWithoutExtensionLowerCase()));
					
					
					
					if(notApproved1 || notApproved2)
					{
						proceed = false;
						failedCheck = 7;
						
					}
					
				}
				
			}
			
			if(proceed && specifiedExcludedFileTypesIgnoreCase)
			{
				if(currentPath.getIsFile())
				{
					boolean
					notApproved;
					
					
					
					notApproved = excludedFileTypesIgnoreCase.stream()
					.anyMatch(s -> s.equals(currentPath.getFileExtensionLowerCase()));
					
					
					
					if(notApproved)
					{
						proceed = false;
						failedCheck = 8;
						
					}
					
				}
				
			}
			
			if(proceed)
			{
				failedCheck = -1;
				
			}
			
			
			
			result[0] = (Boolean) proceed;
			result[1] = (Integer) failedCheck;
			
			
			
			return result;
			
		}
	/*End: return methods.*/
	
}