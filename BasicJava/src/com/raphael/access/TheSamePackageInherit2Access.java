package com.raphael.access;

/**
 * Created by Nov on 2015/1/13.
 * 同包子类
 */
public class TheSamePackageInherit2Access extends ThisKindClass2Access {
    void AccessMethod_2(){
        //一、直接访问
        System.out.println(public_x);
        System.out.println(protected_x);
        System.out.println(default_x);

        //二、间接访问（直接使用就行了，为何要间接使用）
        TheSamePackageInherit2Access theSamePackageInherit2Access = new TheSamePackageInherit2Access();
        theSamePackageInherit2Access.public_x = 0;
        theSamePackageInherit2Access.protected_x = 0;
        theSamePackageInherit2Access.default_x = 0;
    }
}
