package com.heller.dpj.ch02.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void getInstance() {
        assertSingleton(SimpleSingleton::getInstance);
        assertSingleton(LockFreeSingleton::getInstance);
        assertSingleton(DoubleCheckSingleton::getInstance);

        assertNotSingleton(Object::new);
    }

    private <T> void assertSingleton(Supplier<T> supplier) {
        assertEquals(supplier.get(), supplier.get());
    }

    private <T> void assertNotSingleton(Supplier<T> supplier) {
        assertNotEquals(supplier.get(), supplier.get());
    }

}