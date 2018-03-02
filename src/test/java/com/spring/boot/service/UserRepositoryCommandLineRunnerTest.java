//package com.hiynn.jizhen.gk.service;
//
//import CustomerDao;
//import Customer;
//import OrderDetail;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.simplefactory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserRepositoryCommandLineRunnerTest {
//
//    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunnerTest.class);
//
//    @Autowired
//    private CustomerDao customerRepository;
//
//    @Test
//    public void run() {
//        List<Customer> customers = customerRepository.findAll();
//        saveData();
//        log.info("-------------------------------");
//        log.info("Finding all users");
//        log.info("-------------------------------");
//    }
//
//    public void saveData() {
//        System.out.println("===============Storing Customers===============");
//
//        // ===============Create customers===============
//        // 1. Jack
//        Customer jack = new Customer(1000, "azc", "A & Z", "Jack");
//
//        OrderDetail jackIphoneOrder = new OrderDetail("001", "IPhone 7", jack);
//        OrderDetail jackIPadMiniOrder = new OrderDetail("002", "IPad Mini 2", jack);
//
//        Set<OrderDetail> jackOrderDetails = new HashSet<OrderDetail>(Arrays.asList(jackIphoneOrder, jackIPadMiniOrder));
//
//        jack.setOrderDetails(jackOrderDetails);
//
//        // 2. Mary
//        Customer mary = new Customer(1000, "azc", "Fashjijkddddion Company", "Mary");
//
//        OrderDetail maryNote7Order = new OrderDetail("003", "Samsung Galaxy Note 7", mary);
//
//        Set<OrderDetail> maryOrderDetails = new HashSet<OrderDetail>(Arrays.asList(maryNote7Order));
//
//        mary.setOrderDetails(maryOrderDetails);
//
//        // ===============Saving to DB===============
//
//        customerRepository.save(jack);
//        customerRepository.save(mary);
//
//    }
//
//}
//
