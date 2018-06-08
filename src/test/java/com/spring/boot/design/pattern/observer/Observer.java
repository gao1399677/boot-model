package com.spring.boot.design.pattern.observer;

/**
 * <p>Title: Observer </p>
 * <p>Description: Observer </p>
 * Date: 2017年11月21日 下午5:52 PM
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
public interface Observer {

    void updateData(Float temperature, Float humidity, Float pressure);

}
