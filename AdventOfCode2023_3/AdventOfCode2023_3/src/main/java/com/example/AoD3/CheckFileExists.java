package main.java.com.example.AoD3;

import java.io.File;

public class CheckFileExists {
    public static Boolean checkFileExists(File fileName){
        if(fileName.canRead()){
            System.out.println(fileName + " is gevonden");
            return true;
        }
        return false;
    }

}
