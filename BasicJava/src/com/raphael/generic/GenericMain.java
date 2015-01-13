package com.raphael.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Nov on 2015/1/6.
 * 泛型
 * 泛型类和泛型方法
 * 有界的类型参数！
 * Class</?>
 */
public class GenericMain {
    /*
    为了更好地去理解泛型，我们也需要去理解java泛型的命名规范。为了与java关键字区别开来，java泛型参数只是使用一个大写字母来定义。各种常用泛型参数的意义如下：
    E — Element，常用在java Collection里，如：List<E>,Iterator<E>,Set<E>
    K,V — Key，Value，代表Map的键值对
    N — Number，数字
    T — Type，类型，如String，Integer等等
    S,U,V etc. - 2nd, 3rd, 4th 类型，和T的用法一样
     */
    public static void main(String[] args){
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\nArray characterArray contains:" );
        //!!!只能是number类型，编译出错。
//        printArray( charArray ); // 传递一个字符型型数组

        //collection1可以存放任何类型
        Collection<?> collection1 = null;
        collection1 = new ArrayList<String>();
        collection1 = new ArrayList<Integer>();
        collection1 = new ArrayList<Object>();


        //而collection2则只能放在Object类型
        Collection<Object> collection2 = new ArrayList<Object>();

    }

    //有时候我们并不希望整个类都被泛型化，这时可以只在某个方法上应用泛型。
    //[public][protected][private][static][abstract][final]只是方法修饰符
    //[返回类型]！[方法名][参数列表]才是方法签名
    //这就明白<E>
    //泛型参数的界限 <T extends BoundingType> 此定义表示T应该是BoundingType的子类型（subtype）。T和BoundingType可以是类，也可以是接口。另外注意的是，此处的”extends“表示的子类型，不等同于继承。
    public static final        //修饰符
                       <E extends Number> void printArray(E[] array){        //方法签名
        for(E i: array){                                                                       //方法体
            System.out.print(i);
        }
        System.out.println();
    }
}
