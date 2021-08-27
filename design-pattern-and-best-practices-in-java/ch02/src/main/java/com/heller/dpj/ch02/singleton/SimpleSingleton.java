package com.heller.dpj.ch02.singleton;

/**
 * 最简单的一种单例
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
