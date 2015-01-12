package com.raphael.loader;

/**
 * Created by Nov on 2015/1/6.
 * java类装载机制
 * JVM运行参数
 * Class类
 * OSGi
 */
public class LoaderMain {
//    启动类加载器(Bootstrap ClassLoader):  主要负责加载<JAVA_HOME>\lib目录中的,或是-Xbootclasspath参数指定的路径中的，并且可以被虚拟机识别(仅仅按照文件名识别的)的类库到虚拟机内存中。它加载的是System.getProperty("sun.boot.class.path")所指定的路径或jar。
//    扩展类加载器(Extension ClassLoader):主要负责加载<JAVA_HOME>\lib\ext目录中的，或者被java.ext.dirs系统变量所指定的路径中的所有类库。它加载的是System.getProperty("java.ext.dirs")所指定的路径或jar。
//    应用程序类加载器(Application ClassLoader)：也叫系统类加载器，主要负责加载ClassPath路径上的类库，如果应用程序没有自定义自己类加载器，则这个就是默认的类加载器。它加载的是System.getProperty("java.class.path")所指定的路径或jar。


    /*
      当在命令行下执行：java HelloWorld(HelloWorld是含有main方法的类的Class文件)，JVM会将HelloWorld.class加载到内存中，并在堆中形成一个Class的对象HelloWorld.class。
      基本的加载流程如下：
      1)寻找jre目录，寻找jvm.dll，并初始化JVM；
      2)产生一个Bootstrap Loader（启动类加载器）；
      3)Bootstrap Loader，该加载器会加载它指定路径下的Java核心API，并且再自动加载Extended Loader（标准扩展类加载器），Extended Loader会加载指定路径下的扩展JavaAPI，并将其父Loader设为BootstrapLoader。
      4)Bootstrap Loader也会同时自动加载AppClass Loader（系统类加载器），并将其父Loader设为ExtendedLoader。
      5)最后由AppClass Loader加载CLASSPATH目录下定义的类，HelloWorld类。
     */

    public static void main(String[] args){
        ClassLoader classLoader = LoaderMain.class.getClassLoader();
        while(classLoader != null){
            System.out.println(classLoader.toString());
            classLoader = classLoader.getParent();
        }

    }
}
