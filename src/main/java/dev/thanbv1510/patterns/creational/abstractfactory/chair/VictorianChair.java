package dev.thanbv1510.patterns.creational.abstractfactory.chair;

public class VictorianChair implements Chair {
    @Override
    public void create() {
        System.out.println("==> Create VictorianChair success!");
    }
}
