package com.raphael.reflection;

/**
 * Created by Nov on 2015/1/9.
 */
public class ReflectionSample {
    private int a;
    protected int aa;
    public int aaa;

    private void b(){

    }
    protected void bb(){

    }
    public void bbb(){

    }


    public ReflectionSample(){

    }

    public ReflectionSample(int a, int aa, int aaa){
        this.a = a;
        this.aa = aa;
        this.aaa = aaa;
    }


    public void x(int x, String xx){
        System.out.println("x="+x+" is "+xx);
    }

    public static void y(int y, String yy){
        System.out.println("y="+y+" is "+yy);
    }
}
