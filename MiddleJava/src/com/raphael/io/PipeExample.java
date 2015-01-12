package com.raphael.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Nov on 2015/1/12.
 * 管道节点流（线程间通信）
 */
public class PipeExample {
    public static void main(String[] args){
        final PipedInputStream pis = new PipedInputStream();
        final PipedOutputStream pos = new PipedOutputStream();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pos.write("hello world".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int data = pis.read();
                    while(data != -1){
                        System.out.println((char)data);
                        data = pis.read();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });

        thread1.start();
        thread2.start();
    }
}
