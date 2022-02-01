package systemPathsCollector;



import java.util.*;



public class OptionSettingsCalculation_Gamma extends OptionSettingsCalculation_Beta implements ContainerAndOptions
{
	/*Start: global variables.*/
		protected int
		threadNumbers;
	
		protected ArrayList<SystemPath>
		finishedParentDirectories,
		unfinishedParentDirectories,
		usingParentDirectories,
		unapprovedDirectories;
	/*End: global variables.*/
	
	
	
	/*Start: constructors.*/
		OptionSettingsCalculation_Gamma()
		{}
		
		OptionSettingsCalculation_Gamma(List<List> systemPathOptions_Beta, int threadNumbers)
		{
			allCollectedSystemPaths = new ArrayList<SystemPath>();
			setGlobalSettingVariables_Beta(systemPathOptions_Beta);
			setGlobalSettingVariables_Gamma(threadNumbers);
			setStartDirectories();
			
		}
	/*End: constructors.*/
	
	
	
	protected void setGlobalSettingVariables_Gamma(int threadNumbers)
	{
		this.threadNumbers = threadNumbers;
		finishedParentDirectories = new ArrayList <SystemPath>();
		unfinishedParentDirectories = new ArrayList <SystemPath>();
		usingParentDirectories = new ArrayList <SystemPath>();
		unapprovedDirectories = new ArrayList <SystemPath>();
	
	}
	
	
	
	protected void searchFolder(ArrayList<SystemPath> searchingDirectories)
	{
		List<List>
		excludedDirectories;
		
		
		
	
	}
	
}