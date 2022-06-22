package dev.thanbv1510.patterns.creational.singleton;

import lombok.experimental.UtilityClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@UtilityClass
public class MainApp {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        System.out.println(eagerInitializedSingleton.hashCode()); // 1159190947
        System.out.println(eagerInitializedSingleton.hashCode()); // 1159190947

        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton.hashCode()); // 798154996
        System.out.println(staticBlockSingleton.hashCode()); // 798154996


//        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
//        System.out.println(lazyInitializedSingleton.hashCode()); // 1392838282
//        System.out.println(lazyInitializedSingleton.hashCode()); // 1392838282
        Runnable LazyInitializedSingletonThread1 = () -> {
            LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();
            System.out.println(lazyInitializedSingleton1.hashCode());
        };

        Runnable LazyInitializedSingletonThread2 = () -> {
            LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();
            System.out.println(lazyInitializedSingleton2.hashCode());
        };

        LazyInitializedSingletonThread1.run();
        LazyInitializedSingletonThread2.run();

        EagerInitializedSingleton initializedSingletonOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton initializedSingletonTwo = null;
        Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            initializedSingletonTwo = (EagerInitializedSingleton) constructor.newInstance();
        }
        System.out.println(initializedSingletonOne.hashCode());
        System.out.println(initializedSingletonTwo.hashCode());

        System.out.println(EnumSingleton.INSTANCE.hashCode());
        System.out.println(EnumSingleton.INSTANCE.hashCode());
    }
}
