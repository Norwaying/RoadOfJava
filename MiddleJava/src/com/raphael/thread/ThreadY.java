package com.raphael.thread;

/**
 * Created by Nov on 2015/1/1.
 */
public class ThreadY implements Runnable {
    private String name;
    ThreadY(String name){
        this.name = name;
    }
    @Override
    public void run(){
//        System.out.println("this is thready running.");
        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程：" + Thread.currentThread().getName() + "---" + i+" by "+name);
        }
        //考虑CPU个数，太少语句可能体现不了多线程切换。
        //run()里的语句执行过程中，可能因为时间片用完，在任意位置被打断。
        //时间片是随机分配的，所以可以在线程权重上动手脚。
//        System.out.println(Thread.currentThread().getName() +" hello1");
//        System.out.println(Thread.currentThread().getName() +" hello2");
//        System.out.println(Thread.currentThread().getName() +" hello3");
//        System.out.println(Thread.currentThread().getName() +" hello4");
//        System.out.println(Thread.currentThread().getName() +" hello5");
//        System.out.println(Thread.currentThread().getName() +" hello6");
//        System.out.println(Thread.currentThread().getName() +" hello7");
//        System.out.println(Thread.currentThread().getName() +" hello8");
//        System.out.println(Thread.currentThread().getName() +" hello9");
    }
}
