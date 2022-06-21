package dev.thanbv1510.patterns.creational.abstractfactory.factory;

import dev.thanbv1510.patterns.creational.abstractfactory.chair.ArtDecoChair;
import dev.thanbv1510.patterns.creational.abstractfactory.chair.Chair;
import dev.thanbv1510.patterns.creational.abstractfactory.coffeetable.ArtDecoCoffeeTable;
import dev.thanbv1510.patterns.creational.abstractfactory.coffeetable.CoffeeTable;
import dev.thanbv1510.patterns.creational.abstractfactory.sofa.ArtDecoSofa;
import dev.thanbv1510.patterns.creational.abstractfactory.sofa.Sofa;

public class ArtDecoFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
