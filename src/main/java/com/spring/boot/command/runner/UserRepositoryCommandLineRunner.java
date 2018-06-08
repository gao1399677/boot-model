package com.spring.boot.command.runner;

import com.spring.boot.dao.CustomerDao;
import com.spring.boot.entity.Customer;
import com.spring.boot.entity.OrderDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private CustomerDao customerService;

    @Override
    public void run(String... args) {
        List<Customer> customers = customerService.findAll();
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
        Pageable pageable = new PageRequest(1, 2, sort);
        Page<Customer> customerPage = customerService.findCustomersByBrandCodeNotNull(pageable);
        System.out.println(customerPage.getTotalPages() + "----------------"
                + customerPage.getTotalElements() + "---------" + customerPage.getNumber());
        System.out.println(customerPage.getContent().get(0).toString());
        customerService.findCustomersByIdOrBrandCode(1000, null);
        saveData();
        log.info("-------------------------------");
        log.info("Finding all users");
        log.info("-------------------------------");
    }

    public void saveData() {
        System.out.println("===============Storing Customers===============");

        // ===============Create customers===============
        // 1. Jack
        Customer jack = new Customer(1000, "azc", "A & Z", "Jack");
        OrderDetail jackIphoneOrder = new OrderDetail("001", "IPhone 7", jack);
        OrderDetail jackIPadMiniOrder = new OrderDetail("002", "IPad Mini 2", jack);
        Set<OrderDetail> jackOrderDetails = new HashSet<OrderDetail>(Arrays.asList(jackIphoneOrder, jackIPadMiniOrder));
        jack.setOrderDetails(jackOrderDetails);

        // 2. Mary
        Customer mary = new Customer(2000, "mkl", "Fashion Company", "Mary");
        OrderDetail maryNote7Order = new OrderDetail("003", "Samsung Galaxy Note 7", mary);
        Set<OrderDetail> maryOrderDetails = new HashSet<OrderDetail>(Arrays.asList(maryNote7Order));
        mary.setOrderDetails(maryOrderDetails);

        // 2. Mary
        Customer mary1 = new Customer(3000, "mkl", "Fashion Company", "Mary1");
        OrderDetail maryNote7Order1 = new OrderDetail("003", "Samsung Galaxy Note 7", mary);
        Set<OrderDetail> maryOrderDetails1 = new HashSet<OrderDetail>(Arrays.asList(maryNote7Order1));
        mary.setOrderDetails(maryOrderDetails1);

        // ===============Saving to DB===============

        customerService.save(jack);
        customerService.save(mary);
        customerService.save(mary1);

    }

}

