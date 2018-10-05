package com.bonaparte.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunicatCountDownLatchService {

    public CountDownLatch countDownLatch = new CountDownLatch(5);

    public void conditionCheck() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println("Thread Id" + Thread.currentThread().getId());
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println("Thread Id" + Thread.currentThread().getId());
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println("Thread Id" + Thread.currentThread().getId());
            }
        };

        Runnable r5 = new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println("Thread Id"+Thread.currentThread().getId());
            }
        };

        Runnable r6 = new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println("Thread Id"+Thread.currentThread().getId());
            }
        };

        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r3);
        executorService.submit(r5);
        executorService.submit(r6);
        countDownLatch.await();
        System.out.println("success");
    }
}
