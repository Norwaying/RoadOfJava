package com.raphael.oop;

/**
 * Created by Nov on 2015/1/7.
 */
public class AccessModifier {
    //类的访问控制符:public或者默认缺省(当然对于内部类还可以有static修饰,而用static修饰的内部类叫作嵌套类.)
    //方法或者变量的访问控制符:public protected default(什么都不用写) private

    //什么范围内,不管什么,对(public,protected,default,private)的访问权限

    //public   何时何地都能访问
    //protected同一包中所有(子类,非子类)访问+不同包中子类访问
    //default  同一包中所有(子类,非子类)访问
    //private  同一类中所有访问

}

class TestClass{    //默认缺省(又称"包访问性",即只能被同一包中类访问,而不能被其他包中类访问.)
    public static void test(){
        System.out.println("test is accessed by class in the same package");
    }
}
