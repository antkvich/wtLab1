package com.jwd.java;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static double[] fullfillArray(int n) {
        double[] mas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input another element");
            mas[i] = sc.nextInt();
        }
        return mas;
    }

    public static void printMatrix(double[] mas) {
        int n = mas.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[(j + i) % n] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input length of matrix");
        int n = sc.nextInt();
        double[] mas = fullfillArray(n);
        printMatrix(mas);
    }

}
