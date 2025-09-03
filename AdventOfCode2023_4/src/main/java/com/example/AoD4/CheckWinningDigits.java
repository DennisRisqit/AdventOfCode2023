package main.java.com.example.AoD4;

import java.util.AbstractMap;
import java.util.List;

public class CheckWinningDigits {
    public static Integer checkWinnings(AbstractMap.SimpleEntry<List<Integer>, List<Integer>> input){
        int result = 0;

        List<Integer> WinningNumbers = input.getKey();
        List<Integer> CardNumbers = input.getValue();

        for( int cardValue : CardNumbers){
            if (WinningNumbers.contains(cardValue)){
                if(result == 0)
                {
                    result += 1;
                }
                else if( result >= 1)
                {
                    result += result;
                }
                }
            }

        return result;
    }
    public static Integer countWinnigNumbers(AbstractMap.SimpleEntry<List<Integer>, List<Integer>> input){
        int result = 0;

        List<Integer> WinningNumbers = input.getKey();
        List<Integer> CardNumbers = input.getValue();

        for( int cardValue : CardNumbers){
            if (WinningNumbers.contains(cardValue)){
                result += 1;
            }
        }
        return result;
    }
}
