package com.raphael.decorate;

/**
 * Created by Nov on 2015/1/7.
 */
public class Son extends Father {
    public void A(){
        System.out.println("son.a");
    }

    //warning:B()不允许覆盖(重写)
//    public void B(){
//
//    }
    //静态方法不可以覆盖
    public static void C(){
        System.out.println("son.c");
    }
    //静态方法可以继承
//    public void D(){
//        C();
//    }
    //常方法可以继承
//    public void F(){
//        B();
//    }

    public static void main(String[] args){
        Son a = new Son();
        a.A();  //自身
        a.B();  //继承于final
        a.C();  //继承于static(father.c,son.c)

        Son.C();
        Father.C();

        System.out.println("*******************");
        Father f = new Son();
        f.C();  //静态方法不能覆盖
        f.A();  //普通方法可以覆盖
    }
}
