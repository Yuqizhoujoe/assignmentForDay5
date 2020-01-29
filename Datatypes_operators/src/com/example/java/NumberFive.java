package com.example.java;

import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberFive {
    public static void convertTemperature () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Celsius: ");
        double celsius = in.nextDouble();
        double fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println("The Fahrenheit is " + fahrenheit
                + " and the Celsius is " + celsius);

    }
}
