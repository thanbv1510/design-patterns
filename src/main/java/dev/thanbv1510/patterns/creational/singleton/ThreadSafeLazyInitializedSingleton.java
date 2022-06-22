package dev.thanbv1510.patterns.creational.singleton;

import java.util.Objects;

public class ThreadSafeLazyInitializedSingleton {
    private static ThreadSafeLazyInitializedSingleton instance;

    private ThreadSafeLazyInitializedSingleton() {
    }

    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new ThreadSafeLazyInitializedSingleton();
        }

        return instance;
    }
}
