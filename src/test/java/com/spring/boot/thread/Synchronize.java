package com.spring.boot.thread;

import static org.springframework.test.context.transaction.TestTransaction.start;

/**
 * <p>Title: Synchronize </p>
 * <p>Description: Synchronize </p>
 * Date: 2018年05月08日 下午11:08 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年05月08日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public class Synchronize {
    private Integer i = 0;
    private Integer k = 0;

    public static void main(String[] args) {
        new Synchronize().start();
    }

    public void start() {
        new Thread(() -> {
            try {
                while (true) {
                    synchronized (this.i) {
                        System.out.println("==start=" + this.i);
                        Thread.sleep(2000);
                        System.out.println("==end=" + this.i);
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    synchronized (this.i) {
                        this.i += 10;
                        Thread.sleep(100);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
