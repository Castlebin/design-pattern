package com.heller.rxjava3;

import io.reactivex.rxjava3.core.Flowable;

public class RxJavaDemo1 {
    public static void main(String[] args) {
        hello(args);
    }

    public static void hello(String... args) {
        Flowable.fromArray(args).subscribe(s -> System.out.println("Hello " + s + "!"));
    }

}
