/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CalcRenda.java
 *
 * Created on 07/10/2013, 10:20:43
 */
package br.com.Wiu;


import br.com.Controle.CliBean;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;

/**
 *
 * @author ROX
 */
public class CalcRenda extends javax.swing.JFrame {
    
    DefaultTableModel tmServidores = new DefaultTableModel(null, new String[]{"Base de Cálculo (R$)", "Alíquota (%)", "Parcela a Deduzir do IR (R$))"});
    ListSelectionModel lsmServidores;
    List<CliBean> servidores;

    /** Creates new form CalcRenda */
    public CalcRenda() {
        initComponents();
        
    }
    protected void tbClientesLinhaSelecionada(JTable tb){
        if (tb.getSelectedRow() != -1){
            //txtdeduzir.setText(servidores.get(tb.getSelectedRow()).getNome_vigi());
            //txtdeduzir.setText(recebe);
            incluiTabela();
        }else{
            txtdeduzir.setText("");
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPreviddencia = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtDependente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdeduzir = new javax.swing.JTextField();
        btBusca = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAliquota = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gratificacao = new javax.swing.JCheckBox();
        txtGratificacoes = new javax.swing.JTextField();
        btSomar = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRenda = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPagar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Imposto de Renda");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calcular Imposto de Renda"));

        jLabel1.setText("Salario");

        txtSalario.setToolTipText("É todo rendimento mais Gratificacoes, não é incluido Vale alimentação e Saude");

        jLabel2.setText("Previdencia");

        jCheckBox1.setText("8%");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("10%");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("11%");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Dependentes");

        txtDependente.setToolTipText("O Governo permite retirar do imposto valor especifico e variavel por ano direto da fonte, é preciso calcular a cada ano");

        jLabel5.setText("Deduzir");

        btBusca.setText("Table");
        btBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaActionPerformed(evt);
            }
        });

        jLabel6.setText("Aliquota");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("[(Salario Bruto - dependentes - INSS - planoSaude).alíquota-dedução]=IRRF");
        jLabel8.setToolTipText("nesse caso não considera o plano de saude");

        jLabel9.setText("%");

        gratificacao.setText("Gratificacoes");
        gratificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gratificacaoActionPerformed(evt);
            }
        });

        btSomar.setText("Somar");
        btSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomarActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Diminuir");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAliquota, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(52, 52, 52)
                        .addComponent(btBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtdeduzir, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDependente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPreviddencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2))
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gratificacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGratificacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSomar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox4))
                            .addComponent(jCheckBox3))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gratificacao)
                    .addComponent(txtGratificacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSomar)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPreviddencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdeduzir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAliquota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBusca)
                    .addComponent(btCalcular)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("TABELA DO IRF 2013 - VIGÊNCIA DE 01.01.2013 a 31.12.2013"));

        jLabel4.setText("Lei 12.469/2011");

        tbRenda.setModel(tmServidores);
        tbRenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmServidores = tbRenda.getSelectionModel();
        lsmServidores.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()){
                    tbClientesLinhaSelecionada(tbRenda);
                }
            }
        });
        tbRenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRenda);

        jLabel7.setText("Imposto a pagar mensalmente");

        txtPagar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void incluiTabela() {
        if (tbRenda.getSelectedRow() != -1){
                                                                                                     //pega  a linha do Nome selecionado
            int resposta = JOptionPane.showConfirmDialog(this, "É o que foi Selecionado na Tabela?"+"\n"+tbRenda.getValueAt(tbRenda.getSelectedRow(), 2), "Confirmação",
                    JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION){
                String aliquota = String.valueOf(tbRenda.getValueAt(tbRenda.getSelectedRow(), 1));
                String recebe = String.valueOf(tbRenda.getValueAt(tbRenda.getSelectedRow(), 2));
                txtAliquota.setText(aliquota);
                txtdeduzir.setText(recebe);
                Porcentual();
            }
        }
    }
    private void btBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaActionPerformed
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tbRenda.getModel();
        dtm.addRow(new Object[]{"Até 1.710.78","0","0"});//isento
        dtm.addRow(new Object[]{"De 1.710.79 até 2.563.91","7.5","128.31"});
        dtm.addRow(new Object[]{"De 2.563.92 até 3.418.59","15","320.60"});
        dtm.addRow(new Object[]{"De 3.418.60 até 4.271.59","22.5","577.00"});
        dtm.addRow(new Object[]{"Acima de 4.271.59","27.5","790.58"});
    }//GEN-LAST:event_btBuscaActionPerformed
   
    private void Porcentual(){
        Double valor = Double.valueOf(txtAliquota.getText());
        Double percentual = (valor/100 );
        txtAliquota.setText(String.valueOf(percentual));
    }
    private void tbRendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRendaMouseClicked
        //incluiTabela();
        //Porcentual();
        
    }//GEN-LAST:event_tbRendaMouseClicked

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()== true) {//desmarcado
            //double valor  = Double.parseDouble(cebola.getText());;  
            double Result,total,qtd,valoritem;
            qtd = Double.parseDouble(txtSalario.getText());
            valoritem = 0.11;//11 porcento 11/100
        //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
            Result = (qtd * valoritem);
            total  = Double.valueOf(Result);
        //tfValor.setValue(total);
            txtPreviddencia.setText(String.valueOf(total));
            //tfValor
            //cebola.setText("");//limapa o texto 
            //Tabela.setValueAt("", Tabela.getSelectedRow(), 4);//SENAO CLICAR LIMPA
        
        }else{
           txtPreviddencia.setText("");
           
        }   
            
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()== true) {//desmarcado
            //double valor  = Double.parseDouble(cebola.getText());;  
            double Result,total,qtd,valoritem;
            qtd = Double.parseDouble(txtSalario.getText());
            valoritem = 0.08;//11 porcento 11/100
        //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
            Result = (valoritem * qtd);
            total  = Double.valueOf(Result);
        //tfValor.setValue(total);
            txtPreviddencia.setText(String.valueOf(total));
            //tfValor
            //cebola.setText("");//limapa o texto 
            //Tabela.setValueAt("", Tabela.getSelectedRow(), 4);//SENAO CLICAR LIMPA
        
        }else{
           txtPreviddencia.setText("");
           }   
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()== true) {//desmarcado
            //double valor  = Double.parseDouble(cebola.getText());;  
            double Result,total,qtd,valoritem;
            qtd = Double.parseDouble(txtSalario.getText());
            valoritem = 0.10;//11 porcento 11/100
        //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
            Result = (valoritem * qtd);
            total  = Double.valueOf(Result);
        //tfValor.setValue(total);
            txtPreviddencia.setText(String.valueOf(total));
            //tfValor
            //cebola.setText("");//limapa o texto 
            //Tabela.setValueAt("", Tabela.getSelectedRow(), 4);//SENAO CLICAR LIMPA
        
        }else{
           txtPreviddencia.setText("");
           }   
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        // [(Salario Bruto - dependentes - INSS - planoSaude).alíquota-dedução]=IRRF
        double bruto = Double.parseDouble(txtSalario.getText()); //salario
        double depende = Double.parseDouble(txtDependente.getText()); //salario
        double previdencia = Double.parseDouble(txtPreviddencia.getText()); //salario
        double liquota = Double.parseDouble(txtAliquota.getText()); //salario
        double deduzir = Double.parseDouble(txtdeduzir.getText()); //salario
        
        //String Calculo;
        
         double calculo = ((bruto - depende - previdencia)* liquota - deduzir);
        
         txtPagar.setText(String.valueOf(""+calculo));
    }//GEN-LAST:event_btCalcularActionPerformed

    private void gratificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gratificacaoActionPerformed
        if (gratificacao.isSelected()== true) {
            
            txtGratificacoes.setVisible(true);
        }else{
            
            txtGratificacoes.setVisible(false);
        }
            
    }//GEN-LAST:event_gratificacaoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtGratificacoes.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomarActionPerformed
        Double salario = Double.parseDouble(txtSalario.getText());
        Double gratificacao = Double.parseDouble(txtGratificacoes.getText());
        double Resultado = (salario + gratificacao);
        txtSalario.setText(String.valueOf(Resultado));
        
    }//GEN-LAST:event_btSomarActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
       
      if (jCheckBox4.isSelected()== true) {
          Double salario = Double.parseDouble(txtSalario.getText());
          Double gratificacao = Double.parseDouble(txtGratificacoes.getText());
          double Resultado = (salario - gratificacao);
          txtSalario.setText(String.valueOf(Resultado));
      }else{
          Double salario = Double.parseDouble(txtSalario.getText());
          Double gratificacao = Double.parseDouble(txtGratificacoes.getText());
          double Resultado = (salario + gratificacao);
          txtSalario.setText(String.valueOf(Resultado));
      }
        
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CalcRenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBusca;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btSomar;
    private javax.swing.JCheckBox gratificacao;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable tbRenda;
    private javax.swing.JTextField txtAliquota;
    private javax.swing.JTextField txtDependente;
    private javax.swing.JTextField txtGratificacoes;
    private javax.swing.JTextField txtPagar;
    private javax.swing.JTextField txtPreviddencia;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtdeduzir;
    // End of variables declaration//GEN-END:variables
}
