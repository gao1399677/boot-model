package com.spring.boot.design.pattern.strategy;

public class Squeak implements QuackBehavior {
    public void quack() {

        System.out.println("Squeak");
    }
}