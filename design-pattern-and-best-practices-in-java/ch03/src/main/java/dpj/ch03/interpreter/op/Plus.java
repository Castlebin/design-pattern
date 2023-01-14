package dpj.ch03.interpreter.op;

import dpj.ch03.interpreter.Expression;
import dpj.ch03.interpreter.Number;

/**
 * 定义 加法 运算，它也属于一个表达式，接受两个 Number， 计算后返回一个 Number 结果
 */
public class Plus implements Expression {

    private final Expression left;
    private final Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret() {
        return left.interpret() + right.interpret();
    }

}
