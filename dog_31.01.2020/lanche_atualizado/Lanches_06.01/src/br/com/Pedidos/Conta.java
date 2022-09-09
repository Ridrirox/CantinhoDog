package br.com.Pedidos;

public class Conta {
     
       int numero;
       String dono;
       double saldo;
       double limite;
       
 public Conta(){
     
       this.saldo = 100;
     
 }      


boolean sacar(double valor) {
  if (valor > saldo) {
   System.out.print("Saldo insuficiente");
   return false;
  } else

  saldo = saldo - valor;
  System.out.print("Seu saldo agora é: " + saldo);
  return true;
 }
void depositar(double valor){
    saldo = saldo + valor;
    
}
void imprimirSaldo(){
    System.out.println(saldo);
}
}