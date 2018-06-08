package com.spring.boot.design.pattern.factory;

import com.spring.boot.design.pattern.factory.pizza.*;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals(" cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals(" veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals(" clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals(" pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}