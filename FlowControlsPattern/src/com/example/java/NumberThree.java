package com.example.java;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberThree {

    public static void checkNumSum(){
        // create instance of Scanner class
        Scanner in = new Scanner(System.in);
        // create instance of Random class
        Random rand = new Random();
        // generate random integers in range 0 to 100
        int rand_int1 = rand.nextInt(100);
        int rand_int2 = rand.nextInt(100);
        System.out.println("Random Integers: " + rand_int1);
        System.out.println("Random Integers: " + rand_int2);
        System.out.println("Now, guess the result of sum!");
        double sum = rand_int1 + rand_int2;
        double userAnswer = in.nextDouble();
        if (userAnswer != sum) {
            System.out.println(false);
        } else if (userAnswer == sum){
            System.out.println(true);
        } else {
            System.out.println("Please enter the answer!");
        }

    }

}
