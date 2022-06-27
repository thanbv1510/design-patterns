package dev.thanbv1510.patterns.creational.builder;

import dev.thanbv1510.patterns.creational.builder.concretebuilder.FastFoodOrderBuilder;
import dev.thanbv1510.patterns.creational.builder.product.order.Order;
import dev.thanbv1510.patterns.creational.builder.product.type.OrderType;
import dev.thanbv1510.patterns.creational.builder.product.type.SauceType;
import dev.thanbv1510.patterns.creational.builder.product.type.VegetableType;

public class MainApp {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE)
                .vegetableType(VegetableType.SALAD)
//                .breadType(BreadType.SIMPLE)
                .sauceType(SauceType.FISH_SAUCE)
                .build();

        System.out.println(order);
    }
}
