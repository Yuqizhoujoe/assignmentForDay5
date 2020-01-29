package com.example.java;

import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberSeven {

    public static void findTheOccurrence(){
        // create instance from Scanner class
        Scanner in = new Scanner(System.in);
        // how many number to enter:
        System.out.println("How many numbers you want to enter: ");
        int number = in.nextInt();
        // create an empty array
        int[] array = new int[number];
        // create variable max
        int max = 0, countMax = 0;
        // put the element into array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the " + (i+1) + " element");
            array[i] = in.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                countMax += 1;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of largest number is " + countMax);
    }

}
