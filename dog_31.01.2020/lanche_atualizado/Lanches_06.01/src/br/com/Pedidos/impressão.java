package br.com.Pedidos;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintStream;

import java.io.PrintWriter;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class impressão {


//     cria txt

    public static void criaTxt(){

          try{
                File arquivo = new File("/biblioteca/cupom/comanda.txt");
                if(arquivo.exists()){
                    //se existir
                    FileWriter arquivoTxt = new FileWriter(arquivo, true);
                    PrintWriter linhasTxt = new PrintWriter(arquivoTxt);

                    linhasTxt.println("===========================================");
                    linhasTxt.println("              Nome da empresa              ");
                    linhasTxt.println("===========================================");
                    linhasTxt.println("********** NAO E DOCUMENTO FISCAL *********");
                    linhasTxt.println("===========================================");
                    linhasTxt.println("PRODUTO      QTDE      VALOR UN.      VALOR");
                    //dados da tabela

                    linhasTxt.println();
                    linhasTxt.println("===========================================");
                    linhasTxt.println("SubTotal                            ");
                    linhasTxt.println("                   ------------------------");
                    linhasTxt.println("Total                                ");
                    linhasTxt.println("===========================================");
                    linhasTxt.println("       MENSAGEM DA EMPRESA VAI AQUI        ");
                    linhasTxt.println("   INFORMACOES PARA FECHAMENTO DE CONTA    ");

                    int i = 0;
                    while(i < 10){
                        i++;
                        linhasTxt.println();
                    }                
                    arquivoTxt.close();
                    emiteComanda();

                }else{
                    //se naum existir
                    arquivo.createNewFile();
                    criaTxt();
                }
          }catch(IOException error){
              System.out.println("nao encontrei arquivo");
          }


       }
//    imprime txt

     public static void emiteComanda(){

           try {
                java.io.InputStream is = new FileInputStream("/biblioteca/cupom/comanda.txt");
                Scanner sc = new Scanner(is);
                FileOutputStream fs = new FileOutputStream("COM5:");
                PrintStream ps = new PrintStream(fs);

                while(sc.hasNextLine()){
                    String linhas = sc.nextLine();
                    ps.println(linhas);
                }
                fs.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ""+ex);   //Aqui da como acesso negado
            }        
       }
}