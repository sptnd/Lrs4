package Lrs4;


import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/25 22:12
 */
public class InnerClassTest {
    public static void main(String[] args){
        var clock = new TalkingClock(1000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"退出系统？");
        System.exit(0);
    }
}
class TalkingClock{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval,boolean beep){
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        var listener = new TimePrinter();
        var timer = new Timer(interval,listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("现在时间是："+ Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
