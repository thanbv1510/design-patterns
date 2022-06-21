package dev.thanbv1510.patterns.creational.abstractfactory.coffeetable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void create() {
        System.out.println("==> Create VictorianCoffeeTable success!");
    }
}
