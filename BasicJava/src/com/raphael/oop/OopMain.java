package com.raphael.oop;

/**
 * Created by Nov on 2015/1/6.
 * 面向对象编程（封装、继承、多态）
 * 隐藏和覆盖(extends和implements)    重载
 * 接口和抽象类
 * private,protected,public限定符
 * super和this
 *
 */
public class OopMain {
    public static void main(String[] args){
        /***包访问权只能同一个包下访问***/
        TestClass tc = new TestClass();
        tc.test();
    }

}
