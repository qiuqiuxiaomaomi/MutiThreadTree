package com.bonaparte.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunicatCyclicBarrierService {

    public void cycleBarrierCheck(){
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(6, new Runnable() {
            @Override
            public void run() {
                System.out.println("已经到达栅栏点，所有准备就绪，开始执行");
            }
        });

        executorService.submit(new Runnable() {
                                   @Override
                                   public void run() {
                                       try {
                                           System.out.println("r1 await");
                                           cyclicBarrier.await();
                                           System.out.println("r1 success");
                                       } catch (InterruptedException e) {
                                           e.printStackTrace();
                                       } catch (BrokenBarrierException e) {
                                           e.printStackTrace();
                                       }
                                   }
                               });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("r2 await");
                    cyclicBarrier.await();
                    System.out.println("r2 success");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("r3 wait");
                    cyclicBarrier.await();
                    System.out.println("r3 success");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("r4 await");
                    cyclicBarrier.await();
                    System.out.println("r4 success");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("r5 await");
                    cyclicBarrier.await();
                    System.out.println("r5 success");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
