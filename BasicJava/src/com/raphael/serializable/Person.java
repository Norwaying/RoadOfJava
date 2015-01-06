package com.raphael.serializable;

import java.io.Serializable;

/**
 * Created by Nov on 2015/1/1.
 */
public class Person implements Serializable{
    private String name;
    private transient Integer age;  //临时量，不序列化
    private Gender gender;
    Person(){
        System.out.println("none-args constructor.");
    }
    Person(String name,Integer age,Gender gender){
        System.out.println("have-args constructor.");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "[" + name + ", " + age + ", " + gender + "]";
    }
}
