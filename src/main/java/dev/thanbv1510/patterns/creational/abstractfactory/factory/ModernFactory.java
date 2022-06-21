package dev.thanbv1510.patterns.creational.abstractfactory.factory;

import dev.thanbv1510.patterns.creational.abstractfactory.chair.Chair;
import dev.thanbv1510.patterns.creational.abstractfactory.chair.ModernChair;
import dev.thanbv1510.patterns.creational.abstractfactory.coffeetable.CoffeeTable;
import dev.thanbv1510.patterns.creational.abstractfactory.coffeetable.ModernCoffeeTable;
import dev.thanbv1510.patterns.creational.abstractfactory.sofa.ModernSofa;
import dev.thanbv1510.patterns.creational.abstractfactory.sofa.Sofa;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
