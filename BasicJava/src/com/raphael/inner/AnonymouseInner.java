package com.raphael.inner;

import java.util.Date;

/**
 * Created by Nov on 2015/1/7.
 */
public class AnonymouseInner {
    public String getDate(Date date)
    {
        return date.toLocaleString();
    }

    public static void main(String[] args){
        AnonymouseInner test = new AnonymouseInner();

        // 打印日期：
        String str = test.getDate(new Date());
        System.out.println(str);
        System.out.println("----------------");

        // 使用匿名内部类
        String str2 = test.getDate(new Date()
        {
        });// 使用了花括号，但是不填入内容，执行结果和上面的完全一致
        // 生成了一个继承了Date类的子类的对象
        System.out.println(str2);
        System.out.println("----------------");

        // 使用匿名内部类，并且重写父类中的方法
        String str3 = test.getDate(new Date()
        {

            // 重写父类中的方法
            @Override
            @Deprecated
            public String toLocaleString()
            {
                return "Hello: " + super.toLocaleString();
            }

        });

        System.out.println(str3);
    }
}
