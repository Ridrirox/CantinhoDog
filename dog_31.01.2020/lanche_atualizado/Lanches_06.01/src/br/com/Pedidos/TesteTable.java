package br.com.Pedidos;

import javax.swing.JOptionPane;


import javax.swing.JPanel;


import javax.swing.JFrame;


import javax.swing.JTable;


import java.awt.Rectangle;


import java.awt.event.KeyEvent;


import java.awt.event.KeyListener;


import javax.swing.JScrollPane;

import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TesteTable extends JFrame {

private static final long serialVersionUID = 1L;

private JPanel jContentPane = null;

private JScrollPane jScrollPane = null;

private JTable jTable;

/**CODIGO GERADO PELO ECLIPE VE*/


//Construtor

public TesteTable() {

super();

initialize();

}

private void initialize() {

this.setSize(605, 438);

this.setContentPane(getJContentPane());

this.setTitle("JFrame");

}

private JPanel getJContentPane() {

if (jContentPane == null) {

jContentPane = new JPanel();

jContentPane.setLayout(null);

jContentPane.add(getJScrollPane(), null);

}

return jContentPane;

}

//Metodo que Cria JCrollPane

private JScrollPane getJScrollPane() {

if (jScrollPane == null) {

jScrollPane = new JScrollPane();

jScrollPane.setBounds(new Rectangle(139, 92, 453, 242));

jScrollPane.setViewportView(getJTable());

}

return jScrollPane;

}

/**

* Metodo que cria JTable

* Com modelo padrão


*/

private JTable getJTable() {

String[][] dados = new String[][]{

{"SP","São Paulo"},{"PE","Pernambuco"},

};

String[] colunas = new String[]{"ESTADO","CAIDADE"};

DefaultTableModel modelo = new DefaultTableModel(dados,colunas);

jTable = new JTable(modelo);

DeleteRow deleta = new DeleteRow(); //Cria Objeto da classe interna


jTable.addKeyListener(deleta); // Adiciona evento para jTable

return jTable;

}

//Classe Interna

public class DeleteRow implements KeyListener{

public void keyPressed(KeyEvent evt){

if(evt.getKeyCode() == evt.VK_DELETE){

//Pega a linha selecionada

int linhaSelecionada = jTable.getSelectedRow();

//Obtem o Modelo da Tabela

DefaultTableModel modelo = (DefaultTableModel)jTable.getModel();

//Verifica se tem alguma linha selecionada

if(linhaSelecionada < 0) return;

//Remove a linha selecinada


modelo.removeRow(linhaSelecionada);

//Mostra mensagem se for deletada alguma linha

JOptionPane.showMessageDialog(null,"Deleted");

}

}

public void keyReleased(KeyEvent e) {}

public void keyTyped(KeyEvent e) {}

}
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new TesteTable().setVisible(true);
            }
        });
    }

}