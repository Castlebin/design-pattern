package com.heller.dpj.ch02.singleton;

/**
 * DCL 拥有双重校验锁机制的同步锁单例模式
 *
 * 只有在可能创建对象时，才会加锁。避免了无脑加锁的效率问题
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
