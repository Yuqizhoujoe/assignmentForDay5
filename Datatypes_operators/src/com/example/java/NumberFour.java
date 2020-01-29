package com.example.java;

import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberFour {
    public static void convertMin(){

        double minPerHour = 60;
        double hourPerDay = 24;
        double dayPerYear = 365;

        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        int minute = in.nextInt();
        double numOfYear = ((minute / minPerHour) / hourPerDay) / dayPerYear ;
        if (numOfYear - Math.floor(numOfYear) > 0) {
            double numofDay = numOfYear - Math.floor(numOfYear);
            numofDay = numofDay * dayPerYear;
            System.out.println(String.format("%.0f", Math.floor(numOfYear))
                    + " years and " + String.format("%.2f", numofDay) + " days");
        } else {
            System.out.println((int)numOfYear + " years");
        }

    }
}
