package com.example.java;

/**
 * Created by JOE on
 **/
public class NumberSix {

    public static void displayPattern(){
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern B");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(" ");
            }
            for (int x = i; x >= 1; x--) {
                System.out.print(x);
            }
            System.out.println();
        }

        System.out.println("Pattern D");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i+1; j++) {
                System.out.print(j + " ");
            }
            for (int x = 1; x < i; x++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
