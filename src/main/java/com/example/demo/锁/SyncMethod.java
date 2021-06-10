package com.example.demo.锁;

public class SyncMethod {
    public int i;
    private static int aa;

    public synchronized void syncTask(){
        i++;
    }
}
