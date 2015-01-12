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
    public static void main(String[] args){
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // 传递一个字符型型数组

        //collection1可以存放任何类型
        Collection<?> collection1 = null;
        collection1 = new ArrayList<String>();
        collection1 = new ArrayList<Integer>();
        collection1 = new ArrayList<Object>();


        //而collection2则只能放在Object类型
        Collection<Object> collection2 = new ArrayList<Object>();

    }

    public static <E> void printArray(E[] array){
        for(E i: array){
            System.out.print(i);
        }
        System.out.println();
    }
}
