package com.raphael.runtime;

/**
 * Created by Nov on 2015/1/12.
 */
public class Raphael {
    private String name;
    private int age;
    public static String university;

    public Raphael(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printNameAndAge(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }

    public static void printUniversity(){
        System.out.println("university:"+university);
    }
    
}
