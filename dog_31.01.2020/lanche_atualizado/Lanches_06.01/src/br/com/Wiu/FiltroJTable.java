package br.com.Wiu;

import br.com.Pedidos.Pedidos;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.util.List;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.LineBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
 
/**
 * @author Everton Vieira
 * */
public class FiltroJTable extends JFrame {
 
 public JTextField textField;
 private JTable table;
 private TableRowSorter<TableModel> rowSorter;
 Color foreground, background;
 List<Itens> lanches;
    private Object valoresLinhaTabela;
 public FiltroJTable() throws HeadlessException {
  //TabelaMouseClicked();
  setBounds(280,223,500,820);   
  getContentPane().setLayout(null);
  //table.setSelectionBackground(Color.DARK_GRAY);
  JLabel lblRefinarPesquisa = new JLabel("Refinar Pesquisa:");
  lblRefinarPesquisa.setBounds(10, 11, 123, 14);
  getContentPane().add(lblRefinarPesquisa);
 
  textField = new JTextField();
  //
  textField.addCaretListener(new CaretListener() {
   public void caretUpdate(CaretEvent arg0) {
    String text = textField.getText().trim();
    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" +text, 0));
   }
  });
  textField.setBounds(127, 8, 205, 20);
  getContentPane().add(textField);
  textField.setColumns(10);
  
  table = new JTable();
  table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
      
    { "Cebola", "R$0,50"},
    { "Batata", "R$0,50", }, { "Milho", "R$0,50", },
    { "Ervilha","R$0,50" }, { "Catupiry", "R$1,00" },
    { "Salsicha", "R$1,00",}, { "Hamburguer", "R$1,00" },{ "Presunto", "R$1,00" },
    { "Mussarela", "R$1,00" },{ "Cheddar", "R$1,50" },{ "Calabresa", "R$2,00" },
    { "Baccon", "R$2,00" },{ "Frango", "R$2,00" },{ "Porcao Maionese", "R$3,00" },},
    new String[] { "Ingledientes", "Valor", }));
  table.getColumnModel().getColumn(0).setPreferredWidth(240);
  table.getColumnModel().getColumn(1).setPreferredWidth(20);
  TableCellRenderer renderer = new EvenOddRenderer();
  table.setDefaultRenderer(Object.class, renderer);
  //TabelaMouseClicked(table);
  JScrollPane scrollPane = new JScrollPane();
  scrollPane.setBounds(20, 45, 351, 208);
  scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
  getContentPane().add(scrollPane);
  table.setFillsViewportHeight(true);
  table.setBounds(20, 244, 341, 508);
  scrollPane.setViewportView(table);
  setRowSorter();
 }
 
 
 /**
  * add o TableRowSorter ao minha JTable
  * 
  * @author Everton Vieira
  */
 private void setRowSorter() {
  if (rowSorter == null) {
   rowSorter = new TableRowSorter<TableModel>(table.getModel());
   table.setRowSorter(rowSorter);
  }
 }
 
 
 /**
  * @param args
  */
 public static void main(String[] args) {
  new FiltroJTable().setVisible(true);
  
 }
 public void TabelaMouseClicked(JTable table) {
     
     if (table.getSelectedRow() != -1){
         //int indiceLinha;  
         //indiceLinha = table.getSelectedRow();   
         //Pedidos.Tabela.setValueAt(lanches.get(table.getSelectedRow()).getCebola());
         textField.setText(lanches.get(table.getSelectedRow()).getCebola());
         //Pedidos.Tabela.setValueAt("dddd",Pedidos.Tabela.getSelectedRow(), 4);
//Pega a linha que foi clicada  
        //valoresLinhaTabela = table.getValueAt(indiceLinha,1);                  
        //System.out.println(valoresLinhaTabela); 
     }
         System.out.println(valoresLinhaTabela);
 }   
 
}
class EvenOddRenderer implements TableCellRenderer {
List<Itens> lanches;

  public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    @Override
  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
    Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
        table, value, isSelected, hasFocus, row, column);
    ((JLabel) renderer).setOpaque(true);
    Color foreground, background;
    if (isSelected) {
      foreground = Color.yellow;
      background = Color.green;
      //TabelaMouseClicked();
      
    } else {
      if (row % 2 == 0) {
        foreground = Color.blue;
        background = Color.white;
        //textField.setText(lanches.get(table.getSelectedRow()).getCebola());
        //Pedidos.Tabela.setValueAt(lanches.get(table.getSelectedRow()));
      } else {
        foreground = Color.white;
        background = Color.blue;
        //Pedidos.Tabela.setValueAt("ssssss",Pedidos.Tabela.getSelectedRow(), 4);
      }
    }
    renderer.setForeground(foreground);
    renderer.setBackground(background);
    return renderer;
  }

    
}