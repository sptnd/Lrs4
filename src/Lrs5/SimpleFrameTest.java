package Lrs5;

import javax.swing.*;
import java.awt.*;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/25 23:16
 */
public class SimpleFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->
        {
            var frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("凌瑞松的第一个窗口标签");
        });
    }
}
class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    public SimpleFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
