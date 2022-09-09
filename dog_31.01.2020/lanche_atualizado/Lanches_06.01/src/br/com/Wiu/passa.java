package br.com.Wiu;

public class passa{     
  
   private String lista[] = new String[1];  //quantidadde para ser impressa
  
   public void setLista(String lista[]) {  
      this.lista = lista;  
   }  
  
   public String[] getLista() {  
      return lista;  
   }  
   // ESTE � UM METOTO CRIADO PARA ARMAZENAR UM ITEM DENTRO DA LISTA PASSANDO UM INDEX  
   public void setListaItem(String item,int index) {  
      this.lista[index] = item;  
   }  
   // ESTE � UM METOTO CRIADO PARA ARMAZENAR RETORNAR UM ITEM DA LISTA DE ACOROD COM O INDEX  
   public String getListaItem(int index) {  
      return lista[index];  
   }  
     
}    


