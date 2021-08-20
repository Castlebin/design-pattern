package com.heller.interpreter;

public class Number implements Expression {

    private float number;

    public Number(float number) {
        this.number = number;
    }

    @Override
    public float interpret() {
        return number;
    }

}
