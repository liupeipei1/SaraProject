package com.example.demo.设计模式.AOP;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspectAnno {
   @Pointcut(value="execution(* com.controller(..))")


    public void before() {
        System.out.println("before");
    }




}
