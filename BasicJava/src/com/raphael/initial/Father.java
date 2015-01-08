package com.raphael.initial;

/**
 * Created by Nov on 2015/1/7.
 */
public class Father {
    static{
        System.out.println("this is father's static block.");
    }
    Father(){
        System.out.println("this is father's construct block.");
    }
    {
        System.out.println("this is father's initialization block.");
    }
}
