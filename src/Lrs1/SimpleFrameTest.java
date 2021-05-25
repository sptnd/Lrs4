package Lrs1;

import javax.swing.*;
import java.awt.*;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/24 23:59
 */
public class SimpleFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->
        {
            var frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
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
