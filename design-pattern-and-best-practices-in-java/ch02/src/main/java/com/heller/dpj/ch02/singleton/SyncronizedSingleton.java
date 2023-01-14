package com.heller.dpj.ch02.singleton;

/**
 * 使用同步锁的单例模式（避免了多线程下，创建多个对象的可能性）
 *
 * 由于每次 getInstance 都会加锁，并发效率低
 */
public class SyncronizedSingleton {

    private static SyncronizedSingleton instance;

    public synchronized SyncronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SyncronizedSingleton();
        }
        return instance;
    }

}
