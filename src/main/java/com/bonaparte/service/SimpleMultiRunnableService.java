package com.bonaparte.service;

import org.springframework.stereotype.Service;

/**
 * Created by yangmingquan on 2018/10/2.
 */
@Service
public class SimpleMultiRunnableService {

    public void multiRunnable(){
        for (int i = 0; i < 100; i++){
            Runnable runnable = new SimpleMultiRunnable();
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
