package com.spring.boot.strategy;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I’m flying!!");
    }
}