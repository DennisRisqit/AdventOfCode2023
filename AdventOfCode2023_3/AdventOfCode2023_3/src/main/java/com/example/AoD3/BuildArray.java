package main.java.com.example.AoD3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class BuildArray {
    public static String[][] buildTwoDimensionalArray(){
        String[][] result = new String[10][10];

        File file = new File("src/input.txt");

        try{
            if(!CheckFileExists.checkFileExists(file)){
                throw new Exception("Unable to read the input file");
            }
            Scanner scanner = new Scanner(file);
            int row = 0;

            while(scanner.hasNextLine()){
                int index = 0;
                String data = scanner.nextLine();
                String[] tmp = data.split("");
                for(String item: tmp){
                    result[row][index] = item;
                    //System.out.println("Adding " + item);
                    //System.out.println("row " + row);
                    //System.out.println("index " + index);
                    index++;
                }
                row++;
            }
        }
        catch(Exception e){
            System.out.println("An error occurred");
            System.out.println(e.toString());
        }

        return result;
    }
}
