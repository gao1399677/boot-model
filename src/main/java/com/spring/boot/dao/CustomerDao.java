package com.spring.boot.dao;


import com.spring.boot.entity.Customer;
import com.spring.boot.entity.CustomerId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer, CustomerId>, JpaSpecificationExecutor<Customer> {


    Customer findById(Integer id);







    List<Customer> findByIdGreaterThanOrderByIdDesc(Integer id);








    List<Customer> findByIdIsGreaterThanEqual(Integer id, Sort sort);






    List<Customer> findCustomersByIdOrBrandCode(Integer id, String brandCode);






    Page<Customer> findCustomersByBrandCodeNotNull(Pageable pageable);







    List<Customer> findFirst2ByBrandCodeNotNull();




    @Query(value = "SELECT * FROM Customer WHERE id != ?1 ORDER BY ?#{#pageable}",
            countQuery = "SELECT count(*) FROM Customer WHERE id != ?1",
            nativeQuery = true)
    Page<Customer> findById(Integer id, Pageable pageable);





    @Query(value = "SELECT * FROM #{#entityName} WHERE brand_code != ?1 ORDER BY ?#{#pageable}",
            countQuery = "SELECT count(*) FROM customer WHERE brand_code != ?1",
            nativeQuery = true)
    Page<Customer> findByBrandCode(String brandCode, Pageable pageable);







    //没有Transactional会报错
    @Modifying
    @Transactional
    @Query("update Customer u set u.name = ?1 where u.id = ?2")
    int setFixedBrandCode(String name, Integer id);


}