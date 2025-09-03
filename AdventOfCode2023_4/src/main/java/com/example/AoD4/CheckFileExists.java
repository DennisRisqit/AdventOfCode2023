package main.java.com.example.AoD4;

import java.io.File;

public class CheckFileExists {
    public static Boolean checkFileExists(File filename){
        if(filename.canRead()){
            System.out.println(filename + " is gevonden");
            return true;
        }
        System.out.println("Het bestand is niet gevonden");
        return false;
    }

}
