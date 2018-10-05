package com.bonaparte.service;

import com.bonaparte.bean.ForkJoinTask;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class ForkJoinService {

    public Integer forkJoinCheck(Integer start, Integer end) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask forkJoinTask = new ForkJoinTask(1, 1000);
        Future<Integer> result = forkJoinPool.submit(forkJoinTask);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return (Integer) result.get();
    }
}
