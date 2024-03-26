import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Form2 {
    public Form2(){
        JFrame f = new JFrame();
        Container cp = f.getContentPane();
        cp.setLayout(null);
        JLabel l1 = new JLabel("USER :");
        JLabel l2 = new JLabel("Car lisence:");
        JTextField t = new JTextField("",40);
        JPasswordField p = new JPasswordField("",20);
        JButton b = new JButton("Ok");
        JLabel l3 = new JLabel("Province :");
        JLabel l4 = new JLabel("Car Type :");
        JRadioButton r1 = new JRadioButton("Car",true);
        JRadioButton r2 = new JRadioButton("Bike");
        ButtonGroup  g = new ButtonGroup(); g.add(r1); g.add(r2);
        l1.setBounds(36, 10, 50, 25);
        l2.setBounds(5, 40, 70,25);
        t.setBounds(80, 10, 150, 25);
        p.setBounds(80, 40, 150, 25);
        l3.setBounds(19, 70, 70, 25);
        l4.setBounds(18, 100, 100, 25);
        b.setBounds(80, 135, 90,  25);
        r1.setBounds(75, 101, 50, 25);
        r2.setBounds(125, 101, 70, 25);
        cp.add(l1); cp.add(l2); cp.add(t); cp.add(p); cp.add(b);
        cp.add(l3); cp.add(l4); cp.add(r1); cp.add(r2);

        JComboBox<String> c = new JComboBox<>();
        try {
            File fi = new File("Thailand_PRV.csv");
            FileReader fr = new FileReader(fi);
            BufferedReader br = new BufferedReader(fr);
            String s;
            br.readLine();
            while ((s = br.readLine()) != null) {
                String arr[] = s.split(",");
                c.addItem(arr[1]);
            }
            br.close(); fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        c.setBounds(80, 70, 150, 25);
        c.setSelectedIndex(1);
        cp.add(c);
        
        f.setSize(280, 225);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


