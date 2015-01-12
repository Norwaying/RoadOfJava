package com.raphael.initial;

/**
 * Created by Nov on 2015/1/6.
 * 各种变量的初始化
 * 何时被初始化
 */
public class InitialMain {
    public static void  main(String[] args){
        /*
        系统默认值（准备阶段）
        初始化（开始执行JAVA代码）
         */
        //所谓初始化,当然也就指的是变量.变量可以是内置的变量(int)或者我们创建的类的对象(Person()).
        // 1.值域(Java虚拟机会自动进行初始化),
        // 2.方法局部变量(必须明确进行初始化,否则出现编译错误),
        // 3.方法参数(只不过作为参数,肯定是被初始化过的,传入的值就是初始值,所以不需要初始化.)
        //1.方法里的局部变量
//        int a;
//        System.out.println(a);
        //2.方法参数
//        func(2);
        //3.值域(实例变量或者静态变量)(称为属性更好理解)
        InitialMain im = new InitialMain();
        System.out.println("instance var x is "+im.x);
        System.out.println("static var y is "+im.y);

        System.out.println("**************************");
        new Son();
//        this is father's static block.
//        this is son's static block.
//        this is father's initialization block.
//        this is father's construct block.
//        this is son's initialization block.
//        this is son's construct block.
    }
    public static void func(int b){
        System.out.println(b);
    }

    //值域(属性)
    public int x;
    public static int y;


    //静态初始化块1
    static{
        System.out.println("1.static block");
    }
    //构造函数3
    InitialMain(){
        System.out.println("2.construct block");
    }
    //初始化块2
    {
        System.out.println("3.initialization block");
    }

}
