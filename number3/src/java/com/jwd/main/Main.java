package com.jwd.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        int a = sc.nextInt();
        System.out.println("Input b");
        int b = sc.nextInt();
        System.out.println("Input h");
        int h = sc.nextInt();
        while(a <= b){
            System.out.println("x = " + a +"\ttg(x) = " + Math.tan(a));
            a += h;
        }
    }

}
