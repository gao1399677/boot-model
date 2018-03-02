package com.spring.boot;

import com.spring.boot.simulate.MyDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

@SpringBootTest
@RunWith(SpringRunner.class)
public class MainTest {

    @Autowired
    private MyDao myDao;

    @Test
    public void test() {
        myDao.findAll();
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.test();
    }

}
