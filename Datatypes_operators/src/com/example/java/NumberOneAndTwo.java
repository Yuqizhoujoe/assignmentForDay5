package com.example.java;

/**
 * Created by JOE on
 **/
public class NumberOneAndTwo {
    public double RupeeToUsd(double currency) {
        // 1. convert Rupee to USD
        double ratioRupeeToUSD = 0.014;
        double result = ratioRupeeToUSD * currency;
        return Math.round(result);
    }

    public double RupeeToPound(double currency) {
        // 1. convert Rupee to Pound
        double ratioRupeeToPound = 0.011;
        double result = ratioRupeeToPound * currency;
        return Math.round(result);
    }

    public double UsdToRupee(double currency) {
        // 1. convert USD to Rupee
        double ratioUSOToRupee = 71.27;
        double result = ratioUSOToRupee * currency;
        return Math.round(result);
    }

    public double UsdToPound(double currency) {
        // 1. convert USD to Rupee
        double ratioUSOToPound = 0.76;
        double result = ratioUSOToPound * currency;
        return Math.round(result);
    }
}
