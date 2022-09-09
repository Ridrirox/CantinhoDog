package br.com.Util;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Gerlandio da Silva Lucena(WebforCraft)
 */
public class Exercicio12 extends JFrame implements ActionListener{

    
    JLabel lbl1, lbl2, lbl3;
    JButton btn1, btn2, btn3, btn4, btn5;
    JTextField txt1, txt2,txt3;
    
    public Exercicio12()
    {
        setTitle("Calculadora");
        setBounds(300,50,350,90);
        getContentPane().setBackground(new Color(123,120,245));
        getContentPane().setLayout(new GridLayout(3,4));
        lbl1 = new JLabel("Num.1");
        lbl2 = new JLabel("Num. 2");
        lbl3 = new JLabel("Total");
        lbl1.setForeground(Color.black);
        lbl2.setForeground(Color.black);
        lbl3.setForeground(Color.red);
        btn1 = new JButton("+"); btn1.addActionListener(this);
        btn2 = new JButton("-"); btn2.addActionListener(this);
        btn3 = new JButton("*"); btn3.addActionListener(this);
        btn4 = new JButton("/"); btn4.addActionListener(this);
        btn5 = new JButton("Limpar"); btn5.addActionListener(this);
        btn5.setBackground(Color.black);
        btn5.setForeground(Color.red);
        txt1 = new JTextField(); 
        txt2= new JTextField();
        txt3 = new JTextField();
        txt3.setEditable(false);
        getContentPane().add(lbl1);
        getContentPane().add(txt1);
        getContentPane().add(lbl2);
        getContentPane().add(txt2);
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(btn3);
        getContentPane().add(btn4);
        getContentPane().add(lbl3);
        getContentPane().add(txt3);
        getContentPane().add(btn5);
        
    }
    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource() == btn5)
     {
      txt1.setText("");txt2.setText("");txt3.setText("");
     }
     float n1=0,n2=0,resultado=0;
     try
     {
        n1= Float.parseFloat(txt1.getText());
        n2 = Float.parseFloat(txt2.getText());
        
        
     }
     catch(NumberFormatException erro)
     {
        txt3.setText("Err0");
     }
     if(e.getSource()== btn1)
         resultado= n1+n2;
     if(e.getSource()== btn2)
         resultado = n1-n2;
     if(e.getSource()== btn3)
         resultado = n1* n2;
     if(e.getSource()== btn4)
         resultado =n1/n2;
         
     txt3.setText(""+resultado);
    }
    public static void main(String[] args) {
        JFrame calc = new Exercicio12();
        calc.setUndecorated(true);
        calc.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}
