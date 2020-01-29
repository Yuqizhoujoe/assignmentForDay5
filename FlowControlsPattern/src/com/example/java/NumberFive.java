package com.example.java;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberFive {

    public static void countAverage(){
        // create instance from DecimalFormat
        DecimalFormat df = new DecimalFormat("#.##");
        // create instance from Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("How many number you want to enter: ");
        int n = in.nextInt();
        int[] array = new int[n];
        int sum = 0, countPositive = 0, countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the " + (i+1) + " element: ");
            array[i] = in.nextInt();
            if (array[i] != 0) {
                sum += array[i];
                if (array[i] > 0) {
                    countPositive += 1;
                } else {
                    countNegative += 1;
                }
            }
        }
        double average = sum/(double)n;
        System.out.println("The number of positives is " + countPositive);
        System.out.println("The number of negatives is " + countNegative);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + df.format(average));
    }

}
