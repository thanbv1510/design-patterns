package dev.thanbv1510.patterns.creational.abstractfactory.factory;

import dev.thanbv1510.patterns.creational.abstractfactory.chair.Chair;
import dev.thanbv1510.patterns.creational.abstractfactory.chair.VictorianChair;
import dev.thanbv1510.patterns.creational.abstractfactory.coffeetable.CoffeeTable;
import dev.thanbv1510.patterns.creational.abstractfactory.coffeetable.VictorianCoffeeTable;
import dev.thanbv1510.patterns.creational.abstractfactory.sofa.Sofa;
import dev.thanbv1510.patterns.creational.abstractfactory.sofa.VictorianSofa;

public class VictorianFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
