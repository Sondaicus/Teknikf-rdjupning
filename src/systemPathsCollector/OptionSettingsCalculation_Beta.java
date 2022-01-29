package systemPathsCollector;



import java.util.*;



public class OptionSettingsCalculation_Beta extends OptionSettingsCalculation_Alpha implements OptionsAndSearch
{
	/*Start: global variables.*/
		protected List<String>
		startDirectoriesValues,
		excludedDirectories,
		excludedFileNames,
		excludedFileTypes,
		excludedDirectoriesIgnoreCase,
		excludedFileNamesIgnoreCase,
		excludedFileTypesIgnoreCase;
		
		protected boolean
		useHiddenPaths,
		useVisiblePaths,
		specifiedStartDirectories,
		specifiedExcludedDirectories,
		specifiedExcludedFileNames,
		specifiedExcludedFileTypes,
		specifiedExcludedDirectoriesIgnoreCase,
		specifiedExcludedFileNamesIgnoreCase,
		specifiedExcludedFileTypesIgnoreCase;
	/*End: global variables.*/
	
	
	
	/*Start: constructors.*/
		OptionSettingsCalculation_Beta()
		{}
	
		OptionSettingsCalculation_Beta(List<List> systemPathOptions_Beta)
		{
			allCollectedSystemPaths = new ArrayList<SystemPath>();
			setGlobalSettingVariables_Beta(systemPathOptions_Beta);
			setStartDirectories();
			
		}
	/*End: constructors.*/
	
	
	
	/*Start: new methods.*/
		protected void setGlobalSettingVariables_Beta(List<List> systemPathOptions)
		{
			startDirectoriesValues = (List<String>) systemPathOptions.get(0);
			excludedDirectories = (List<String>) systemPathOptions.get(1);
			excludedFileNames = (List<String>) systemPathOptions.get(2);
			excludedFileTypes =  (List<String>) systemPathOptions.get(3);
			excludedDirectoriesIgnoreCase = (List<String>) systemPathOptions.get(4);
			excludedFileNamesIgnoreCase = (List<String>) systemPathOptions.get(5);
			excludedFileTypesIgnoreCase =  (List<String>) systemPathOptions.get(6);
			useHiddenPaths = (boolean) systemPathOptions.get(7).get(0);
			useVisiblePaths = (boolean) systemPathOptions.get(7).get(1);
			
			
			
			specifiedStartDirectories = checkVariableValueToBoolean(startDirectoriesValues, 0);
			specifiedExcludedDirectories = checkVariableValueToBoolean(excludedDirectories, 0);
			specifiedExcludedFileNames =  checkVariableValueToBoolean(excludedFileNames, 0);
			specifiedExcludedFileTypes =  checkVariableValueToBoolean(excludedFileTypes, 0);
			specifiedExcludedDirectoriesIgnoreCase = checkVariableValueToBoolean(excludedDirectoriesIgnoreCase, 0);
			specifiedExcludedFileNamesIgnoreCase =  checkVariableValueToBoolean(excludedFileNamesIgnoreCase, 0);
			specifiedExcludedFileTypesIgnoreCase =  checkVariableValueToBoolean(excludedFileTypesIgnoreCase, 0);
			
		}
		
		protected boolean checkVariableValueToBoolean(List variable, int value)
		{
			boolean
			result;
			
			int
			variableSize;
			
			
			
			variableSize = variable.size();
			
			if(variableSize == value)
			{
				result = false;
				
			}
			else
			{
				result = true;
				
			}
			
			
			
			return result;
			
		}
	
		protected boolean checkApprovedSystemPath_Beta(SystemPath currentPath, boolean proceed)
		{
			if(proceed && !useHiddenPaths)
			{
				if(currentPath.getIsHidden())
				{
					proceed = false;
					
				}
				
			}
			
			if(proceed && !useVisiblePaths)
			{
				if(!currentPath.getIsHidden())
				{
					proceed = false;
					
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
						
					}
					
				}
				
			}
			
			
			return proceed;
			
		}
	/*End: new methods.*/
	
	
	
	/*Start: overriding methods.*/
		protected void setStartDirectories()
		{
			if(!specifiedStartDirectories)
			{
				getSystemRoots();
				
			}
			else
			{
				startDirectories = arrayAndListConversions.listStringToListFile(startDirectoriesValues);
				
			}
			
		}
	
		protected boolean checkApprovedSystemPath(SystemPath currentPath)
		{
			boolean
			proceed;
			
			
			
			proceed = true;
			proceed = CheckApprovedSystemPath.Beta(currentPath, proceed);
			
			
			
			return proceed;
			
		}
	/*End overriding methods.*/
	
}