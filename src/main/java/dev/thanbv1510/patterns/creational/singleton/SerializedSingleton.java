package dev.thanbv1510.patterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private SerializedSingleton() {
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
/*
    private Object readResolve() {
        return SingletonHelper.instance;
    }
*/

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
}
