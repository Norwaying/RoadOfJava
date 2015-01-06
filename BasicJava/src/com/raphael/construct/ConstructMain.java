package com.raphael.construct;

/**
 * Created by Nov on 2015/1/6.
 * Java默认构造函数,构造函数,带参构造函数及构造块
 */
public class ConstructMain {
    public static void main(String[] args){
        B b1 = new B();
        B b2 = new B("java");
        C c1 = new C(); //系统自动创建默认构造函数 如果已经自定义构造函数 系统将不会创建默认构造函数
    }
}
