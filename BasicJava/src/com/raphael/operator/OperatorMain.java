package com.raphael.operator;




/**
 * Created by Nov on 2015/1/6.
 * Java运算符
 * ==(对象引用)与equals()(对象内容)
 * instanceof运算符
 * 向上转型(自动):子类->父类,int->float 向下转型(强制):父类->子类,float->int
 */
public class OperatorMain {
    public static void main(String[] args){
        //( Object reference variable ) instanceOf  (class/interface type)
        //1.如果运算符左侧变量所指的对象,是操作符右侧类或接口(class/interface)的一个对象,那么结果为真.
        //2.如果被比较的对象兼容于右侧类型,该运算符仍然返回true.
        String name = "James";
        boolean r1 = name instanceof String;
        System.out.println(r1);

        Vehicle vehicle = new Vehicle();
        boolean r2 = vehicle instanceof Vehicle;
        System.out.println(r2);     //实例是本对象实例

        Car car = new Car();
        boolean r3 = car instanceof Car;
        System.out.println(r3);      //实例是本对象实例

        boolean r4 = car instanceof Vehicle;
        System.out.println(r4);    //子类是父类的实例

        boolean r5 = vehicle instanceof Car;
        System.out.println(r5);     //父类不是子类的实例

        Vehicle special = new Car();
        System.out.println(special instanceof Car); //判定用于向下转型
        System.out.println(special instanceof Vehicle);


        if(special instanceof Car) {    //
            Car car1 = (Car) special;
        }

    }
}
