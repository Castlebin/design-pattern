package dpj.ch09.se02;

/**
 * Java 8 开始，接口可以有 默认方法 和 静态方法。
 *
 * Java 9 开始，接口可以有 私有方法 了
 */
public interface InterfaceExample {

    private int sum(int a, int b) {
        return a + b;
    }

    default int getSum(int a, int b) {
        return sum(a, b);
    }

    static int getSumStatic(int a, int b) {
        return a + b;
    }

}
