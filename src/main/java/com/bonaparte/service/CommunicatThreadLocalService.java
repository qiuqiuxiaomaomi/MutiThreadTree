package com.bonaparte.service;

import org.springframework.stereotype.Service;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunicatThreadLocalService {
    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public void threadLocalCheck(){
        threadLocal.set(1);
    }

    public Integer threadLocalLoad(){
        return threadLocal.get();
    }
}
