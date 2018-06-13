package com.spring.boot.controller;

import com.spring.boot.dao.CustomerDao;
import com.spring.boot.entity.Customer;
import com.spring.boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>Title: CustomerCotroller </p>
 * <p>Description: CustomerCotroller </p>
 * Date: 2017年12月06日 下午2:00 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年12月06日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */

@RestController
public class CustomerControllerTest {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerDao customerDao;

    //http://localhost:8088/boot/pathVariable?page=0&size=2&sort=id,desc
    @RequestMapping(value = "pathVariable")
    public String pathVariableTest1(Pageable pageable) {
        Page<Customer> customerPage = customerService.queryPage(pageable);
        this.write(customerPage.getContent());
        return "userForm";
    }


    //http://localhost:8088/boot/pathVariable1?foo_page=0&foo_size=2?bar_page
    @RequestMapping(value = "pathVariable1")
    public String pathVariableTest1(@Qualifier("foo") Pageable first,
                                    @Qualifier("bar") Pageable second, HttpServletResponse response) {
        Page<Customer> customerPage = customerService.queryPage(first);
        Page<Customer> customerPage2 = customerService.queryPage(second);
        this.write(customerPage.getContent());
        this.write(customerPage2.getContent());
        return "userForm";
    }


    public static <T> void write(List<T> list) {
        System.out.println("\n开始打印：");
        for (T t : list) {
            System.out.println(t.toString());
        }
        System.out.println("打印结束\n");
    }
}
