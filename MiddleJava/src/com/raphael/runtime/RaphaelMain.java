package com.raphael.runtime;

/**
 * Created by Nov on 2015/1/12.
 * 演示
 * 如图Simulating Figure.png
 * 引用自《Java内存管理的进一步理解-模拟过程图解 - ghostProgrammer - 博客频道 - CSDN.NET》
 */
/*
   step1:
         运行RaphaelMain.class后，首先在方法区开辟一片空间，将RaphaelMain加载进方法区（这个过程包括将持有对象this
         以及构造方法进行加载）；
         在方法区中还有一个特殊的区域叫做，静态区。静态区存放类中静态成员。于是主函数main方法被加载进方法区。
 */
public class RaphaelMain {
    /*
       step2:
             当完成将RaphaelMain类加载到方法区后。JVM找到RaphaelMain类的入口函数main方法，于是main方法进行压栈工作，
             进入栈内存当中。
     */
    public static void main(String[] args){
        /*
           step3:
                 RaphaelMain的main方法压栈后，开始执行main中的内容。
                 首先执行Raphael.printUniversity(),这是虚拟机首先查找到Raphael.class文件进行运行。
                 于是同step1一样，开始讲Raphael类加载进方法区。依然是先开辟一个空间，存放Person类的持有对象，构造方法和成员
                 方法。静态成员（university和printUniversity()）被加载到静态区。
         */

        /*
           step4:
                 Raphael被加载到方法区存放好后，执行Raphael.printUniversity()。虚拟机从方法区的静态区中查找到Raphael类的
                 printUniversity()方法，对其进行压栈。
                 于是，printUniversity()进入到栈内存，随后执行该方法中的内容，内容为打印Raphael类的变量university。
                 于是从静态区查找到university的值，将其打印。方法执行完毕，将其进行出栈，printUniversity()方法从栈内存中释放。
         */
        Raphael.printUniversity();

        /*
           step5:
                 接着执行Raphael raphael = new Raphael("Rap",25);这里定义了一个Raphael类型的对象引用raphael，于是引用raphael
                 进入栈中main方法所处的空间区域。
         */
        /*
           step6:
                 关键字new开始初始化一个Raphael对象，虚拟机在堆内存中开辟一块空间，存放该对象，并分配了一个内存地址(0x2222),该对象的成员变量
                 被加载进该空间，并进行了一次默认初始化。
         */
        /*
           step7:
                 调用Raphael类的构造方法开始对对象初始化工作。于是首先对构造方法Raphael(String name,int age)进行压栈，构造方法进入
                 到栈中，方法中的形参name和age作为局部变量也被加入到栈中，其中name值是Rap，age的值是25.
                 紧接着，执行构造方法的内容，this.name=name;this.age=age;此时栈中构造方法的持有对象this为0x2222，于是将堆内存中，
                 内存地址为0x2222的Raphael对象进行赋值，完成后，堆内存中的Raphael对象的成员变量的值被改变。
                 最后将堆内存中该Raphael对象的内存地址赋值给栈内存中的对象引用raphael，让raphael指向该对象。到此，便完成了该
                 Raphael raphael = new Raphael("Rap",25)的所有工作，于是构造函数Raphael(String name, int age)出栈，从栈内存
                 中释放。
         */
        Raphael raphael = new Raphael("Rap",25);
        /*
           step8:
                 执行raphael.printNameAndAge(),同理printNameAndAge()方法进行压栈，进入到栈内存中。因为该方法通过对象引用
                 raphael进行调用，所以在方法内，该方法的持有对象this为0x2222.
                 执行方法中的内容，通过持有对象到堆内存中找到对应的对象，取出name和age的值，进行打印
                 此时printNameAndAge()方法执行完毕，进行出栈，从栈内存中释放。main方法也随之结束，也进行出栈，从内存中释放。
         */
        raphael.printNameAndAge();
    }
}
