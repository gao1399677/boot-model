package com.spring.boot.service;

import com.spring.boot.dao.CustomerDao;
import com.spring.boot.entity.Customer;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * <p>Title: CustermerServiceTest </p>
 * <p>Description: CustermerServiceTest </p>
 * Date: 2017年11月10日 下午3:39 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月10日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustermerServiceTest {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerDao customerDao;


    @Test
    public void baseUse() {
        Customer customer = customerDao.findById(1000);
        System.out.println(customer.toString());
    }


    /**
     * <p>Title: findCustomersByBrandCodeNotNull </p>
     * <p>Description: 分页查询 </p>
     * @return:
     */
    @Test
    public void queryCustomersByBrandCodeNotNull() {
        Page<Customer> customerPage = customerService.queryCustomersByBrandCodeNotNull( "id");
        Assert.assertThat(customerPage.getTotalElements(), Matchers.greaterThan(0L));
    }


    /**
     * <p>Title: findAllCommonQuery </p>
     * <p>Description: 动态查询 </p>
     * @return: 
     */
    @Test
    public void findAllCommonQuery() {
        List<Customer> customers = customerService.findAllCommonQuery(null);
        Assert.assertThat(customers.size(), Matchers.greaterThan(0));
    }

}
