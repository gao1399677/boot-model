package com.spring.boot.design.pattern.factory;

import com.spring.boot.design.pattern.factory.pizza.*;

public class CNPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals(" cheese")) {
            return new CheesePizza();
        } else if (item.equals(" veggie")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals(" clam")) {
            return new ClamPizza();
        } else if (item.equals(" pepperoni")) {
            return new GreekPizza();
        } else return null;
    }
}