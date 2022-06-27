package dev.thanbv1510.patterns.creational.builder.builder;

import dev.thanbv1510.patterns.creational.builder.product.order.Order;
import dev.thanbv1510.patterns.creational.builder.product.type.BreadType;
import dev.thanbv1510.patterns.creational.builder.product.type.OrderType;
import dev.thanbv1510.patterns.creational.builder.product.type.SauceType;
import dev.thanbv1510.patterns.creational.builder.product.type.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder vegetableType(VegetableType vegetableType);

    OrderBuilder breadType(BreadType breadType);

    OrderBuilder sauceType(SauceType sauceType);

    Order build();
}
