package com.raphael.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Nov on 2015/1/2.
 */
public class Processor implements Runnable{
    private Socket server;
    public Processor(Socket server){
        this.server = server;
    }
    public void run(){
        try {
            InputStream is = server.getInputStream();//从客户端读

            byte buffer[] = new byte[1024];
            is.read(buffer);
            System.out.println(new String(buffer));


            OutputStream os = server.getOutputStream();//往客户端写
            String s2c = "hello "+Thread.currentThread().getName()+" is processed.";
            os.write(s2c.getBytes());


            is.close();
            os.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
