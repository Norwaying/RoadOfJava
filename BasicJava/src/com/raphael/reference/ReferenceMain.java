package com.raphael.reference;

/**
 * Created by Nov on 2015/1/6.
 * Java引用理解
 */
public class ReferenceMain {
    public static void main(String[] args){
        Box b1 = new Box(1,2,3);
        Box b2 = b1;    //b1和b2指向同一个对象,b2对对象的改变将影响到b1指向的对象.
        b1 = null;      //b1设置为空,b2仍然指向原来对象.
    }

}
