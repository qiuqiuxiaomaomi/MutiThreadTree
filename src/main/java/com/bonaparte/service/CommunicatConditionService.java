package com.bonaparte.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yangmingquan on 2018/10/6.
 */
@Service
public class CommunicatConditionService {
    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    BlockingQueue blockingQueue = new LinkedBlockingDeque();

    public void conditionCheck(){
        try {
            lock.wait();
            while (blockingQueue.take() == null) {
                condition1.await();
            }
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void conditionCheckExt(){
        try{
            lock.wait();
            while(blockingQueue.size() == 10){
                condition2.await();
            }
            condition1.signal();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
