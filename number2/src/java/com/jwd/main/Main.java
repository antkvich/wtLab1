package com.jwd.main;

import java.util.Scanner;

public class Main {

    public static boolean checkPresence(int x, int y) {
        if (y >= 0) {
            if (y <= 6)
                if (x >= -4 && x <= 4) {
                    return true;
                }
        } else {
            if (y >= -6)
                if (x >= -6 && x <= 6) {
                    return true;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x");
        int x = sc.nextInt();
        System.out.println("Input y");
        int y = sc.nextInt();
        if (checkPresence(x, y)) {
            System.out.println("Точка с координатами [" + x + ", " + y + "] принадлежит области\ntrue");
        } else {
            System.out.println("Точка с координатами [" + x + ", " + y + "] не принадлежит области\ntrue");
        }
    }


}
