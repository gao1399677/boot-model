package com.spring.boot.simulate;

import com.spring.boot.entity.Customer;
import com.spring.boot.entity.CustomerId;

/**
 * <p>Title: MyDao </p>
 * <p>Description: MyDao </p>
 * Date: 2017年12月07日 下午5:16 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年12月07日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public interface MyDao extends MyRepository<Customer, CustomerId>{
}
