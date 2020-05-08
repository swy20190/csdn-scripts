package com.company;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;
public class Main {
    public static void main(String[] args) throws AWTException {
        // write your code here
        Robot writer = new Robot();
        writer.delay(3000);
        for(int i=0;i<5;i++) {

            writer.delay(300000);
            //title
            for (int j = 0; j < 5; j++) {
                writer.mouseMove(140, 100);
            }
            writer.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            writer.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            writer.delay(1000);
            writer.keyPress(KeyEvent.VK_1);
            writer.keyRelease(KeyEvent.VK_1);
            writer.delay(300);
            writer.keyPress(KeyEvent.VK_1);
            writer.keyRelease(KeyEvent.VK_1);
            writer.delay(300);
            writer.keyPress(KeyEvent.VK_4);
            writer.keyRelease(KeyEvent.VK_4);
            writer.delay(3000);
            //content
            writer.mouseMove(140, 300);
            writer.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            writer.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            writer.keyPress(KeyEvent.VK_CONTROL);
            writer.keyPress(KeyEvent.VK_V);
            writer.keyRelease(KeyEvent.VK_CONTROL);
            writer.keyRelease(KeyEvent.VK_V);
            writer.delay(3000);
            //go to release
            writer.mouseMove(1400, 100);
            writer.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            writer.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            //选择专栏
            writer.mouseMove(650, 305);
            writer.delay(500);
            writer.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            writer.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            writer.delay(1000);
            writer.keyPress(KeyEvent.VK_C);
            writer.keyRelease(KeyEvent.VK_C);
            writer.delay(500);
            writer.keyPress(KeyEvent.VK_E);
            writer.keyRelease(KeyEvent.VK_E);
            writer.delay(500);
            writer.keyPress(KeyEvent.VK_S);
            writer.keyRelease(KeyEvent.VK_S);
            writer.delay(500);
            writer.keyPress(KeyEvent.VK_H);
            writer.keyRelease(KeyEvent.VK_H);
            writer.delay(500);
            writer.keyPress(KeyEvent.VK_1);
            writer.keyRelease(KeyEvent.VK_1);
            //select 文章类型
            writer.mouseMove(730, 588);
            writer.delay(2000);
            writer.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            writer.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            writer.delay(2000);
            writer.mouseMove(730, 591);
            writer.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            writer.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            writer.delay(2000);
            writer.mouseMove(980, 800);
            writer.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            writer.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            writer.delay(500);
            //one more :-)
            for (int j = 0; j < 5; j++) {
                writer.mouseMove(900, 560);
            }
            writer.delay(1000);
            writer.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            writer.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        }
    }
}
