package com.raphael.assist;

import com.raphael.access.ThisKindClass2Access;

/**
 * Created by Nov on 2015/1/13.
 * 不同包子类
 */
public class TheDifferentPackageInherit2Access extends ThisKindClass2Access {
    void AccessMethod_4(){
        //一、直接使用
        System.out.println(public_x);
        System.out.println(protected_x);

        //二、间接使用（直接使用就行了，为何要间接使用）
        TheDifferentPackageInherit2Access theDifferentPackageInherit2Access = new TheDifferentPackageInherit2Access();
        theDifferentPackageInherit2Access.public_x = 0;
        theDifferentPackageInherit2Access.protected_x = 0;
    }
}
