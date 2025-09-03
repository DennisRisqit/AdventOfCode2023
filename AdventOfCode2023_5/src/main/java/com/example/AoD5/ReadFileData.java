package main.java.com.example.AoD5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFileData{
    public static HashMap<Integer,String> readFileData(File file){
        HashMap<Integer,String> FileData = new HashMap<>();
        int counter = 0;
        try{
            Scanner scanner = new Scanner(file);
            System.out.println("Reading file content");
            while(scanner.hasNextLine()) {
                String Data = scanner.nextLine();
                if (!Data.isEmpty()){
                    FileData.put(counter,Data);
                    counter++;
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        return FileData;
        
    }
}
