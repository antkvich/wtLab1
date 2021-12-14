package com.jwd.main;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int[] fullfillArray(int n){
        int[] mas = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Input another element");
            mas[i] = sc.nextInt();
        }
        return mas;
    }

    public static boolean isPrime(int number)
    {
        if (number < 2) return false;
        if (number % 2 == 0) return (number == 2);
        int root = (int)Math.sqrt(number);
        for (int i = 3; i <= root; i += 2)
        {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void printPrimes(int[] mas){
        for(int i = 0; i < mas.length; i++){
            if(isPrime(mas[i])){
                System.out.println("Value - " + mas[i] + " on position " + (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Input array length");
        int n = sc.nextInt();
        int[] mas = fullfillArray(n);
        printPrimes(mas);
    }

}
