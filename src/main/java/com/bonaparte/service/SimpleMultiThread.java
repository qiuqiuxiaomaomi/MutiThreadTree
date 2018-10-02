package com.bonaparte.service;

/**
 * Created by yangmingquan on 2018/10/2.
 */
public class SimpleMultiThread extends Thread{
    @Override
    public void run() {
        System.out.println("Current Thread ID:" + Thread.currentThread().getId());
    }
}
