package com.example.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberFour {

    public static void lottery(){
        // create instance from Scanner class
        Scanner in = new Scanner(System.in);
        // create instance from Random class
        Random rand =  new Random();
        // generate random number from 100 to 899
        Integer rand_int = rand.nextInt(1000) + 100;
        String rand_int_str = rand_int.toString();
        System.out.println("The random number is " + rand_int_str);
        System.out.println("Enter a three digit number: ");
        String threeDigit = in.nextLine();
        int award = 0;
        // if all the digits in the user input match all the digits in the exact order
        if (rand_int_str == threeDigit) {
            award = 10000;
        }
        // if all the digits in the user input match all the digits but order is different
        char[] userChar = threeDigit.toCharArray();
        char[] randChar = rand_int_str.toCharArray();
        Arrays.sort(userChar);
        Arrays.sort(randChar);
        if (Arrays.equals(userChar, randChar)) {
            award = 3000;
        }
        // if one digit matches
        for (int i = 0; i < rand_int_str.length(); i++) {
            if (threeDigit.indexOf(rand_int_str.charAt(i)) != -1) {
                award = 1000;
                break;
            }
        }
        System.out.println("The award finally is " + award);
    }

}
