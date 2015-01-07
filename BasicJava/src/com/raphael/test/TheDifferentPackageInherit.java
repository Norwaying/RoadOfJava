package com.raphael.test;

import com.raphael.oop.AccessModifier;

/**
 * Created by Nov on 2015/1/7.
 * 异包继承
 */
public class TheDifferentPackageInherit extends AccessModifier {
//    void TheDifferentPackageInherit2Public(){
//        AccessModifier am = new AccessModifier();
//        System.out.println(am.public_x);
//        System.out.println(am.protected_x);
//        System.out.println(am.default_x);
//        System.out.println(am.private_x);
//    }
    public static void main(String[] args){
        TheDifferentPackageInherit tdpi = new TheDifferentPackageInherit();
        System.out.println(tdpi.public_x);
        System.out.println(tdpi.protected_x);

        AccessModifier am = new AccessModifier();
        System.out.println(am.public_x);
//        System.out.println(am.protected_x); //error
    }
}
