package com.raphael.oop;

/**
 * Created by Nov on 2015/1/6.
 */
public class Son1 extends Father1{
    public String name = "SON";
    public int a = 20;
    public static int age = 500;
    public void showName(){
//        super.showName();
        System.out.println("Son");  //方法覆盖
    }
    public void test(){
        System.out.println("test");
    }

//    private void test(){
//        return ;
//    }
    //仅仅是修饰符、返回值、throw的异常 不同，那这是2个相同的方法，编译都通不过

    public static void myFunc(){
        System.out.println("this is func of son.");
    }
    public static void main(String[] args){
        Father1 f1 = new Son1();
        f1.showName();
        System.out.println(f1.name);
//        f1.test();    //失去自身非覆盖的方法


        //这里肯定是调用父类的，与子类毫无关系。
        Father1 f2 = new Father1();
        f2.showName();
        System.out.println(f2.name);


        //只有当父类引用子类对象时才会出现这一系列问题
        Son1 s1 = new Son1();
        s1.showName();  //访问是自己的方法，父类中的再也访问不到了。
        System.out.println(s1.name);
        s1.myFunc();
        System.out.println(s1.age);

        Father1 f3 = s1;     //关键一步 向上转型！！！
        f3.myFunc();    //可以继续访问父类隐藏的静态方法    （隐藏）
        System.out.println(f3.age); //可以继续访问父类隐藏的静态变量       （隐藏）
        System.out.println(f3.name);    //可以访问父类隐藏的实例变量       （隐藏）
        f3.showName();  //不可以访问父类覆盖的实例方法了     （覆盖）
    }
}
