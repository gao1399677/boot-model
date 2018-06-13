package com.spring.boot.design.pattern.simplefactory;

import com.spring.boot.design.pattern.simplefactory.pizza.Pizza;

/**
 * <p>Title: OrderPizza </p>
 * <p>Description: OrderPizza </p>
 * Date: 2017年12月28日 下午10:40 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年12月28日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public class OrderPizza {
    Pizza orderPizza(String type) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
