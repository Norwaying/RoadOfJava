package com.raphael.oop;

/**
 * Created by Nov on 2015/1/7.
 */
public class TheSamePackage {
    void TheSamePackage2Public(){
        AccessModifier am = new AccessModifier();
        System.out.println(am.public_x);
        System.out.println(am.protected_x);
        System.out.println(am.default_x);
//        System.out.println(am.private_x);
    }
}
