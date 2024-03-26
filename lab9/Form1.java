import java.awt.*;
import javax.swing.*;

public class Form1 {
   public Form1(){
        JFrame f = new JFrame();
        Container cp = f.getContentPane();
        cp.setLayout(null);
        JLabel l1 = new JLabel("USER :");
        JLabel l2 = new JLabel("Password :");
        JTextField t = new JTextField("",20);
        JPasswordField p = new JPasswordField("",20);
        JButton b = new JButton("Login");
        l1.setBounds(36, 10, 50, 25);
        l2.setBounds(10, 40, 70, 25);
        t.setBounds(80, 10, 150, 25);
        p.setBounds(80, 40, 150, 25);
        b.setBounds(80, 75, 90,  30);
        cp.add(l1); cp.add(l2); cp.add(t); cp.add(p); cp.add(b);
        f.setSize(260, 155);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
   }