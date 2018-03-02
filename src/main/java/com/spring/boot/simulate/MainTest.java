package com.spring.boot.simulate;

import com.spring.boot.entity.Customer;
import com.spring.boot.entity.CustomerId;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>Title: MainTest </p>
 * <p>Description: MainTest </p>
 * Date: 2017年12月07日 下午5:16 PM
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
public class MainTest {

    @Autowired
    private MyDao myDao;

    void test() {
        myDao.findAll();
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.test();
    }

}
