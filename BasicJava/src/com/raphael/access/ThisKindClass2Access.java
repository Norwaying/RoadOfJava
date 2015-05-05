package com.raphael.access;

/**
 * Created by Nov on 2015/1/13.
 * 本类
 * 访问可以理解为"可见"--使用这个特性(方法或属性)
 *
 * private：仅对本类是可见的；
 * public：对所有类都是可见的；
 * protected：对本包(package)及所有子类（本包继承或者不同包继承）是可见的；
 * default：对本包内的所有类是可见的；
 *
 * 何为可见性（来自网络）
 * 1.在类B中实例化了类A，能否通过A的对象直接访问A的某个属性或方法；
 * 2.类B继承了类A，那么能否通过类B的对象来访问类A中的某个属性或者方法；
 *
 *
 * [也变相回答了访问限定对继承的影响]
 */
public class ThisKindClass2Access { //重名，即覆盖时不能缩小访问权限。
    private int private_x;
    int default_x;
    protected int protected_x;
    public int public_x;


    void AccessMethod_1(){
        //一、直接访问
        System.out.println(private_x);
        System.out.println(default_x);
        System.out.println(protected_x);
        System.out.println(public_x);

        //二、间接访问（直接使用就行了，为何要间接使用）
        ThisKindClass2Access thisKindClass2Access = new ThisKindClass2Access();
        thisKindClass2Access.private_x = 0;
        thisKindClass2Access.default_x = 0;
        thisKindClass2Access.protected_x = 0;
        thisKindClass2Access.public_x = 0;
    }
}
