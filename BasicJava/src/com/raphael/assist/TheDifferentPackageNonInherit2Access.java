package com.raphael.assist;

import com.raphael.access.ThisKindClass2Access;

/**
 * Created by Nov on 2015/1/13.
 * 不同包非子类
 * 非继承
 */
public class TheDifferentPackageNonInherit2Access {
    void AccessMethod_6(){
        //一、非继承，所以谈不上直接使用


        //二、间接使用（只能间接使用了）
        ThisKindClass2Access thisKindClass2Access = new ThisKindClass2Access();
        thisKindClass2Access.public_x = 0;
    }
}
