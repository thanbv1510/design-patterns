package dev.thanbv1510.patterns.creational.singleton;

import java.util.Objects;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new LazyInitializedSingleton();
        }

        return instance;
    }
}
