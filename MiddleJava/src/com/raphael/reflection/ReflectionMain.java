package com.raphael.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Nov on 2015/1/6.
 * Java反射机制
 * Class类
 */
public class ReflectionMain {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class类代表java类，它的各个实例对象对应了各个类在内存中的字节码（类装载,不是创建对象）
        //一个类被类加载器加载到内存中，占用一片存储空间，这个空间里面的内容就是类的字节码，
        //不同的类的字节码是不同的，所以他们在内存中的内容是不一样的。
        //Class类的每一个实例化对象对应的是一个字节码文件
        //关于字节码：当创建一个类时，如Person类，首先就是将这个类的二进制文件加载到内存中，才可以用它来实例化一个个对象。
        //获得各个字节码对应的实例对象的三种方法
        String string = "Hello World!";

        Class c1 = String.class;    //方式一
        Class c2 = string.getClass();   //方式二
        Class c3 = Class.forName("java.lang.String");   //方式三


        //以上三个变量对应的字节码是同一份。
        System.out.println(c1==c2);
        System.out.println(c2==c3);
        System.out.println(c3==c1);


        Class c4 = Class.forName("com.raphael.reflection.ReflectionSample");

        Constructor[] constructors = c4.getConstructors();
        System.out.println("constructors:");
        for(Constructor c : constructors)
            System.out.println(c);


        //getDeclaredMethod*()获取的是类自身声明的所有方法，包含public、protected和private方法。
        //getMethod*()获取的是类的所有共有方法，这就包括自身的所有public方法，和从基类继承的、从接口实现的所有public方法。
        //Method[] methods = c4.getMethods();//只能是public成员方法
        Method[] methods = c4.getDeclaredMethods();
        System.out.println("methods:");
        for(Method m : methods)
            System.out.println(m);

//        Field[] fields = c4.getFields();//只能是public变量成员
        Field[] fields = c4.getDeclaredFields();
        System.out.println("fields:");
        for(Field f : fields)
            System.out.println(f);

    }
}
