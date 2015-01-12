package com.raphael.memory;

/**
 * Created by Nov on 2015/1/12.
 * 统称为 运行时数据区
 */
public class A {//(类信息)********************************************(方法区)
    int instanceVar ;   //实例变量(有系统默认值0)************************(堆)
    static int staticVar;  //静态变量(有系统默认值0)*********************(方法区)
    final int finalVar = 2; //常量(必须初始化)**************************(方法区)

    void anotherStackFrame(){

    }
    //程序开始
    public static void main(String[] args){//************************(栈帧:每个方法被执行时产生一个栈帧)
        int localVar = 1;   //局部变量*********************************(栈区)
//        int localVar;   //必须初始化,否则编译出错.
        System.out.println("this is local var : "+localVar);
        A a = null;//*************************************************(栈区)
        a = new A();//************************************************(堆)
        System.out.println("this is instance var : "+a.instanceVar);
        System.out.println("this is static var : "+a.staticVar);
        System.out.println("this is final var : "+a.finalVar);

        a.anotherStackFrame();//**************************************(栈帧:入栈)

    }

    /*
       1.A.class被加载进内存.
       2.已被虚拟机加载的类A的类信息、字段信息、运行常量池、静态变量、方法信息等分配到方法区(在堆建立一个java.lang.Class对象与之对应).

       3.main()入口开始执行,栈帧入栈.
       4.局部变量在栈区申请.
       5.如果有new,则在堆中开辟对象空间.
       6.一系列方法的入栈出栈,包含4和5阶段.
       7.main()栈帧出栈.
     */
}
