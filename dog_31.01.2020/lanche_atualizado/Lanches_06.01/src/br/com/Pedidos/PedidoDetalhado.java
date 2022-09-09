/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PedidoDetalhado.java
 *
 * Created on 12/02/2014, 00:28:07
 */
package br.com.Pedidos;

import br.com.Controle.CliBean;
import br.com.Controle.CliControl;
import br.com.Controle.Contato;
import br.com.Controle.ContatoController;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ROX
 */
public class PedidoDetalhado extends javax.swing.JFrame {
    
    private String temp, tempo, numeroAntes, nomeAntes;
    private double num1, num2,resultado;
    private char operacao;
    private double Result; 
    private double total = 0;
     private List<CliBean> pedido;
    //double total = 0;
    double totalpedidos = 0;
     private String nome;
    /** Creates new form PedidoDetalhado */
    public PedidoDetalhado() {
        initComponents();
        setBounds(280,77,900,460);      // eixos (x,y,x,y) Seta posicao e tamanho 
        //LimpaCamposs(); //limpa campo caso novo acrescimo for adicionado
        //MeuValor();
         TxtClientes.setVisible(false);
    
    
    }
    private void LimpaCampos(){
        
        cbOvo.setSelected(false);
        cbBatata.setSelected(false);
        cbMilho.setSelected(false);
        cbErvilha.setSelected(false);
        jTVisor.setText("");
        //txtTotal.setText("");
        jTVisorRetira.setText("");
        //cbOvo.isEnabled();
        cebola.setSelected(false);
        milho.setSelected(false);
        vina.setSelected(false);
        pimentao.setSelected(false);
        batata.setSelected(false);
        maionese.setSelected(false);
        txtTotal.setText("0");//volta para a estaca zero
        sair();
        //LimpaCamposs();
        
    }
    public void numeroDigitado(String acrescimo) {
        temp = txtTotal.getText();
        numeroAntes = temp;
        temp = temp + acrescimo;
        //txtTotal.setText((temp));
        txtTotal.setText((temp)+"0+");
        jTextValor.setText("R$"+(temp).replace(".", ",")+"0");//valor dos acr);
        //jTextValor.setText("R$"+(temp));//valor dos acr);
        // "+txtValorFinal.getText().replace(".", ",")+"0");//valor dos acr
       // Pedidos.Tabela.setValueAt(jTextValor.getText(), Pedidos.Tabela.getSelectedRow(), 5);  

    }
    public void nomeDigitado(String ingredientes) {
        tempo = jTVisor.getText();
        nomeAntes = tempo;
        tempo = tempo + ingredientes;
        jTVisor.setText(tempo);
        
       

    }
    
    public void nomeDigitadodetalhes(String retira) {
        tempo = jTVisorRetira.getText();
        nomeAntes = tempo;
        tempo = tempo + retira;
        jTVisorRetira.setText(tempo);
        //jTextValor.setText("R$"+(temp).replace(".", ",")+"0");//valor dos acr);
       

    }
     public void Somatorio(){
        
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 2;//valor do acrescimo 50 centavos //ovo, batatamilh e ervilha era 1.5
        //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
            
            Result = (valoritem * qtd);
            total += Result;//atribui o valor
            
            //txtTudo.setText(String.valueOf(total));
            //num1 = Double.valueOf(txtTudo.getText());//armazena na variavel num1 que pegou 
            Pedidos.txtAcrecimo.setText(String.valueOf((total)));
            Pedidos.Tabela.setValueAt(jTVisor.getText(), Pedidos.Tabela.getSelectedRow(), 4);
            Pedidos.Tabela.setValueAt(jTextValor.getText(), Pedidos.Tabela.getSelectedRow(), 5);              
           //--acrescentei aqui
            //----Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
            
             //LimpaCamposs();
            
    }

    /**
     *
     * @return
     */
    
     private void Somatorio1(){
        
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 2.5;//valor do acrescimo era 2
        //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
            Result = (valoritem * qtd);
            total += Result;//retira valor
        //tfValor.setValue(total);
           Pedidos.txtAcrecimo.setText(String.valueOf(total));
           Pedidos.Tabela.setValueAt(jTVisor.getText(), Pedidos.Tabela.getSelectedRow(), 4);
           Pedidos.Tabela.setValueAt(jTextValor.getText(), Pedidos.Tabela.getSelectedRow(), 5);
           //LimpaCamposs();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
    }
     private void Somatorio2(){
        
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 4.5;//valor do acrescimo era 4
        //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
            Result = (valoritem * qtd);
            total += Result;//retira valor
        //tfValor.setValue(total);
           Pedidos.txtAcrecimo.setText(String.valueOf(total));
           Pedidos.Tabela.setValueAt(jTVisor.getText(), Pedidos.Tabela.getSelectedRow(), 4);
           Pedidos.Tabela.setValueAt(jTextValor.getText(), Pedidos.Tabela.getSelectedRow(), 5);
           //LimpaCamposs();
          // Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
    }
     private void Somatorio3(){
        
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 7.0;//valor do acrescimo 6 //baccon
        //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
            Result = (valoritem * qtd);
            total += Result;//retira valor
        //tfValor.setValue(total);
           Pedidos.txtAcrecimo.setText(String.valueOf(total));
           Pedidos.Tabela.setValueAt(jTVisor.getText(), Pedidos.Tabela.getSelectedRow(), 4);
           Pedidos.Tabela.setValueAt(jTextValor.getText(), Pedidos.Tabela.getSelectedRow(), 5);
            //LimpaCamposs();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
    }
     private void Somatorio4(){
        
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 4.0;//valor do acrescimo 50 centavos //maionese
        //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
            Result = (valoritem * qtd);
            total += Double.valueOf(Result);//retira valor
        //tfValor.setValue(total);
           Pedidos.txtAcrecimo.setText(String.valueOf(total));
           Pedidos.Tabela.setValueAt(jTVisor.getText(), Pedidos.Tabela.getSelectedRow(), 4);
           Pedidos.Tabela.setValueAt(jTextValor.getText(), Pedidos.Tabela.getSelectedRow(), 5);
            //LimpaCamposs();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
    }
             
    private void Seleciona(){
        if (cbOvo.isSelected()) {
            
           //nomeDigitado("Ovo,");
           //numeroDigitado("0.5");
           Somatorio();
           //cbOvo.setSelected(false);
           //cbOvo.isEnabled();
           //JOptionPane.showMessageDialog(null, "O sujeito quer uma pizza.", "Pedido",JOptionPane.INFORMATION_MESSAGE);
          //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());  
            
        }if (cbBatata.isSelected()) {
            
           //nomeDigitado("Bata,");
           //numeroDigitado("0.5");
           Somatorio();
           //cbBatata.setSelected(false);
           //cbBatata.isEnabled();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
           
        
        }if (cbMilho.isSelected()) {
            
           //nomeDigitado("Milho,");
           //numeroDigitado("0.5");
           Somatorio();
           //cbMilho.setSelected(false);
           //cbMilho.isEnabled();
            
        
        }if (cbErvilha.isSelected()) {
            
           //nomeDigitado("Ervil,");
           //numeroDigitado("0.5");
           Somatorio();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
          // Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
          
        }if (catupiry.isSelected()) {
            
           
           Somatorio1();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
        }if (salsicha.isSelected()) {
            
           //nomeDigitado("Salsi,");
           //numeroDigitado("1.0");
           Somatorio1();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
          // Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
        
          }if (hamburguer.isSelected()) {
            
           //nomeDigitado("Hamburg,");
          // numeroDigitado("1.0");
           Somatorio1();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
         }if (presunto.isSelected()) {
            
           //nomeDigitado("Presun,");
          // numeroDigitado("1.0");
           Somatorio2();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
        
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
           
          }if (mussarela.isSelected()) {
            
           //nomeDigitado("Mussar,");
           //numeroDigitado("1.0");
              
           Somatorio2();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
         //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
           
        }
        if (cheddar.isSelected()) {
            
           //nomeDigitado("Cheddar,");
          // numeroDigitado("1.5");
           Somatorio2();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
           
        }
        if (calabresa.isSelected()) {
            
          // nomeDigitado("Calab,");
          // numeroDigitado("2.0");
           Somatorio3();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
        }
        if (baccon.isSelected()) {
            
          // nomeDigitado("Baccon,");
          // numeroDigitado("2.0");
           Somatorio3();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
        }
        if (frango.isSelected()) {
            
          // nomeDigitado("Frango,");
          // numeroDigitado("2.0");
           Somatorio3();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
            
        }
        if (pmaionese.isSelected()) {
            
          // nomeDigitado("P.Maion,");
          // numeroDigitado("3.0");
           Somatorio4();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
           //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
           
        }
               
              
            somatorios();
            SemIgrendientes();
         // dispose(); //sai depois de escolher

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
        cbOvo = new javax.swing.JCheckBox();
        cbBatata = new javax.swing.JCheckBox();
        cbMilho = new javax.swing.JCheckBox();
        cbErvilha = new javax.swing.JCheckBox();
        catupiry = new javax.swing.JCheckBox();
        salsicha = new javax.swing.JCheckBox();
        hamburguer = new javax.swing.JCheckBox();
        presunto = new javax.swing.JCheckBox();
        mussarela = new javax.swing.JCheckBox();
        cheddar = new javax.swing.JCheckBox();
        calabresa = new javax.swing.JCheckBox();
        baccon = new javax.swing.JCheckBox();
        frango = new javax.swing.JCheckBox();
        pmaionese = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sbaccon = new javax.swing.JCheckBox();
        scatupiry = new javax.swing.JCheckBox();
        ssalsicha = new javax.swing.JCheckBox();
        scalabresa = new javax.swing.JCheckBox();
        sfrango = new javax.swing.JCheckBox();
        smolho = new javax.swing.JCheckBox();
        squeijo = new javax.swing.JCheckBox();
        spresunto = new javax.swing.JCheckBox();
        shamburguer = new javax.swing.JCheckBox();
        outros = new javax.swing.JCheckBox();
        servilha = new javax.swing.JCheckBox();
        scatchup = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        cebola = new javax.swing.JCheckBox();
        pimentao = new javax.swing.JCheckBox();
        maionese = new javax.swing.JCheckBox();
        batata = new javax.swing.JCheckBox();
        vina = new javax.swing.JCheckBox();
        milho = new javax.swing.JCheckBox();
        btIngredientes = new javax.swing.JButton();
        alface = new javax.swing.JCheckBox();
        tomate = new javax.swing.JCheckBox();
        TxtClientes = new javax.swing.JTextField();
        scatchups = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtTudo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTVisor = new javax.swing.JTextField();
        jTVisorRetira = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextValor = new javax.swing.JTextField();
        txtTelefones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalhe os Pedidos");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Acrescimos"));

        cbOvo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbOvo.setForeground(new java.awt.Color(255, 204, 51));
        cbOvo.setText("Ovo");
        cbOvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOvoActionPerformed(evt);
            }
        });

        cbBatata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbBatata.setForeground(new java.awt.Color(153, 153, 0));
        cbBatata.setText("Batata");
        cbBatata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBatataActionPerformed(evt);
            }
        });

        cbMilho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbMilho.setForeground(new java.awt.Color(255, 153, 51));
        cbMilho.setText("Milho");
        cbMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMilhoActionPerformed(evt);
            }
        });

        cbErvilha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbErvilha.setForeground(new java.awt.Color(51, 153, 0));
        cbErvilha.setText("Ervilha");
        cbErvilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbErvilhaActionPerformed(evt);
            }
        });

        catupiry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catupiry.setForeground(new java.awt.Color(255, 153, 102));
        catupiry.setText("Catupiry");
        catupiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catupiryActionPerformed(evt);
            }
        });

        salsicha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salsicha.setForeground(new java.awt.Color(204, 0, 0));
        salsicha.setText("Salsicha");
        salsicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salsichaActionPerformed(evt);
            }
        });

        hamburguer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hamburguer.setForeground(new java.awt.Color(255, 153, 51));
        hamburguer.setText("Hamburguer");
        hamburguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburguerActionPerformed(evt);
            }
        });

        presunto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        presunto.setForeground(new java.awt.Color(0, 153, 153));
        presunto.setText("Presunto");
        presunto.setToolTipText("Presunto");
        presunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presuntoActionPerformed(evt);
            }
        });

        mussarela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mussarela.setForeground(new java.awt.Color(0, 51, 153));
        mussarela.setText("Mussarela");
        mussarela.setToolTipText("Mussarela");
        mussarela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mussarelaActionPerformed(evt);
            }
        });

        cheddar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cheddar.setText("Cheddar");
        cheddar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheddarActionPerformed(evt);
            }
        });

        calabresa.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        calabresa.setForeground(new java.awt.Color(255, 0, 51));
        calabresa.setText("Calabresa");
        calabresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calabresaActionPerformed(evt);
            }
        });

        baccon.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        baccon.setForeground(new java.awt.Color(102, 0, 0));
        baccon.setText("Baccon");
        baccon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacconActionPerformed(evt);
            }
        });

        frango.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        frango.setForeground(new java.awt.Color(204, 204, 0));
        frango.setText("Frango");
        frango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frangoActionPerformed(evt);
            }
        });

        pmaionese.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        pmaionese.setForeground(new java.awt.Color(0, 0, 102));
        pmaionese.setText("Porcao Maionese");
        pmaionese.setEnabled(false);
        pmaionese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmaioneseActionPerformed(evt);
            }
        });

        jLabel1.setText("R$ 2,00");

        jLabel2.setText("R$ 2,50");

        jLabel3.setText("R$ 4,50");

        jLabel4.setText("R$ 7,00");

        jLabel5.setText("R$ 0,00");

        sbaccon.setText("s/baccon");

        scatupiry.setText("s/catupiry");

        ssalsicha.setText("s/salsicha");

        scalabresa.setText("s/calabresa");

        sfrango.setText("s/frango");

        smolho.setText("s/molho");

        squeijo.setText("s/queijo");

        spresunto.setText("s/presunto");

        shamburguer.setText("s/hamburguer");

        outros.setText("Outros");
        outros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outrosActionPerformed(evt);
            }
        });

        servilha.setText("s/ervilha");

        scatchup.setBackground(new java.awt.Color(204, 0, 0));
        scatchup.setText("s/catchup");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sbaccon)
                        .addGap(91, 91, 91)
                        .addComponent(ssalsicha))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(scalabresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scatupiry)
                                    .addComponent(sfrango)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(outros)
                                        .addComponent(squeijo))
                                    .addComponent(scatchup))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(servilha)
                                    .addComponent(spresunto))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(smolho)
                            .addComponent(shamburguer))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbaccon)
                    .addComponent(ssalsicha)
                    .addComponent(scatupiry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scalabresa)
                    .addComponent(sfrango)
                    .addComponent(smolho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(squeijo)
                    .addComponent(spresunto)
                    .addComponent(shamburguer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servilha)
                    .addComponent(scatchup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(outros)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pmaionese)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbOvo)
                        .addGap(18, 18, 18)
                        .addComponent(cbBatata)
                        .addGap(18, 18, 18)
                        .addComponent(cbMilho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbErvilha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calabresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(baccon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frango))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catupiry)
                            .addComponent(cheddar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salsicha)
                            .addComponent(presunto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mussarela)
                            .addComponent(hamburguer))))
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOvo)
                            .addComponent(cbBatata)
                            .addComponent(cbMilho)
                            .addComponent(cbErvilha)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catupiry)
                            .addComponent(salsicha)
                            .addComponent(hamburguer)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cheddar)
                            .addComponent(jLabel3)
                            .addComponent(presunto)
                            .addComponent(mussarela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calabresa)
                            .addComponent(baccon)
                            .addComponent(frango)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pmaionese)
                            .addComponent(jLabel5)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cebola.setText("s/cebola");
        cebola.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cebolaStateChanged(evt);
            }
        });

        pimentao.setText("s/pimentao");

        maionese.setText("s/maionese");

        batata.setText("s/batata");
        batata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batataActionPerformed(evt);
            }
        });

        vina.setText("s/vina");
        vina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinaActionPerformed(evt);
            }
        });

        milho.setBackground(new java.awt.Color(255, 255, 102));
        milho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        milho.setForeground(new java.awt.Color(51, 0, 51));
        milho.setText("s/milho");
        milho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milhoActionPerformed(evt);
            }
        });

        btIngredientes.setText("Retira Ingredientes");
        btIngredientes.setToolTipText("Somente retira os ingredientes");
        btIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngredientesActionPerformed(evt);
            }
        });

        alface.setText("s/allface");

        tomate.setText("s/tomate");

        TxtClientes.setEditable(false);
        TxtClientes.setText("....");
        TxtClientes.setOpaque(false);

        scatchups.setBackground(new java.awt.Color(153, 51, 0));
        scatchups.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        scatchups.setText("s/catchup");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cebola)
                        .addGap(18, 18, 18)
                        .addComponent(pimentao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maionese)
                        .addGap(2, 2, 2)
                        .addComponent(batata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(milho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alface)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tomate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scatchups)
                        .addGap(84, 84, 84)
                        .addComponent(TxtClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cebola)
                    .addComponent(pimentao)
                    .addComponent(maionese)
                    .addComponent(batata)
                    .addComponent(vina)
                    .addComponent(milho)
                    .addComponent(alface)
                    .addComponent(tomate)
                    .addComponent(TxtClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scatchups))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btIngredientes))
        );

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setEnabled(false);

        txtQuantidade.setEditable(false);
        txtQuantidade.setText("1");

        txtTudo.setEditable(false);
        txtTudo.setText("0");
        txtTudo.setEnabled(false);
        txtTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTudoActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTVisor.setEditable(false);
        jTVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTVisorActionPerformed(evt);
            }
        });

        jTVisorRetira.setEditable(false);

        jButton4.setText("?");
        jButton4.setToolTipText("Ajuda");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextValor.setEditable(false);
        jTextValor.setEnabled(false);
        jTextValor.setFocusable(false);

        txtTelefones.setEditable(false);
        txtTelefones.setText("...........");
        txtTelefones.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(91, 91, 91)
                .addComponent(txtTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTVisorRetira, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTVisorRetira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(txtTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (JOptionPane.showConfirmDialog(null,"Confirma o acrescimo na tabela PEDIDOS?")==JOptionPane.OK_OPTION){  
            
            //cadastrando();
            Seleciona();
            //SemIgrendientes();
            //somente clientes
            //Pedidos.txtCliente.setText(TxtClientes.getText()+" | "+txtEndereco.getText());
             
            //dispose();
          
            
        }else{
        
        
        }   
        
           //sair();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LimpaCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbOvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOvoActionPerformed
        if (cbOvo.isSelected()) {
            
          nomeDigitado("Ovo,");
          numeroDigitado("2.0");
           //Somatorio();
           //cbMilho.setSelected(false);
           //cbMilho.isEnabled();
        
        }
    }//GEN-LAST:event_cbOvoActionPerformed

    private void cbBatataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBatataActionPerformed
       if (cbBatata.isSelected()) {
            
          nomeDigitado("Bata,");
          numeroDigitado("2.0");
           //Somatorio();
           //cbMilho.setSelected(false);
           //cbMilho.isEnabled();
        
        }else{
           
       }
    }//GEN-LAST:event_cbBatataActionPerformed

    private void cbMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMilhoActionPerformed
        if (cbMilho.isSelected()) {
            
           nomeDigitado("Milh,");
           numeroDigitado("2.0");
           //Somatorio();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
        }
    }//GEN-LAST:event_cbMilhoActionPerformed

    private void cbErvilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbErvilhaActionPerformed
        if (cbErvilha.isSelected()) {
            
           nomeDigitado("Ervi,");
           numeroDigitado("2.0");
           //Somatorio();
           //cbErvilha.setSelected(false);
           //cbErvilha.isEnabled();
        }
    }//GEN-LAST:event_cbErvilhaActionPerformed
    private void MeuValor() {
        Pedidos tudo = new Pedidos(); 
        //setResizable(false);//desabilitar o Botao Maximizar
        setLocationRelativeTo(null);//iniciar a tela no centro do monitor

        txtTotal.setText(tudo.getValorTotal());// apresentando o valor da variavel
        //JOptionPane.showMessageDialog(null, "Erro na soma Acrescimo"+ valorTotal);  

    }
    private void SomarFora(){
    try{
        
        //Pedidos tudo = new Pedidos(); 
        //double valorTotal = Double.valueOf(tudo.getValorTotal());
        double valorTotal  = Double.valueOf(Pedidos.txtValorFinal.getText());//valor que vai receber 
       // double valorAtual  = Double.valueOf(Pedidos.txtAcresce.getText());//valor que vai receber  
        double acresce = Double.valueOf(Pedidos.txtAcrecimo.getText());
       // double valoritem = 3.5;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valorTotal + acresce);//valor recebido menos o total
        //total += Double.valueOf(Result); 
        Pedidos.txtValorFinal.setText((String.valueOf(Result)));
        //Pedidos.tfValor.setValue((String.valueOf(Result)));
    
       } catch (NumberFormatException ex){ 
        //JOptionPane.showMessageDialog(null, "Erro,!!"+ex); 
        JOptionPane.showMessageDialog(null, "Erro na soma Acrescimo"+ ex);  
       }
    }
    private void somatorios(){
            SomarFora();
            Pedidos.txtAcresce.setText("");
            //Pedidos.txtAcrecimo.setText("0");
            
            dispose();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           
        if (JOptionPane.showConfirmDialog(null,"Deseja sair sem escolher NADA ?")==JOptionPane.OK_OPTION){  
            
            dispose();
            
          
            
        }else{
                    
            
            return;
           //System.exit(0);
        }   
        
          
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void catupiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catupiryActionPerformed

        if (catupiry.isSelected()) {
            
            nomeDigitado("Catupi,");
            numeroDigitado("2.5");
        
        }
        
    }//GEN-LAST:event_catupiryActionPerformed

    private void salsichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salsichaActionPerformed
        if (salsicha.isSelected()) {
            
            nomeDigitado("Salsi,");
            numeroDigitado("2.5");
        
        }
    }//GEN-LAST:event_salsichaActionPerformed

    private void hamburguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamburguerActionPerformed
        if (hamburguer.isSelected()) {
            
            nomeDigitado("Hambur,");
            numeroDigitado("2.5");
        
        }
    }//GEN-LAST:event_hamburguerActionPerformed

    private void presuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presuntoActionPerformed
        if (presunto.isSelected()) {
            
            nomeDigitado("Presu,");
            numeroDigitado("4.5");
        
        }
    }//GEN-LAST:event_presuntoActionPerformed

    private void mussarelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mussarelaActionPerformed
       if (mussarela.isSelected()) {
            
            nomeDigitado("Mussa,");
            numeroDigitado("4.5");
        
        }
    }//GEN-LAST:event_mussarelaActionPerformed

    private void cheddarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheddarActionPerformed
        if (cheddar.isSelected()) {
            
            nomeDigitado("Chedd,");
            numeroDigitado("4.5");
        
        }
    }//GEN-LAST:event_cheddarActionPerformed

    private void calabresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calabresaActionPerformed
        if (calabresa.isSelected()) {
            
            nomeDigitado("Calab,");
            numeroDigitado("7.0");
        
        }
    }//GEN-LAST:event_calabresaActionPerformed

    private void bacconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacconActionPerformed
       if (baccon.isSelected()) {
            
            nomeDigitado("Bacc,");
            numeroDigitado("7.0");
        
        }
    }//GEN-LAST:event_bacconActionPerformed

    private void frangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frangoActionPerformed
        if (frango.isSelected()) {
            
            nomeDigitado("Fran,");
            numeroDigitado("7.0");
        
        }
    }//GEN-LAST:event_frangoActionPerformed

    private void pmaioneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmaioneseActionPerformed
        if (pmaionese.isSelected()) {
            
            nomeDigitado("Maion,");
            numeroDigitado("7.0");
        
        }
    }//GEN-LAST:event_pmaioneseActionPerformed

    private void milhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milhoActionPerformed
        
    }//GEN-LAST:event_milhoActionPerformed
    private void SemIgrendientes(){
        if (cebola.isSelected()) {
            
          nomeDigitadodetalhes("s/cebo,");
            
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
        
        
        }
        if (pimentao.isSelected()) {
            
          nomeDigitadodetalhes("s/pimen,");
            
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (maionese.isSelected()) {
            
          nomeDigitadodetalhes("s/maione,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (batata.isSelected()) {
            
          nomeDigitadodetalhes("s/bata,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (milho.isSelected()) {
            
          nomeDigitadodetalhes("s/milho,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (vina.isSelected()) {
            
          nomeDigitadodetalhes("s/vina,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (alface.isSelected()) {
            
          nomeDigitadodetalhes("s/alfa,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (tomate.isSelected()) {
            
          nomeDigitadodetalhes("s/toma,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (sbaccon.isSelected()) {
            
          nomeDigitadodetalhes("s/bacc,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (scatupiry.isSelected()) {
            
          nomeDigitadodetalhes("s/catu,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (ssalsicha.isSelected()) {
            
          nomeDigitadodetalhes("s/sals,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (scalabresa.isSelected()) {
            
          nomeDigitadodetalhes("s/cala,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (frango.isSelected()) {
            
          nomeDigitadodetalhes("s/fran,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (smolho.isSelected()) {
            
          nomeDigitadodetalhes("s/molho,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (squeijo.isSelected()) {
            
          nomeDigitadodetalhes("s/queijo,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (spresunto.isSelected()) {
            
          nomeDigitadodetalhes("s/pres,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (shamburguer.isSelected()) {
            
          nomeDigitadodetalhes("s/hambu,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (servilha.isSelected()) {
            
          nomeDigitadodetalhes("s/ervilh,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        if (scatchup.isSelected()) {
            
          nomeDigitadodetalhes("s/catchu,");
          Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
        //--if (outros.isSelected()) {
                             
        //--  nome = JOptionPane.showInputDialog(null, "Digite sua escolha?");
        //--  Pedidos.Tabela.setValueAt(nome, Pedidos.Tabela.getSelectedRow(), 3);
          
       //-- }
       //-- dispose();
    }
    private void vinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinaActionPerformed
       
    }//GEN-LAST:event_vinaActionPerformed

    private void btIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngredientesActionPerformed
        SemIgrendientes();
    }//GEN-LAST:event_btIngredientesActionPerformed

    private void cebolaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cebolaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cebolaStateChanged

    private void outrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outrosActionPerformed
       if (outros.isSelected() & JOptionPane.showConfirmDialog(null,"Confirma sua ESCOLHA NA TABELA PEDIDOS?")==JOptionPane.OK_OPTION) {
            
          nome = JOptionPane.showInputDialog(null, "Digite sua escolha?");
          Pedidos.Tabela.setValueAt(nome, Pedidos.Tabela.getSelectedRow(), 3);
      }else{
          dispose();
       }
       
       
    }//GEN-LAST:event_outrosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       JOptionPane.showMessageDialog(null, "Caso deseje escolher somente retirar os ingredientes, faça sua escolha e clique no boatão Retira Ingredientes"+"\n"+" Telefone: 41-988503864 - diagaotekwondo@hotmail.com");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTudoActionPerformed

 
    private void jTVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTVisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTVisorActionPerformed

    private void batataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batataActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PedidoDetalhado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtClientes;
    private javax.swing.JCheckBox alface;
    private javax.swing.JCheckBox baccon;
    private javax.swing.JCheckBox batata;
    private javax.swing.JButton btIngredientes;
    private javax.swing.JCheckBox calabresa;
    private javax.swing.JCheckBox catupiry;
    private javax.swing.JCheckBox cbBatata;
    private javax.swing.JCheckBox cbErvilha;
    private javax.swing.JCheckBox cbMilho;
    private javax.swing.JCheckBox cbOvo;
    private javax.swing.JCheckBox cebola;
    private javax.swing.JCheckBox cheddar;
    private javax.swing.JCheckBox frango;
    private javax.swing.JCheckBox hamburguer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTVisor;
    private javax.swing.JTextField jTVisorRetira;
    private javax.swing.JTextField jTextValor;
    private javax.swing.JCheckBox maionese;
    private javax.swing.JCheckBox milho;
    private javax.swing.JCheckBox mussarela;
    private javax.swing.JCheckBox outros;
    private javax.swing.JCheckBox pimentao;
    private javax.swing.JCheckBox pmaionese;
    private javax.swing.JCheckBox presunto;
    private javax.swing.JCheckBox salsicha;
    private javax.swing.JCheckBox sbaccon;
    private javax.swing.JCheckBox scalabresa;
    private javax.swing.JCheckBox scatchup;
    private javax.swing.JCheckBox scatchups;
    private javax.swing.JCheckBox scatupiry;
    private javax.swing.JCheckBox servilha;
    private javax.swing.JCheckBox sfrango;
    private javax.swing.JCheckBox shamburguer;
    private javax.swing.JCheckBox smolho;
    private javax.swing.JCheckBox spresunto;
    private javax.swing.JCheckBox squeijo;
    private javax.swing.JCheckBox ssalsicha;
    private javax.swing.JCheckBox tomate;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTelefones;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTudo;
    private javax.swing.JCheckBox vina;
    // End of variables declaration//GEN-END:variables

    private void LimpaCamposs(){
        //tfValor.setValue(0);
        txtTotal.setText(String.valueOf(0));
        txtQuantidade.setText(String.valueOf(0));
        txtTudo.setText(String.valueOf(0));
        //tmVendas.removeRow(4); 
        //venda.clear();
        //this.dispose();
        }
    private void sair() {
        dispose();
    }
}
