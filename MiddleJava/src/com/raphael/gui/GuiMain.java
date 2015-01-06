package com.raphael.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nov on 2015/1/6.
 * java图形编程（AWT及Swing）
 * 事件源,事件监听器
 */
public class GuiMain {
    public static void main(String[] args){
        FrameA mf = new FrameA();

        Container c = mf.getContentPane();  //获得容器
        JPanel p = new JPanel();
        Button b1 = new Button("Pull me");  //添加组件1
        b1.setSize(100,100);
        b1.addActionListener(new EventA());    //增加事件监听
        p.add(b1);

        Button b2 = new Button("Push me"); //添加组件1
        b2.setSize(100,100);
        p.add(b2);

        c.add(p);
        mf.setVisible(true);
    }
}
