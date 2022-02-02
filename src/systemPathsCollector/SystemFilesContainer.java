package systemPathsCollector;


import java.util.List;

public class SystemFilesContainer extends SystemFilesContainer_Beta  implements ContainerAndOptions
{
	/*Start: global variables.*/
		protected ExtraSystemCollectionThreads
		esct;
	/*End: global variables.*/
	
	
	/*Start: constructors.*/
		public SystemFilesContainer() throws ExtraThreadsValueNotApprovedException
		{
			setSystemSearchOptionsVariablesStartValues_Beta();
			setSystemIsRead(false);
			setSystemThreadUseOptionsStartValues();
			
		}
	/*End: constructors.*/
	
	
	
	/*Start: public methods.*/
		/*Start: system extra thread use variables.*/
			public void setExtraSystemReadingThreads(int input) throws ExtraThreadsValueNotApprovedException
			{
				esct.setThreadsNumber(input);
				
			}
			
			public int getExtraSystemReadingThreads()
			{
				return esct.getThreadsNumber();
				
			}
		/*End: system extra thread use variables.*/
	/*End: public methods.*/
	
	
	
	/*Start: protected methods.*/
		/*Start: initialize global variables.*/
			protected void setSystemThreadUseOptionsStartValues() throws ExtraThreadsValueNotApprovedException
			{
				esct = new ExtraSystemCollectionThreads();
				
			}
	
			protected void collectMainList() throws InterruptedException
			{
				List<List>
				systemPathOptions;
				
				boolean
				useExtraThreads;
				
				
				
				systemPathOptions = collectMainListOptions_Beta();
				useExtraThreads = esct.getExtraThreadsUse();
				
				
				
				if(useExtraThreads)
				{
					int
					threadNumbers;
					
					
					
					threadNumbers = esct.getThreadsNumber();
					allSystemPaths = sendAndReceive_Gamma(systemPathOptions, threadNumbers);
					
				}
				else
				{
					collectMainList_Beta(systemPathOptions);
					
				}
				
			}
		/*End: initialize global variables.*/
	/*End: protected methods.*/
}