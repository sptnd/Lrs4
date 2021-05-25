package Lrs5;

import javax.swing.*;
import java.awt.*;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/25 23:32
 */
public class NoHelloWorld {
    public static void main(String[] args){
        EventQueue.invokeLater(() ->
        {
            var frame = new NotHelloWorldFrame();
            frame.setTitle("凌瑞松");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class NotHelloWorldFrame extends JFrame{
    public NotHelloWorldFrame(){
        add(new NotHelloWorldComponent());
        pack();
    }
}

class NotHelloWorldComponent extends JComponent{
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g){
        g.drawString("凌瑞松大帅哥呀！！",MESSAGE_X,MESSAGE_Y);
    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
