package br.com.Pedidos;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import javax.swing.event.*;

public class Estudos extends JFrame{
  private boolean ALLOW_COLUMN_SELECTION = false;
  private boolean ALLOW_ROW_SELECTION = true;
  
  public Estudos(){
    super("Exemplo de uma tabela simples");
		
    // colunas da tabela
    String[] colunas = {"Cidade", "Estado", "Habitantes"};
		
    // conteúdo da tabela	
    Object[][] conteudo = {
        {"Goiânia", "GO", "43.023.432"},
        {"São Paulo", "SP", "5.343.234"},
        {"Rio de Janeiro", "RJ", "6.434.212"},
        {"Jussara", "GO", "87.454"},
        {"Barra do Garças", "MT", "64.344"}
    };
        
    // constrói a tabela
    final JTable tabela = new JTable(conteudo, colunas);
    tabela.setPreferredScrollableViewportSize(new Dimension(350, 50));
	
	// permite selecionar apenas uma linha de cada vez
	tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	// detecta seleções de linha
	if(ALLOW_ROW_SELECTION){ // verdadeiro por padrão
      ListSelectionModel rowSM = tabela.getSelectionModel();
      rowSM.addListSelectionListener(new ListSelectionListener(){
         public void valueChanged(ListSelectionEvent e){
            if(e.getValueIsAdjusting()) 
               return;

            ListSelectionModel lsm = (ListSelectionModel)e.getSource();
            if(lsm.isSelectionEmpty()){
               System.out.println("Nenhuma linha selecionada.");
            }
            else{
               int selectedRow = lsm.getMinSelectionIndex();
               System.out.println("Linha " + selectedRow
                                          + " foi selecionada.");
            }
         }
      });
    }
    else{
       tabela.setRowSelectionAllowed(false);
    }

    if(ALLOW_COLUMN_SELECTION){ // falso por padrão
      if(ALLOW_ROW_SELECTION){
         tabela.setCellSelectionEnabled(true);
      }
      tabela.setColumnSelectionAllowed(true);
      ListSelectionModel colSM = tabela.getColumnModel().getSelectionModel();
      colSM.addListSelectionListener(new ListSelectionListener(){
         public void valueChanged(ListSelectionEvent e){
            if(e.getValueIsAdjusting()) 
              return;

            ListSelectionModel lsm = (ListSelectionModel)e.getSource();
            if(lsm.isSelectionEmpty()) {
               System.out.println("Nenhuma coluna selecionada.");
            } 
            else{
               int selectedCol = lsm.getMinSelectionIndex();
               System.out.println("Coluna " + selectedCol
                                           + " está selecionada.");
            }
          }
      });
    }
	
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
			
    JScrollPane scrollPane = new JScrollPane(tabela);
    c.add(scrollPane);
    	
    setSize(400, 300);
    setVisible(true);
  }
	
  public static void main(String args[]){
    Estudos app = new Estudos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}