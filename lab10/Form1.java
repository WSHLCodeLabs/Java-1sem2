import java.awt.*;
import javax.swing.*;

public class Form1 extends JFrame {
    public Form1(){
        super("Checker");
        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        
        JPanel detail = createJPanel1();
        JPanel Table = createPanel2();
        cp.add(Table);
        cp.add(detail);

        ImageIcon img = new ImageIcon("Chess_icon.png");
        this.setIconImage(img.getImage());
        
        this.pack(); 
        this.setVisible(true);
        this.setLocation(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public JPanel createJPanel1(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JLabel L1 = new JLabel("Game Panel.");
        L1.setHorizontalAlignment(JLabel.CENTER);
        L1.setVerticalAlignment(JLabel.BOTTOM);
        L1.setFont(new Font("Times New Roman", Font.BOLD , 20));
        JLabel L2 = new JLabel("Time Passed : 00.00");
        L2.setHorizontalAlignment(JLabel.CENTER);
        JButton b = new JButton("START");
        c.gridx = 0; c.gridy = 0; c.ipadx = 100; c.ipady = 50; 
        p1.add(L1,c);
        c.gridy = 1; 
        p1.add(L2,c);
        c.gridy = 2; c.ipadx = 20; c.ipady = 15;
        p1.add(b,c);
        return p1;
    }

    public JPanel createPanel2(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(8,8));
        JButton bt[][] = new JButton[8][8];
        for (int i = 0; i < 8 ; i++){
            for (int j = 0 ; j < 8 ; j++){
                bt[i][j] = new JButton();
                bt[i][j].setPreferredSize(new Dimension(50,50));
                if ((i+j) % 2 == 0)
                    bt[i][j].setBackground(Color.black);
                else 
                    bt[i][j].setBackground(Color.white);
                p.add(bt[i][j]);
            }
        }
        return p;
    }
}
