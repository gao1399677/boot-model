package com.spring.boot.service;

import com.spring.boot.dao.CustomerDao;
import com.spring.boot.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: CustomerService </p>
 * <p>Description: CustomerService </p>
 * Date: 2017年11月10日 下午5:49 PM
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
@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public List<Customer> findAllCommonQuery(Customer customer) {
        if (customer == null) {
            return new ArrayList<>();
        }
        return customerDao.findAll(CustomerSpecification.CommonQuery(customer));
    }

    public Page<Customer> queryCustomersByBrandCodeNotNull(String sort) {
        Pageable pageable = new PageRequest(0, 10, new Sort(new Sort.Order(Sort.Direction.DESC, sort)));
        Page<Customer> customerPage = customerDao.findCustomersByBrandCodeNotNull(pageable);
        return customerPage;
    }

    public Page<Customer> queryPage(Pageable pageable) {
        Page<Customer> customerPage = customerDao.findAll(pageable);
        return customerPage;
    }
}
