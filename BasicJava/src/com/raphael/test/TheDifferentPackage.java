package com.raphael.test;

import com.raphael.oop.AccessModifier;

/**
 * Created by Nov on 2015/1/7.
 */
public class TheDifferentPackage {
    void TheDifferentPackage2Public(){
        AccessModifier am = new AccessModifier();
        System.out.println(am.public_x);
//        System.out.println(am.protected_x);
//        System.out.println(am.default_x);
//        System.out.println(am.private_x);
    }
}
