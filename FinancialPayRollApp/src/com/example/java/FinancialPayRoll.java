package com.example.java;

import java.util.Scanner;

/**
 * Created by JOE on
 **/
public class FinancialPayRoll {
    public static void payroll(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String name = in.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        int hours = in.nextInt();
        System.out.println("Enter hourly pay rate: ");
        double payRate = in.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxWithheld = in.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxWithheld = in.nextDouble();

        double grossPay = payRate * hours;
        double federalTax = grossPay * (federalTaxWithheld/100);
        double stateTax = grossPay * (stateTaxWithheld/100);
        double totalDeduct = federalTax + stateTax;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + payRate);
        System.out.println("Gross Pay: " + String.format("%.2f", grossPay));
        System.out.println("Deductions: ");
        System.out.println("Federal Tax Withholding(20.0%): " + String.format("%.2f", federalTax));
        System.out.println("State Tax Withholding(9.0%): " + String.format("%.2f", stateTax));
        System.out.println("Total Deduction: " + String.format("%.2f", (federalTax+stateTax)));
        System.out.println("Net Pay: " + String.format("%.2f", (grossPay-totalDeduct)));
    }
}
