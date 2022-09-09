package br.com.Util;

import javax.swing.JOptionPane;  
  
public class TabuadaF1a10c {  
    public static void main (String []args){  
    String ex = "";  
  
        for(int a =1;a<=10;a++){  
            for(int b=1;b<=5;b++){  
                ex +=(b+ "x" +a+ "=" +(b*a)+"              ");  
            }         
                ex +=(" ");  
                ex +=("\n");  
                  
        }  
                ex +=(" ");  
                ex +=("\n");  
        for(int a =1;a<=10;a++){  
            for(int b=6;b<=10;b++){  
                ex +=(b+ "x" +a+ "=" +(b*a)+"            ");  
            }         
                ex +=(" ");  
                ex +=("\n");  
                  
        }     
                JOptionPane.showMessageDialog(null, ex);                  
    }  
}  