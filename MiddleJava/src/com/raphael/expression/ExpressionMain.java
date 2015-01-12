package com.raphael.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Nov on 2015/1/6.
 * Java正则表达式
 */
public class ExpressionMain {
    //字符串匹配(字符匹配)
    //字符串查找
    //字符串替换
    //字符串分割

    /*
         java.lang.String   matches(),split(),replace()...
         java.util.regex.Pattern：模式类：字符串要被匹配的这么一个模式，该模式本身已经被编译过，使用的话效率要高很多。
         java.util.regex.Matcher：匹配类：这个模式匹配某个字符串所产生的结果，这个结果可能会有很多个。
     */

    /*
    如果想要将正则表达式视为一个对象来重复使用，可以使用Pattern的静态方法compile()进行编译。
    compile()方法会返回一个Pattern的实例，这个实例代表正则表达式，之后就可以重复使用Pattern
    实例的matcher()方法来返回一个Matcher的实例，代表符合正则式的实例，这个实例上有一些寻找符
    合正则式条件的方法可供操作。
     */
    public static void main(String[] args){
        //方式一：
        Pattern p = Pattern.compile("a*b");         //PatternCompile
        Matcher m1 = p.matcher("aaaaab");            //PatternMatcher
        Matcher m2 = p.matcher("abababa");
        boolean b1 = m1.matches();
        boolean b3 = m2.matches();

        //方式二：
        boolean b2 = Pattern.matches("a*b", "aaaaab");



        /*
        寻找手机号码为0515开头的号码，假设号码来源不止一个(如phones1、phones2)，
        则可以编译好正则表达式并返回一个Pattern对象，之后就可以重复使用这个Pattern对象，
        在比对时使用matcher()返回符合条件的Matcher实例。find()方法表示是否有符合的字符串，
        group()方法则可以将符合的字符串返回。
         */

        Pattern pattern = Pattern.compile(".*0515-\\d{6}");
        Matcher matcher = null;

        /*************************************************/
        String phones1 ="A:0515-203291\n" +
                        "B:0515-136485\n" +
                        "F:0515-666666";
        matcher = pattern.matcher(phones1);
        while(matcher.find()) {                 //find()和group()使用
            System.out.println(matcher.group());
        }

        /************************************************/
        String phones2 ="C:0515-321231\n" +
                        "D:0515-222121";
        matcher = pattern.matcher(phones2);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
