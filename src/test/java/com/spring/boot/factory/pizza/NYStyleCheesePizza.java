package com.spring.boot.factory.pizza;

import com.spring.boot.factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = " NY Style Sauce and Cheese Pizza";
        dough = " Thin Crust Dough";
        sauce = " Marinara Sauce";
        toppings.add(" Grated Reggiano Cheese");
    }
}