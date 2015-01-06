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

        //系统主动抛出ArithmeticException和ArrayIndexOutOfBoundsException异常，都是运行时异常有系统处理。
        //运行时异常通过更改程序来避免
        //1.ArithmeticException
        int a = 5;
        int b = 0;
        int c = a/b;
        //2.ArrayIndexOutOfBoundsException
        String[] strings = new String[4];
        String string = strings[4];



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
