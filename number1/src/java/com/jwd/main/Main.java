package com.jwd.main;

import java.util.Scanner;

public class Main {

    //1 + sin^2(x+y)
    //----------------------------------- + x
    //2 + | x - (2 * x) / (1 + x^2 * y^2)|


    //sin^2(x+y) = (1 - cos(2x+2y))/ 2

    public static double getNumerator(double x, double y) {
        double numerator = 1 - Math.cos(2 * (x + y));
        numerator /= 2;
        return numerator + 1;
    }

    public static double getDenominator(double x, double y) {
        double denominator = 2 * x / (1 + x * x + y * y);
        denominator = Math.abs(x - denominator);
        return denominator += 2;
    }

    public static double calculate(double x, double y) {
        double numerator = getNumerator(x, y);
        System.out.println("num - " + numerator);
        double denominator = getDenominator(x, y);
        System.out.println("denom - " + denominator);
        return numerator / denominator;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input x:");
        double x = sc.nextDouble();
        System.out.println("Input y:");
        double y = sc.nextDouble();
        double result = calculate(x, y);
        System.out.println(result);
    }

}
