package com.bonaparte.service;

import org.springframework.stereotype.Service;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunicatWaitNotifyService {
    public Integer sum = 0;

    public Integer synchonizedWait(){
        synchronized (this){
            try {
                sum.wait();
                sum = 1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

    public Integer synchonizedNotify(){
        synchronized (this){
            sum = 2;
            sum.notify();
        }
        return sum;
    }
    public Integer getSum(){
        return sum;
    }
}
