package com.example.java;

import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberEight {
    public static void findTheBiggest(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = in.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = in.nextInt();
        int maxNumber = 0;
        int[] numArr = new int[]{firstNumber, secondNumber, thirdNumber};
        for (int elem : numArr) {
            if (elem > maxNumber) {
                maxNumber = elem;
            }
        }
        System.out.println("The largest number is " + maxNumber);
    }
}
