package com.spring.boot.observer;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>Title: ObserverMain </p>
 * <p>Description: ObserverMain </p>
 * Date: 2017年11月21日 下午6:30 PM
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
@SpringBootTest
@RunWith(SpringRunner.class)
public class ObserverMain {

    @Test
    public void observer() {
        SubjectImp subject = new SubjectImp();
        CurrentConditionsDisplay cur = new CurrentConditionsDisplay();
        subject.registerObserver(cur);

        subject.setData(70f, 0.5f, 80.0f);
        cur.display();
        Assert.assertThat(2, Matchers.equalTo(1));
    }

}
