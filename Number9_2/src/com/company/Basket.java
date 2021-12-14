package com.company;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> basket = new ArrayList<>();

    public void addBallIntoBasket(int weight, BallColor color){
        this.basket.add(new Ball(weight, color));
    }

    public int countBasketWeight(){
        int weight = 0;
        for(Ball ball : basket){
            weight += ball.getWeight();
        }
        return weight;
    }

    public int countBlueBalls(){
        int count = 0;
        for(Ball ball : basket){
            if(ball.getColor() == BallColor.BLUE)
            count++;
        }
        return count;
    }

}
