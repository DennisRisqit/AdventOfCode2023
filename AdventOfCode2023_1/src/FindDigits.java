import java.util.*;

public class FindDigits {
        static String convertWordToNumber (String line){
            List<String> stringDigitList = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
            Dictionary<Integer,Integer> dictlist = new Hashtable<>();
            StringBuilder lineBuilder = new StringBuilder(line);
            int counter = 0;
            for(String number : stringDigitList){
                counter++;
                if(lineBuilder.toString().contains(number)){
                    System.out.println("Nummer : " + number + " is aanwezig in " + lineBuilder);
                    List<Integer> indexResult = FindWordIndex.findWordIndex(lineBuilder, number);
                    for(int i : indexResult){
                        lineBuilder.insert(i+2,counter);
                    }
                }
            }
            return lineBuilder.toString();
        }



}
