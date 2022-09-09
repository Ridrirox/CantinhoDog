package br.com.Acessobd;

import javax.swing.JOptionPane;  
  
  
import javax.swing.UIManager;  
  
public class CaixaDeDialogo{  
      
    public static void main(String[]args){  
      
        String nome;  
        int verifica;  
    
        UIManager.put("OptionPane.cancelButtonText", "CANCELAR");  
        UIManager.put("OptionPane.yesButtonText", "SIM");      
        UIManager.put("OptionPane.noButtonText", "NÃO");    
        UIManager.put("OptionPane.okButtonText", "OK");   
     
            nome = JOptionPane.showInputDialog(null,"Olá! Digite seu nome:","Entrada",1);  
            while(nome.isEmpty()){  
                JOptionPane.showInputDialog("O campo nome deve ser preenchido");
            nome = JOptionPane.showInputDialog(null,"Olá! Digite seu nome:","Entrada",1);  
            }  
            verifica = JOptionPane.showConfirmDialog(null,nome+", você é maior de 18 anos?","Verificação",0);  
     
            if(verifica ==JOptionPane.YES_OPTION){  
                  
                JOptionPane.showMessageDialog(null,"Pode entrar.\nBom divertimento!");  
                }else{  
                      
                    verifica = JOptionPane.showConfirmDialog(null,nome+", Você só poderá entrar se estiver acompanhado por maior de 18 anos.\nVocê está acompanhado(a) com maior de 18 anos");  
      
                        if(verifica==JOptionPane.YES_OPTION){  
                        JOptionPane.showMessageDialog(null,"Pode entrar.\nBom divertimento!");  
                    }else{  
             
                        JOptionPane.showMessageDialog(null,"Você não pode entrar!");  
            }          
        }  
    }  
}  
  