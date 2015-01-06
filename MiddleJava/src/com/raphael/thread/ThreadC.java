package com.raphael.thread;

/**
 * Created by Nov on 2015/1/6.
 */
public class ThreadC implements Runnable{
    public void run(){
        synchronized(this){
            for(int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }
    //    public void run(){
//            for(int i = 0; i < 10; i++){
//                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
//            }
//    }
    //与ThreadD形成鲜明对比
    public static void main(String[] args){
        ThreadC c  = new ThreadC(); //synchronized(this)这里的this就代指ThreadC对象c 这里和ThreadA extends Thread不一样
        //for(int j = 0;j < 10; j++) new ThreadA(j).start()时候synchronized(this)这里的this就代指
        //每一个ThreadA对象
        //implements可以使线程执行和对象分开，实现共享。
        for(int j = 0; j < 5; j++)
            new Thread(c,String.valueOf(j)).start();
    }
}
