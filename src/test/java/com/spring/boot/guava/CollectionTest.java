package com.spring.boot.guava;

import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Ordering;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * <p>Title: CollectionTest </p>
 * <p>Description: CollectionTest </p>
 * Date: 2018年05月30日 下午2:35 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年05月30日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
@SpringBootTest
//@RunWith(SpringRunner.class)
public class CollectionTest {

    @Test
    public void whenUsingSortedMap_thenKeysAreSorted() {
        ImmutableSortedMap<String, Integer> salary = new ImmutableSortedMap
                .Builder<String, Integer>(Ordering.natural())
                .put("John", 1000)
                .put("Jane", 1500)
                .put("Tom", 2000)
                .put("Adam", 2000)
                .build();

        assertEquals("Adam", salary.firstKey());
        assertEquals(2000, salary.lastEntry().getValue().intValue());
    }
}
