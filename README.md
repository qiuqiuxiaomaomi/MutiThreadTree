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

![](https://i.imgur.com/CGXjHj8.png)   

<pre>
Signal

      Sun为我们提供了2个方便安装和替换信号处理器的工具类。
         sun.misc.Signal
         sun.misc.SignalHandler

      在Java编程中使用信号的实际收益
         信号作为最原始的进程间异步通信手段，有着诸多局限性的，比如不能传递上下文，信号随
         时都可能被占用导致冲突，不具备扩展性等，所以对功能性需求来说，使用它收益甚微。

         当然，信号也不是一无是处，除了用作简单的异步通知外，还可以利用它的进程事件通知功能。在Java里有一个典型例子，就是 ShutdownHook。
</pre>

![](https://i.imgur.com/0I89aoT.png)

<pre>
TimerTask定时调用类
</pre>

![](https://i.imgur.com/6Au8q1N.png)

![](https://i.imgur.com/cTMz39J.png)

![](https://i.imgur.com/VTFgKfV.png)

<pre>
Condition

      任何一个java对象都天然继承Object类，在线程间实现通信的往往会应用到Object方法，比如
      wait(),notify(),notifyAll()几个方法实现等待、通知机制，同样的，在java Lock体系下
      依然会有同样的方法实现等待/通知机制，从整体上看Object的wait和notify是与对象的监视器
      配合完成线程间的等待/通知机制，而Condition与Lock配合完成等待通知机制，前者是java
      底层级别的，后者是语言级别的，具有更高的可控制性和扩展性。二者出了在使用方式上不同外，
      在功能特性上还是有很多的不同：
          1）Condition能够支持不响应中断，而通过使用Object不支持
          2）Condition能够支持多个等待队列（new 多个Condition对象），而Object方式只能
             支持一个
          3）Condition支持超时时间的设置，而Object不支持。

      我们知道在锁机制的实现上，AQS内部维护了一个同步队列，如果是独占式锁的话，所有获取锁失
      败的线程的尾插入到同步队列，同样的，condition内部也是使用同样的方式，内部维护了一
      个等待队列，所有调用condition.await方法的线程会加入到等待队列中，并且线程状态转换为
      等待状态
</pre>   
