package com.raphael.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Nov on 2014/12/29.
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {
        String fileName = "D:"+File.separator+"Instance"+File.separator+"test2.txt";
        System.out.println(fileName);
//        File f = new File("D:\\Instance\\test1.txt");
        File f = new File(fileName);
        //            if(!f.exists())
//                f.createNewFile();
//            System.out.println(f.separator);
        if(f.exists())
            f.delete();

    }
}
