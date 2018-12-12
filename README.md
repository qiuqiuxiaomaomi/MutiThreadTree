# MutiThreadTree
多线程编程

![](https://i.imgur.com/HB8LB3C.png)

<pre>
实现多线程的几种方式：
      1）继承Thread类，重新run方法；
      2）实现Runnable接口，重写run方法，
      3）通过Callable和FutureTask创建线程。
      5）通过线程池创建线程。
</pre>

<pre>
Fork/Join

      ForkJoin是JDK7提供的原生多线程处理框架，其基本思想是将大任务切分成多个小任务，在处理
     多线程中已经有如AKKA这样的基于ACTOR模型的框架，而FORKJOIN则是针对具有明显可以进行任
     务分隔特性需求的实现。

     Fork/Join使用两个类完成以上两件事情：
         ForkJoinTask：要使用ForkJoin框架，必须首先创建一个ForkJoin任务，它提供在任务中
                       执行fork(),join()的操作机制，通常我们不直接继承ForkJoinTask类
                       ，只需要直接继承其子类。

           1）RecursiveAction：
              用于没有返回结果的任务。
           2）RecursiveTask:
              用于有返回值的任务。

           ForkJoinPool：task要通过ForkJoinPool来执行，分割的子任务也会添加到当前工作线
                         程的双端队列中，进入队列的头部。当一个工作线程中没有任务时，会从
                         其他工作线程的队列尾部获取一个任务。

           ForkJoin框架使用了工作窃取的思想，算法从其他队列中窃取任务来执行。
</pre>
   
<pre>
Signal
</pre>

<pre>
TimerTask
</pre>

<pre>
Condition
</pre>   
