package com.example.java;

import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberSeven {
    public static void speedCalculate(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double distanceInMeter = in.nextDouble();
        System.out.print("Input hour: ");
        int hours = in.nextInt();
        System.out.print("Input minutes: ");
        int minutes = in.nextInt();
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        double distanceInMile = distanceInMeter / 1609;
        double distanceInKm = distanceInMeter / 1000;
        double speedInMeterPerSecond = distanceInMeter / seconds;
        double speedInKmPerHour = distanceInKm / hours;
        double speedInMilePerHour = distanceInMile / hours;
        System.out.println("The speed in meters per second: " + String.format("%.2f", speedInMeterPerSecond)
                + "\nThe speed in km per hour: " + String.format("%.2f", speedInKmPerHour)
                + "\nThe speed in mile per hour: " + String.format("%.2f", speedInMilePerHour));
    }
}
