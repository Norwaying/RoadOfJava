package com.raphael.decorate;

/**
 * Created by Nov on 2015/1/7.
 */

//public class Father extends GrandFather{
//Final类不允许继承
public class Father{
    public void A(){

    }

    public final void B(){  //final方法比非final方法要快，因为在编译的时候已经静态绑定了，不需要在运行时再动态绑定。

    }
}

