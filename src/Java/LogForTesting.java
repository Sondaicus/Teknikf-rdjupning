package Java;



import java.io.*;



public class LogForTesting
{
    private long
    startTime,
    endTime,
    nanoToStandardPOWLong;
    
    private double
    endTimeDoubleHolder,
    totalTime;
    
    private String
    endMessageStarter,
    sectionSpacer;
    
    
    
    public LogForTesting()
    {
        nanoToStandardPOWLong = (int)Math.pow(10, 9);
        endMessageStarter = "\n" + "\n" + "Total runtime: ";
        sectionSpacer = "            ";
        
    }
    
    
    
    public void printListLog(String[] content, String fileName, String taskName) throws IOException
    {
        String
        startPrint;
        
        int
        contentLength,
        advancementInt;
        
        double
        advancementDouble,
        procentalDouble;
    
        Printer
        logger;
    
    
        
        startTimer(taskName);
    
    
        
        logger = new Printer(fileName);
        contentLength = content.length;
        procentalDouble = 0.01;
        advancementDouble = contentLength * procentalDouble;
        advancementInt = (int) advancementDouble;
        startPrint = contentLength + "\n" + "\n";
    
    
    
        logger.print(startPrint, false);
        
        
        
        System.out.println(sectionSpacer + contentLength);
        System.out.println();
        System.out.println(sectionSpacer + "0%");
        
        
        
        for(int i = 0; i < contentLength; i++)
        {
            String
            currentContent;
    
    
    
            currentContent = content[i];
    
    
    
            logger.print(currentContent, true);
            
            
            
            if(i >= advancementInt)
            {
                String
                displayProcentalText;
                
                int
                procentalInt;
    
                
                
                if(i == advancementInt)
                {
                    procentalInt = (int) procentalDouble * 100;
    
                    procentalDouble = procentalDouble + 0.01;
                    advancementDouble = contentLength * procentalDouble;
                    advancementInt = (int) advancementDouble;
                    
                }
                else
                {
                    procentalDouble = (double) i;
                    procentalDouble = procentalDouble / contentLength;
                    advancementDouble = procentalDouble;
                    advancementInt = (int) advancementDouble;
                    
                    procentalInt = (int) procentalDouble * 100;
                    
                }
    
    
                
                displayProcentalText = sectionSpacer + procentalInt + "%";
                
                
                
                System.out.println(displayProcentalText);
    
                
    
                advancementDouble = advancementInt;
                procentalDouble = advancementDouble / 100;
                
            }
            
        }
    
        
        
        System.out.println(sectionSpacer + "100%");
    
    
    
        endTimer(taskName, fileName);
        
    }
    
    public void startTimer(String taskName)
    {
        System.out.println("Start: " + taskName);
    
    
    
        startTime = System.nanoTime();
    
    }
    
    public void endTimer(String taskName, String fileName) throws IOException
    {
        String
        endMessageFinal;
    
        Printer
        logger;
    
        
    
        logger = new Printer(fileName);
        
        
        
        endTime = System.nanoTime() - startTime;
        endTimeDoubleHolder = endTime;
        totalTime = endTimeDoubleHolder / nanoToStandardPOWLong;
        endMessageFinal = endMessageStarter + totalTime + " seconds";
        logger.print(endMessageFinal, true);
        
        
        
        System.out.println("End: " + taskName);
        
    }
    
}