package com.spring.boot;

import com.spring.boot.dao.CustomerDao;
import com.spring.boot.entity.Customer;
import com.spring.boot.service.CustomerService;
import com.spring.boot.service.CustomerSpecification;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * <p>Title: SpringJpaTest </p>
 * <p>Description: SpringJpaTest </p>
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
public class SpringJpaTest {

    @Autowired
    private CustomerDao customerDao;


    @Test
    public void baseUseTest() {
        Customer customer = customerDao.findById(1000);//通过id查找
        System.out.println(customer.toString());

        // 1000   2000   3000   (IdGreaterThan,OrderByIdDesc)
        List<Customer> customers = customerDao.findByIdGreaterThanOrderByIdDesc(1000);
        this.write(customers);

        Assert.assertThat(customer, Matchers.notNullValue());
    }



    @Test
    public void OrderTest() {//排序查找
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
        List<Customer> customers = customerDao.findByIdIsGreaterThanEqual(1000, sort);
        this.write(customers);
    }





    @Test
    public void PageableTest() {//分页查找
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
        Pageable pageable = new PageRequest(0, 2, sort);
        Page<Customer> customerPage = customerDao.findCustomersByBrandCodeNotNull(pageable);
        this.write(customerPage.getContent());

        List<Customer> customers = customerDao.findFirst2ByBrandCodeNotNull();
    }





    /**
     * <p>Title: customerSpecification </p>
     * <p>Description: 动态用法 </p>
     * @return:
     */
    @Test
    public void customerSpecification() {
        Customer customer = new Customer(1000, "azc", "A & Z", "Jack");
        Specification<Customer> specification = CustomerSpecification.CommonQuery(customer);
        List<Customer> customersResult = customerDao.findAll(specification);
        this.write(customersResult);
    }






    @Test
    public void nameSpace() {
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
        Pageable pageable = new PageRequest(0, 10, sort);

        Page<Customer> customerPage = customerDao.findById(1000, pageable);
        this.write(customerPage.getContent());


        Page<Customer> customerPage1 = customerDao.findByBrandCode("aa", pageable);
        this.write(customerPage1.getContent());

        int volume = customerDao.setFixedBrandCode("Jack", 1000);
        System.out.println(volume);
    }


    public static  <T> void write(List<T> list) {
        System.out.println("\n开始打印：");
        for (T t : list) {
            System.out.println(t.toString());
        }
        System.out.println("打印结束\n");
    }

}
