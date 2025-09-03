package main.java.com.example.AoD3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class FindAllPartNumbers {
    public static Integer findPartNumbers(String[][] input){
        int maxLine = 0;
        for(String[] line : input){
            System.out.println(Arrays.toString(line));
            maxLine++;
        }

        for(int row = 0; row <= Arrays.stream(input).toList().size() -1; row++){
            System.out.println("Working on " + Arrays.toString(input[row]));
            for (int col = 0; col <= maxLine -1; col++) {
                if(input[row][col].matches("[+*#$]")){
                    System.out.println("Match gevonden :: " + input[row][col] + " row = " + row + " col = " + col );

                    if(row >= 1){
                        System.out.println("Previouse :: " + Arrays.toString(input[row -1]));
                        //links diagonaal
                        if(isNumeric(input[row -1][col -1])){
                            String line = Arrays.toString(input[row -1]);
                            line = line.replaceAll("[,\\[\\] .]","").substring(0,col);
                            System.out.println(line);
                        }
                        //midden
                        if(isNumeric(input[row -1][col])){}
                        //rechts diagonaal
                        if(isNumeric(input[row -1][col +1])){}
                    }

                    System.out.println("CurrentLine :: " + Arrays.toString(input[row]));


                    if(row <= maxLine -1){
                        System.out.println("Next line :: " + Arrays.toString(input[row +1]));
                    }

                }
            }

        }

        return 1;
    }

    private static final Pattern pattern = Pattern.compile("\\d");

    public static boolean isNumeric(String strNum){
        if (strNum == null){
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

}

/*
    public static Integer findPartNumbers(ArrayList<String[]> input){
        System.out.println(Arrays.deepToString(input.toArray()));

        for(String[] row : input){
            System.out.println("Row: " + Arrays.toString(row));
        }

        for(int row = 0; row <= input.size() -1; row++){
            String[] previouseLine = row == 0 ? input.get(row) : input.get(row - 1);
            String[] currentLine = input.get(row);
            String[] nextLine = row == input.size() - 1 ? input.get(row) : input.get(row + 1);
            int nr = 0;
            for( String Item : currentLine){
                if(Item.matches("[+*#$]")){
                    System.out.println("Row nr: " + row + " Char : " +Item + " found at : " + nr);
                    System.out.println("previouseLine " + previouseLine[nr]);
                    System.out.println("Nextline " + nextLine[nr]);
                }
                nr++;
            }
        }


        return 1;
    }
 */
