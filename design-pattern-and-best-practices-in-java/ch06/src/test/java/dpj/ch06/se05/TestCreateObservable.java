package dpj.ch06.se05;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import io.reactivex.rxjava3.core.Observable;

/**
 * 创建 Observable
 */
public class TestCreateObservable {

    /**
     * 1. 通过 Observable.create() 创建
     * <p>
     * Emitter ( observer ) 实现了 3 个方法，一般来说，使用 Observable 时，只有 onNext() 是必须的。
     * 1. onNext()：发射数据 ，对应的是 subscribe 里的 onNext
     * 2. onError()：发射错误，对应的是 subscribe 里的 onError
     * 3. onComplete()：发射完成事件，对应的是 subscribe 里的 onComplete
     */
    @Test
    void testCreateObservable() {
        Observable.create(observer -> {
            try {
                if (!observer.isDisposed()) {
                    for (int i = 0; i < 5; i++) {
                        observer.onNext(i);
                    }
                    observer.onComplete();
                }
            } catch (Exception e) {
                observer.onError(e);
            }
        }).subscribe(System.out::println, System.err::println, () -> System.out.println("Sequence complete"));
    }

    /**
     * 2. 通过 Observable.defer() 创建
     * defer 操作符用于推迟 Observable 的创建，直到有 Observer 订阅它时，才创建新的 Observable
     */
    @Test
    void testDefer() {
        Observable<Integer> observable = Observable.defer(() -> Observable.just(123));
        observable.subscribe(System.out::println);
    }

    /**
     * 3. 通过 Observable.empty() 创建
     * empty 操作符创建一个不发射任何数据但是正常终止的 Observable
     */
    @Test
    void testEmpty() {
        Observable.empty()
                .subscribe(System.out::println, System.err::println, () -> System.out.println("Sequence complete"));
    }

    /**
     * 通过 Observable.error() 创建
     * error 操作符创建一个不发射数据以一个错误终止的 Observable
     */
    @Test
    void testError() {
        Observable.error(new Exception("error"))
                .subscribe(System.out::println, System.err::println, () -> System.out.println("Sequence complete"));
    }

    /**
     * 4. 通过 Observable.fromArray() 创建
     * fromArray 操作符创建一个发射指定数组数据的 Observable
     */
    @Test
    void testFromArray() {
        Observable.fromArray(1, 2, 3, 4, 5)
                .subscribe(System.out::println, System.err::println, () -> System.out.println("Sequence complete"));
    }

    /**
     * 5. 通过 Observable.interval() 创建
     * interval 操作符创建一个按固定时间间隔发射整数序列的 Observable，即作为计数器使用
     *
     * 不会停止，所以你看不到 onComplete 的执行
     * (test case 停止了是因为 junit case 执行完了（只让持续 5 s。
     * 所以，你也可以看到，Observable 有自己的执行线程，因为Thread.sleep执行到了，二者户不干扰）)
     */
    @Test
    void testInterval() throws InterruptedException {
        Observable.interval(1, 1, TimeUnit.SECONDS)
                .subscribe(System.out::println, System.err::println, () -> System.out.println("Sequence complete"));
        Thread.sleep(5000);
    }

    /**
     * 为了使上面说的 Observable 会使用自己的线程管理，我们打印下线程名字，看得更清楚一些
     */
    @Test
    void testInterval_1() throws InterruptedException {
        Observable.interval(1, 1, TimeUnit.SECONDS)
                .subscribe(item -> {System.out.println(Thread.currentThread().getName() + " : " + item);}, System.err::println, () -> System.out.println("Sequence complete"));
        System.out.println(Thread.currentThread().getName() + "：主线程");
        Thread.sleep(5000);
    }

    /**
     * 6. 通过 Observable.timer() 创建
     * timer 操作符创建一个在给定的延迟后发射一个特殊值的 Observable
     */
    @Test
    void testTimer() throws InterruptedException {
        Observable.timer(1, TimeUnit.SECONDS)
                .subscribe(System.out::println, System.err::println, () -> System.out.println("Sequence complete"));
        Thread.sleep(5000);
    }

    /**
     * 7. 通过 Observable.range() 创建
     * range 操作符创建一个发射指定范围的整数序列的 Observable
     */
    @Test
    void testRange() {
        Observable.range(1, 10)
                .subscribe(System.out::println, System.err::println, () -> System.out.println("Sequence complete"));
    }



}
