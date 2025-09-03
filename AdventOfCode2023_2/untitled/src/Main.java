import java.io.File;
import java.util.*;

import main.java.com.example.AoD2.CalculatePower;
import main.java.com.example.AoD2.CheckFileExists;
import main.java.com.example.AoD2.CheckGameResult;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> configuredAmount = new HashMap<>();
        HashMap<String,Integer> GameResult = new HashMap<>();
        HashMap<String,String> InputData = new HashMap<>();

        HashMap<String,Integer> RoundResult;

        try{
            File file = new File("src/input.txt");

            if (!CheckFileExists.checkFileExists(file)){
                System.out.println("Somethign went wrong");
                throw new Exception();
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String Data = scanner.nextLine();
                String[] tmp = Data.split(":");
                InputData.put(tmp[0],tmp[1]);
            }

            for (String key : InputData.keySet() ){
                configuredAmount.put("red",-1);
                configuredAmount.put("blue",-1);
                configuredAmount.put("green",-1);

                System.out.println("Key:" + key);
                RoundResult = CheckGameResult.lowestGameResult(InputData.get(key),configuredAmount);
                GameResult.put(key,CalculatePower.calculate(RoundResult));
            }
            int actualResult = CalculatePower.TotalPower(GameResult);
            System.out.println("totaal power " + actualResult);
        }
        catch(Exception e){
            System.out.println("An error occured");
            System.out.println(e.toString());
        }
        }
}
