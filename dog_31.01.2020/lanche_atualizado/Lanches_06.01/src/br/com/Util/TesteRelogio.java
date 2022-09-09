package br.com.Util;


import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class TesteRelogio extends JFrame  
{  
   private Container c;  
     
   public TesteRelogio()  
   {  
      super("Teste RELOGIO");  
      Relogio relogio = new Relogio();   
      c = getContentPane();  
      c.add(relogio, BorderLayout.BEFORE_FIRST_LINE);  
      setBounds(100,100,500,500);  
       setVisible(true);  
   }  
   public static void main(String args[])  
   {  
      TesteRelogio t = new TesteRelogio();  
      t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
   }  
}  


//Read more: http://javafree.uol.com.br/topic-9982-Sisteminha-de-Ponto-como-inserir-relogio-digital-em-java.html#ixzz2CXNc14dA