package com.spring.boot.design.pattern.decorator;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>Title: Decorator </p>
 * <p>Description: Decorator </p>
 * Date: 2018年06月08日 下午5:37 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年06月08日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
@SpringBootTest
public class Decorator {

    @Test
    public void runDecorator() {
        House house = new House();
        Sofa sofa = new Sofa(house);
        NoteBook noteBook = new NoteBook(sofa);
        System.out.println(noteBook.name());
        System.out.println("cost:" + noteBook.cost());
    }
}

abstract class DecorateHouse {
    String name;
    int cost;

    abstract String name();

    abstract int cost();
}

class House extends DecorateHouse {

    public House() {
        this.name = "house";
        this.cost = 100;
    }

    @Override
    String name() {
        return this.name;
    }

    @Override
    int cost() {
        return this.cost;
    }
}

class Sofa extends DecorateHouse {

    private DecorateHouse decorateHouse;

    public Sofa(DecorateHouse decorateHouse) {
        this.decorateHouse = decorateHouse;
        this.name = "sofa";
        this.cost = 10;
    }

    @Override
    String name() {
        System.out.print(decorateHouse.name() + " ");
        return this.name;
    }

    @Override
    int cost() {
        return this.cost + decorateHouse.cost();
    }
}

class NoteBook extends DecorateHouse {

    private DecorateHouse decorateHouse;

    public NoteBook(DecorateHouse decorateHouse) {
        this.decorateHouse = decorateHouse;
        this.name = "noteBook";
        this.cost = 9;
    }

    @Override
    String name() {
        System.out.print(decorateHouse.name() + " ");
        return this.name;
    }

    @Override
    int cost() {
        return this.cost + decorateHouse.cost();
    }
}

