package com.raphael.oop;


/**
 * Created by Nov on 2014/12/31.
 * 由于private变量受访问权限的限制，它不能被覆盖。
 *
 * [也变相回答了访问限定对覆盖和隐藏的影响]
 */
public class Son extends Father{
    public String localName = "I am local son.";    //隐藏不因限定符不同而变化
//    public String localName = "I am local son?";  //不能通过限定符区分变量
    protected static String staticName = "I am static son.";
    protected String normalName = "I am normal son.";   //新增变量
    protected String specialSName = "I am special son";

    /***************************方法覆盖**************************************/
    //方法覆盖考虑访问限定的变化
    // 1.子类方法修饰符的范围要比父类的宽才能覆盖；
    // 2.子类方法抛出的异常不能超过父类的异常才能覆盖；
    public void showLocalName(){
//        super.showLocalName();
        System.out.println("To show local name of son."+"&&"+localName);    //也只能访问Son的实例变量
    }
    /************************************************************************/


    public static void showStaticName(){
        System.out.println("To show static name of son."+"&&"+staticName);      //也只能访问Son的静态变量
    }
    public void showNormalName(){   //新增方法
        System.out.println("To show normal name of son."+"&&"+normalName);
    }

    /**
     * 实际上应该Son包含Father中的成员，但由于隐藏和覆盖原因，导致不可访问。
     *
     protected String localName = "I am local father";
     protected static String staticName = "I am static father.";
     public void showLocalName(){
     System.out.println("To show local name of father.");
     }
     public static void showStaticName(){
     System.out.println("To show static name of father.");
     }

     */
    public static void main(String[] args){

        /**
         *父类此时与子类毫无关系
         */
        Father father = new Father();
        System.out.println(father.localName);
        System.out.println(father.staticName);
        father.showLocalName();
        father.showStaticName();
        System.out.println("****************************");

        /**
         *子类访问的都是自己成员
         *看不见父类中隐藏的成员？
         *隐藏和覆盖都是指：子类覆盖或者隐藏父类的成员！
         *主要原因是同名的存在而导致的
         */
        Son son = new Son();
        System.out.println(son.localName);
        System.out.println(son.staticName);
        System.out.println(son.normalName);
        System.out.println(son.specialFName); //和父类不同名的变量
        son.showLocalName();
        son.showStaticName();
        son.showNormalName();
        System.out.println("****************************");
        /*********************************************/
        /*************              ******************/
        /*************              ******************/
        /*************              ******************/
        /*************              ******************/
        /*************              ******************/
        /****                                  *******/
        /*****                                ********/
        /******                              *********/
        /*******                            **********/
        /********                          ***********/
        /*********                        ************/
        /**********                      *************/
        /***********                    **************/
        /************                  ***************/
        /*************                ****************/
        /**************              *****************/
        /***************            ******************/
        /****************          *******************/
        /*****************        ********************/
        /******************      *********************/
        /*******************    **********************/
        /********************  ***********************/
        /*********************************************/

        /**
         * 关键步骤（如果Son要访问Father中成员，必须进行向上转型。）
         * 子类可以访问父类中成员、
         * Attention：相同的方法会被重写，变量没有重写之说，如果子类声明了跟父类一样的变量，那意味着子类将有两个相同名称的变量。一个存放在子类实例对象中，一个存放在父类子对象中。父类的private变量，也会被继承并且初始化在子类父对象中，只不过对外不可见。
         * 即同名或者private都会被继承！！！
         */
        Father f = son;//向上转型（访问范围缩小：新增成员（方法和变量）不能访问，除了隐藏和覆盖的）按正常思路，应该是输出子类的成员的。
        System.out.println(f.localName); //隐藏实例变量 （得以显现）
        System.out.println(f.staticName);//隐藏静态变量 （得以显现）
        System.out.println(f.specialFName);
//        System.out.println(f.specialSName);
//        System.out.println(f.normalName);//不可以访问子类中新增变量（丢失子类中不同的变量，即新增变量）
        f.showLocalName();//覆盖实例方法 （再也无法显现！！！） 多态的体现！！！(彻底覆盖了)
        f.showStaticName();//隐藏静态方法 （得以显现）
//        f.showNormalName();//不可以访问子类中新增方法（丢失子类中不同的方法，即新增方法）
    }
}
