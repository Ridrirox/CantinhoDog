package br.com.Acessobd;

import javax.swing.JOptionPane;  
  
/** 
* 
* @author guga 
*/  
public class clsPrincipal {  
  
    clsLayout layout = new clsLayout();  
  
    public clsPrincipal() {  
        confere();  
    }  
  
    private void confere(){  
        switch(layout.DesenharMenu()){  
            case 1:  
                JOptionPane.showMessageDialog(null,"Escolheu menu 1");  
            break;  
            case 2:  
                JOptionPane.showMessageDialog(null,"Escolheu menu 2");  
            break;  
            case 3:  
                JOptionPane.showMessageDialog(null,"Escolheu menu 3");  
            break;  
            default: JOptionPane.showMessageDialog(null,"opção invalida");  
        }  
    }  
  
  
    public static void main(String[] args) {  
        clsPrincipal principal = new clsPrincipal();  
    }  
  
}  