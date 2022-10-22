package JavaSwings;

import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        ABC obj = new ABC();
    }
}
class ABC extends JFrame{
    public ABC(){
        JLabel l = new JLabel("SWING GUI");
        JLabel m = new JLabel("SWING DEMO");
        add(l);
        add(m);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
//        setVisible(true);
//        setSize(400, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setDefaultCloseOperation(3);
    }
}