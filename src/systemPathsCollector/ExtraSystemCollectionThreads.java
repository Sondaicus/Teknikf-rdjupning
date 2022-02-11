package systemPathsCollector;



class ExtraSystemCollectionThreads
{
	private int
	threadsNumber;
	
	private boolean
	extraThreadsUse;
	
	
	
	ExtraSystemCollectionThreads() throws ExtraThreadsValueNotApprovedException
	{
		setThreadsNumber(-1);
		
	}
	
	ExtraSystemCollectionThreads(int input) throws ExtraThreadsValueNotApprovedException
	{
		setThreadsNumber(input);
		
	}
	
	
	
	private void setExtraThreadsUse(boolean value)
	{
		this.extraThreadsUse = value;
		
	}
	
	void setThreadsNumber(int input) throws ExtraThreadsValueNotApprovedException
	{
		if(input < -1)
		{
			throw new ExtraThreadsValueNotApprovedException();
			
		}
		else
		{
			if(input == 0)
			{
				setExtraThreadsUse(false);
				
			}
			else
			{
				setExtraThreadsUse(true);
				
			}
			
			if(input == -1)
			{
				this.threadsNumber = Runtime.getRuntime().availableProcessors();
				
			}
			else
			{
				this.threadsNumber = input;
				
			}
			
		}
		
	}
	
	
	
	int getThreadsNumber()
	{
		return threadsNumber;
		
	}
	
	boolean getExtraThreadsUse()
	{
		return extraThreadsUse;
		
	}

}