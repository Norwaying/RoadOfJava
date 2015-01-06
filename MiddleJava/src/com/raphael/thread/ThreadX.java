package com.raphael.thread;

/**
 * Created by Nov on 2015/1/1.
 */
public class ThreadX extends Thread {
    private String name;
    ThreadX(String name){
        this.name = name;
    }

    public void run(){
//        System.out.println("this is threadx running.");
        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程：" + Thread.currentThread().getName() + "---" + i+" by "+name);
        }
    }
}
