package main.java.com.example.AoD2;

import java.util.*;

public class CheckGameResult {

    public static HashMap<String,Integer> lowestGameResult (String input,HashMap<String,Integer> configuredAmount){
        String[] rounds = input.split(";");
        for (String round : rounds){
            String[] roundResult = round.split(",");
            for (String roundDetails : roundResult){
                String amount = roundDetails.replaceAll("[^\\d+]","");
                String colour = roundDetails.replaceAll("[^[a-z]]","");
                if(configuredAmount.get(colour) == -1){
                    configuredAmount.put(colour,Integer.parseInt(amount));
                }
                else {
                    if( configuredAmount.get(colour) <= Integer.parseInt(amount)){
                        configuredAmount.put(colour,Integer.parseInt(amount));
                    }
                }
            }
        }
        return configuredAmount;
    }
    }