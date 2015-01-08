package com.raphael.oop;

/**
 * Created by Nov on 2015/1/7.
 * 常用接口clone,Comparable,等
 *
 */
public class SpecialInterface {
    public static void main(String[] args){
        //浅拷贝(基本类型)
        //深拷贝(引用类型)
        //1.引用复制
        Person a = new Person("LU",22);
        Person b = a;
        System.out.println(a);
        System.out.println(b);

        //2.对象克隆
        Person c = new Person("ZHANG",18);
        Person d = (Person)p.clone();
        System.out.println(c);
        System.out.println(d);

    }



}
