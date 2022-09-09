package br.com.Pedidos;

import java.util.Scanner;

public class Principal {

 int numero;
 String dono;
 double saldo;
 double limite;

//método construtor
      public static void main (String args[]){
      //this.saldo = 100; // todo objeto criado inicia com 100 reais de saldo
      //o this serve pra dizer que se refere ao saldo dessa classe
          Scanner entrada = new Scanner(System.in);
          Conta conta1 = new Conta();
          double valor;
          //conta1.sacar(50);
          int resposta=1;
          while (resposta ==1){
              
              int opcao;
              System.out.println("Escolha uma opcao a baixo!");
              System.out.println("(1) Saque");
              System.out.println("(2) Saldo");
              System.out.println("(3) Deposito");
              opcao = entrada.nextInt();
              
              switch (opcao){
                  case 1:
                      System.out.println("Digite o valor do saque!");
                      valor = entrada.nextDouble();
                      conta1.sacar(valor);
                      break;
                  case 2:
                     // System.out.println("Digite o valor do saque!");
                      //valor = entrada.nextDouble();
                      conta1.imprimirSaldo();
                      break;
                  case 3:
                      System.out.println("Digite o valor do deposito!");
                      valor = entrada.nextDouble();
                      conta1.depositar(valor);
                      break;
                 
                  default: 
                      System.out.println("Voce digitou uma opcao invalidad!");
                      break;
              }
          
                      System.out.println("\nDeseja realizar outra operacao? (1)Sim ou (2) Não");
                      resposta = entrada.nextInt();
                      if (resposta != 1){
                          System.out.println("Obrigado por fazer suas escolha...Fim");
                      }
          
          }//fin while
          
          
}

 
}
