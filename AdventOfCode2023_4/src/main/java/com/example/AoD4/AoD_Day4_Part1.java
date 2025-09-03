package main.java.com.example.AoD4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.AbstractMap;
import java.util.List;
import java.util.Scanner;

public class AoD_Day4_Part1 {
    public static void Aod_Day4_part1(){
        try{
            int TotalScore = 0;
            File file = new File("src/input.txt");
            CheckFileExists.checkFileExists(file);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String Data = scanner.nextLine();
                String[] SplitData = Data.split(":");

                AbstractMap.SimpleEntry<String, String> StringCard = SplitString.SplitWinningAndActual(SplitData[1]);
                AbstractMap.SimpleEntry<List<Integer>,List<Integer>> IntCard = SplitString.SplitStringToInt(StringCard);
                TotalScore += CheckWinningDigits.checkWinnings(IntCard);
            }
            System.out.println("Total score : " + TotalScore);
        }
        catch (FileNotFoundException e)        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
