package com.jwd.main;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int[] fullfillArray(int n) {
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input another element");
            mas[i] = sc.nextInt();
        }
        return mas;
    }

    public static void checkInsert(int[] masA, int[] masB){
        int shift = 0;
        for(int i = 0; i < masA.length - 1; i++){
            if(masA[i + 1] != masA[i] + 1){
                for(int j = shift; j < masB.length; j++){
                    if(masB[j]> masA[i] && masB[j] < masA[i + 1]){
                        System.out.println("Element - " + masB[j] + " can be puted afer " + (i + 1) + " element");
                        shift = j;
                        break;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Input first array length");
        int n = sc.nextInt();
        int[] masA = fullfillArray(n);

        System.out.println("Input second array length");
        int m = sc.nextInt();
        int[] masB = fullfillArray(m);

        checkInsert(masA, masB);


    }

}
