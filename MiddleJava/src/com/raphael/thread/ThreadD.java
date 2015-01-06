package com.raphael.thread;

/**
 * Created by Nov on 2015/1/6.
 */
public class ThreadD extends Thread {
    private int j;
    public ThreadD(int j) {
        this.j = j;
    }

    public void run(){
        synchronized(this){
            for(int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }
    public static void main(String[] args){
        for(int j = 0; j < 5; j++){
            new ThreadD(j).start();
        }
    }
}
