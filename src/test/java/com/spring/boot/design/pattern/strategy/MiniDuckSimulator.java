package com.spring.boot.design.pattern.strategy;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MiniDuckSimulator {

    @Test
    public static void duckPerform() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}