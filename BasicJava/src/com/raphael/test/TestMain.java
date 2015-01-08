package com.raphael.test;

//import com.raphael.oop.TestClass; 导入也没用(包访问权限)

import com.raphael.oop.AccessModifier;  //public访问权限
import com.raphael.oop.TheSameClass;

/**
 * Created by Nov on 2015/1/7.
 * 用于其他目的
 */
public class TestMain {
    public static void main(String[] args){
        /***包访问权不能在其他包下访问(即使import相应pkg也无济于事)***/
//        TestClass tc = new TestClass();
//        tc.test();
        /***public访问权不能在其他包下访问(需要import相应的pkg)***/
        AccessModifier am = new AccessModifier();

        //TheSameClass tsc = new TheSameClass();
        //System.out.println(tsc.protected_x);   //不可访问
    }
}
