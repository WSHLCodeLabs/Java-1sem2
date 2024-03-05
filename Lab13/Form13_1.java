import java.awt.*;
import javax.swing.*;


public class FormLab13_1 extends JFrame{
    public FormLab13_1(){

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(new Draw1(),BorderLayout.CENTER);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class Draw1 extends JPanel {
    public void paintComponent(Graphics g){
        g.drawString("Just keep smiling.", 100, 50);
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.fillOval(getWidth()/2 - 75 , getHeight()/2 - 75 , 150, 150);
        g.setColor(Color.black);
        g.drawOval(getWidth()/2 - 75 , getHeight()/2 - 75 , 150, 150);
        g.setColor(Color.black);
        g.fillOval(95, 100,25, 25);
        g.setColor(Color.black);
        g.fillOval(165, 100,25, 25);
        g.drawArc(95, 125, 100, 65, 0, -180);
    }
}

