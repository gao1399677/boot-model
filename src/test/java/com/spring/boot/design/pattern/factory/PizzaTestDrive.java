package com.spring.boot.design.pattern.factory;

import com.spring.boot.design.pattern.factory.pizza.ChicagoStyleCheesePizza;
import com.spring.boot.design.pattern.factory.pizza.Pizza;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PizzaTestDrive {

    @Test
    public void nyPizza() {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza(" cheese");
        System.out.println(" Ethan ordered a " + pizza.getName() + " \n");
        System.out.println(" Joel ordered a " + pizza.getName() + " \n");
    }

    @Test
    public void cnPizza() {
        PizzaStore chicagoStore = new CNPizzaStore();
        Pizza pizza = chicagoStore.orderPizza(" cheese");
        System.out.println(" Ethan ordered a " + pizza.getName() + " \n");
        System.out.println(" Joel ordered a " + pizza.getName() + " \n");
    }
}