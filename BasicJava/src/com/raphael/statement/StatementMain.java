package com.raphael.statement;

/**
 * Created by Nov on 2015/1/6.
 * 流程控制语句（顺序、选择、循环）
 * if-else,for,while,switch,continue,break
 */
public class StatementMain {
    public static void main(String[] args){
        int no = 1;
        switch (no){    //switch中的数据类型只能是整型,字符或者枚举(byte  short  char  int  enum)
            case 1:     //case后面不能是变量
            {
                System.out.println("this is 1");
//                break;    //在每一个分支里面都必须写break,此语句表示退出整个switch()循环;
                            //如果不使用break语句则所有的操作将在第一个满足条件之后的语句全部输出,直到遇到break语句为止;
                            //如果有return语句,可以不加break语句;
                            //break只是跳出所在的switch;
                            //return会跳出当前所在的函数;
            }
            case 2:
            {
                System.out.println("this is 2");
//                break;
            }
            case 3:
            {
                System.out.println("this is 3");
//                break;
            }
            default:
            {
                System.out.println("default");  //保证程序的规范化和健壮性一般都加上default子句
//                break;
            }
        }

        System.out.println("main "+func(2));
    }
    public static int func(int number){
        switch (number){
            case 1:
            {
                System.out.println("func 1");
                return 1;
            }
            case 2:
            {
                System.out.println("func 2");
                return 2;
            }
            default:
            {
                System.out.println("func -1");
                return -1;
            }
        }
    }
}
