package systemPathsCollector;



import java.util.*;



public class OptionSettingsCalculation_Beta extends OptionSettingsCalculation_Alpha implements OptionsAndSearch
{
	/*Start: global variables.*/
		protected List<String>
		startDirectoriesValues;
		
		boolean
		specifiedStartDirectories;
	
		protected CheckApprovedSystemPath
		casp_b;
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
			specifiedStartDirectories = InputAndReturnTypes.checkVariableValueToBoolean(startDirectoriesValues, 0);
			casp_b = new CheckApprovedSystemPath(systemPathOptions);
			
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
			Object[]
			results;
			
			boolean
			proceed;
			
			
			
			proceed = true;
			results = casp_b.checkApprovedPath(currentPath, proceed);
			proceed = (Boolean) results[0];
			
			
			return proceed;
			
		}
	/*End overriding methods.*/
	
}