package com.bonaparte.bean;

import java.util.concurrent.Exchanger;

/**
 * Created by yangmingquan on 2018/10/6.
 */
public class FatherExchangerRunnable implements Runnable{
    public Exchanger<String> exchanger;

    public FatherExchangerRunnable(Exchanger exchanger){
        super();
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            exchanger.exchange("father");
            System.out.println(exchanger.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
