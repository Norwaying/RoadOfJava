package com.raphael.construct;

/**
 * Created by Nov on 2014/12/30.
 */
public class B extends A{
    public B(){
        super();    //这时可以不需要super()
        System.out.println("B 构造");
    }

    public B(String string){
        super(string);
        System.out.println("B 构造："+string);
    }
}
