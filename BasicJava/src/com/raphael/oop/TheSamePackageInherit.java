package com.raphael.oop;

/**
 * Created by Nov on 2015/1/7.
 * 同包继承
 */
public class TheSamePackageInherit extends TheSameClass {
    public static void main(String[] args){

    }

    void TheSamePackageInherit_Any_To_Public(){
        //方式一
        TheSameClass tsc = new TheSameClass();
        //[public]
        System.out.println(tsc.public_x);

        //[protected]
        System.out.println(tsc.protected_x);    //相同包调用非子类

        //[default]
        System.out.println(tsc.default_x);

        //[private] X
        //System.out.println(tsc.private_x);


        //方式二
        TheSamePackageInherit tspi = new TheSamePackageInherit();
        //[public]
        System.out.println(tspi.public_x);
        System.out.println(public_x);

        //[protected]
        System.out.println(tspi.protected_x);
        System.out.println(protected_x);

        //[default]
        System.out.println(tspi.default_x);
        System.out.println(default_x);

        //[private] X
        //System.out.println(tspi.private_x);
    }
}
