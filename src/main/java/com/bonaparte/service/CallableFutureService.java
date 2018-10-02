package com.bonaparte.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by yangmingquan on 2018/10/2.
 */
@Service
public class CallableFutureService {

    public void callableFuture(){
        Callable callable = new CallableFuture();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        for (int i = 0; i < 100; i++){
            Thread thread = new Thread(futureTask);
            thread.start();
        }

        try{
            System.out.println((int)futureTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
