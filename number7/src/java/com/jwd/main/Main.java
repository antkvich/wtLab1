package com.jwd.main;

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

    public static double[] sortArray(double[] mas) {
        double buf = 0;
        int i = 0;
        while(i < mas.length - 1){
            if(mas[i + 1] < mas[i]){
                buf = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = buf;
                if(i > 0){
                    i--;
                }
            }
            else {
                i++;
            }
        }

        return mas;
    }

    public static void main(String[] args) {
//        System.out.println("Input array length");
//        int n = sc.nextInt();
//        double[] mas = fullfillArray(n);
        double[] mas = {1.7, 1, 3.6, 8, 6.7, 5.3};
        mas = sortArray(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
