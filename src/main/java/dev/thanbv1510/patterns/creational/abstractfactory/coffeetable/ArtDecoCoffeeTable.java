package dev.thanbv1510.patterns.creational.abstractfactory.coffeetable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void create() {
        System.out.println("==> Create ArtDecoCoffeeTable success!");
    }
}
