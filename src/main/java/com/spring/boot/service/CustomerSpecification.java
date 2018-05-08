package com.spring.boot.service;

import com.spring.boot.entity.Customer;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Title: CustomerSpecification </p>
 * <p>Description: CustomerSpecification </p>
 * Date: 2017年11月10日 下午3:42 PM
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
public class CustomerSpecification {

    public static Specification<Customer> CommonQuery(Customer customer) {
        return (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            predicates.add(criteriaBuilder.between(root.get("id"), 50, 1000));
            criteriaQuery.orderBy(criteriaBuilder.desc(root.get("id")));
            criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()]));

            return criteriaQuery.getRestriction();
        };
    }

}
