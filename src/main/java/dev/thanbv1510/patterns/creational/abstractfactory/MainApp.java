package dev.thanbv1510.patterns.creational.abstractfactory;

import dev.thanbv1510.patterns.creational.abstractfactory.chair.Chair;
import dev.thanbv1510.patterns.creational.abstractfactory.coffeetable.CoffeeTable;
import dev.thanbv1510.patterns.creational.abstractfactory.factory.ArtDecoFactory;
import dev.thanbv1510.patterns.creational.abstractfactory.factory.FurnitureFactory;
import dev.thanbv1510.patterns.creational.abstractfactory.factory.ModernFactory;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MainApp {
    public static void main(String[] args) {
        FurnitureFactory artDecoFactory = new ArtDecoFactory();
        Chair artDecoChair = artDecoFactory.createChair();
        artDecoChair.create();

        FurnitureFactory modernFactory = new ModernFactory();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();
        modernCoffeeTable.create();
    }
}
