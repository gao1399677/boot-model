package com.spring.boot.factory.pizza;

import java.util.ArrayList;

/**
 * <p>Title: Pizza </p>
 * <p>Description: Pizza </p>
 * Date: 2017年12月28日 下午10:37 AM
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
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println(" Preparing " + name);
        System.out.println(" Tossing dough...");
        System.out.println(" Adding sauce...");
        System.out.println(" Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println(" Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println(" Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println(" Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
