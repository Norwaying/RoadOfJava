package com.raphael.construct;

/**
 * Created by Nov on 2015/1/6.
 */
public class D {
    //静态代码块是在类加载时自动执行的，非静态代码块在创建对象自动执行的代码
    static{
        System.out.println("this is a static block.");  //静态代码块1（静态成员专属） 只在第一次new（或者类加载）执行一次！！！
    }

    {
        System.out.println("this is a con block.");  //构造代码块2(构造时候才用上)    每new一次就执行一次！！！
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

        try {
//            Class.forName("com.raphael.construct.D",false,D.class.getClassLoader());


            Class.forName("com.raphael.construct.D");
            Class.forName("com.raphael.construct.D");
            Class.forName("com.raphael.construct.D");   //只输出一次
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /**************************************************/
//        {
//            System.out.println("this is a normal block.");
//        }
//        D  d = new D();
    }
}
