package dev.thanbv1510.patterns.creational.builder.concretebuilder;

import dev.thanbv1510.patterns.creational.builder.builder.OrderBuilder;
import dev.thanbv1510.patterns.creational.builder.product.order.Order;
import dev.thanbv1510.patterns.creational.builder.product.type.BreadType;
import dev.thanbv1510.patterns.creational.builder.product.type.OrderType;
import dev.thanbv1510.patterns.creational.builder.product.type.SauceType;
import dev.thanbv1510.patterns.creational.builder.product.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder vegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public OrderBuilder breadType(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder sauceType(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
}
