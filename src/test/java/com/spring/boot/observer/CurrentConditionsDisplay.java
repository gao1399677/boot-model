package com.spring.boot.observer;

/**
 * <p>Title: CurrentConditionsDisplay </p>
 * <p>Description: CurrentConditionsDisplay </p>
 * Date: 2017年11月21日 下午6:01 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月21日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public class CurrentConditionsDisplay implements Observer, Displayer {
    Float temperature;
    Float humidity;
    Float pressure;

    @Override
    public void updateData(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println(this.humidity);
        System.out.println(this.temperature);
        System.out.println(this.pressure);
    }


}
