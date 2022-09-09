package br.com.Wiu;

import java.awt.*;  
import java.awt.event.*;  
  
import javax.swing.*;  
  
public class Calculadora extends JFrame implements ActionListener {  
    //campos para exibir os valores  
    private JTextField n1, n2, rst;  
    private JTextField op;//exibe tipo de operação  
    //botões das operações calculadora  
    private JButton soma, subt, div, mult, result;    
      
    //construtor  
    public Calculadora(){         
        //instância campos para exibir os valores  
        n1 = new JTextField(5);  
        op = new JTextField(1);  
        n2 = new JTextField(5);  
        rst = new JTextField(5);  
        //instância botões da calculadora  
        soma = new JButton("+");  
        subt = new JButton("-");  
        div = new JButton("/");  
        mult = new JButton("x");  
        result = new JButton("=");  
        //instância uma janela para os componetes  
        Container janela = getContentPane();  
        janela.setLayout(new FlowLayout());           
        //inclusão dos elementos no container  
        janela.add(n1);  
        janela.add(op);  
        janela.add(n2);  
        janela.add(result);          
        janela.add(rst);   
        janela.add(soma);  
        janela.add(subt);  
        janela.add(mult);  
        janela.add(div);  
        //associa receptor de ação aos botões  
        soma.addActionListener(this);  
        subt.addActionListener(this);  
        div.addActionListener(this);  
        mult.addActionListener(this);  
        result.addActionListener(this);   
        //define o frame  
        setSize(300,125);  
        setTitle("Calculadora");  
        setVisible(true);  
    }  
  
    @Override  
    public void actionPerformed(ActionEvent e) {  
        if(e.getSource() == soma){  
            op.setText("+");  
            if(op.equals("+") && (e.getSource() == result)){  
              int resultado = Integer.parseInt(n1.getText()) + Integer.parseInt(n2.getText());                 
              rst.setText(String.valueOf(resultado));    
            }  
        }  
  
        if (e.getSource() == subt){  
            op.setText("-");  
        }  
        if (e.getSource() == mult){  
            op.setText("x");  
        }  
        if (e.getSource() == div){  
            op.setText("/");  
        }  
          
    }     
    public static void main(String[] args) {  
        Calculadora c = new Calculadora();  
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        }  
  
}  