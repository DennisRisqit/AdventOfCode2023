package main.java.com.example.AoD5;

import java.io.File;

public class CheckFileExists {
    public static void checkFileExists(File filename) {
        if (filename.canRead()) {
            System.out.println(filename + " is gevonden");
            return;
        }
        System.out.println("Het bestand is niet gevonden");
    }
}
