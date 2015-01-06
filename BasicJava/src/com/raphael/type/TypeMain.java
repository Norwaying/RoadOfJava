package com.raphael.type;

/**
 * Created by Nov on 2015/1/6.
 * Java八大基本类型
 * (自动)拆箱和装箱机制(包装类)
 *
 */
public class TypeMain {
    public static void main(String[] args){
    //整型:byte(8),short(16),int(32),long(64)
    //浮点型:float(32),double(64)
    //字符型:char(16) unicode
    //布尔型:boolean()
    //装箱:自动将基本数据类型转换为包装器类型;拆箱:自动将包装器类型转换为基本数据类型;
        Integer a = 100;    //(自动装箱)
        int b = new Integer(100);   //(自动拆箱)

    //byte->short->int->long->float->double
    //较小值赋给较大变量,自动类型转换
    //较大值赋给较小变量,强制类型转换
        float x = 100;
        int y = (int) 10.00001;
        System.out.println("x is "+x);  //100.0
        System.out.println("y is "+y);  //10
    //例如parseInt(返回double)和valueOf(返回Double):字符串转化成整型
        String string = "1234";
        System.out.println(Integer.parseInt(string));   //返回的是double基本类型
        System.out.println(Integer.valueOf(string));    //返回的是Double对象

    //内存分配问题:基本类型和引用类型
    //堆是全局的,栈是局部的(线程私有).
        StringBuffer sb = new StringBuffer();   //sb在栈上,StringBuffer()对象在堆上.

    }
}
