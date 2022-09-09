package br.com.Util;

import java.awt.GridLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;  
  
/** 
 * 
 * @author Sekkuar 
 */  
public class TesteDecimalField extends JFrame {  
  
    JFormattedTextField numero = new DecimalFormattedField(DecimalFormattedField.NUMERO);  
    JFormattedTextField real = new DecimalFormattedField(DecimalFormattedField.REAL);  
    JFormattedTextField porcentagem = new DecimalFormattedField(DecimalFormattedField.PORCENTAGEM);  
  
    public TesteDecimalField() {  
        setLayout(new GridLayout(7, 1, 5, 5));  
          
        add(new JLabel("Valor numérico:"));  
        add(numero);  
  
        add(new JLabel("Valor monetário:"));  
        add(real);  
  
        add(new JLabel("Valor porcento:"));  
        add(porcentagem);  
        JButton button = new JButton("Mostrar Valores");  
          
        button.addActionListener(new ActionListener(){  
  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                /** 
                 * em versões do java anteriores à 7 
                 * utilize (Double) para fazer o cast ao inves de (double) 
                 */  
                double valor1 = (Double) numero.getValue();                                     
                double valor2 = (Double) real.getValue();  
                double valor3 = (Double) porcentagem.getValue();  
                  
                String valor = valor1+"\n"+valor2+"\n"+valor3;  
                  
                JOptionPane.showMessageDialog(TesteDecimalField.this, valor, "Valores", JOptionPane.INFORMATION_MESSAGE);  
            }  
              
        });  
          
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        add(button);  
        pack();  
    }  
      
    public static void main(String...args){  
        new TesteDecimalField().setVisible(true);  
    }  
}  


//Read more: http://javafree.uol.com.br/artigo/884545/Campo-formatado-para-valores-decimais.html#ixzz29DTX1v7g