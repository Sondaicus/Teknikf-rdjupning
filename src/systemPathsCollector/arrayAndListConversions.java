package systemPathsCollector;



import java.io.File;
import java.util.*;



interface arrayAndListConversions
{
	static List<String> stringArrayToListString(String[] input)
	{
		List<String>
		result;
		
		int
		inputLength;
		
		
		
		result = new ArrayList<String>();
		inputLength = input.length;
		
		for(int i = 0; i < inputLength; i++)
		{
			String
			currentString;
			
			
			
			currentString = input[i];
			result.add(currentString);
			
		}
		
		
		
		return result;
		
	}
	
	static String[] listStringToStringArray(List<String> input)
	{
		String[]
		result;
		
		int
		inputSize;
		
		
		
		inputSize = input.size();
		result = new String[inputSize];
		
		for(int i = 0; i < inputSize; i++)
		{
			String
			currentString;
			
			
			
			currentString = input.get(i);
			result[i] = currentString;
			
		}
		
		
		
		return result;
		
	}
	
	static List<File> fileArrayToListArray(File[] input)
	{
		List<File>
		result;
		
		int
		inputLength;
		
		
		
		result = new ArrayList<File>();
		inputLength = input.length;
		
		for(int i = 0; i < inputLength; i++)
		{
			File
			currentFile;
			
			
			
			currentFile = input[i];
			result.add(currentFile);
			
		}
		
		
		
		return result;
		
	}
	
	static List<File> listStringToListFile(List<String> input)
	{
		List<File>
		results;
		
		int
		inputSize;
		
		
		
		results = new ArrayList<File>();
		inputSize = input.size();
		
		
		
		for(int i = 0; i < inputSize; i++)
		{
			String
			currentString;
			
			File
			newFile;
			
			
			
			currentString = input.get(i);
			newFile = new File(currentString);
			
			
			
			results.add(newFile);
			
		}
		
		
		
		return results;
		
	}
}