/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CalcJuros.java
 *
 * Created on 26/09/2013, 00:47:22
 */
package br.com.Wiu;

import javax.swing.JOptionPane;




/**
 *
 * @author ROX
 */
public class CalcJuros extends javax.swing.JFrame {
    
    double prestacao, taxaJuros, tempo, valorFinalPagar, capital, constante,potenciapro, 
            potenciapre, jurosReal, constanteJuros;

    /** Creates new form CalcJuros */
    public CalcJuros() {
        initComponents();
        setBounds(260, 120, 850, 480);//lado, baixo, largura,comprimento
        
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtParcela = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTaxas = new javax.swing.JTextField();
        txtDiasAtraso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbValorFinal = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtParcelas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTempo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtJuros = new javax.swing.JTextField();
        lbEmprestimo = new javax.swing.JLabel();
        lbGrana = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btCalculoEmprestimo = new javax.swing.JButton();
        lbFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculos de Juros Compostos e Emprestimo Consignado");

        jLabel1.setText("Calcular Juros Compostos sobre Emprestimos Consignados ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel2.setText("Valor da Parcela");

        jLabel3.setText("Taxa de Juros");

        jLabel4.setText("Numero de Dias de atraso (a pagar)");

        jLabel5.setText("Valor Final a ser pago com Juros");

        lbValorFinal.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        lbValorFinal.setForeground(new java.awt.Color(255, 0, 0));
        lbValorFinal.setText("..........");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Emprestimo Consignado"));

        jLabel6.setText("Parcela");

        jLabel7.setText("Tempo");

        jLabel8.setText("Juros");

        lbEmprestimo.setText("..............");

        lbGrana.setFont(new java.awt.Font("Lucida Sans", 1, 18));
        lbGrana.setForeground(new java.awt.Color(0, 204, 51));
        lbGrana.setText("........");

        jLabel9.setText("Meses");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbGrana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbEmprestimo)
                .addGap(18, 18, 18)
                .addComponent(lbGrana, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        btCalculoEmprestimo.setText("Emprestimo");
        btCalculoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculoEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbValorFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCalculoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDiasAtraso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtParcela, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(txtTaxas, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
                        .addGap(523, 523, 523))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTaxas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiasAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbValorFinal))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCalcular)
                    .addComponent(btCalculoEmprestimo))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/cam.gif"))); // NOI18N
        lbFoto.setText("Cuide bem do sue Dinheiro, é muito difícil ganhar!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        calculo ();
    }//GEN-LAST:event_btCalcularActionPerformed

    private void btCalculoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculoEmprestimoActionPerformed
        calculoEmprestimo();
    }//GEN-LAST:event_btCalculoEmprestimoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CalcJuros().setVisible(true);
            }
        });
    }
private void calculoEmprestimo(){
   
 if (verificarCamposEmprestimo()){
     
    prestacao = Double.parseDouble(txtParcelas.getText());//prestacao
    tempo =   Double.parseDouble(txtTempo.getText());//tempo
    taxaJuros  =   Double.parseDouble(txtJuros.getText());//pega o valor e divide por 100
    jurosReal = (taxaJuros/100);      
    
    constanteJuros = Math.pow(1+jurosReal, tempo);//5,9172 ok
    potenciapro = (constanteJuros-1);
    potenciapre = jurosReal*constanteJuros;
    constante = potenciapro/potenciapre;
    
    
    lbEmprestimo.setText("Constante de calculo é"+" "+constante);//basta multiplicar pelo valor da parcela
    lbGrana.setText("Valor em dinheiro é"+" R$ "+prestacao*constante);//prestaacao veses a constante
        
   }
 

}
    
private void calculo (){

 if (verificarCampos()){   
    double valorParcela, taxaJuros, diasAtraso, valorFinalPagar, calcTaxa;
    valorParcela = Double.parseDouble(txtParcela.getText());
    diasAtraso =   Double.parseDouble(txtDiasAtraso.getText());
    taxaJuros  =   Double.parseDouble(txtTaxas.getText());

    calcTaxa  =   (taxaJuros/100);
    //ValorFinal = ValorParcela * (1+TaxaJuros) ^ diasAtraso
    valorFinalPagar = valorParcela * Math.pow((1+calcTaxa), diasAtraso);

    lbValorFinal.setText("Voce vai pagar"+" R$ "+valorFinalPagar);
 }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCalculoEmprestimo;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbEmprestimo;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbGrana;
    private javax.swing.JLabel lbValorFinal;
    private javax.swing.JTextField txtDiasAtraso;
    private javax.swing.JTextField txtJuros;
    private javax.swing.JTextField txtParcela;
    private javax.swing.JTextField txtParcelas;
    private javax.swing.JTextField txtTaxas;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables

    private boolean verificarCampos() {
        if (txtParcela.getText().trim().equals("")){//nome do cracha
            JOptionPane.showMessageDialog(this,"VALOR DA PARCELA NAO PODEM SER VAZIO!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtParcela.requestFocus();//faz esse campo fique com o cursor nele
            //nomecracha.setText("SEGUE O JOGO");
            //nomecracha.setText("SEGUE O JOGO");
        //}else{
           // nomecracha.setText("SEGUE O JOGO");
            return false;
        }
        
        if (txtTaxas.getText().trim().equals("")){//nome do cracha
            JOptionPane.showMessageDialog(this,"TAXA DE JUROS NAO PODEM SER VAZIO!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtTaxas.requestFocus();//faz esse campo fique com o cursor nele
            //nomecracha.setText("SEGUE O JOGO");
            //nomecracha.setText("SEGUE O JOGO");
        //}else{
           // nomecracha.setText("SEGUE O JOGO");
            return false;
        }
        if (txtDiasAtraso.getText().trim().equals("")){//nome do cracha
            JOptionPane.showMessageDialog(this,"DIAS EM ATRASO NAO PODEM SER VAZIO!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtDiasAtraso.requestFocus();//faz esse campo fique com o cursor nele
            //nomecracha.setText("SEGUE O JOGO");
            //nomecracha.setText("SEGUE O JOGO");
        //}else{
           // nomecracha.setText("SEGUE O JOGO");
            return false;
        }
        
        
        return true;
        
    }

    private boolean verificarCamposEmprestimo() {
        if (txtParcelas.getText().trim().equals("")){//nome do cracha
            JOptionPane.showMessageDialog(this,"PARCELAS NAO PODEM SER VAZIO!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtParcelas.requestFocus();//faz esse campo fique com o cursor nele
            //nomecracha.setText("SEGUE O JOGO");
            //nomecracha.setText("SEGUE O JOGO");
        //}else{
           // nomecracha.setText("SEGUE O JOGO");
            return false;
        }
        
        if (txtTempo.getText().trim().equals("")){//nome do cracha
            JOptionPane.showMessageDialog(this,"TEMPO NAO PODEM SER VAZIO!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtTempo.requestFocus();//faz esse campo fique com o cursor nele
            //nomecracha.setText("SEGUE O JOGO");
            //nomecracha.setText("SEGUE O JOGO");
        //}else{
           // nomecracha.setText("SEGUE O JOGO");
            return false;
        }
        if (txtJuros.getText().trim().equals("")){//nome do cracha
            JOptionPane.showMessageDialog(this,"JUROS NAO PODEM SER VAZIO!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtJuros.requestFocus();//faz esse campo fique com o cursor nele
            //nomecracha.setText("SEGUE O JOGO");
            //nomecracha.setText("SEGUE O JOGO");
        //}else{
           // nomecracha.setText("SEGUE O JOGO");
            return false;
        }
        
        
        return true;
        
    }
}