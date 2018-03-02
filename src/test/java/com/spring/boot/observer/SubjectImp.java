package com.spring.boot.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: SubjectImp </p>
 * <p>Description: SubjectImp </p>
 * Date: 2017年11月21日 下午5:48 PM
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
public class SubjectImp implements Subject {

    List<Observer> observers;
    Float temperature;
    Float humidity;
    Float pressure;

    public SubjectImp() {
        observers = new ArrayList<>();
    }

    @Override
    public void removeObserver(Observer observer) {
        for (int i = 0; i < observers.size(); i++) {
            if (observers.get(i) == observer) {
                observers.remove(i);
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updateData(temperature, humidity, pressure);
        }
    }

    public void setData(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObserver();
    }
}
