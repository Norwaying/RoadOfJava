package com.raphael.serializable;

import java.io.*;

/**
 * Created by Nov on 2015/1/6.
 */
public class SerializableMain {
    public static void main(String[] args){
        File file = new File("person.out");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            Person person = new Person("luwei",25,Gender.MALE);
            oos.writeObject(person);
            oos.close();

            //System.out out：它是一种输出流对象，它的目的地是命令行窗口
            //System.in 它是一种输入流对像，它的源是键盘，可以读取用户从键盘输入的数据，在读取数据时会引起堵塞，直到用户按下Enter键
            //String s = "I AM an Object!";
            //boolean isObject = s instanceof Object;
            //我们声明了一个String对象引用，指向一个String对象，然后用instancof来测试它所指向的对象是否是Object类的一个实例
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Object newPerson = ois.readObject();
            System.out.println(newPerson);  //使用System.out.println输出一个引用的时候实际上调用了该对象的toString()方法
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
