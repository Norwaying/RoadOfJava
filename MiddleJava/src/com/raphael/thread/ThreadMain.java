package com.raphael.thread;

/**
 * Created by Nov on 2015/1/6.
 * java多线程编程
 */
public class ThreadMain {
    public static void main(String[] args){
        //一是写一个类继承自Thread类,然后重写里面的run方法,用start方法启动线程
        //二是写一个类实现Runnable接口,实现里面的run方法,用new Thread(Runnable target).start()方法来启动
        //方式一：继承方式（不推荐使用）
        System.out.println("当前线程："+Thread.currentThread().getName());


        // main->Thread-0 and Thread-1交替
//        ThreadX threadX = new ThreadX("luwei");
//        ThreadX threadX1 = new ThreadX("zmq");
//        threadX.start();    //start()是native方法
//        threadX1.start();
        //main自己执行，谈不上多线程。（这就是run和start启动方式不同的原因）
//        threadX.run();
//        threadX1.run();
        //main中的语句出现在启动其他线程之前
        for(int i = 0; i < 10; i++)
            System.out.println("当前线程："+Thread.currentThread().getName()+" by i="+i);





        /**************************************************************/
        //方式二：接口方式（线程任务和线程对象分开）（非常方便的实现资源的共享！！！）
        ThreadY threadY = new ThreadY("zhameqi");   //多个线程可以共享同一个ThreadY类的实例(zhangmengqi共享)
//        new Thread(ThreadY).start();    //这样会不会内存泄露？
//        new Thread(ThreadY).start();
//        new Thread(ThreadY).start();
        Thread t1 = new Thread(threadY);
//        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(threadY);
//        t2.setPriority(Thread.MIN_PRIORITY);
        Thread t3 = new Thread(threadY);
//        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        /**************************************************************/




        //main中的语句出现在启动其他线程之前
        for(int j = 0; j < 10; j++)
            System.out.println("当前线程："+Thread.currentThread().getName()+" by j="+j);
        //main方法和其他线程交替运行的
        //没有其他线程，main方法会逐一执行完毕，但有其他线程，这些线程穿插在中间执行。
//        System.out.println("当前线程："+Thread.currentThread().getName());
//        System.out.println("当前线程："+Thread.currentThread().getName());
//        System.out.println("当前线程："+Thread.currentThread().getName());
    }
}
