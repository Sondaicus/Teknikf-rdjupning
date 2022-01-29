package systemPathsCollector;



class ExtraSystemCollectionThreads
{
	private int
	threadsNumber;
	
	private boolean
	extraThreadsUse;
	
	
	
	ExtraSystemCollectionThreads() throws ExtraThreadsValueNotApprovedException
	{
		setThreadsNumber(0);
		
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
		if(input < 0)
		{
			throw new ExtraThreadsValueNotApprovedException();
			
		}
		else
		{
			this.threadsNumber = input;
			
			if(input == 0)
			{
				setExtraThreadsUse(false);
				
			}
			else
			{
				setExtraThreadsUse(true);
				
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
