package com.raphael.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * Created by Nov on 2015/1/12.
 * 内存数组节点流
 * CharArrayReader/CharArrayWriter(字符)
 * ByteArrayInputStream/ByteArrayOutputStream（位）
 */
public class MemoryArrayExample {
    public static void main(String[] args){
        //把字符数组当做流
        char[] mychar = {'R','A','P'};
        CharArrayReader car = new CharArrayReader(mychar);
        int i;
        try {
            while((i=car.read())!=-1)
                System.out.println((char)i);
            car.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        char[] yourchar= {'K','I','S','S'};
        CharArrayWriter caw = new CharArrayWriter();
        try {
            caw.write(yourchar);
            System.out.println(caw.toCharArray());
            caw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
