package com.raphael.test;


import com.raphael.oop.TheSameClass;

import java.lang.reflect.Field;

/**
 * Created by Nov on 2015/1/7.
 */
public class TheDifferentPackage {
    public static void main(String[] args){

    }
    void TheDifferentPackage_Any_To_Public(){
        TheSameClass tsc = new TheSameClass();
        //[public]
        System.out.println(tsc.public_x);

        //[protected]
        //System.out.println(tsc.protected_x);


        //[default]
        //System.out.println(tsc.default_x);

        //[private]
        //System.out.println(tsc.private_x);
    }
}
