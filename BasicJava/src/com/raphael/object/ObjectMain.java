package com.raphael.object;

import java.util.Date;

/**
 * Created by Nov on 2015/1/6.
 * Object类的理解
 * toString(),equals()
 * String、Object、Class、Collection、ClassLoader、System、Runtime
 */
public class ObjectMain {
    public static void main(String[] args){
        //在不明确给出超类的情况下,Java会自动把Object作为要定义类的超类
        Employee e1 = new Employee("li",100,new Date(2015,1,8));
//        Employee e2 = new Employee("li",100,new Date(2015,1,8));  //e1和e2引用不同
        Employee e2 = e1;                                           //e1和e2引用相同
        if(e1 == e2)
            System.out.println("e1和e2引用相同");
        else
            System.out.println("e1和e2引用不同");

        /**************************************************************************/

//        public boolean equals(Object obj)
//        {
//            　　return (this == obj);
//        }

        //可以看出，只有当一个实例等于它本身的时候，equals()才会返回true值。通俗地说，
        // 此时比较的是两个引用是否指向内存中的同一个对象，也可以称做是否实例相等。而
        // 我们在使用equals()来比较两个指向值对象的引用的时候，往往希望知道它们[逻辑]
        // 上是否相等，而不是它们是否指向同一个对象。在这样的情况下， 如果超类也没有重
        // 写equals()以实现期望的行为，这时我们就需要重写equals方法。


        /**************************************************************************/

        Employee e3 = new Employee("li",100,new Date(2015,1,9));        //原来equals默认按是否指向同一个对象为依据！！！
        Employee e4 = new Employee("li",100,new Date(2015,1,9));      //e3和e4对象不同(指向不同的对象)
//        Employee e4 = e3;                                               //e3和e4对象相同(指向同一个对象)
//        if(e3.equals(e4))
//            System.out.println("e3和e4指向同一个对象");
//        else
//            System.out.println("e3和e4指向不同的对象");

        //重写equals()之后  如何定义是否是同一个对象（我们需要逻辑上比较是否相等！！！）
        if(e3.equals(e4))
            System.out.println("e3和e4是同一个对象");
        else
            System.out.println("e3和e4是不同的对象");

        String s1 = new String("hello world");
        String s2 = new String("hello world");
        if(s1.equals(s2))
            System.out.println("s1串和s2串相同");    //根本原因是String类重写了Object的equals()方法，逻辑上比较。
        else
            System.out.println("s2串和s2串不同");

    }
}
