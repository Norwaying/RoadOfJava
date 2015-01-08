package com.raphael.array;

/**
 * Created by Nov on 2015/1/6.
 * Java数组使用
 * foreach循环
 * Arrays 类
 */
public class ArrayMain {
    public static void main(String[] args){
        //dataType[] arrayRefVar;   数组声明
        //arrayRefVar = new dataType[arraySize];   数组创建
        //dataType[] arrayRefVar = new dataType[arraySize];    合并
        //dataType[] arrayRefVar = {value0, value1, ..., valuek};    抑或这样
        //方式一
        int[] a;
        a = new int[100];

        //方式二(动态初始化)
        int[] b = new int[100];

        //方式三(静态初始化)
        int[] c ={1,2,3,4,5};

        //foreach
        String[] strings = {"abc","def","ghi"};
        for(String str:strings)
            System.out.println(str);


        //调用函数printArray(int[] array)
        printArray(c);
        //调用函数returnArray()
        System.out.println(returnArray().length);




        //二维数组的创建和赋值(本质上是 数组的数组)
        int[][] e = new int[2][2];  //等长数组

        int[][] f = new int[2][];   //可变数组int[][] a = new int [][2];XX(错误创建方式)
        f[0] = new int[10];
        f[1] = new int[20];

    }

    //数组作为函数的参数
    public static void printArray(int[] array){
        for(int i:array)
            System.out.println(i);
    }

    //数组作为函数的返回值
    public static int[] returnArray(){
        int[] x ={1,2,3,4,5};
        return x;
    }
}
