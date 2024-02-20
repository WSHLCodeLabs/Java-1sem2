import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class FormLab11_1 extends JFrame implements ActionListener{
    
    JTextField user;
    JPasswordField pass;

    public FormLab11_1(){
        super("Login");
        Container cp = this.getContentPane();
        cp.setLayout(null);
        JLabel L1 = new JLabel("USER : ");
        JLabel L2 = new JLabel("Password : ");
        user = new JTextField();
        pass = new JPasswordField();
        JButton b = new JButton("Login");
    
        b.addActionListener(this);
        
        L1.setBounds(34,10,46,25);
        L2.setBounds(10,40,70,25);
        user.setBounds(80, 10, 120, 25);
        pass.setBounds(80, 40, 120, 25);
        b.setBounds(80, 70, 70, 30);
        cp.add(L1);cp.add(L2);cp.add(b);cp.add(user);cp.add(pass);
        this.setSize(225, 150);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        
        String stUser = user.getText();
        String stPass = String.valueOf(pass.getPassword());

        if ((!stUser.equals("")) && (!stPass.equals(""))){
            try {
                File f = new File("./user_table.csv");
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String s;
                boolean complete = false;
                br.readLine();
                while ((s = br.readLine()) != null){
                    String arr[] = s.split(",");
                    if(arr[0].equals(stUser) && arr[1].equals(stPass)){
                        complete = true;
                        Popup("Login Complete !!!");
                        this.setVisible(false);
                        break;
                    }
                }
                if(!complete){
                    Popup("User or Password incorrect.");
                }
                br.close(); fr.close();
            } catch (Exception e1) {
                System.out.println(e1);
            }
        } else 
            Popup("Plz input Username or Password.");
    }

    public void Popup(String s){
        JDialog d = new JDialog();
        d.getContentPane().setLayout(new FlowLayout());
        d.getContentPane().add(new JLabel(s));
        d.pack();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }

    
}
