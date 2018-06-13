package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

@Controller
public class CustomerController {


    @RequestMapping(value = "viewPage")
    public String viewPage() {
        return "index.html";
    }
}
