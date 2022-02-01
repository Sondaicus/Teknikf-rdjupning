package systemPathsCollector;



import java.util.List;



interface InputAndReturnTypes
{
	static boolean checkVariableValueToBoolean(List variable, int value)
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
}