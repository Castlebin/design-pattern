package dpj.ch02.singleton;

/**
 * 既是无锁线程安全的，又是懒加载（在 jvm class load 的时候创建）
 */
public class InstanceHolderSingleton {
    private InstanceHolderSingleton() {}

    private static class InstanceHolder {
        private static final InstanceHolderSingleton instance = new InstanceHolderSingleton();
    }

    public static InstanceHolderSingleton getInstance() {
        return InstanceHolder.instance;
    }

}
