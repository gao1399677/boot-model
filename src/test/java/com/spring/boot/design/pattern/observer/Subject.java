package com.spring.boot.design.pattern.observer;

/**
 * <p>Title: Subject </p>
 * <p>Description: Subject </p>
 * Date: 2017年11月21日 下午5:50 PM
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
public interface Subject {
    void removeObserver(Observer observer);

    void registerObserver(Observer observer);

    void notifyObserver();

}
