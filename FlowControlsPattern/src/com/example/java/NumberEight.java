package com.example.java;

import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberEight {

    public static void convertDecimalToHex(){
        // create instance from Scanner class
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = in.nextInt();

        // check the value is in the range from 0 to 15
        if (decimalValue >=0 && decimalValue <= 15) {
            // calling method toHexString()
            String str = Integer.toHexString(decimalValue);
            System.out.println("The hex value is " + str.toUpperCase());
        } else {
            System.out.println("Invalid Input");
        }


    }

}
