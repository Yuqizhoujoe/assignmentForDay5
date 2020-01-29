package com.example.java;

/**
 * Created by JOE on
 **/
public class NumberOne {
    public static void calculateCubicTable(){
        for (int i = 1, j=2; i <= 5; i++, j++) {
            System.out.println(i + " " + j + " " + String.format("%.0f", Math.pow(i,j)));
        }
    }
}
