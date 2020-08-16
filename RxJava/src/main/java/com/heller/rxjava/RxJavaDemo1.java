package com.heller.rxjava;

import io.reactivex.Observable;

public class RxJavaDemo1 {
    public static void main(String[] args) {
        Observable.create(observable -> {
            try {
                if (!observable.isDisposed()) {
                    for (int i = 1; i < 5; i++) {
                        observable.onNext(i);
                    }
                    observable.onComplete();
                }
            } catch (Exception e) {
                observable.onError(e);
            }
        }).subscribe(System.out::println,
                System.err::println,
                () -> System.out.println("Sequence complete."));
    }
}
