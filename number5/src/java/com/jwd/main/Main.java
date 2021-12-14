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

    public static void countElements(int[] mas) {
        int count = 0;
        int currMax = mas[0];
        for(int i = 1; i < mas.length; i++){
            if(currMax > mas[i]){
                System.out.println("Can be throwed value - " + mas[i] + " position - " + i);
                count++;
            }
            else{
                currMax = mas[i];
            }
        }
        System.out.println(count + " elements can be throwed");
    }

    public static void main(String[] args) {
        System.out.println("Input array length");
        int n = sc.nextInt();
        int[] mas = fullfillArray(n);
        countElements(mas);
    }
}
