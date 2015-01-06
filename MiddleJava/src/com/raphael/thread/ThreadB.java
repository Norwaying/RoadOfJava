package com.raphael.thread;

/**
 * Created by Nov on 2015/1/6.
 */
public class ThreadB extends Thread {
    private int threadNo;
    private String lock;
    public ThreadB(int threadNo, String lock){
        this.threadNo = threadNo;
        this.lock = lock;
    }

    public void run(){  //synchronized块中方法一次性执行完，方才释放锁。
        synchronized (lock){    //synchronized至于方法块，则以synchronized(obj)的obj作为对象lock
            for(int i = 0; i < 100; i++)
                System.out.println("counting "+threadNo+" : "+i);
            System.out.println("this is synchronized block.");
        }
        System.out.println("lock is end.");
    }
    //一个线程结束的标志是：run()方法结束。
    //一个机锁被释放的标志是：synchronized块或方法结束。

    //如果要对这些线程进行同步，那么这些线程所持有的对象锁应当是共享且唯一的！
    public static void main(String[] args){
        String lock = new String("lock");
        for(int j = 0; j < 10; j++){
            new ThreadB(j,lock).start();    //不会发生数数穿插，因为所有线程都已lock这个作为对象锁（对象锁唯一）
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}