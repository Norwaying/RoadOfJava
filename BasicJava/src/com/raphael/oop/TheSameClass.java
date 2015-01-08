package com.raphael.oop;

/**
 * Created by Administrator on 2015/1/8.
 */
public class TheSameClass {
    public int public_x;
    protected int protected_x;
    int default_x;
    private int private_x;



    //[public]
    void TheSameClass_Any_To_Public(){
        System.out.println(public_x);   //this.public_x?
    }

    void TheSameClass_Any_To_Protected(){
        System.out.println(protected_x);
    }

    //[default]
    void TheSameClass_Any_To_Default(){
        System.out.println(default_x);
    }

    //[private]
    void TheSameClass_Any_To_Private(){
        System.out.println(private_x);
    }

}
