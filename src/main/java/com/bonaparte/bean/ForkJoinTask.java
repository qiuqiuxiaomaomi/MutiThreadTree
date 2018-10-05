package com.bonaparte.bean;

import java.util.concurrent.RecursiveTask;

/**
 * Created by yangmingquan on 2018/10/5.
 */
public class ForkJoinTask extends RecursiveTask<Integer> {
    public final static Integer THREASHOLD = 10;

    public Integer start;
    public Integer end;

    public ForkJoinTask(Integer start, Integer end){
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        //判断任务是否足够小
        boolean canCompute = (end - start) <= THREASHOLD;
        if(canCompute) {
            for(int i=start; i<=end; i++) {
                sum += i;
            }
        } else {
            //如果大于阈值，就再进行任务拆分
            Integer middle = (start + end)/2;
            ForkJoinTask leftTask = new  ForkJoinTask(start,middle);
            ForkJoinTask rightTask = new  ForkJoinTask(middle+1,end);
            //执行子任务
            leftTask.fork();
            rightTask.fork();
            //等待子任务执行完，并得到执行结果
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            //合并子任务
            sum = leftResult + rightResult;
        }
        return sum;
    }
}
