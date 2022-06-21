package dev.thanbv1510.patterns.creational.abstractfactory.chair;

public class ArtDecoChair implements Chair {
    @Override
    public void create() {
        System.out.println("==> Create ArtDecoChair success!");
    }
}
