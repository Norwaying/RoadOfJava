package com.raphael.test;


import com.raphael.oop.TheSameClass;

import java.lang.reflect.Field;

/**
 * Created by Nov on 2015/1/7.
 * 异包继承
 */
public class TheDifferentPackageInherit extends TheSameClass {
    void TheDifferentPackageInherit_Any_To_Public(){
//        TheSameClass tsc = new TheSameClass();
//        //[public]
//        System.out.println(tsc.public_x);

        //[protected]
        //System.out.println(tsc.protected_x);

        //[default]
        //System.out.println(tsc.default_x);

        //[private]
        //System.out.println(tsc.private_x);

        //方式一
        TheDifferentPackageInherit tdpi = new TheDifferentPackageInherit();
        //
        System.out.println(tdpi.protected_x);
        System.out.println(protected_x);

        //方式二(父类和子类位于不同的包中,父类的protected成员,对于父类本身是不可见的,只有子类对象才能访问.)
        TheSameClass tsc = new TheSameClass();  //不同包调用非子类!
        //error
        //System.out.println(tsc.protected_x);
    }
    public static void main(String[] args) throws ClassNotFoundException {

//        Class c=Class.forName("com.raphael.test.TheDifferentPackageInherit");
//        Field f[]=c.getFields();
//        for(Field i : f){
//            System.out.println(i.getName());
//        }

    }
}
