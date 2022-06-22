package dev.thanbv1510.patterns.creational.singleton;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton serializedSingleton1 = SerializedSingleton.getInstance();
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("target/SingletonSerializedTest.txt"));
        out.writeObject(serializedSingleton1);
        out.writeObject(enumSingleton1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("target/SingletonSerializedTest.txt"));
        SerializedSingleton serializedSingleton2 = (SerializedSingleton) in.readObject();
        EnumSingleton enumSingleton2 = (EnumSingleton) in.readObject();
        in.close();

        System.out.println("serializedSingleton1 hashCode=" + serializedSingleton1.hashCode()); // serializedSingleton1 hashCode=87285178
        System.out.println("serializedSingleton2 hashCode=" + serializedSingleton2.hashCode()); // serializedSingleton2 hashCode=1160264930
        System.out.println("enumSingleton1 hashCode=" + enumSingleton1.hashCode()); // enumSingleton1 hashCode=2047329716
        System.out.println("enumSingleton2 hashCode=" + enumSingleton2.hashCode()); // enumSingleton2 hashCode=2047329716
    }
}
