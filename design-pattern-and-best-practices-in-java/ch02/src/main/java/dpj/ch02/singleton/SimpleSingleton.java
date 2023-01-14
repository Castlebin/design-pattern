package dpj.ch02.singleton;

/**
 * 最简单的一种单例（多线程下，两个线程同时调用getInstance，有重复创建对象实例的可能性）
 */
public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

}
