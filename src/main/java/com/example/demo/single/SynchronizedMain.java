package com.example.demo.single;


public class SynchronizedMain  implements  Runnable{



    @Override
    public void run() {
        LazySingleton tt = LazySingleton.getInstance();
        System.out.println("AA"+tt);

        HungruySingleton ll = HungruySingleton.getInstance();
        System.out.println("AA1"+ll);


    }
}
