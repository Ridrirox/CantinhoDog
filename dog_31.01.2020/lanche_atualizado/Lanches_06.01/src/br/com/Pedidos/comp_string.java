package br.com.Pedidos;

import javax.swing.*;
class comp_string
{
	public static void main (String args[]){        
    boolean palindrome = true;    
    String str = JOptionPane.showInputDialog ("Digite uma palavra: ");   
	int tam = str.length();
	
	if (tam > 0){
	
		int i=0, j=tam-1;
	   
	    do {
	       System.out.println("Testando se (" + i + ") == (" + j + ")");
	       if (str.charAt(i) != str.charAt(j)){            	   
	    	   palindrome = false;
	    	   // o break SAI do (do.. while)
	    	   // se quiser remover, tudo bem,  a unica coisa que faz eh
	    	   // deixar o metodo mais rapido
	    	   break;
	       }       
	       i++;
	       j--;                                      
	    } while (i<j); // pense por que eu faço esta condicao...
            // poderia ser ate i < tam -1... pq ?

	    System.out.println ("Palavra " 
	    		+ ((palindrome)? "" : "nao" ) // operador TERNARIO... (condicao) ? valor1 : valor2 ;
	    		+ " eh Palindrome.");            
	
		} else {

			System.out.println("Precisa digitar alguma coisa ...");
		}
	}
}
