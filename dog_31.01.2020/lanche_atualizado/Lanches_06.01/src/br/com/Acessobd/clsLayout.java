package br.com.Acessobd;

import javax.swing.JOptionPane;  
  
public class clsLayout {     
  
    public int DesenharMenu(){  
          
        String desenha =  "1 - Menu 1\n"  
                        + "2 - Menu 2\n"  
                        + "3 - Menu 3\n\n"  
                        + "Escolha uma opção: " ;  
  
        int escolheu = Integer.parseInt(JOptionPane.showInputDialog(desenha));  
  
        return escolheu; //retorna o menu escolhido  
    }  
  
}  