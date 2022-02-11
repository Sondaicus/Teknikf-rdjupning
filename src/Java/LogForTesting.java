package Java;



import java.io.*;
import java.text.*;
import java.util.*;



public class LogForTesting
{
    private long startTime, endTime, nanoToStandardPOWLong;
    
    private double endTimeDoubleHolder, totalTime;
    
    private String endMessageStarter, sectionSpacer;
    
    
    public LogForTesting()
    {
        nanoToStandardPOWLong = (int) Math.pow(10 , 9);
        endMessageStarter = "Total runtime: ";
        sectionSpacer = "            ";
        
    }
    
    
    public void printListLog(String[] content , String fileName , String taskName , boolean useDateAndTime) throws IOException
    {
        String startPrint;
        
        String dateAndTime;
        
        int contentLength, advancementInt;
        
        double advancementDouble, procentalDouble;
    
        Printer logger;
    
    
        startTimer(taskName);
    
    
        if(useDateAndTime)
        {
            SimpleDateFormat formatter;
    
            Date date;
    
    
            formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            date = new Date();
    
    
            dateAndTime = String.valueOf(formatter.format(date));
            dateAndTime = dateAndTime.replaceAll("/" , "-");
            dateAndTime = dateAndTime.replaceAll(":" , ";");
            dateAndTime = "    " + dateAndTime;
            
        }
        else
        {
            dateAndTime = "";
            
        }
    
    
        fileName = fileName + dateAndTime;
    
    
        logger = new Printer(fileName);
        contentLength = content.length;
        procentalDouble = 0.01;
        advancementDouble = contentLength * procentalDouble;
        advancementInt = (int) advancementDouble;
        startPrint = contentLength + "\n" + "\n";
    
    
        logger.print(startPrint , false);
    
    
        System.out.println(sectionSpacer + contentLength);
        System.out.println();
        System.out.println(sectionSpacer + "0%");
    
    
        for(int i = 0; i < contentLength; i++)
        {
            String currentContent;
    
    
            currentContent = content[i];
    
    
            logger.print(currentContent , true);
    
    
            if(i >= advancementInt)
            {
                String displayProcentalText;
                
                int procentalInt;
                
                double procentalDoubleHolder;
                
                boolean proceed;
    
    
                procentalInt = 0;
    
    
                if(i == advancementInt)
                {
                    if(i != 0)
                    {
                        procentalDoubleHolder = procentalDouble * 100;
                        procentalDoubleHolder = procentalDoubleHolder + 0.5;
                        procentalInt = (int) procentalDoubleHolder;
    
                        procentalDoubleHolder = procentalInt;
                        procentalDoubleHolder = procentalDoubleHolder / 100;
                        procentalDouble = procentalDoubleHolder + 0.01;
                        advancementDouble = contentLength * procentalDouble;
                        advancementInt = (int) advancementDouble;
    
                        proceed = true;
                        
                    }
                    else
                    {
                        proceed = false;
                        
                    }
                    
                }
                else
                {
                    procentalDouble = (double) i;
                    procentalDouble = procentalDouble / contentLength;
                    
                    procentalDoubleHolder = procentalDouble * 100;
                    procentalDoubleHolder = procentalDoubleHolder + 0.5;
                    procentalInt = (int) procentalDoubleHolder;
    
                    procentalDoubleHolder = procentalInt;
                    procentalDoubleHolder = procentalDoubleHolder / 100;
                    procentalDouble = procentalDoubleHolder + 0.01;
                    advancementDouble = contentLength * procentalDouble;
                    advancementInt = (int) advancementDouble;
    
                    proceed = true;
                    
                }
    
    
                if(proceed)
                {
                    displayProcentalText = sectionSpacer + procentalInt + "%";
    
    
                    System.out.println(displayProcentalText);
                    
                }
                
            }
            
        }
    
        
    
        System.out.println(sectionSpacer + "100%");
    
        
    
        endMessageStarter = "\n" + "\n" + endMessageStarter;
        endTimer(taskName , fileName , false, true);
        
    }
    
    public void startTimer(String taskName)
    {
        System.out.println("Start: " + taskName);
    
    
        startTime = System.nanoTime();
    
    }
    
    public void endTimer(String taskName , String fileName) throws IOException
    {
        endTimer(taskName , fileName , true , false);
    
    }
    
    public void endTimer(String taskName , String fileName , boolean useDateAndTime) throws IOException
    {
        endTimer(taskName , fileName , useDateAndTime , false);
        
    }
    
    public void endTimer(String taskName , String fileName , boolean useDateAndTime , boolean append) throws IOException
    {
        String endMessageFinal, dateAndTime;
    
        Printer logger;
    
    
        if(useDateAndTime)
        {
            SimpleDateFormat formatter;
    
            Date date;
    
    
            formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            date = new Date();
    
    
            dateAndTime = String.valueOf(formatter.format(date));
            dateAndTime = dateAndTime.replaceAll("/" , "-");
            dateAndTime = dateAndTime.replaceAll(":" , ";");
            dateAndTime = "    " + dateAndTime;
    
        }
        else
        {
            dateAndTime = "";
    
        }
    
    
        fileName = fileName + dateAndTime;
    
    
        logger = new Printer(fileName);
    
    
        endTime = System.nanoTime() - startTime;
        endTimeDoubleHolder = endTime;
        totalTime = endTimeDoubleHolder / nanoToStandardPOWLong;
        endMessageFinal = endMessageStarter + totalTime + " seconds";
        logger.print(endMessageFinal , append);
    
    
        System.out.println("End: " + taskName);
    
    }
    
}