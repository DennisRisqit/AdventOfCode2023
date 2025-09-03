package main.java.com.example.AoD4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AoD_Day4_Part2 {
    public static void Aod_Day4_part2() {
        try {
            TreeMap<String,List<Integer>> scratchCardResult = new TreeMap<>();

            File file = new File("src/input.txt");
            CheckFileExists.checkFileExists(file);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int matchingNumbers = 0;
                String Data = scanner.nextLine();
                String[] SplitData = Data.split(":");

                AbstractMap.SimpleEntry<String, String> StringCard = SplitString.SplitWinningAndActual(SplitData[1]);
                AbstractMap.SimpleEntry<List<Integer>, List<Integer>> IntCard = SplitString.SplitStringToInt(StringCard);
                matchingNumbers += CheckWinningDigits.countWinnigNumbers(IntCard);
                System.out.println("Winning numbers : " + matchingNumbers);
                String name = SplitData[0].replaceAll(" +"," ");
                scratchCardResult.put(name,List.of(matchingNumbers,1));
            }

            //deze counter houdt bij, bij welk index nummer we zijn in de lijst.
            int cardResultIndex = 0;

            //voor alle Cards in de lijst
            for(String key: scratchCardResult.keySet()){//Haal de Winnende nummers en het aantal kaarten op
                List<Integer> WinAndCardAmount = scratchCardResult.get("Card " + (cardResultIndex +1));
                int WinAmount = WinAndCardAmount.get(0);
                int CardAmount = WinAndCardAmount.get(1); //dit is het aantal keer
                int CurrentCardIterator = 0; //Deze counter wordt gebruikt om het aantal bij te houden

                //doe dit voor elke kaart die we hebben
                while (CurrentCardIterator < CardAmount){
                    //doe dit voor elk winnend nummer dat we hebben
                    int maxCardWin = cardResultIndex + WinAmount;
                    int tmpWinCounter = cardResultIndex + 1;
                    while (tmpWinCounter <= maxCardWin){
                        tmpWinCounter++;
                        List<Integer> TmpList = scratchCardResult.get(String.format("Card " + tmpWinCounter));

                        scratchCardResult.put("Card " + tmpWinCounter ,List.of(TmpList.get(0), (TmpList.get(1) + 1)));
                    }
                    CurrentCardIterator++;
                }
                cardResultIndex++;
            }
            System.out.println(scratchCardResult);
            int result = CalculateTotalScratchCards.CalculateTotal(scratchCardResult);
            System.out.println("Result : " + result);

        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
