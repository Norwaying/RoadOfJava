package com.raphael.inner;

/**
 * Created by Nov on 2015/1/7.
 * 局部内部类
 */
public class LocalInner {
    //局部内部类定义在方法中，比方法的范围还小。是内部类中最少用到的一种类型。
    //只能访问方法中定义的final类型的局部变量。
    int a = 1;  //
    public void doSomething(){
        int b = 2;
        final int c = 3;
        class Inner{
            public void test(){
                System.out.println(a);  //???
//                System.out.println(b);  //不可以访问非final的局部变量
                System.out.println(c);  //可以访问final变量
            }
        }

        new Inner().test();
    }

    public static void main(String[] args){
        LocalInner li = new LocalInner();
        li.doSomething();
    }
}
