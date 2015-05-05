package com.raphael.oop;

/**
 * Created by Nov on 2014/12/31.
 */
public class Father {
    protected String localName = "I am local father";   //实例变量
    protected static String staticName = "I am static father.";     //静态变量
    protected String specialFName = "I am special father";
    public void showLocalName(){
        System.out.println("To show local name of father.");
    }    //实例方法
    public static void showStaticName(){
        System.out.println("To show static name of father.");
    }    //静态方法
}
