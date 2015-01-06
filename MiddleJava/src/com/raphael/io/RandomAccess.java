package com.raphael.io;

import java.io.*;

/**
 * Created by Nov on 2014/12/29.
 */
public class RandomAccess {
    public static void main(String[] args){
        String fileName = "D:"+ File.separator+"Instance"+File.separator+"helloworld.txt";
        File file = new File(fileName);
//        try {
//            OutputStream  os = new FileOutputStream(file);
//            String str = "Hello World";
//            byte[] b = str.getBytes();
//            os.write(b);
//            os.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            InputStream is = new FileInputStream(file);
            byte[] b = new byte[1024];
            is.read(b);
            is.close();
            System.out.println(new String(b));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
