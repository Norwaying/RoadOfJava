package com.raphael.oop;

/**
 * Created by Nov on 2015/1/7.
 * 常用接口clone,Comparable,等
 *
 */
public class SpecialInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝(基本类型)
        //深拷贝(引用类型)
        //1.引用复制
//        Person a = new Person("LU",22);
//        Person b = a;
//        System.out.println(a);
//        System.out.println(b);
//
//        a.setAge(100);
//        a.setName("HHH");
//
//        System.out.println(b.getAge());
//        System.out.println(b.getName());

        /**********************************************/
        //2.对象克隆(这里是浅拷贝)
        //String不是基本数据类型，而是一个类，所以他的克隆应该和其他的类一样是个浅拷贝才对．但是为什么它和基本数据类型一样，可以实现完全拷贝？
//        Person c = new Person("ZHANG",18);  //c与d中String类型引用指向同一个对象?
//        Person d = (Person)c.clone();
//        System.out.println(c);
//        System.out.println(d);
//
//        d.setAge(10);
//        d.setName("GGG");
//
//        System.out.println(c.getAge());
//        System.out.println(c.getName());
        Behavior behavior = new Behavior("AAA","BBB");
        Person person = new Person("lu",20,behavior);
        Person p = (Person)person.clone();
        p.getBehavior().setRun("yyy");
        p.getBehavior().setWalk("xxx");

        System.out.println(person.getBehavior().getRun()+person.getBehavior().getWalk());

    }



}
