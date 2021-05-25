package Lrs2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/25 21:28
 */
public class TimerTest {
    public static void main(String[] args){
        var listener = new TimePrinter();
        var timer = new Timer(1000,listener);
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("the time is:"+ Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
