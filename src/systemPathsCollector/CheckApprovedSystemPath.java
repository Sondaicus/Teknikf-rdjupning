package systemPathsCollector;


import java.util.List;



interface CheckApprovedSystemPath
{
	static boolean Beta(SystemPath currentPath, boolean proceed)
	{
		List <String>
		startDirectoriesValues,
		excludedDirectories,
		excludedFileNames,
		excludedFileTypes,
		excludedDirectoriesIgnoreCase,
		excludedFileNamesIgnoreCase,
		excludedFileTypesIgnoreCase;
		
		boolean
		useHiddenPaths,
		useVisiblePaths,
		specifiedStartDirectories,
		specifiedExcludedDirectories,
		specifiedExcludedFileNames,
		specifiedExcludedFileTypes,
		specifiedExcludedDirectoriesIgnoreCase,
		specifiedExcludedFileNamesIgnoreCase,
		specifiedExcludedFileTypesIgnoreCase;
		
		
		
		
		if(proceed && !useHiddenPaths)
		{
			if(currentPath.getIsHidden())
			{
				proceed = false;
				
			}
			
		}
		
		if(proceed && !useVisiblePaths)
		{
			if(!currentPath.getIsHidden())
			{
				proceed = false;
				
			}
			
		}
		
		if(proceed && specifiedExcludedDirectories)
		{
			if(currentPath.getIsDirectory())
			{
				boolean
				notApproved;
				
				
				
				notApproved = excludedDirectories.stream()
				.anyMatch(s -> s.equals(currentPath.getFileName()));
				
				
				
				if(notApproved)
				{
					proceed = false;
					
				}
				
			}
			
		}
		
		if(proceed && specifiedExcludedFileNames)
		{
			if(currentPath.getIsFile())
			{
				boolean
				notApproved1,
				notApproved2;
				
				
				
				notApproved1 = excludedFileNames.stream()
				.anyMatch(s -> s.equals(currentPath.getFileName()));
				
				notApproved2 = excludedFileNames.stream()
				.anyMatch(s -> s.equals(currentPath.getFileNameWithoutExtension()));
				
				
				
				if(notApproved1 || notApproved2)
				{
					proceed = false;
					
				}
				
			}
			
		}
		
		if(proceed && specifiedExcludedFileTypes)
		{
			if(currentPath.getIsFile())
			{
				boolean
				notApproved;
				
				
				
				notApproved = excludedFileTypes.stream()
				.anyMatch(s -> s.equals(currentPath.getFileExtension()));
				
				
				
				if(notApproved)
				{
					proceed = false;
					
				}
				
			}
			
		}
		
		if(proceed && specifiedExcludedDirectoriesIgnoreCase)
		{
			if(currentPath.getIsDirectory())
			{
				boolean
				notApproved;
				
				
				
				notApproved = excludedDirectoriesIgnoreCase.stream()
				.anyMatch(s -> s.equals(currentPath.getFileNameLowerCase()));
				
				
				
				if(notApproved)
				{
					proceed = false;
					
				}
				
			}
			
		}
		
		if(proceed && specifiedExcludedFileNamesIgnoreCase)
		{
			if(currentPath.getIsFile())
			{
				boolean
				notApproved1,
				notApproved2;
				
				
				
				notApproved1 = excludedFileNamesIgnoreCase.stream()
				.anyMatch(s -> s.equals(currentPath.getFileNameLowerCase()));
				
				notApproved2 = excludedFileNamesIgnoreCase.stream()
				.anyMatch(s -> s.equals(currentPath.getFileNameWithoutExtensionLowerCase()));
				
				
				
				if(notApproved1 || notApproved2)
				{
					proceed = false;
					
				}
				
			}
			
		}
		
		if(proceed && specifiedExcludedFileTypesIgnoreCase)
		{
			if(currentPath.getIsFile())
			{
				boolean
				notApproved;
				
				
				
				notApproved = excludedFileTypesIgnoreCase.stream()
				.anyMatch(s -> s.equals(currentPath.getFileExtensionLowerCase()));
				
				
				
				if(notApproved)
				{
					proceed = false;
					
				}
				
			}
			
		}
		
		
		return proceed;
		
	}
}
