package com.raphael.thread;

/**
 * Created by Nov on 2015/1/6.
 */
public class ThreadE implements Runnable {
    public void run(){
        synchronized(this){
            for(int i = 0; i < 100; i++){
                if(20 == i) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else
                    System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }
    public static void main(String[] args){
        ThreadE e  = new ThreadE();
        for(int j = 0; j < 100; j++)
            new Thread(e,String.valueOf(j)).start();
    }
}