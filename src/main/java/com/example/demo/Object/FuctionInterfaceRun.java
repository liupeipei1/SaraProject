package com.example.demo.Object;

public class FuctionInterfaceRun {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("hello world");

        new Thread(()-> System.out.println("hello world")).run();

        FuctionInterface1 ff=(q,b) -> {return  Math.addExact(q,b);};

        ff.add(1,2);

        System.out.printf("ff:"+ff);

    }
}
