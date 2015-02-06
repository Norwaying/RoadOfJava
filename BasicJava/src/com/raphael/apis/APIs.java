package com.raphael.apis;

/**
 * Created by Administrator on 2015/2/5.
 * java之路
 * 0.JDK|JRE|JVM
 * 1.基本语法
 * 2.常用api
 * 3.框架与模式
 * 4.业务逻辑
 */
public class APIs {
    /*
    jdk里常用APIs
    1.集合框架、2.IO系统、3.GUI、4.数据库、5.网络、6.多线程、7.xml
    一、集合框架(从容器看问题,往容器的槽里面存放对象的引用):

     1、Collection：容器的每一个槽只能存放一个元素
       1)Set: 容器中的元素=对象引用，所以引用不能重复
          ①HashSet
          ②TreeSet
          ③LinkedHashSet


       2)List:容器中元素=对象引用+序号，所以引用可以重复，
          ①LinkedList：
          ②ArrayList：



       3)Quene:容器只有一个进口和一个出口，就像一根水管一样


      2、Map：容器的每个槽里面可以放两个对象引用，他们形成映射的关系
         ①HashMap：
         ②TreeMap
         ③LinkedHashMap

      3、工具类：
       ①Collections
       ②Arrays
       ③Iterator
       ④Comparable
       ⑤Comparator






 二、IO系统(从流的角度看问题：输入流->内存->输出流,内存与外 设之间数据的交互)
     1、字符流：基于字节的包装而成
         ①字符输入流：Reader  外设的数据流向内存，字符管道
         ②字符输出流：Writer 内存的数据流向外设，字符管道

     2、字节流：
          ①字节输入流：InputStream 外设流向内存的字节管道
          ②字节输出流：OutputStream 内存流向外设的字节管道


     3、文件和目录的抽象：
         File：映射硬盘上面的一个文件或者目录，用这个对象
来间接操作硬盘上面的文件


      4、基于以上流的包装：
           ①FileInputStream/FileOutputStream
             FileReader/FileWriter:增加文件操作
           ②BufferedReader/BufferedWriter
             BufferedInputStream/BufferedOutputStream
               :增加缓存功能
           ③Object**:操作对象
           ④Data***：操作基本数据类型和类类型
           ⑤Piped***：连接多个流
           ⑥。。。

        流像一个通道，根据不同的需要，有不同的样式，如水管、
煤气管、电线、网线(光纤、铜缆、双绞线)、水泥路、铁路、海道、
空道、电磁波……都是将对象由一个地方传导到另一个地方，好像就是物质运动的介质和形式的一个抽象。






三、GUI设计(与用户打交道的脸面，脸面不做好，何以为人？)
   1、组件：脸面上面的一个个功能小模块
      ①awt组件：与机器平台相关的组件
      ②Swing组件：独立于平台的组件，推荐使用
      ③swt组件：开源的界面组件、与Swing类似
   2、组件布局：在脸面上面怎么摆弄这些组件
   3、事件机制：为组件模块添加动态行为

四、数据库：
  1、基本的SQL语句掌握
  2、建库、连接数据库、编程
  3、编程：①加载驱动
           ②连接数据库
           ③执行SQL
           ④读写数据：对数据操作
           ⑤关闭连接，释放资源

五、网络：java网络编程只涉及到应用层和传输层
  1、传输层：
     1)TCP协议：像银行开的传输专线一样，相对来说可靠和稳定。

①Socket:连接远程主机、发送数据、
                         接收数据、关闭连接
                ②ServerSocket：绑定端口、监听入站数据、
                      在端口上面接收客户端连接


     2)UDP协议：像我们普通的家庭宽带一样，不稳定也不可靠。

①DatagramPacket：发送数据和接收数据两种
                ②DatagramSockek：自寻址套接字，分客户机套接 字和服务器套接字


     3)Port:端口 与进程关联。


  2、应用层：
       1)URL: 统一资源定位器，表示Internet上的某一资源
             protocol://resourceName
          ①传输协议名：http、ftp、gopher、file
          ②资源名：资源的完整路径名，主机+端口号+文件名

2)URLConnection


  3、通信模型：
      ①进程A——Socket<——> Socket——进程B
       ②套接字是两个通信进程之间的桥梁，所以要熟练掌握Socket的使用


六、多线程：
    1、多线程是什么：进程被分割为多个执行流，这些不同的执行流称之为多线程。如果把一个企业称为一个进程，那么这个企业里面的每一个员工就是一个线程，每一个员工按照自己的方式为企业盈利。多线程从宏观上面看是并行的，而从微观实际(cpu的执行)看是串行的。


   2、两种创建线程的方式：
          ①继承Thread，并覆盖run()
          ②实现Runnable接口：灵活


   3、线程的生命周期：
         ①新生：线程被创建出来了，
         ②就绪：调用了start方法
         ③运行：线程被cpu执行中
         ④死亡：cpu将线程执行完
         ⑤阻塞：线程没有被分配CPU时间，无法执行，一直等待


   4、线程的优先级：等级越高，越容易被CPU执行
   5、线程同步：对共享资源的独占


七、XML操作
    1：XML是什么：可扩展标记语言，与HTML类似
         ①文档声明：
         ②元素
         ③属性
         ④注释
         ⑤CDATA区、特殊字符
         ⑥处理指令
     2、XML约束：
        ①XML DTD
        ②XML Schema

     3、XML解析：增删改查
      1)dom:文档对象模型，将整个当成一个树状结构的对象，
              ①耗内存
              ②因为都放内存里面， 处理的速度就快了
              ③适用于小文档增删改查
      2)sax:Simple API for XML，事实标准，读一行解析一行
              ①频繁与外设交互，速度慢
              ②节约内存
              ③适用于大文档的读操作


    4、常用XML解析包：
          ①JaxP包：包含在JavaSE里面
          ②dom4J包：性能优异
          ③Xpath

     */
}
