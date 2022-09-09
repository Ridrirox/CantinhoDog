package br.com.Acessobd;

import javax.swing.JOptionPane;

public class Detalhe2 {
   
    public static void main(String[] args){
        //variaveil
       
       //int c;
       //c = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero:"+"\n"+"Nº1 - Completo,"
              // +"\n"+"Nº2 - Maionese e Cebola,"+"\n"+"Nº3 - Ervilha, Batata e Cebola"));
       for(int i=1;i<=3;i++){
        Object[] selectionValues = { "Ervilha","Batata", "Cebola", "Completo"};
        String initialSelection = "Ervilha";
        Object selection = JOptionPane.showInputDialog(null, "Qual seu Pedido Favorito?",
        "Detalhe do Pedido", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        System.out.println(selection);;
        if(selection.equals("Completo")){
            JOptionPane.showMessageDialog(null,"Voce escolheu completo");
            break; //sai do laço
        }
        
        System.out.println(selection);
        
        //JOptionPane.showMessageDialog(null,"Escolha!"+selection);  
      
                
       }  
         //JOptionPane.showMessageDialog(null,"Escolha seu pedido!");
    } //fim do main
} //fim da classe