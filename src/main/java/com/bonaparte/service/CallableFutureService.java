package com.bonaparte.service;

import com.bonaparte.bean.CallableFuture;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by yangmingquan on 2018/10/2.
 */
@Service
public class CallableFutureService {

    public void callableFuture(){
        Callable callable = new CallableFuture();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        for (int i = 0; i < 100; i++){
            Thread thread = new Thread(futureTask);
            thread.start();
        }

        try{
            System.out.println((int)futureTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }

        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Integer> future = threadPool.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });

        try {
            Thread.sleep(5000);
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
