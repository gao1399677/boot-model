package com.spring.boot.simulate;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * <p>Title: MyRepositoryImp </p>
 * <p>Description: MyRepositoryImp </p>
 * Date: 2017年12月07日 下午5:11 PM
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

@Component
public class MyRepositoryImp<T, ID extends Serializable> implements MyRepository{



    public MyRepositoryImp() {
//        Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericInterfaces()).getActualTypeArguments()[0];
//        System.out.println(entityClass);
    }

    @Override
    public List findAll() {
        return null;
    }
}
