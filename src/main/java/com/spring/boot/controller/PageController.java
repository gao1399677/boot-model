package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: PageController </p>
 * <p>Description: PageController </p>
 * Date: 2018年06月08日 下午10:08 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年06月08日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */

@Controller
public class PageController {

    @Value("${welcome.message:(If null, show this)}")
    private String message = "Hello World";

    @RequestMapping("/index.do")
    public String returnIndex() {
        return "index";
    }

    @RequestMapping("/templatesPage.do")
    public String templatesPage(Model model) {
        model.addAttribute("message", this.message);
        return "templatesPage";
    }
}
