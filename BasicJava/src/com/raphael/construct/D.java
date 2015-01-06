package com.raphael.construct;

/**
 * Created by Nov on 2015/1/6.
 */
public class D {
    static{
        System.out.println("this is a static block.");  //静态代码块1
    }

    {
        System.out.println("this is a con block.");  //构造代码块2
    }
    D(){
        System.out.println("this is a con func.");  //构造函数3
    }

    /**
     * 静态代码块在类加载时
     * 构造代码块先于构造函数时（对象创建时，用于初始化。）
     * @param args
     */
    public static void main(String[] args){
        {
            System.out.println("this is a normal block.");
        }
        D  d = new D();
    }
}
