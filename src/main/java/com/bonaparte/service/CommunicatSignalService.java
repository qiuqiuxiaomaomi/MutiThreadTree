package com.bonaparte.service;

import com.bonaparte.bean.SignalExt;
import org.springframework.stereotype.Service;
import sun.misc.Signal;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunicatSignalService {

    public void signalCheck(){
        Signal.handle(new Signal("test1"), new SignalExt());
        Signal.handle(new Signal("test2"), new SignalExt());
        System.out.println("test1" + "test2");
    }
}
