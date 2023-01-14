package dpj.ch03.interpreter;

/**
 * Number 类代表数字，它也属于一个表达式（ 实现 Expression 接口）
 */
public class Number implements Expression {
    private final float number;

    public Number(float number) {
        this.number = number;
    }

    @Override
    public float interpret() {
        return number;
    }

}
