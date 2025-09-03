package main.java.com.example.AoD4;

import java.util.List;
import java.util.TreeMap;

public class CalculateTotalScratchCards {
    public static Integer CalculateTotal(TreeMap<String, List<Integer>> scratchCardResult){
        int totalCards = 0;
        for(String key : scratchCardResult.keySet()){
            List<Integer> ValueList = scratchCardResult.get(key);
            totalCards += ValueList.get(1);
        }
        return totalCards;
    }
}

/*
        for(String key: scratchCardResult.keySet() ){
            int tmpindex = cardResultIndex + 1;
            List<Integer> ValueList = scratchCardResult.get(key);
            Integer WinAmount = ValueList.get(0);
            int WinIndex = cardResultIndex + WinAmount;
            while ( tmpindex <= WinIndex){
                tmpindex ++;
                List<Integer> TmpList = scratchCardResult.get(String.format("Card " + tmpindex));
                int NewAmount = TmpList.get(1) + 1;
                scratchCardResult.put("Card " + tmpindex,List.of(TmpList.get(0), NewAmount));
            }
            cardResultIndex ++;
        }
 */