package com.spring.boot.design.pattern.observer2;

/**
 * <p>Title: TestMain </p>
 * <p>Description: TestMain </p>
 * Date: 2018年05月15日 下午11:25 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年05月15日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public class TestMain {
    public static void main(String[] args) {
//        CurrentConditionsDisplay display = new CurrentConditionsDisplay();
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(10 ,10,10);
    }
}
