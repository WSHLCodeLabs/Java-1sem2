import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FormLab13_2 extends JFrame{
    public FormLab13_2(){
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(new Animation1(),BorderLayout.CENTER);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class Animation1 extends JPanel implements ActionListener{
    int rad,count;
    boolean growth;
    public Animation1(){
        rad = 20; count = 0; growth = true;
        Timer t = new Timer(100, this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(getWidth()/2 - rad ,getHeight()/2 - rad , 2*rad, 2*rad);
    }

    public void actionPerformed(ActionEvent e) {
        if (growth){
            rad += 5;
            count++;
            if (count == 10) growth = false;
        } else { 
            rad -= 5;
            count--;
            if (count == 0) growth = true;
        }
        repaint();
    }
}
