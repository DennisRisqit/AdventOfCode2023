import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        int totalValue = 0;
        Dictionary<Integer,Integer> dictlist = new Hashtable<>();
        try{
            File file = new File("src/input.txt");

            if(file.canRead()){
                System.out.println("Het bestand is gelezen.");
            }
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String Data = scanner.nextLine();
                System.out.println("Starting line ::" + Data);
                //controleer of er woorden in de string aanwezig zijn
                String ConvertedLide = FindDigits.convertWordToNumber(Data);
                String digitLine = KeepOnlyDigits.keepOnlyDigits(ConvertedLide);
                // switch om de waarde van de regel toe te voegen aan de array
                if(digitLine.isEmpty()){
                    System.out.println("De regel bevat geen nummmers");
                }
                else{
                    System.out.println(digitLine);
                    String tmp = digitLine.charAt(0) + digitLine.substring(digitLine.length() -1);
                    System.out.println(tmp);
                    System.out.println("Previouse result: " + totalValue );
                    System.out.println("Calculating result =" + totalValue +" + " + tmp);
                    totalValue = totalValue + Integer.parseInt(tmp);
                    dictlist.put(Integer.parseInt(digitLine),Integer.parseInt(tmp));
                }
            }
            scanner.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        System.out.println(dictlist);
        System.out.println("Antwoord: " + totalValue);



    }
}
