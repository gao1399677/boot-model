package com.spring.boot.simplefactory;

import com.spring.boot.simplefactory.pizza.*;

/**
 * <p>Title: dsag </p>
 * <p>Description: dsag </p>
 * Date: 2017年12月28日 下午10:45 AM
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
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals(" cheese" )) {
            pizza = new CheesePizza();
        } else if (type.equals(" pepperoni" )) {
            pizza = new PepperoniPizza();
        } else if (type.equals(" clam" )) {
            pizza = new ClamPizza();
        } else if (type.equals(" veggie" )) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
