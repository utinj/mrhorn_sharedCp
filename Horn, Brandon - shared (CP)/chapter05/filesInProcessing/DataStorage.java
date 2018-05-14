package filesInProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataStorage
{
    private String filePath;
    private ArrayList<String> values;
    
    public DataStorage(String filePath)
    {
        this.filePath = filePath;
        values = new ArrayList<String>();
    }
    
    public void addValue(String value)
    {
        values.add(value);
    }
    
    public ArrayList<String> getValues()
    {
        return new ArrayList<String>(values);
    }
    
    public boolean loadValues()
    {
        Scanner fromFile = null;
        
        try
        {
            fromFile = new Scanner(new File(filePath));
        }
        catch(FileNotFoundException e)
        {
            return false;
        }
        
        while(fromFile.hasNextLine())
        {
            String line = fromFile.nextLine();
            values.add(line);
        }
        
        fromFile.close();
        
        return true;
    }
    
    public boolean saveValues()
    {
        PrintWriter toFile = null;
        
        try
        {
            toFile = new PrintWriter(filePath);
        }
        catch(FileNotFoundException e)
        {
            return false;
        }
        
        for(String value : values)
        {
            toFile.println(value);
        }
        
        toFile.close();
        
        return true;
    }
}
