package com.raphael.initial;

/**
 * Created by Nov on 2015/1/7.
 */
public class Son extends Father {
    static{
        System.out.println("this is son's static block.");
    }
    Son(){
        System.out.println("this is son's construct block.");
    }
    {
        System.out.println("this is son's initialization block.");
    }
}
