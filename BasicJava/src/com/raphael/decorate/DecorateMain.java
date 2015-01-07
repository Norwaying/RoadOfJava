package com.raphael.decorate;

/**
 * Created by Nov on 2015/1/6.
 * java修饰符（final和static）
 * abstract
 * final:最终的,不能改变的
 * static:静态的,全局的
 * static和final一块用
 */
public class DecorateMain {
//理解:final成员变量必须在声明的时候初始化或者在构造器中初始化，否则就会报编译错误。
//方式一:
//    public DecorateMain() {
//        finalVar = 0;
//    }
//方式二:
//    public DecorateMain(int finalVar) {
//        this.finalVar = finalVar;
//    }
//方式三:
//    private final int finalVar = 0;

    public static void main(String[] args){

//        static修饰符，用来创建类方法和类变量。
//
//        Final修饰符，用来修饰类、方法和变量，final修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
//
//        Abstract修饰符，用来创建抽象类和抽象方法。
//
//        Synchronized和volatile修饰符，主要用于线程的编程。


    //1.final类(final类不能被继承,因此final类的成员方法没有机会被覆盖,默认都是final的)
    //2.final方法(不允许其子类覆盖改方法)
    //3.final变量(常量)(final修饰的变量有三种：静态变量、实例变量和局部变量，分别表示三种类型的常量)
                                     //final成员变量必须在声明的时候初始化或者在构造器中初始化，否则就会报编译错误。



    //1.static方法(静态方法可以直接通过类名调用,任何的实例也都可以调用,因此静态方法中不能用this和super关键字,不能直接访问所属类的实例变量和实例方法,只能访问所属类的静态成员变量和成员方法)
    //2.static变量(类变量)对于静态变量在内存中只有一个拷贝
    //3.static代码块( static代码块也叫静态代码块,是在类中独立于类成员的static语句块,可以有多个,位置可以随便放,它不在任何的方法体内,JVM加载类时会执行这些静态的代码块,如果static代码块有多个,JVM将按照它们在类中出现的先后顺序依次执行它们,每个代码块只会被执行一次)
    }

    //final方法不能被子类的方法覆盖,但可以被继承.

    //Final变量能被显式地初始化并且只能初始化一次。被声明为final的对象的引用不能指向不同的对象。但是final对象里的数据可以被改变。也就是说final对象的引用不能改变，但是里面的值可以改变。

    //抽象类可以包含抽象方法和非抽象方法。(如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误。抽象类可以不包含抽象方法。)
//    abstract class Caravan{
//        private double price;
//        private String model;
//        private String year;
//        public abstract void goFast(); //抽象方法(抽象方法是一种没有任何实现的方法，该方法的的具体实现由子类提供。抽象方法不能被声明成final和strict。)
//        public abstract void changeColor();
//    }


    //任何继承抽象类的子类必须实现父类的 [所有] 抽象方法，除非该子类也是抽象类。


//    static final用来修饰成员变量和成员方法，可简单理解为“全局常量(方法)”！
//    对于变量，表示一旦给值就不可修改，并且通过类名可以访问。
//    对于方法，表示不可覆盖，并且可以通过类名直接访问。

}
