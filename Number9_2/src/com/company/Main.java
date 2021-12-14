package com.company;

import java.util.Scanner;

public class Main {

    public static BallColor getColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color of the ball(red, blue, green)");
        char input = sc.nextLine().charAt(0);
        switch (input) {
            case 'r':
                return BallColor.RED;
            case 'g':
                return BallColor.GREEN;
            case 'b':
                return BallColor.BLUE;
        }
        return null;
    }

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.addBallIntoBasket(13, BallColor.BLUE);
        basket.addBallIntoBasket(1, BallColor.RED);
        basket.addBallIntoBasket(24, BallColor.GREEN);
        System.out.println("Total weight - " + basket.countBasketWeight());
        System.out.println("Total blue balls - " + basket.countBlueBalls());

    }

}
