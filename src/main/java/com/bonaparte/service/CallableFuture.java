package com.bonaparte.service;

import java.util.concurrent.Callable;

/**
 * Created by yangmingquan on 2018/10/2.
 */
public class CallableFuture implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++){
            sum += i;
        }
        return sum;
    }
}
