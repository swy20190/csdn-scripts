package com.company;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws AWTException {
	// write your code here
        Robot commenter = new Robot();
        //鼠标准备
        commenter.delay(3000);
        //先来个5下
        for(int i=0;i<5;i++){
            commenter.mousePress(InputEvent.BUTTON1_MASK);
            commenter.mouseRelease(InputEvent.BUTTON1_MASK);
            commenter.delay(200);
            commenter.mousePress(InputEvent.BUTTON1_MASK);
            commenter.mouseRelease(InputEvent.BUTTON1_MASK);
            commenter.delay(2000);
            //开始输入
            commenter.keyPress(KeyEvent.VK_CONTROL);
            commenter.keyPress(KeyEvent.VK_V);
            commenter.delay(100);
            commenter.keyRelease(KeyEvent.VK_V);
            commenter.keyRelease(KeyEvent.VK_CONTROL);
            commenter.delay(200);
            //commit comment
            Point p = MouseInfo.getPointerInfo().getLocation();
            commenter.mouseMove((int)p.getX(),(int)p.getY()+78);
            commenter.delay(200);
            commenter.mousePress(InputEvent.BUTTON1_MASK);
            commenter.mouseRelease(InputEvent.BUTTON1_MASK);
            p = MouseInfo.getPointerInfo().getLocation();
            commenter.mouseMove((int)p.getX(),(int)p.getY()-78);
            commenter.delay(1000);
        }
    }
}

