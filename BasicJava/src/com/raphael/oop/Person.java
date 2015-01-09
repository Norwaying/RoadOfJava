package com.raphael.oop;

/**
 * Created by Nov on 2015/1/8.
 */
public class Person implements Cloneable{
    private String name;
    private int age;
    private Behavior behavior; //(需要深拷贝)

    public Person(String name, int age, Behavior behavior) {
        this.name = name;
        this.age = age;
        this.behavior = behavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public Object clone() throws CloneNotSupportedException {   //重写的时候子类只能扩大父类方法的访问范围而不能缩小!!!
//        return (Person)super.clone();//(如果只是用Object中默认的clone方法,是浅拷贝的.)
        Person p = (Person)super.clone();
        p.behavior = (Behavior)behavior.clone();    //决定深拷贝还是浅拷贝
        return p;
    }
}
