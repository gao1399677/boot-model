package com.spring.boot.controller;

import com.spring.boot.entity.Customer;
import com.spring.boot.service.CustomerService;
import com.spring.boot.util.RestURIConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: controller </p>
 * <p>Description: controller </p>
 * Date: 2017年11月02日 下午17:02
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月02日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */


@RestController
public class UserTime {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(RestURIConstants.USER)
    public String getUser() {
        Customer customer = new Customer(1000, "azc", "A & Z", "Jack");
        customerService.findAllCommonQuery(customer);
        return "dsagsadg";
    }

}
