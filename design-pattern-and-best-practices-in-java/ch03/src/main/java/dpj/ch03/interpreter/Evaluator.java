package dpj.ch03.interpreter;

import java.util.Objects;
import java.util.Stack;

import dpj.ch03.interpreter.op.Minus;
import dpj.ch03.interpreter.op.Plus;

/**
 * 解释器，用于解析表达式
 * 为了简单，表达式使用的是 逆波兰表示法(不需要括号，使用栈可以直接做计算)  （ 即 1 + 2 - 3 ，逆波兰表示法为 1 2 + 3 -  ）
 */
public class Evaluator {

    public float evaluate(String expression) {
        Stack<Expression> stack = new Stack<>();
        float result = 0;
        // 严格用单个空格分割
        for (String token : expression.split(" ")) {
            if (isOperator(token)) {
                Expression exp = null;
                if (Objects.equals("+", token)) {
                    exp = stack.push(new Plus(stack.pop(), stack.pop()));
                } else if (Objects.equals("-", token)) {
                    exp = stack.push(new Minus(stack.pop(), stack.pop()));
                }
                if (exp != null) {
                    result = exp.interpret();
                }
            } else if (isNumber(token)) {
                stack.push(new Number(Float.parseFloat(token)));
            }
        }
        return result;
    }

    /**
     * 判断是否为数字
     */
    private boolean isNumber(String token) {
        try {
            Float.parseFloat(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 判断是否为运算符（demo，只有 + 、 -）
     */
    private boolean isOperator(String token) {
        if (Objects.equals("+", token) || Objects.equals("-", token)) {
            return true;
        }
        return false;
    }

}
