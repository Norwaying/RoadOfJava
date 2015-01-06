package com.raphael.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Nov on 2015/1/2.
 */
public class Server {
    public static void main(String[] args){
            try {
                ServerSocket serverSocket = new ServerSocket(9999,1);
                //Socket server = serverSocket.accept();
                while(true) {
                    Socket server = null;
                    server = serverSocket.accept();
                    Processor processor = new Processor(server);
                    new Thread(processor).start();
//                    InputStream is = server.getInputStream();//从客户端读
//                    byte buffer[] = new byte[1024];
//                    is.read(buffer);
//                    System.out.println(new String(buffer));
//
//
//                    OutputStream os = server.getOutputStream();//往客户端写
//                    os.write("hello client, i am server.".getBytes());
//
//
//                    is.close();
//                    os.close();
//
//                    server.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
