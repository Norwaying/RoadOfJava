package com.raphael.exception;

/**
 * Created by Nov on 2015/1/6.
 */
public class ExceptionA {
    public static void main(String[] args){
//        Main main = new Main();
//
//        try {
//            main.showException();
//        } catch (Exception e) {
//            System.out.println("catch the method throws exception.");
//        }

        //系统主动抛出ArithmeticException和ArrayIndexOutOfBoundsException异常，都是运行时异常有系统处理。（属于非受检异常，无需异常处理）
        //运行时异常通过更改程序来避免
        //1.ArithmeticException
        int a = 5;
        int b = 0;
        int c = a/b;
        //2.ArrayIndexOutOfBoundsException
        String[] strings = new String[4];
        String string = strings[4];


       /*
       java.lang.Throwable
          |-- Error错误：JVM内部的严重问题。无法恢复。程序人员不用处理。
          |--Exception异常：普通的问题。通过合理的处理，程序还可以回到正常执行流程。要求编程人员要进行处理。
             |--RuntimeException:也叫非受检异常(unchecked exception).这类异常是编程人员的逻辑问题。应该承担责任。Java编译器不进行强制要求处理。 也就是说，这类异常再程序中，可以进行处理，也可以不处理。
             |--非RuntimeException:也叫受检异常(checked exception).这类异常是由一些外部的偶然因素所引起的。Java编译器强制要求处理。也就是说，程序必须进行对这类异常进行处理。
        */




       //受检异常必须处理（Exception,FileNotFoundException,IOException,SQLException.）
       //两种方式1.try catch 2.向上声明 throws 向上声明是告诉本方法的调用者，在使用本方法时，应该对这些异常进行处理。

        /***********************************************/
//    try{
//        throw new Exception("hello exception.");
//    }
//    catch (Exception e){
//       System.out.println("catch the hello exception.");
//    }
//    finally {
//       System.out.println("end finally.");
//    }
        /***********************************************/
    }

    public void showException() throws Exception{   //明示了该方法会抛出异常，谁调用，谁捕获处理。
        throw new Exception("this is method exception."); //用户自己抛出异常
        // XXXXXXXXXX                                     //系统自己抛出异常
//        System.out.println("method throw exception.");
    }
}
