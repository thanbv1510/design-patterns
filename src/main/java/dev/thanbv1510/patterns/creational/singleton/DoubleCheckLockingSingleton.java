package dev.thanbv1510.patterns.creational.singleton;

import java.util.Objects;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
