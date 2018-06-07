package com.spring.boot.command.head.first;

/**
 * <p>Title: GarageDoor </p>
 * <p>Description: GarageDoor </p>
 * Date: 2018年06月07日 下午11:39 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年06月07日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public class GarageDoor {
    public void up(){};

    public void down() {
        System.out.println("GarageDoor is down");
    }

    public void stop() {
        System.out.println("GarageDoor has bean stopped");
    }
}
