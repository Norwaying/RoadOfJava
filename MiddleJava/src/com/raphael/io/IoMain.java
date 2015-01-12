package com.raphael.io;

/**
 * Created by Nov on 2015/1/6.
 * IO操作
 * 文件访问
 * 网络访问
 * 内存缓存访问
 * 线程内部通信(管道)
 * 缓冲
 * 过滤
 * 解析
 * 读写文本 (Readers / Writers)
 * 读写基本类型数据 (long, int etc.)
 * 读写对象（序列化ObjectInputStream）
 */
public class IoMain {
    //一、节点流（ 该类型可以从或者向一个特定的地点或者节点读写数据）
    /*
    File              FileReader/FileWriter                       FileInputStream/FileOutputStream
    MemoryArray       CharArrayReader/CharArrayWriter             ByteArrayInputStream/ByteArrayOutputStream
    MemoryString      StringReader/StringWriter
    Pipe              PipedReader/PipedWriter                     PipedInputStream/PipedOutputStream
     */

    //二、处理流（该类型是对一个已存在的流的连接和封装，通过所封装的流的功能调用实现数据读写，处理流的构造方法总是要带一个其他流对象作为参数，一个流对象进过其他流的多次包装，叫做流的链接）
    /*
          1.缓冲流
          BufferedInputStream/BufferedOutputStream
          BufferedReader/BufferedWriter

          2.转换流
          InputStreamReader/OutputStreamWriter

          3.数据流
          DataInputStream/DataOutputStream

          4.打印流
          PrintStream/PrintWriter

          5.对象流
          ObjectInputStream/ObjectOutputStream

          6.过滤流
          FilterReader/FilterWriter   FilterInputStream/FilterOutputStream
     */

    public static void main(String[] args){

    }
}
