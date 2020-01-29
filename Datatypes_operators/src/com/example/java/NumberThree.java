package com.example.java;

import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class NumberThree {
    public static void twoValueAddition(int a, int b){
        Scanner in = new Scanner(System.in);
        System.out.println("1. + ; 2. - ; 3. * ; 4. / ; select one: ");
        Integer response;
        response = in.nextInt();
        if (response == 1) {
            System.out.println(a + b);
        } else if (response == 2) {
            System.out.println(a - b);
        } else if (response == 3) {
            System.out.println(a * b);
        } else if (response == 4) {
            System.out.println(a / b);
        } else {
            System.out.println("You enter a wrong value!");
        }

    }

    public static void threeValueAddition(int a, int b, int z) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. + ; 2. - ; 3. * ; 4. / ; select one: ");
        Integer response;
        response = in.nextInt();
        if (response == 1) {
            System.out.println(a + b + z);
        } else if (response == 2) {
            System.out.println(a - b - z);
        } else if (response == 3) {
            System.out.println(a * b * z);
        } else if (response == 4) {
            System.out.println((a / b) / z);
        } else {
            System.out.println("You enter a wrong value!");
        }
    }
}
