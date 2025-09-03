package main.java.com.example.AoD2;

import java.util.*;

public class CalculatePower {
    public static Integer calculate(HashMap<String,Integer> input){
        return input.values().stream().reduce(1, (subtotal, element) -> subtotal * element);
    }
    public static Integer TotalPower(HashMap<String,Integer> input){
        return input.values().stream().reduce(0, Integer::sum);
    }
}

