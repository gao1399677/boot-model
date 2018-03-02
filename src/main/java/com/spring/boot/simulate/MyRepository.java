package com.spring.boot.simulate;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Title: MyRepository </p>
 * <p>Description: MyRepository </p>
 * Date: 2017年12月07日 下午5:07 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年12月07日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public interface MyRepository<T,ID extends Serializable> {

    List<T> findAll();
}
