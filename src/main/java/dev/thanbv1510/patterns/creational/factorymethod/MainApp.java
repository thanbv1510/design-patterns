package dev.thanbv1510.patterns.creational.factorymethod;

import dev.thanbv1510.patterns.creational.factorymethod.factory.ShapeFactory;
import dev.thanbv1510.patterns.creational.factorymethod.shape.Shape;
import dev.thanbv1510.patterns.creational.factorymethod.shape.ShapeType;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MainApp {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);

        System.out.printf("Draw: %s - %s - %s%n", circle.draw(), square.draw(), rectangle.draw());

    }
}
