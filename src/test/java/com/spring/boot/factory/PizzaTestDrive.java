package com.spring.boot.factory;

import com.spring.boot.factory.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
//        PizzaStore chicagoStore = new ChicagoStyleCheesePizza();
        Pizza pizza = nyStore.orderPizza(" cheese");
        System.out.println(" Ethan ordered a " + pizza.getName() + " \n");
//        pizza = chicagoStore.orderPizza(" cheese");
        System.out.println(" Joel ordered a " + pizza.getName() + " \n");
    }
}