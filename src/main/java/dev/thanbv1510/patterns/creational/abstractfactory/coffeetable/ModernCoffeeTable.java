package dev.thanbv1510.patterns.creational.abstractfactory.coffeetable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void create() {
        System.out.println("==> Create ModernCoffeeTable success!");
    }
}
