package systemPathsCollector;



import java.io.File;
import java.util.*;



public class OptionSettingsCalculation_Beta extends OptionSettingsCalculation_Alpha implements OptionsAndSearch
{
	/*Start: global variables.*/
		protected List<String>
		startDirectoriesValues;
		
		boolean
		specifiedStartDirectories;
	
		protected CheckApprovedSystemPath
		casp;
	/*End: global variables.*/
	
	
	
	/*Start: constructors.*/
		OptionSettingsCalculation_Beta()
		{}
	
		OptionSettingsCalculation_Beta(List<List> settings)
		{
			initializeStartValues(settings);
			setTimers(settings);
			
		}
	/*End: constructors.*/
	
	
	
	/*Start: new methods.*/
		protected void setGlobalSettingVariables_Beta(List<List> settings_Beta)
		{
			startDirectoriesValues = (List<String>) settings_Beta.get(0);
			specifiedStartDirectories = InputAndReturnTypes.checkVariableValueToBoolean(startDirectoriesValues, 0);
			casp = new CheckApprovedSystemPath(settings_Beta);
			
		}
	
		protected void initializeStartValues_Beta(List<List> settings)
		{
			List<List>
			settings_Beta;
			
			
			
			settings_Beta = settings.get(0);
			
			
			
			setGlobalSettingVariables_Beta(settings_Beta);
			setStartDirectories();
			
		}
	/*End: new methods.*/
	
	
	
	/*Start: overriding methods.*/
		protected void initializeStartValues(List<List> settings)
		{
			initializeStartValues_Alpha();
			initializeStartValues_Beta(settings);
			
		}
	
		protected void setStartDirectories()
		{
			if(!specifiedStartDirectories)
			{
				getSystemRoots();
				
			}
			else
			{
				startDirectories = ArrayAndListConversions.listStringToListFile(startDirectoriesValues);
				
			}
			
		}
	
		protected boolean checkApprovedSystemPath(SystemPath currentPath)
		{
			Object[]
			results;
			
			boolean
			proceed;
			
			
			
			proceed = true;
			results = casp.checkApprovedPath(currentPath, proceed);
			proceed = (Boolean) results[0];
			
			
			return proceed;
			
		}
	
		protected void setTimers(List<List> settings)
		{
			processToUser = new Timer();
			systemPathTimerTask = new SystemPathTimerTask(false, 0);
			
		}
	/*End overriding methods.*/
	
}