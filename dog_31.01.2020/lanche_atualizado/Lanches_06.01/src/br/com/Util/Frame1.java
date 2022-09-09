package br.com.Util;

import java.awt.Dimension;  
import java.awt.Toolkit;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JTextField;  
  
  
public class Frame1 extends JFrame {  
     
   public Frame1() {  
   setSize(400,300);  
   getContentPane().setLayout(null);  
   setDefaultCloseOperation(EXIT_ON_CLOSE);  
   centralizar();  
     
   JLabel lnome = new JLabel("Nome");  
   lnome.setSize(80,20);  
   lnome.setLocation(5,20);  
   add(lnome);  
     
   final JTextField nome = new JTextField();  
   nome.setSize(140,20);  
   nome.setLocation(45,20);  
   nome.setEditable(false);  
   add(nome);  
     
   JButton b = new JButton();  
   b.setSize(100,25);  
   b.setLocation(20, 80);  
   b.setText("Add nome");  
   b.addActionListener(new ActionListener() {  
        
      @Override  
      public void actionPerformed(ActionEvent arg0) {  
         Frame2 f2 = new Frame2(nome);  
         f2.setVisible(true);  
           
      }  
   });  
   add(b);  
   }  
     
   public static void main (String args[]){  
      Frame1 f = new Frame1();  
      f.setVisible(true);  
        
   }  
    public void centralizar() {  
        Dimension dScreen = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension dJanela = this.getSize();  
  
        if (dJanela.height > dScreen.height) {  
            setSize(dJanela.width, dScreen.height);  
        }  
        if (dJanela.width > dScreen.width) {  
            setSize(dScreen.width, dJanela.height);  
        }  
        this.setLocation((dScreen.width - dJanela.width) / 2, (dScreen.height - dJanela.height) / 2);  
    }  
  
}  

