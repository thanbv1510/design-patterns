package dev.thanbv1510.patterns.creational.builder.immutable;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .id(1)
                .name("John")
                .build();
        System.out.println(student);
    }
}
