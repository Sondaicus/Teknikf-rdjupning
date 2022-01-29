package systemPathsCollector;



import java.util.*;



public class OptionSettingsCalculation extends OptionSettingsCalculation_Beta implements ContainerAndOptions
{
	/*Start: global variables.*/
		protected int
		threadNumbers;
	
		protected ArrayList <SystemPath>
		closedDirectories,
		openDirectories;
	/*End: global variables.*/
	
	
	
	/*Start: constructors.*/
		OptionSettingsCalculation()
		{}
		
		OptionSettingsCalculation(List<List> systemPathOptions_Beta, int threadNumbers)
		{
			allCollectedSystemPaths = new ArrayList<SystemPath>();
			setGlobalSettingVariables_Beta(systemPathOptions_Beta);
			setGlobalSettingVariables(threadNumbers);
			setStartDirectories();
			
		}
	/*End: constructors.*/
	
	
	
	protected void setGlobalSettingVariables(int threadNumbers)
	{
		this.threadNumbers = threadNumbers;
		
	}
}
