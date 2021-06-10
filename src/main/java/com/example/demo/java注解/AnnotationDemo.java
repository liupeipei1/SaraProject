package com.example.demo.java注解;

import org.junit.Test;

public class AnnotationDemo {
    //@Test注解修饰方法A
    @Test
    public  void A(){
        System.out.println("Test.....");
    }

    //一个方法上可以拥有多个不同的注解
    @Deprecated
    @SuppressWarnings("uncheck")
    public static void B(){

    }

}
