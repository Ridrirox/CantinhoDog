package br.com.Wiu;


import javax.swing.JFrame;
import javax.swing.JTable;

public class TesteJTable extends JFrame{

     public TesteJTable() {
setSize(400, 400);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
getContentPane().setLayout(null);

Object[] colunas = new Object[] {"", "a", "b"};
Object[][] valores = new Object[3][3];
    for (int i = 0; i < 3; i++) {
valores[i][0] = "";
valores[i][1] = "aaaaaa";
valores[i][2] = "bbbbbb";
}
JTable table = new JTable(valores, colunas);

table.setBounds(10, 10, 200, 200);

getContentPane().add(table);

setVisible(true);
}

      public static void main(String[] x) {
TesteJTable tjt = new TesteJTable();
}

}