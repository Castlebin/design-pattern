package com.heller.dpj.ch02.singleton;

/**
 * 类加载的时候就创建好的单例，避免多线程竞争（因为JVM类加载时单线程的）
 */
public class LockFreeSingleton {
    private static final LockFreeSingleton instance = new LockFreeSingleton();

    private LockFreeSingleton() {}

    public static LockFreeSingleton getInstance() {
        return instance;
    }

}
