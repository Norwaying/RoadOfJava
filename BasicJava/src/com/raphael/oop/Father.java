package com.raphael.oop;

/**
 * Created by Nov on 2014/12/31.
 */
public class Father {
    protected String localName = "I am local father";
    protected static String staticName = "I am static father.";
    public void showLocalName(){
        System.out.println("To show local name of father.");
    }
    public static void showStaticName(){
        System.out.println("To show static name of father.");
    }
}
