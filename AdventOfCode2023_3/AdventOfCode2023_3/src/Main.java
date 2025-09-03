import main.java.com.example.AoD3.BuildArray;
import main.java.com.example.AoD3.FindAllPartNumbers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] InputArray;

        InputArray = BuildArray.buildTwoDimensionalArray();
        //System.out.println(Arrays.deepToString(InputArray));


        FindAllPartNumbers.findPartNumbers(InputArray);




    }
}