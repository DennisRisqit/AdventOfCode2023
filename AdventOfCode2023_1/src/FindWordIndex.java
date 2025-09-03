import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordIndex {
    static List<Integer> findWordIndex (StringBuilder line,String digit){
        List<Integer> indexList = new ArrayList<>();
        int i = 0;
        Pattern p = Pattern.compile(digit);
        Matcher m = p.matcher(line);
        while(m.find()){
            i++;
        }

        indexList.add(line.indexOf(digit));
        if (i != 1) {
            int num = line.indexOf(digit);
            while (num >= 0){
                num = line.indexOf(digit,num+1);
                if(num > 0){
                    indexList.add(num);
                }
            }
        }
        return indexList;


    }
}