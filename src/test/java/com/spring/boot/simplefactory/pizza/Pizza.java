package com.spring.boot.simplefactory.pizza;

/**
 * <p>Title: Pizza </p>
 * <p>Description: Pizza </p>
 * Date: 2017年12月28日 下午10:37 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年12月28日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public interface Pizza {
    void prepare();

    void bake();

    void cut();

    void box();
}
