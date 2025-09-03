package main.java.com.example.AoD4;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {
    public static AbstractMap.SimpleEntry<String, String> SplitWinningAndActual(String line){

        //String[] SplitLine = line.split(":");
        String[] ValueSplit = line.split(" \\| ");
        String keys = ValueSplit[0];
        String values = ValueSplit[1];

        System.out.println("Winning numbers : " + keys);
        System.out.println("Card    numbers : " + values);
        return new AbstractMap.SimpleEntry<>(keys,values);
    }
    public static AbstractMap.SimpleEntry<List<Integer>,List<Integer>> SplitStringToInt(AbstractMap.SimpleEntry<String, String> input){
        List<Integer> keys = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        String curKeys = input.getKey();
        for(String K : curKeys.split(" +")){
            if(!K.isEmpty())
            {
                keys.add(Integer.parseInt(K));
            }
        }

        String curValues = input.getValue();
        for(String V : curValues.split(" +")){
            if(!V.isEmpty())
            {
                values.add(Integer.parseInt(V));
            }
        }

        return new AbstractMap.SimpleEntry<>(keys,values);
    }
}
