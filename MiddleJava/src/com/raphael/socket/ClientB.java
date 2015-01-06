package com.raphael.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Nov on 2015/1/2.
 */
public class ClientB {
    public static void main(String[] args){
        try {
            Socket client  = new Socket("127.0.0.1",9999);

            OutputStream os = client.getOutputStream();//往服务器写
            os.write("hello server,i am client B.".getBytes());


            InputStream is = client.getInputStream();//从服务器读
            byte buffer[] = new byte[1024];
            is.read(buffer);
            System.out.println(new String(buffer));


            os.close();
            is.close();
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
