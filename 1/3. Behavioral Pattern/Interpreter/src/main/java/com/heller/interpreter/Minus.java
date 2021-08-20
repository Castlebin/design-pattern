package com.heller.interpreter;

public class Minus implements Expression {

    private Expression left;
    private Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret() {
        return left.interpret() - right.interpret();
    }

}
