/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.Pedidos;
import br.com.Controle.CliBean;
import br.com.Controle.CliControl;
import br.com.Util.TeclasPermitidas;
import br.com.Wiu.Clientes;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author digao
 */
public class PegaClientes extends javax.swing.JFrame {

    private List<CliBean> pedido;
    /**
     * Creates new form PegaClientes
     */
    public PegaClientes() {
        initComponents();
        //PegaClientes.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        ControleDigitacao();
        
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPesquisa = new javax.swing.JButton();
        llbData = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtEndereco = new javax.swing.JTextField();
        txtEntrega = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btTransporte = new javax.swing.JButton();
        entrega = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        btPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/Find.png"))); // NOI18N
        btPesquisa.setText(".....");
        btPesquisa.setToolTipText("Pesquisar");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        llbData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/celular.png"))); // NOI18N
        llbData.setText(":.");

        txtEndereco.setEditable(false);
        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(51, 153, 255));
        txtEndereco.setText("Rua");

        txtEntrega.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEntrega.setForeground(new java.awt.Color(0, 204, 51));
        txtEntrega.setText("0.0");
        txtEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntregaActionPerformed(evt);
            }
        });
        txtEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntregaKeyTyped(evt);
            }
        });

        txtTelefone.setEditable(false);
        txtTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(51, 0, 204));
        txtTelefone.setText("(41)00000000");

        txtNome.setEditable(false);
        txtNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(153, 0, 0));
        txtNome.setText("S/Cliente");

        txtId.setEditable(false);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtId.setOpaque(false);

        btTransporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/sair.gif"))); // NOI18N
        btTransporte.setText("Sair");
        btTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransporteActionPerformed(evt);
            }
        });

        entrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/Save.png"))); // NOI18N
        entrega.setText("AlteraEntrega");
        entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entregaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/Dial.png"))); // NOI18N
        jLabel2.setText("Telefone:");

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/Add.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txtEntrega))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entrega)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btTransporte)
                .addContainerGap())
        );

        txtPesquisa.setToolTipText("Pesquisa por nome ou numero ");
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyTyped(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(llbData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(llbData)
                    .addComponent(btPesquisa)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        if(txtPesquisa.getText().trim().equals("")){//se esse campo for vazio
                    getRootPane().setDefaultButton(btPesquisa);  //marca o botao para ser clicado
                    
                    JOptionPane.showMessageDialog(null, "Nada a Pesquisar");
                    txtPesquisa.requestFocus();
               }else{
                   //listarNomes();//pesquisa nome completo
                   //listarAcessosNome();//pesquisa nos acessos
                   listarClientesTelefone();//pesquisa por telefone
                   listarClientesNome();
                   //getRootPane().setDefaultButton(Pedidos.Pega);  //marca o botao para ser clicado
                   //listarAcessos();
                     
               }
        
    }//GEN-LAST:event_btPesquisaActionPerformed
public boolean Javolto(){
        //if (txtCartao.getText().length() > 6){//condicional caso o tamanho do campo matricula for maior que 5
          //  if (!ListaSaida());{
       
        //if (TxtCondicao.getText().trim().equals("N")){
          // if (txtCartao.getText().trim().equals(txtCartao)){
           
         //JDialog.setDefaultLookAndFeelDecorated(true);
         int response = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Confirme",
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if (response == JOptionPane.NO_OPTION) {// se clicar me nao volta tudo ao normal
             return false;
         //System.out.println("No button clicked");
         } else if (response == JOptionPane.YES_OPTION) {//se clicar em sim da baixa
             JOptionPane.showMessageDialog(null, "Cliente CAPTURADO, !", "Informa????o", JOptionPane.QUESTION_MESSAGE);
            // atualizaSaida();
            // cadastraSaida();
             
        //--    Pedidos action = new Pedidos ();
        //--    getRootPane().setDefaultButton(Pedidos.Pega);  //marca o botao para ser clicado
        //instancio um botao:
          //Pedidos botao = new Pedidos("OK");
             //simulo um clique:
            // Pedidos.pega.doClick();
        //--       action.PegaClientes();
               Pedidos.txtconferir.setText("");
               dispose();
               //limparCampo();
               
         }
         
           
         return true;
        
    } 
    private void btTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransporteActionPerformed
           Javolto();
    }//GEN-LAST:event_btTransporteActionPerformed

    private boolean verificarEntrega() {
        if (txtEntrega.getText().trim().equals("")){//igual vazio
            JOptionPane.showMessageDialog(this,"O campo ENTREGA ?? Obrigat??rio!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtEntrega.requestFocus();
            return false;
        }
        
           return true;
    }
     protected void alteraEntrega(){
        
      if (verificarEntrega()){
          //try{
            CliControl c = new CliControl();//importa o objeto uqe controla
            CliBean vgt = new CliBean();
            vgt.setEntrega(Double.parseDouble(txtEntrega.getText().trim()));
            vgt.setId_vigilancia(Integer.parseInt(txtId.getText()));
            //servidor.setEmpresas_id_empresas(Integer.parseInt(txtIdprodutos.getText().trim()));
            //servidor.setEmpresas_id_empresas(produtos.get(cbPedidos.getSelectedIndex()).getEmpresas_id_empresas());
            //vgt.setId_vigilancia(produtos.get(cbClientes.getSelectedIndex()).getId_vigilancia());
            //servidor.setObs_vigi(txtObs.getText().trim());
            c.alterarEntrega(vgt);
            //desabilitarCampo();
            //JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO vvvvvvv!");
            //dispose();
            listarClientesNome();//atualiza apos pesquisar por nome
            listarClientesTelefone();//atualiza apos pesquisar por telefone
          // }catch(SQLException e){
            //e.printStackTrace();
            //e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "NADAAA FOI ALTERADO!" + e);
        //}
      }
    
    }
    
    private void entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entregaActionPerformed
        alteraEntrega();
    }//GEN-LAST:event_entregaActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
          Clientes clientes = new Clientes();
                   clientes.setVisible(true);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntregaActionPerformed

    private void txtEntregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntregaKeyTyped
        
    }//GEN-LAST:event_txtEntregaKeyTyped

    public void keyPressed(KeyEvent arg0) {  
                if (Toolkit.getDefaultToolkit().getLockingKeyState(  
                        java.awt.event.KeyEvent.VK_CAPS_LOCK)) {  
                    //msg.setVisible(true);  
                    JOptionPane.showMessageDialog(null,"CAPS LOCK EST?? ATIVADA","ATENCAO",JOptionPane.WARNING_MESSAGE);
                } else {  
                    //JOptionPane.showMessageDialog(null,"CAPS LOCK N??O EST?? ATIVADA","ATENCAO",JOptionPane.WARNING_MESSAGE);
                    //msg.setVisible(false);  
                    
                }  
            }  
    private void txtPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyTyped
       getRootPane().setDefaultButton(btPesquisa); //passa o valor para o botao ao ser clicado
        keyPressed(evt);
    }//GEN-LAST:event_txtPesquisaKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PegaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PegaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PegaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PegaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PegaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btTransporte;
    private javax.swing.JButton entrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel llbData;
    public static javax.swing.JTextField txtEndereco;
    public static javax.swing.JTextField txtEntrega;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    public static javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private boolean listarClientesTelefone() {
        CliControl cli = new CliControl();
        //--usado antespedido = cli.listarCliente("%" + txtPesquisa.getText().trim() + "%");//tfPesquisaCliente
        pedido = cli.listarPedidos("%" + txtPesquisa.getText().trim() + "%");
        //pedido = cli.listarNomes("%" + txtPesquisa.getText().trim() + "%");
        //listarPedidos
        //mostrarVeiculos(pedido);
        for (int i = 0; i < pedido.size(); i++){
           //-- cbPedidos.addItem(pedido.get(i).getNome_vigi());
            txtId.setText(String.valueOf(pedido.get(i).getId_vigilancia()));
            txtNome.setText(pedido.get(i).getNome_vigi().toString());
            txtTelefone.setText(pedido.get(i).getTelefone_vigi().toString());
            txtEndereco.setText(pedido.get(i).getPosto_vigi());
            txtEntrega.setText(String.valueOf(pedido.get(i).getEntrega()));
           //  Pedidos.jIdCliente.setText(String.valueOf(pedido.get(i).getId_vigilancia()));
           //  Pedidos.txtNome.setText(pedido.get(i).getNome_vigi());
           //  Pedidos.txtTelefone.setText(pedido.get(i).getTelefone_vigi());
           //  Pedidos.txtEndereco.setText(pedido.get(i).getPosto_vigi());
          //   Pedidos.txtEntrega.setText(String.valueOf(pedido.get(i).getEntrega()));
            //--transporta para pedidos//--Pedidos.txtTelefone.setText(pedido.get(i).getTelefone_vigi());
            //cbPedidos.addItem(pedido.get(i).getTelefone_vigi());
            //String conta = String.valueOf("Total de "+ cliente.size()+"  "+"Clientes cadastrados");//conta quantidade de servidores no banco
            //contacli.setText(conta
            // jId.setText(String.valueOf(c.getIdindex()));
           // pedido.clear();
        }
        
       return true;
    
    }
     private boolean listarClientesNome() {
        CliControl cli = new CliControl();
        //--usado antespedido = cli.listarCliente("%" + txtPesquisa.getText().trim() + "%");//tfPesquisaCliente
        //pedido = cli.listarPedidos("%" + txtPesquisa.getText().trim() + "%");
        pedido = cli.listarNomes("%" + txtPesquisa.getText().trim() + "%");
        //listarPedidos
        //mostrarVeiculos(pedido);
        for (int i = 0; i < pedido.size(); i++){
           //-- cbPedidos.addItem(pedido.get(i).getNome_vigi());
            txtId.setText(String.valueOf(pedido.get(i).getId_vigilancia()));
            txtNome.setText(pedido.get(i).getNome_vigi().toString());
            txtTelefone.setText(pedido.get(i).getTelefone_vigi().toString());
            txtEndereco.setText(pedido.get(i).getPosto_vigi());
            txtEntrega.setText(String.valueOf(pedido.get(i).getEntrega()));
           //  Pedidos.jIdCliente.setText(String.valueOf(pedido.get(i).getId_vigilancia()));
           //  Pedidos.txtNome.setText(pedido.get(i).getNome_vigi());
           //  Pedidos.txtTelefone.setText(pedido.get(i).getTelefone_vigi());
           //  Pedidos.txtEndereco.setText(pedido.get(i).getPosto_vigi());
          //   Pedidos.txtEntrega.setText(String.valueOf(pedido.get(i).getEntrega()));
            //--transporta para pedidos//--Pedidos.txtTelefone.setText(pedido.get(i).getTelefone_vigi());
            //cbPedidos.addItem(pedido.get(i).getTelefone_vigi());
            //String conta = String.valueOf("Total de "+ cliente.size()+"  "+"Clientes cadastrados");//conta quantidade de servidores no banco
            //contacli.setText(conta
            // jId.setText(String.valueOf(c.getIdindex()));
           // pedido.clear();
        }
        
       return true;
    
    }
     private void ControleDigitacao(){
        txtEntrega.setDocument(new TeclasPermitidas());
        //txtDoc.setDocument(new TeclasPermitidas());
       // txtTelefone.setDocument(new TeclasPermitidas());
       // txtNome.setDocument(new TeclasPermitidasnome());
         //grava.setVisible(false);
        //gravacesso.setVisible(false);
    }

     private boolean listarEntrega() {
        CliControl cli = new CliControl();
        //--usado antespedido = cli.listarCliente("%" + txtPesquisa.getText().trim() + "%");//tfPesquisaCliente
        //pedido = cli.listarPedidos("%" + txtPesquisa.getText().trim() + "%");
        pedido = cli.listarNomes("%" + txtPesquisa.getText().trim() + "%");
        //listarPedidos
        //mostrarVeiculos(pedido);
        for (int i = 0; i < pedido.size(); i++){
           //-- cbPedidos.addItem(pedido.get(i).getNome_vigi());
            txtId.setText(String.valueOf(pedido.get(i).getId_vigilancia()));
            txtNome.setText(pedido.get(i).getNome_vigi().toString());
            txtTelefone.setText(pedido.get(i).getTelefone_vigi().toString());
            txtEndereco.setText(pedido.get(i).getPosto_vigi());
            txtEntrega.setText(String.valueOf(pedido.get(i).getEntrega()));
           //  Pedidos.jIdCliente.setText(String.valueOf(pedido.get(i).getId_vigilancia()));
           //  Pedidos.txtNome.setText(pedido.get(i).getNome_vigi());
           //  Pedidos.txtTelefone.setText(pedido.get(i).getTelefone_vigi());
           //  Pedidos.txtEndereco.setText(pedido.get(i).getPosto_vigi());
          //   Pedidos.txtEntrega.setText(String.valueOf(pedido.get(i).getEntrega()));
            //--transporta para pedidos//--Pedidos.txtTelefone.setText(pedido.get(i).getTelefone_vigi());
            //cbPedidos.addItem(pedido.get(i).getTelefone_vigi());
            //String conta = String.valueOf("Total de "+ cliente.size()+"  "+"Clientes cadastrados");//conta quantidade de servidores no banco
            //contacli.setText(conta
            // jId.setText(String.valueOf(c.getIdindex()));
           // pedido.clear();
        }
        
       return true;
    
    }

    private void desabilitarCampo() {
       txtEntrega.setEditable(false);
    }
    private void HabilitarCampo() {
       txtEntrega.setEditable(true);
    }
    private void limparCampo() {
       txtEntrega.setText("");
       txtNome.setText("");
    }
}
