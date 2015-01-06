package com.raphael.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Nov on 2014/12/29.
 */
public class CharFile {
    public static void main(String[] args){
        String fileName = "D:"+ File.separator+"Instance"+File.separator+"helloworld.txt";
        File file = new File(fileName);
        try {
            Writer w = new FileWriter(file,true);
            String str = "world";
            w.write(str);
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
