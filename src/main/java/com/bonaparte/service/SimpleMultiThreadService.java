package com.bonaparte.service;

import org.springframework.stereotype.Service;

/**
 * Created by yangmingquan on 2018/10/2.
 */
@Service
public class SimpleMultiThreadService {

    public void multiThread(){
        for(int i = 0; i < 100; i++){
            Thread thread = new SimpleMultiThread();
            thread.start();        }
    }
}
