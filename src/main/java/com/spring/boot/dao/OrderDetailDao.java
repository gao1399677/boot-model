package com.spring.boot.dao;

import com.spring.boot.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>Title: OrderDetailDao </p>
 * <p>Description: OrderDetailDao </p>
 * Date: 2017年11月09日 下午11:03 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月09日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public interface OrderDetailDao extends JpaRepository<OrderDetail, String> {

}
