package com.company;

public class Ball {
    private int _weight;
    private BallColor _color;

    public Ball(int weight, BallColor color) {
        _weight = weight;
        _color = color;
    }

    public int getWeight() {
        return _weight;
    }

    public BallColor getColor() {
        return _color;
    }

}
