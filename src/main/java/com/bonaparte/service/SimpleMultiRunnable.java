package com.bonaparte.service;

/**
 * Created by yangmingquan on 2018/10/2.
 */
public class SimpleMultiRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Current Thread:" + Thread.currentThread().getId());
    }
}
