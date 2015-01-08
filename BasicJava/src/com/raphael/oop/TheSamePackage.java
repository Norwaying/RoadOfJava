package com.raphael.oop;

/**
 * Created by Nov on 2015/1/7.
 */
public class TheSamePackage {
    public static void main(String[] args){

    }
    void TheSamePackage_Any_To_Public(){
        TheSameClass tsc = new TheSameClass();
        //[public]
        System.out.println(tsc.public_x);

        //[protected]
        System.out.println(tsc.protected_x);

        //[default]
        System.out.println(tsc.default_x);

        //[private] X
        //System.out.println(tsc.private_x);
    }
}
