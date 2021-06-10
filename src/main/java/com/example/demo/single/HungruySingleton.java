package com.example.demo.single;

public class HungruySingleton {

    private static HungruySingleton ll=new HungruySingleton();

    private HungruySingleton(){}

    public static HungruySingleton getInstance(){return  ll;}
}

