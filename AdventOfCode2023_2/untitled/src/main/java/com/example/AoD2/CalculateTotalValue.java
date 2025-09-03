package main.java.com.example.AoD2;


import java.util.Dictionary;
import java.util.Enumeration;

public class CalculateTotalValue {

    public static Integer calculateTotalValue(Dictionary<String,Boolean> calculatedResults){
        Integer totalValue = 0;
        System.out.println(calculatedResults);
        Enumeration<String> e = calculatedResults.keys();
        while(e.hasMoreElements()){
            String key = e.nextElement();
            if(calculatedResults.get(key)) {
                String[] gameSplit = key.split(" ");
                int gameNr = Integer.parseInt(gameSplit[1]);
                System.out.printf("%d + %d = %d",totalValue,gameNr,totalValue + gameNr);
                totalValue += gameNr;
            }
        }
        return totalValue;
    }
}
