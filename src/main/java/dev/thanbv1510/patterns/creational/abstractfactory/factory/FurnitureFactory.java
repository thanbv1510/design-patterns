package dev.thanbv1510.patterns.creational.abstractfactory.factory;

import dev.thanbv1510.patterns.creational.abstractfactory.chair.Chair;
import dev.thanbv1510.patterns.creational.abstractfactory.coffeetable.CoffeeTable;
import dev.thanbv1510.patterns.creational.abstractfactory.sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();

    CoffeeTable createCoffeeTable();

    Sofa createSofa();
}
