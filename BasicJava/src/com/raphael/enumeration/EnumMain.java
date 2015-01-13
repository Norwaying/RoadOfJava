package com.raphael.enumeration;

/**
 * Created by Nov on 2015/1/6.
 * Java枚举类使用
 */
public class EnumMain {
    public static  void main(String[] args){
        show(Season.AUTUMN);
    }

    public static void show(Season season){
        switch (season){
            case SPRING:
                System.out.println("this is spring");
                break;
            case SUMMER:
                System.out.println("this is summer");
                break;
            case AUTUMN:
                System.out.println("this is autumn");
                break;
            case WINTER:
                System.out.println("this is winter");
                break;
        }
    }
    public enum Season{ //类似于内部类(而且是成员内部类)
        SPRING,SUMMER,AUTUMN,WINTER
    }
    public enum Day{
        MORNING,AFTERNOON,EVENING
    }
}
