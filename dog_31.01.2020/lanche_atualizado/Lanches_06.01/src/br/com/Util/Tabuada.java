package br.com.Util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class Tabuada {
 
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    int i, n;
   // JOptionPane.showInputDialog("Digite o nome do Operador");
    //JOptionPane.showMessageDialog(this, "Boleto impresso com Sucesso!");
    System.out.printf("Informe o número para a tabuada:\n");
    n = ler.nextInt();
 
    FileWriter arq = new FileWriter("d:\\tabuada.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
 
    gravarArq.printf("+--Resultado--+%n");
    for (i=1; i<=10; i++) {
      gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
    }
    gravarArq.printf("+-------------+%n");
 
    arq.close();
 
    System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);
  }
 
}


//Leia mais em: Criando e Gravando dados em Txt com Java http://www.devmedia.com.br/criando-e-gravando-dados-em-txt-com-java/23060#ixzz2A5vWEKxS