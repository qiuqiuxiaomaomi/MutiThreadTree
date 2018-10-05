package com.bonaparte.bean;

import sun.misc.Signal;
import sun.misc.SignalHandler;

/**
 * Created by yangmingquan on 2018/10/5.
 */
public class SignalExt implements SignalHandler {
    @Override
    public void handle(Signal signal) {
        System.out.println(signal.getName());
    }
}
