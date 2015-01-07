package com.raphael.oop;

/**
 * Created by Nov on 2015/1/7.
 * 同包继承
 */
public class TheSamePackageInherit extends AccessModifier {
    public static void main(String[] args){

    }

    void TheSamePackageInherit2Public(){
        AccessModifier am = new AccessModifier();
        System.out.println(am.public_x);
        System.out.println(am.protected_x);
        System.out.println(am.default_x);
//        System.out.println(am.private_x);
    }
}
