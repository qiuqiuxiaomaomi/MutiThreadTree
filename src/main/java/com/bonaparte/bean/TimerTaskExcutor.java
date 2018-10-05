package com.bonaparte.bean;

import java.util.TimerTask;

/**
 * Created by yangmingquan on 2018/10/5.
 */
public class TimerTaskExcutor extends TimerTask {

    @Override
    public void run() {
        System.out.println("timer task");
    }
}
