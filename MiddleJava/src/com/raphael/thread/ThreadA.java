package com.raphael.thread;

/**
 * Created by Nov on 2015/1/6.
 */
public class ThreadA extends Thread{
    private int threadNo;
    public ThreadA(int threadNo){
        this.threadNo = threadNo;
    }
    //1.方法一
//    public synchronized void run(){ //synchronized之于方法，则是取当前线程作为对象lock。而此时，new ThreadA(j)都是创建一个新的对象。
//        for(int i = 0; i < 100; i++)
//            System.out.println("Thread "+threadNo+" is counting : "+i);
//    }

    //2.方法二（同一）
    public void run(){
        synchronized (this){
            for(int i = 0; i < 100; i++)
                System.out.println("Thread "+threadNo+" is counting : "+i);
        }
    }
//    public void run(){
//        for(int i = 0; i < 100; i++)
//            System.out.println("counting "+threadNo+" : "+i);   //循环过程中，可能在任何位置退出。CPU轮转时刻不确定。
//        System.out.println(threadNo+" is end.");    //run()方法执行完毕，表示线程结束。
//    }

//    public void run(){  //每个线程可能在任何语句位置处断开，让出CPU。
//        System.out.println(threadNo+" 1");
//        System.out.println(threadNo+" 2");
//        System.out.println(threadNo+" 3");
//        System.out.println(threadNo+" 4");
//        System.out.println(threadNo+" 5");
//    }

    //一个线程结束的标志是：run()方法结束。
    //一个机锁被释放的标志是：synchronized块或方法结束。
    //如果要对这些线程进行同步，那么这些线程所持有的对象锁应当是共享且唯一的！
    public static void main(String[] args){
        for(int j = 0;j < 10; j++){
            new ThreadA(j).start(); //发生数数穿插，因为各自线程以各自本身作为对象锁
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
