package com.bonaparte.service;

import org.springframework.stereotype.Service;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunitcatSynchonizedService {
    public Integer count = 0;

    public Integer synchonizedCheck(){
        synchronized (this) {
            count = 1;
        }
        return count;
    }

    synchronized public Integer synchonizedCheckFunc(){
        count = 2;
        return count;
    }
}
