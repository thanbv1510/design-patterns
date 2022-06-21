package dev.thanbv1510.patterns.creational.abstractfactory.chair;

public class ModernChair implements Chair {
    @Override
    public void create() {
        System.out.println("==> Create ModernChair success!");
    }
}
