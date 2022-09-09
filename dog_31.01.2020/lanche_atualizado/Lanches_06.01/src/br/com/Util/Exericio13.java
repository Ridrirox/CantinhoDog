package br.com.Util;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Gerlandio da Silva Lucena(Webforcraft)
 */
public class Exericio13 extends JFrame implements ActionListener{

    JLabel lbl1,lbl2;
    JTextField txt1;
    JPasswordField pass1;
    
     Exericio13()
    {
    setTitle("Caixa de password!");
    setBounds(200,50,350,85);
    getContentPane().setBackground(new Color(123,143,154));
    getContentPane().setLayout(new GridLayout(2,2));
    lbl1 = new JLabel("Digite a senha");
    lbl1.setForeground(Color.black);
    lbl2 = new JLabel("Validação");
    lbl2.setForeground(Color.black);
    lbl1.setFont(new Font("", Font.BOLD,14));
    lbl2.setFont(new Font("", Font.BOLD,14));
    txt1= new JTextField();
    txt1.setForeground(Color.red);
    pass1 = new JPasswordField();
    pass1.setEchoChar('*');
    pass1.addActionListener(this);
    getContentPane().add(lbl1);
    getContentPane().add(pass1);
    getContentPane().add(lbl2);
    getContentPane().add(txt1);
    }
    
    public void actionPerformed(ActionEvent e)
    {
      if(new String(pass1.getPassword()).equals("JAVA"))
      {txt1.setText("Senha Valida");}
      else
      {txt1.setText("Senha Invalida!");}
    }
    
    public static void main(String[] args) {
        JFrame password= new Exericio13();
        password.setUndecorated(true);
        password.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        password.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        password.setVisible(true);
        
        
        
    }
}
