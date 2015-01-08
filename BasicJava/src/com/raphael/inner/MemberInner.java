package com.raphael.inner;

/**
 * Created by Nov on 2015/1/7.
 * 成员内部类
 */
public class MemberInner {
    private int a;
    private static int b;
    public class Inner{
        private int a;
//        private static int b; //???
        public void test(){
            System.out.println(a);  //访问内部类的a
            System.out.println(b);

            System.out.println(MemberInner.this.a); //访问外部类的a   （在内部类里访问外部类的成员：Outerclass.this.member）
        }
    }

    public static void main(String[] args){
        MemberInner.Inner mi = (new MemberInner()).new Inner();   //创建成员内部类的对象,需要先创建外部类的实例
        mi.test();
    }
}
