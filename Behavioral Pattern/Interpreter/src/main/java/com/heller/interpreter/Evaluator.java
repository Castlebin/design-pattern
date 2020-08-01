package com.heller.interpreter;

import java.util.Stack;

public class Evaluator {

    public float evaluator(String expression) {
        Stack<Expression> stack = new Stack<>();
        float result = 0;
        for (String token : expression.split("\\s+")) {
            if (isNumber(token)) {
                stack.push(new Number(Float.parseFloat(token)));
            } else if (isOperator(token)) {
                Expression exp = null;
                Expression right = stack.pop();
                Expression left = stack.pop();
                if (token.equals("+")) {
                    exp = stack.push(new Plus(left, right));
                } else if (token.equals("-")) {
                    exp = stack.push(new Minus(left, right));
                }
                if (exp != null) {
                    result = exp.interpret();
                    stack.push(new Number(result));
                }
            }
        }
        return result;
    }

    private boolean isOperator(String token) {
        if (token.equals("+") || token.equals("-")) {
            return true;
        }
        return false;
    }

    private boolean isNumber(String token) {
        try {
            Float.parseFloat(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
