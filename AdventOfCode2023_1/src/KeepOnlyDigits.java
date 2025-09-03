public class KeepOnlyDigits {
    static String keepOnlyDigits(String line){
        StringBuilder ResultDigits = new StringBuilder();
        System.out.println("Removing all letters from :: " + line );
        // alle karakters uit de string halen
        String[] splitLine = line.split("");
        for(String letter: splitLine){
            if (checkIfDigit(letter)){
                ResultDigits.append(letter);
            }
        }
        return ResultDigits.toString();
    }
    static Boolean checkIfDigit(String letter){
        try{
            Integer.parseInt(letter);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
