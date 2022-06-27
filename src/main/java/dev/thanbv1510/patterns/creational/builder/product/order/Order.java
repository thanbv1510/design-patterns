package dev.thanbv1510.patterns.creational.builder.product.order;

import dev.thanbv1510.patterns.creational.builder.product.type.BreadType;
import dev.thanbv1510.patterns.creational.builder.product.type.OrderType;
import dev.thanbv1510.patterns.creational.builder.product.type.SauceType;
import dev.thanbv1510.patterns.creational.builder.product.type.VegetableType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
}

