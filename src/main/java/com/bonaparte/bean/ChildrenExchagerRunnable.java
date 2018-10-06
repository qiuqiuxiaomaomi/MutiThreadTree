package com.bonaparte.bean;

import java.util.concurrent.Exchanger;

/**
 * Created by yangmingquan on 2018/10/6.
 */
public class ChildrenExchagerRunnable implements Runnable{
    public Exchanger<String> exchanger;

    public ChildrenExchagerRunnable(Exchanger exchanger){
        super();
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            exchanger.exchange("children");
            System.out.println(exchanger.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
