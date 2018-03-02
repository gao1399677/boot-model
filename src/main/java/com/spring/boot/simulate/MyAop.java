package com.spring.boot.simulate;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * <p>Title: MyAop </p>
 * <p>Description: MyAop </p>
 * Date: 2017年12月08日 下午10:55 AM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年12月08日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */

@Component
@Aspect
public class MyAop {

    @Around("execution(public * com.spring.boot.simulate.MyRepository.findAll(..))")
    public void myAop(ProceedingJoinPoint joinPoint) {
        System.out.println("L******");
    }
}
