package dev.thanbv1510.patterns.creational.factorymethod.factory;

import dev.thanbv1510.patterns.creational.factorymethod.shape.ShapeType;
import dev.thanbv1510.patterns.creational.factorymethod.shape.Circle;
import dev.thanbv1510.patterns.creational.factorymethod.shape.Rectangle;
import dev.thanbv1510.patterns.creational.factorymethod.shape.Shape;
import dev.thanbv1510.patterns.creational.factorymethod.shape.Square;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Shape type not valid!");
        }
    }
}
