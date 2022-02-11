package systemPathsCollector;



import java.util.*;



public class SystemPathTimer extends Timer
{
	protected boolean
	usingExtraThreads;
	
	protected int
	threadsBeingUsed,
	listSize;
	
	protected double
	timeElapsedSeconds;
	
	protected long
	startTime,
	nanoToStandardPOWLong;
	
	protected String
	startMessage,
	elapsedTimeLinePart,
	collectedSystemPathsLinePart;
	
	SystemPathTimerTask
	systemPathTimerTask;
	
	Timer
	timer;
	
	
	
	SystemPathTimer(boolean usingExtraThreads, int threadsBeingUsed)
	{
		setStartVariables(usingExtraThreads, threadsBeingUsed);
		
	}
	
	
	
	protected void printStartMessage()
	{
		System.out.println(startMessage);
		
	}
	
	protected void printProgressMessage()
	{
		String
		fullMessage,
		firstLineFull,
		secondLineFull;
		
		
		
		firstLineFull = elapsedTimeLinePart + timeElapsedSeconds + " seconds." + "\n";
		secondLineFull = collectedSystemPathsLinePart + listSize + "." + "\n";
		fullMessage = firstLineFull + secondLineFull;
		
		
		
		System.out.println(fullMessage);
		
	}
	
	protected void setListSize(int listSize)
	{
		this.listSize = listSize;
		
	}
	
	protected void setStartVariables(boolean usingExtraThreads, int threadsBeingUsed)
	{
		setStartTime();
		setNanoToStandardPOWLong();
		setUsingExtraThreads(usingExtraThreads);
		setThreadsBeingUsed(threadsBeingUsed);
		setStartMessage();
		setProgressStrings();
		setTimerTask();
		printStartMessage();
		
	}
	
	protected void setStartTime()
	{
		startTime = System.nanoTime();
		
	}
	
	protected void setNanoToStandardPOWLong()
	{
		nanoToStandardPOWLong = (int) Math.pow(10, 9);
		
	}
	
	protected void setTimeElapsedSeconds()
	{
		long
		endTime;
		
		double
		endTimeDoubleHolder;
		
		
		
		endTime = System.nanoTime() - startTime;
		endTimeDoubleHolder = endTime;
		timeElapsedSeconds = endTimeDoubleHolder / nanoToStandardPOWLong;
		
	}
	
	protected void setTimerTask()
	{
		systemPathTimerTask = new SystemPathTimerTask(usingExtraThreads, threadsBeingUsed)
		{
			@Override
			public void run()
			{
				setTimeElapsedSeconds();
				printProgressMessage();
				
			}
			
		};
		
	}
	
	protected void setUsingExtraThreads(boolean usingExtraThreads)
	{
		this.usingExtraThreads = usingExtraThreads;
		
	}
	
	protected void setThreadsBeingUsed(int threadsBeingUsed)
	{
		this.threadsBeingUsed = threadsBeingUsed;
		
	}
	
	protected void setStartMessage()
	{
		String
		fullString,
		firstLine,
		secondLineFull,
		secondLinePart,
		thirdLineFull,
		thirdLinePart;
		
		
		
		firstLine = "System paths collecting started.";
		secondLinePart = "Using more then one thread: ";
		thirdLinePart = "Using total number of threads: ";
		
		
		
		if(usingExtraThreads)
		{
			secondLineFull = secondLinePart + "true.";
			thirdLineFull = thirdLinePart + threadsBeingUsed + ".";
			fullString = firstLine + "\n" + secondLineFull + "\n" + thirdLineFull + "\n";
			
		}
		else
		{
			secondLineFull = secondLinePart + "false.";
			fullString = firstLine + "\n" + secondLineFull + "\n";
			
		}
		
		
		
		this.startMessage = fullString;
		
	}
	
	protected void setProgressStrings()
	{
		elapsedTimeLinePart = "Elapsed time: ";
		collectedSystemPathsLinePart = "Collected system paths: ";
		
	}
	
}