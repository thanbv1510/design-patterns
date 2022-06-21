package dev.thanbv1510.patterns.creational.abstractfactory.sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void create() {
        System.out.println("==> Create VictorianSofa success!");
    }
}
