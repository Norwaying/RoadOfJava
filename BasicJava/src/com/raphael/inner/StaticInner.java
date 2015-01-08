package com.raphael.inner;

/**
 * Created by Nov on 2015/1/7.
 * 静态内部类
 */
public class StaticInner {
    private static int a;   //初始化为0
    public static class Inner{
        public void test(){
            System.out.println(a);  //只可以访问外部类的静态成员和静态方法，包括了私有的静态成员和方法。
        }
    }

    public static void main(String[] args){
        StaticInner.Inner si = new StaticInner.Inner();   //OuterClass.InnerClass inner = new OuterClass.InnerClass();
        si.test();
    }
}
