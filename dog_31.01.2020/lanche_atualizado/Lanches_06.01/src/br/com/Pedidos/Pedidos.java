/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on 12/10/2012, 23:28:22
 */
package br.com.Pedidos;

import br.com.Acessobd.AcessoMySql;
import br.com.Controle.CliBean;
import br.com.Controle.CliControl;
import br.com.Controle.Contato;
import br.com.Controle.ContatoController;
import static br.com.Pedidos.PegaClientes.txtEntrega;
import br.com.Util.TeclasPermitidas;
import br.com.Wiu.Clientes;
import br.com.Wiu.Principal;
import br.com.Wiu.ProdutoBean;
import br.com.Wiu.passa;
//import com.sun.media.Connector;
import br.com.sisvenda.vendas.VendasBean;
import br.com.sisvenda.vendas.VendasControl;
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dialog.ModalityType;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.PreparedStatement;
//import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rox
 */
public final class Pedidos extends javax.swing.JFrame  {
    DefaultTableModel tmVendas = new DefaultTableModel(null, new String[] {"Produto","Valor UN","Qtd","Detalhe do Pedido","Acrecimos","valorAcrescimos"});
    DefaultTableModel tmVendasBebidas = new DefaultTableModel(null, new String[] {"Bebidas","","",""});
    List<ProdutoBean> produtos;
    List<ProdutoBean> venda = new ArrayList<>();
    ListSelectionModel lsmProdutos;
     
  
    private String tipoCadastro;
    private String temp, tempo, numeroAntes, nomeAntes;
    private double num1, num2,resultado;
    private char operacao;
    private double Result; 
    private double total = 0;
    //double total = 0;
    double totalpedidos = 0;
    //double Result = 0;
    private MaskFormatter mascaraCPF;
    //public Pedir(JFrame janela1){  
    private String nome;
    private String jacliquei;
    private final int contador =1; 
    public int response;
    private int conta;
    private String acres;
    private Object impressora;
    private Component m_Page;
    private JTextField textField;
    private Component jButton1;
    private JButton jButton2;
    JPanel northpanel, southpanel;			// declare reference variables
    JTextField jfield;
    JCheckBox pastrybox, burgerbox, pizzabox,cebolas;
    JRadioButton veg, nonveg;
    ButtonGroup bg;
    private String ativo;
    
      
   //}  
    
    /** Creates new form Principal */
    public Pedidos() {
        
     initComponents();
     FormataBotao();
     
     //acrecimos.setVisible(false);
     //jPanel10.setFocusable(true);
    // btXqueijoquente = new javax.swing.JButton();
    // btXqueijoquente.setText("<html>\n<style>\ndiv {\ncolor: white;\nfont-family:arial;\nbackground-color: black\n}\n</style>\n<div>Teste</div>\n</html>");
         txtValorsemacrescimo.setVisible(false);
         cbPedidos.setVisible(false);
         ControleDigitacao();
         //--txtTelefone.setVisible(false);
         
        
        
         Rezise();
     //PegaClientes();
       
     //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/icones/pedidos.jpg")));
     setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
     
         //Entra();
     //jbBotao = new javax.swing.JButton();
     //btXqueijoquente.setText("<html>\n<style>\ndiv {\ncolor: white;\nfont-family:arial;\nbackground-color: black\n}\n</style>\n<div>Teste</div>\n</html>");
     //Entrar();
     //Pedidos.lbPrincipal.
    //lbOperador jMenuOperador
        //java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
       // setBounds((screenSi9ze.width-994)/2, (screenSize.height-780)/2, 890, 970);
       
       //setExtendedState(MAXIMIZED_BOTH);
    
    
    }                                                  //altura   //largura //comprimento
    private void ControleDigitacao(){
        txtDesconto.setDocument(new TeclasPermitidas());
        txtValorrecebido.setDocument(new TeclasPermitidas());
        txtDesconto.setText("0.0");
       // txtTelefone.setDocument(new TeclasPermitidas());
       // txtNome.setDocument(new TeclasPermitidasnome());
         //grava.setVisible(false);
        //gravacesso.setVisible(false);
    }
     public void  FormataBotao(){
         btXfrango.setBorderPainted(false); 
         btXfrango.setContentAreaFilled(false); 
         btXfrango.setFocusPainted(false);
         
         btCoca.setBorderPainted(false); 
         btCoca.setContentAreaFilled(false); 
         btCoca.setFocusPainted(false);
         
         btCocalata.setBorderPainted(false); 
         btCocalata.setContentAreaFilled(false); 
         btCocalata.setFocusPainted(false);
         
          btCerveja.setBorderPainted(false); 
          btCerveja.setContentAreaFilled(false); 
          btCerveja.setFocusPainted(false);
          
          btAgua.setBorderPainted(false); 
          btAgua.setContentAreaFilled(false); 
          btAgua.setFocusPainted(false);
          
          //btKaiser
                  
                  btTampico.setBorderPainted(false); 
          btTampico.setContentAreaFilled(false); 
         btTampico.setFocusPainted(false);
         
         btKaiser.setBorderPainted(false); 
          btKaiser.setContentAreaFilled(false); 
         btKaiser.setFocusPainted(false);
         
         bt600ml.setBorderPainted(false); 
         bt600ml.setContentAreaFilled(false); 
       bt600ml.setFocusPainted(false);
       
       btSabores.setBorderPainted(false); 
        btSabores.setContentAreaFilled(false); 
      btSabores.setFocusPainted(false);
      
      btVale1.setBorderPainted(false); 
        btVale1.setContentAreaFilled(false); 
      btVale1.setFocusPainted(false);
      
     bt200.setBorderPainted(false); 
       bt200.setContentAreaFilled(false); 
      bt200.setFocusPainted(false);
         //btPicanha
          btPicanha.setBorderPainted(false); 
      btPicanha.setContentAreaFilled(false); 
      btPicanha.setFocusPainted(false);
        
     btXsalada.setBorderPainted(false); 
      btXsalada.setContentAreaFilled(false); 
     btXsalada.setFocusPainted(false);
     
         btXegg.setBorderPainted(false); 
         btXegg.setContentAreaFilled(false); 
         btXegg.setFocusPainted(false);
     
          btXBurger.setBorderPainted(false); 
         btXBurger.setContentAreaFilled(false); 
        btXBurger.setFocusPainted(false);
     
     
      btXCalabresa.setBorderPainted(false); 
     btXCalabresa.setContentAreaFilled(false); 
      btXCalabresa.setFocusPainted(false);
      
      btMignom.setBorderPainted(false); 
     btMignom.setContentAreaFilled(false); 
      btMignom.setFocusPainted(false);
      
       btXbaccon.setBorderPainted(false); 
       btXbaccon.setContentAreaFilled(false); 
       btXbaccon.setFocusPainted(false);
       
       btXqueijoquente.setBorderPainted(false); 
       btXqueijoquente.setContentAreaFilled(false); 
       btXqueijoquente.setFocusPainted(false);
       
       btXtudo.setBorderPainted(false); 
       btXtudo.setContentAreaFilled(false); 
       btXtudo.setFocusPainted(false);
         
       btXdog.setBorderPainted(false); 
       btXdog.setContentAreaFilled(false); 
       btXdog.setFocusPainted(false);
       
        btBauru.setBorderPainted(false); 
        btBauru.setContentAreaFilled(false); 
        btBauru.setFocusPainted(false);
         
       btDogbaconChedar.setBorderPainted(false); 
       btDogbaconChedar.setContentAreaFilled(false); 
       btDogbaconChedar.setFocusPainted(false);
       
        btFranCalabresa.setBorderPainted(false); 
        btFranCalabresa.setContentAreaFilled(false); 
        btFranCalabresa.setFocusPainted(false);
        
        btDogCalaBacon.setBorderPainted(false); 
        btDogCalaBacon.setContentAreaFilled(false); 
        btDogCalaBacon.setFocusPainted(false);
        
    }
 
     public void PegaClientes(){
         
       //-- try{
         if (txtconferir.getText().equals("conferir")){//sendo igual
             //sair();
             //PegaClientes.txtId.setText("0.0");
             //PegaClientes.txtNome.setText("balcao");
             jIdCliente.setText("0");
             txtNome.setText("S/Cliente");
             txtTelefone.setText("....");
             txtEndereco.setText("....");
             txtEntrega.setText("0.0");
             //--return (true);
                                 
         }else{//se nao for igual conferir
            
             jIdCliente.setText(PegaClientes.txtId.getText());
             txtNome.setText(PegaClientes.txtNome.getText());
             txtTelefone.setText(PegaClientes.txtTelefone.getText());
             txtEndereco.setText(PegaClientes.txtEndereco.getText());//seta no label o usuario que cadastrou
             txtEntrega.setText(PegaClientes.txtEntrega.getText().toString());
             
             //txtNome.setText(PesquisaClientes.txtNome.setText(""));
         }
         
         //--return (false);
     }
     
  
private void cadastrando() {
        
    try{
    
    
    if (verificarCampos()){
            VendasControl c = new VendasControl();//importa o objeto uqe controla
            VendasBean acessar = new VendasBean();//objeto que instancia a classe ServidorBean para dentro de cliente
            acessar.setItens(conte.getText().trim());
            acessar.setDatVenda(jVendasDia.getText().trim());
            acessar.setPedido(pedir.getText().trim());
            acessar.setRecebido(txtValorrecebido.getText().trim());
            acessar.setTroco(txtTrocos.getText().trim());
            //acessar.setItens(String.valueOf(conte.getText().trim()));//troco
            //acessar.setIdDestino(Integer.parseInt(TxtDestino.getSe().trim()));
            //acessar.setValor(Double.parseDouble(tfValor.getText().trim().toString()));//usava esse antes total
            //acessar.setValor(Double.parseDouble(txtValorFinal.getText().trim()));//total
            acessar.setValor(Double.parseDouble(tfValor.getText().trim()));//total
            
            //acessar.setFoto(jTFoto.getText().trim());
            //int codigo = c.buscarCodigoCadastrado() + 1;//pega o ultimo codigo e acrescenta mais um
            //jTidcad.setText(String.valueOf(codigo));//seta no campo ultimo codigo e cadastra no banco esse valor
            //servidor.setIdentifica(tfatualizacao.getText().trim());
            //acessar.setLogin(Operador.getText().trim());//cadastra o operador que cadastrou
            
            c.cadastrarVenda(acessar);
           
            //c.incluiServidor();//inclui na tabela auditoria
            //JOptionPane.showMessageDialog(null, "CADASTRO ADICIONADO COM SUCESSO!");
            
            //Inicia();executa 
            //DesabilitarCampos();
            
        }else{
            //habilitarCampos();
            //clearFields();
            //btAlterar.setEnabled(false);
            }
       
        } catch (NumberFormatException ex){ 
        //JOptionPane.showMessageDialog(null, "Erro,!!"+ex); 
        JOptionPane.showMessageDialog(null, "Erro na Venda"+ ex);  
      }
    
    
    
    }
    
    private void cadastrandoPedidos() {//Mysql atualizei para pegar na coluna desconto, o valor do pedido do dia
        
   
    
    
    //if (!VerificarEntrega()){
     try{   
      
            VendasControl c = new VendasControl();//importa o objeto uqe controla
            VendasBean acessar = new VendasBean();//objeto que instancia a classe ServidorBean para dentro de cliente
           
            acessar.setDatVenda(jVendasDia.getText().trim());//data
            acessar.setHora(Time.valueOf(txtHora.getText().trim()));//hora
            acessar.setCodigoCliente(Integer.parseInt(jIdCliente.getText().trim()));//id_clientes
            acessar.setPedido(txtNome.getText().trim());//clientes
            acessar.setQuantidade(Integer.parseInt(conte.getText().trim()));//quantidade de itens
            acessar.setEntrega(Double.valueOf(txtEntrega.getText().trim()));//entrega
            
            //acessar.setTroco(txtTrocos.getText().trim());
            //--atualizei para pegar a quantidade de pedidos do dia 13/08/2022
            //--acessar.setPedir(Double.parseDouble(pedir.getText().trim()));//pegar para calcular quantidade de pedidos
            acessar.setPediro(Double.valueOf(pedir.getText().trim()));//pegar para calcular quantidade de pedidos
//acessar.setItens(String.valueOf(conte.getText().trim()));//troco
            //acessar.setIdDestino(Integer.parseInt(TxtDestino.getSe().trim()));
            //acessar.setValor(Double.parseDouble(tfValor.getText().trim().toString()));//usava esse antes total
            //acessar.setValor(Double.parseDouble(txtValorFinal.getText().trim()));//total
            acessar.setValor(Double.parseDouble(tfValor.getText().trim()));//total
            
            //acessar.setFoto(jTFoto.getText().trim());
            //int codigo = c.buscarCodigoCadastrado() + 1;//pega o ultimo codigo e acrescenta mais um
            //jTidcad.setText(String.valueOf(codigo));//seta no campo ultimo codigo e cadastra no banco esse valor
            //servidor.setIdentifica(tfatualizacao.getText().trim());
            //acessar.setLogin(Operador.getText().trim());//cadastra o operador que cadastrou
            
            //c.cadastrarVenda(acessar);
             c.cadastrarPedidoMysql(acessar);
             //ImprimiaoSair();//imprimi impressora
            //c.incluiServidor();//inclui na tabela auditoria
            //JOptionPane.showMessageDialog(null, "CADASTRO ADICIONADO COM SUCESSO!");
            
            //Inicia();executa 
            //DesabilitarCampos();
            
        //--  }else{
            // ImprimiaoSair();
            // habilitarCampos();
            //clearFields();
            //btAlterar.setEnabled(false);
       //}
       
       } catch (NumberFormatException ex){ 
            JOptionPane.showMessageDialog(null, "Erro,!!"+ex); 
           // JOptionPane.showMessageDialog(null, "Erro ao cadastrar esse rrPedido"+ ex);  
       }
    
     //-- }
    
    }
    
    public String getValorTotal(){//metodo que passa por parametro o que pega da label Operador, pode ser usado
    
     return tfValor.getText(); //retorna o nome do operador
    
    }
    
    private void Demarcar(){
     
        //pedindo.isSelected(true);
 
    }
    private void fechar(){
        
            if (JOptionPane.showConfirmDialog(this, "Vai fechar tudo. Continua?",   
                    "Confirme o fechamento",  
                    JOptionPane.YES_NO_OPTION) != JOptionPane.OK_OPTION){ 
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //DESABILITA O X NO FORMULÁRIO
                return;  
            }  
      
            //Fecha o sistema inteiro  
            System.exit(0);  
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DESABILITA O X NO FORMULÁRIO
      
            /*Se você quisesse fechar só o painel de cadastro, você faria: 
            fc.dispose();            
            */  
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btXfrango = new javax.swing.JButton();
        btXsalada = new javax.swing.JButton();
        btXegg = new javax.swing.JButton();
        btXbaccon = new javax.swing.JButton();
        btXBurger = new javax.swing.JButton();
        btBauru = new javax.swing.JButton();
        btXqueijoquente = new javax.swing.JButton();
        btXCalabresa = new javax.swing.JButton();
        btXtudo = new javax.swing.JButton();
        btXdog = new javax.swing.JButton();
        btPicanha = new javax.swing.JButton();
        btMignom = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btCoca = new javax.swing.JButton();
        btCocalata = new javax.swing.JButton();
        btCerveja = new javax.swing.JButton();
        btAgua = new javax.swing.JButton();
        btTampico = new javax.swing.JButton();
        btKaiser = new javax.swing.JButton();
        bt600ml = new javax.swing.JButton();
        btSabores = new javax.swing.JButton();
        bt200 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaBebidas = new javax.swing.JTable();
        btVale1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btFinal = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        conte = new javax.swing.JLabel();
        Removelinha = new javax.swing.JButton();
        txtQtd = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        PassaVlor = new javax.swing.JToggleButton();
        Pega = new javax.swing.JButton();
        contebebidas = new javax.swing.JLabel();
        txtSomaProdutos = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        cbQtd = new javax.swing.JComboBox();
        txtQuantidade = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btTroco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPede1 = new javax.swing.JLabel();
        pedir = new javax.swing.JTextField();
        jPede = new javax.swing.JLabel();
        jCount = new javax.swing.JLabel();
        txtTrocos = new javax.swing.JFormattedTextField();
        txtValorrecebido = new javax.swing.JFormattedTextField();
        txtValorFinal = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbPedidos = new javax.swing.JComboBox();
        txtEndereco = new javax.swing.JTextField();
        jCheckLimpar = new javax.swing.JCheckBox();
        txtTelefone = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtconferir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tableindice = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        cebola = new javax.swing.JLabel();
        ervilha = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btDogcalaChedar = new javax.swing.JButton();
        btDogCalaBacon = new javax.swing.JButton();
        btFranCalabresa = new javax.swing.JButton();
        btFranCatupiri = new javax.swing.JButton();
        btFranCheder = new javax.swing.JButton();
        btDogfrango = new javax.swing.JButton();
        btQueijo = new javax.swing.JButton();
        btPrensado = new javax.swing.JButton();
        btTradicional = new javax.swing.JButton();
        btDogcalaCatu = new javax.swing.JButton();
        btDogBacon = new javax.swing.JButton();
        btDogbaconChedar = new javax.swing.JButton();
        btDogbaconCatupiry = new javax.swing.JButton();
        btDogEspecialCatupiri = new javax.swing.JButton();
        btDogEspecialChedar = new javax.swing.JButton();
        pedindo = new javax.swing.JCheckBox();
        detalhe = new javax.swing.JLabel();
        acrescimo = new javax.swing.JLabel();
        acrescimo1 = new javax.swing.JLabel();
        acrescimo2 = new javax.swing.JLabel();
        acrescimo3 = new javax.swing.JLabel();
        acrescimo4 = new javax.swing.JLabel();
        btDogbacon = new javax.swing.JButton();
        btDogEspecial = new javax.swing.JButton();
        dogcalabresa = new javax.swing.JButton();
        dogsimplao = new javax.swing.JButton();
        txtValorsemacrescimo = new javax.swing.JTextField();
        tfValorsem = new javax.swing.JLabel();
        jTVisor = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtAcrecimo = new javax.swing.JTextField();
        txtAcresce = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jIdCliente = new javax.swing.JTextField();
        txtEntrega = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        print = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Vendas = new javax.swing.JMenuItem();
        jData = new javax.swing.JMenu();
        jVendasDia = new javax.swing.JMenuItem();
        jvendaHora = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuOperador = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenuItem();
        jMenuPesquisa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pedidos");
        setBackground(new java.awt.Color(255, 0, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Anotações"));

        Tabela.setModel(tmVendas);
        Tabela.setModel(tmVendas);
        Tabela.setModel(tmVendas);
        Tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmProdutos = Tabela.getSelectionModel();
        lsmProdutos.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()){
                    // tbProdutosLinhaSelecionada();
                }
            }
        }
    );
    Tabela.setToolTipText("Clique para aplicar uma alteração");
    Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            TabelaMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(Tabela);

    jPanel3.setBackground(new java.awt.Color(153, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("LANCHES"));
    jPanel3.setToolTipText("");

    btXfrango.setBackground(new java.awt.Color(153, 153, 0));
    btXfrango.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXfrango.setForeground(new java.awt.Color(153, 0, 153));
    btXfrango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-frango.png"))); // NOI18N
    btXfrango.setText("X-FRANGO");
    btXfrango.setToolTipText("X-FRANGO");
    btXfrango.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btXfrangoMouseClicked(evt);
        }
    });
    btXfrango.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXfrangoActionPerformed(evt);
        }
    });

    btXsalada.setBackground(new java.awt.Color(0, 153, 0));
    btXsalada.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXsalada.setForeground(new java.awt.Color(255, 51, 0));
    btXsalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-salada.png"))); // NOI18N
    btXsalada.setToolTipText("X-SALADA");
    btXsalada.setFocusable(false);
    btXsalada.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXsaladaActionPerformed(evt);
        }
    });

    btXegg.setBackground(new java.awt.Color(255, 204, 102));
    btXegg.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXegg.setForeground(new java.awt.Color(153, 0, 153));
    btXegg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-ovo.png"))); // NOI18N
    btXegg.setToolTipText("X-EGG");
    btXegg.setPreferredSize(new java.awt.Dimension(89, 23));
    btXegg.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXeggActionPerformed(evt);
        }
    });

    btXbaccon.setBackground(new java.awt.Color(204, 0, 0));
    btXbaccon.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXbaccon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-baccon.png"))); // NOI18N
    btXbaccon.setToolTipText("X-BACON");
    btXbaccon.setPreferredSize(new java.awt.Dimension(89, 23));
    btXbaccon.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXbacconActionPerformed(evt);
        }
    });

    btXBurger.setBackground(new java.awt.Color(0, 102, 102));
    btXBurger.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXBurger.setForeground(new java.awt.Color(255, 0, 0));
    btXBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-burger.png"))); // NOI18N
    btXBurger.setToolTipText("X-BURGER");
    btXBurger.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btXBurgerMouseClicked(evt);
        }
    });
    btXBurger.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXBurgerActionPerformed(evt);
        }
    });

    btBauru.setBackground(new java.awt.Color(255, 102, 102));
    btBauru.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btBauru.setForeground(new java.awt.Color(153, 0, 153));
    btBauru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/bauru.png"))); // NOI18N
    btBauru.setToolTipText("BAURU");
    btBauru.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btBauruMouseClicked(evt);
        }
    });
    btBauru.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btBauruActionPerformed(evt);
        }
    });

    btXqueijoquente.setBackground(new java.awt.Color(255, 255, 51));
    btXqueijoquente.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXqueijoquente.setForeground(new java.awt.Color(102, 153, 0));
    btXqueijoquente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-gourmet.png"))); // NOI18N
    btXqueijoquente.setToolTipText("X-GOURMET");
    btXqueijoquente.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btXqueijoquenteMouseClicked(evt);
        }
    });
    btXqueijoquente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXqueijoquenteActionPerformed(evt);
        }
    });

    btXCalabresa.setBackground(new java.awt.Color(102, 0, 0));
    btXCalabresa.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXCalabresa.setForeground(new java.awt.Color(204, 204, 0));
    btXCalabresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-calabresa.png"))); // NOI18N
    btXCalabresa.setToolTipText("X-CALABRESA");
    btXCalabresa.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btXCalabresaMouseClicked(evt);
        }
    });
    btXCalabresa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXCalabresaActionPerformed(evt);
        }
    });

    btXtudo.setBackground(new java.awt.Color(0, 204, 204));
    btXtudo.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXtudo.setForeground(new java.awt.Color(153, 0, 153));
    btXtudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-tudo.png"))); // NOI18N
    btXtudo.setToolTipText("X-TUDO");
    btXtudo.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btXtudoMouseClicked(evt);
        }
    });
    btXtudo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXtudoActionPerformed(evt);
        }
    });

    btXdog.setBackground(new java.awt.Color(51, 51, 255));
    btXdog.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    btXdog.setForeground(new java.awt.Color(0, 204, 204));
    btXdog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-dog1.png"))); // NOI18N
    btXdog.setToolTipText("X-DOG");
    btXdog.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btXdogMouseClicked(evt);
        }
    });
    btXdog.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btXdogActionPerformed(evt);
        }
    });

    btPicanha.setBackground(new java.awt.Color(204, 204, 255));
    btPicanha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btPicanha.setForeground(new java.awt.Color(204, 0, 0));
    btPicanha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-picanha.png"))); // NOI18N
    btPicanha.setToolTipText("fora-do-cardapio");
    btPicanha.setEnabled(false);
    btPicanha.setPreferredSize(new java.awt.Dimension(89, 23));
    btPicanha.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btPicanhaActionPerformed(evt);
        }
    });

    btMignom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btMignom.setForeground(new java.awt.Color(102, 0, 0));
    btMignom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/x-mingnon.png"))); // NOI18N
    btMignom.setToolTipText("fora-do-cardapio");
    btMignom.setEnabled(false);
    btMignom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btMignomActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btXCalabresa, 0, 78, Short.MAX_VALUE)
                .addComponent(btXfrango, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btBauru, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addComponent(btXsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(btXegg, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btXbaccon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(btXqueijoquente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btXtudo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btXdog, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(btXBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btPicanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btMignom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btXegg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btXbaccon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXfrango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btXsalada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(btXBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(btPicanha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btXqueijoquente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btXtudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btXdog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btMignom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXCalabresa, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(btBauru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap())
    );

    jPanel4.setBackground(new java.awt.Color(153, 255, 153));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("BEBIDAS"));
    jPanel4.setToolTipText("");

    btCoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/coca cola 2 litros.jpg"))); // NOI18N
    btCoca.setToolTipText("Coca 2 Litros");
    btCoca.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCocaActionPerformed(evt);
        }
    });

    btCocalata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/lata.png"))); // NOI18N
    btCocalata.setToolTipText("Coca Lata");
    btCocalata.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCocalataActionPerformed(evt);
        }
    });

    btCerveja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/coca-1litro.jpg"))); // NOI18N
    btCerveja.setToolTipText("Coca Litro");
    btCerveja.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCervejaActionPerformed(evt);
        }
    });

    btAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/agua.jpg"))); // NOI18N
    btAgua.setToolTipText("Água Mineral");
    btAgua.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btAguaActionPerformed(evt);
        }
    });

    btTampico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/tampico.png"))); // NOI18N
    btTampico.setToolTipText("Tampico&Chá");
    btTampico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btTampicoActionPerformed(evt);
        }
    });

    btKaiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/cerveja.jpg"))); // NOI18N
    btKaiser.setToolTipText("Cerveja Amstel, Brahma");
    btKaiser.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btKaiserActionPerformed(evt);
        }
    });

    bt600ml.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/refri_600.jpg"))); // NOI18N
    bt600ml.setToolTipText("Ref. 600ml");
    bt600ml.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt600mlActionPerformed(evt);
        }
    });

    btSabores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/sabores.jpg"))); // NOI18N
    btSabores.setToolTipText("Sabores 2 Litros");
    btSabores.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btSaboresActionPerformed(evt);
        }
    });

    bt200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/coca-200.jpg"))); // NOI18N
    bt200.setToolTipText("Coca200");
    bt200.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt200ActionPerformed(evt);
        }
    });

    TabelaBebidas.setModel(tmVendasBebidas);
    TabelaBebidas.setModel(tmVendasBebidas);
    TabelaBebidas.setModel(tmVendasBebidas);
    TabelaBebidas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    lsmProdutos = TabelaBebidas.getSelectionModel();
    lsmProdutos.addListSelectionListener(new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent e) {
            if (! e.getValueIsAdjusting()){
                // tbProdutosLinhaSelecionada();
            }
        }
    }
    );
    TabelaBebidas.setToolTipText("Somente Bebidas");
    TabelaBebidas.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            TabelaBebidasMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(TabelaBebidas);

    btVale1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/vale.jpg"))); // NOI18N
    btVale1.setToolTipText("Suco dVale");
    btVale1.setEnabled(false);
    btVale1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btVale1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(btCoca, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btCocalata, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btTampico, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btKaiser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(bt600ml, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btSabores, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btVale1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(bt200, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btCoca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCocalata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCerveja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAgua, 0, 0, Short.MAX_VALUE)
                .addComponent(btTampico, 0, 0, Short.MAX_VALUE)
                .addComponent(btKaiser, 0, 0, Short.MAX_VALUE)
                .addComponent(bt600ml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSabores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVale1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addContainerGap())
    );

    jPanel2.setBackground(new java.awt.Color(255, 255, 102));

    btFinal.setBackground(new java.awt.Color(0, 255, 102));
    btFinal.setForeground(new java.awt.Color(0, 255, 153));
    btFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/finalizar.png"))); // NOI18N
    btFinal.setText("Pedidos");
    btFinal.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btFinalMouseClicked(evt);
        }
    });
    btFinal.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btFinalActionPerformed(evt);
        }
    });

    btnImprimir.setText(".....................");
    btnImprimir.setToolTipText("Imprimir 2 via");
    btnImprimir.setFocusPainted(false);
    btnImprimir.setOpaque(false);
    btnImprimir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnImprimirActionPerformed(evt);
        }
    });

    btRemove.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
    btRemove.setForeground(new java.awt.Color(255, 0, 0));
    btRemove.setText("Remove Tudo");
    btRemove.setToolTipText("Cancela tudo ");
    btRemove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btRemoveActionPerformed(evt);
        }
    });

    conte.setText("0.0");
    conte.setToolTipText("Lanches");

    Removelinha.setText("....................");
    Removelinha.setToolTipText("Remove ultimo Item");
    Removelinha.setEnabled(false);
    Removelinha.setFocusable(false);
    Removelinha.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RemovelinhaActionPerformed(evt);
        }
    });

    txtQtd.setEditable(false);
    txtQtd.setEnabled(false);

    btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/sair.gif"))); // NOI18N
    btSair.setText("Sair");
    btSair.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btSairActionPerformed(evt);
        }
    });

    PassaVlor.setText("PassaValor");
    PassaVlor.setEnabled(false);
    PassaVlor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            PassaVlorActionPerformed(evt);
        }
    });

    Pega.setText("...");
    Pega.setEnabled(false);
    Pega.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            PegaActionPerformed(evt);
        }
    });

    contebebidas.setText("0.0");
    contebebidas.setToolTipText("Bebidas");

    txtSomaProdutos.setEditable(false);
    txtSomaProdutos.setText("........");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(btFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(PassaVlor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Pega, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
            .addComponent(Removelinha, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(31, 31, 31)
            .addComponent(contebebidas)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtSomaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(conte, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(186, 186, 186))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(btRemove)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PassaVlor)
                        .addComponent(Pega)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conte)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Removelinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contebebidas)
                    .addComponent(txtSomaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(btFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(22, 22, 22))
    );

    jPanel5.setBackground(new java.awt.Color(255, 255, 102));
    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("CONTROLE "));

    cbQtd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
    cbQtd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbQtdActionPerformed(evt);
        }
    });

    txtQuantidade.setEditable(false);
    txtQuantidade.setText("1");
    txtQuantidade.setEnabled(false);

    jPanel6.setBackground(new java.awt.Color(255, 255, 102));
    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Receber Dinheiro"));
    jPanel6.setPreferredSize(new java.awt.Dimension(600, 264));

    btTroco.setText("Troco");
    btTroco.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btTrocoActionPerformed(evt);
        }
    });

    jLabel1.setText("Total");

    jPede1.setText("Pedido");

    pedir.setEditable(false);
    pedir.setBackground(new java.awt.Color(255, 204, 0));
    pedir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addComponent(jPede1)
                    .addGap(19, 19, 19))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addComponent(pedir)
                    .addContainerGap())))
    );
    jPanel11Layout.setVerticalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
            .addComponent(jPede1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pedir, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addContainerGap())
    );

    jPede.setText("Pedido");

    jCount.setText(".....");

    txtTrocos.setEditable(false);
    txtTrocos.setBackground(new java.awt.Color(153, 255, 153));
    txtTrocos.setToolTipText("Seu Troco");
    txtTrocos.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
    txtTrocos.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            txtTrocosFocusLost(evt);
        }
    });

    txtValorrecebido.setBackground(new java.awt.Color(153, 255, 153));
    txtValorrecebido.setToolTipText("Centavos digite com ponto! Ex.: 50.5 Cinqueta ponto 50 ceentavos");
    txtValorrecebido.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
    txtValorrecebido.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            txtValorrecebidoFocusLost(evt);
        }
    });
    txtValorrecebido.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtValorrecebidoMouseClicked(evt);
        }
    });
    txtValorrecebido.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtValorrecebidoKeyTyped(evt);
        }
    });

    txtValorFinal.setEditable(false);
    txtValorFinal.setFont(new java.awt.Font("Arial Black", 2, 36)); // NOI18N
    txtValorFinal.setText("0");
    txtValorFinal.setToolTipText("Acrescimos");
    txtValorFinal.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtValorFinalActionPerformed(evt);
        }
    });

    tfValor.setEditable(false);
    tfValor.setBackground(new java.awt.Color(0, 204, 0));
    tfValor.setFont(new java.awt.Font("Arial Black", 1, 77)); // NOI18N
    tfValor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfValorActionPerformed(evt);
        }
    });

    jLabel9.setText("Clientes");

    cbPedidos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cbPedidos.setSelectedIndex(-1);
    cbPedidos.setEnabled(false);
    cbPedidos.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cbPedidosItemStateChanged(evt);
        }
    });
    cbPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            cbPedidosMouseClicked(evt);
        }
    });
    cbPedidos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbPedidosActionPerformed(evt);
        }
    });

    txtEndereco.setEditable(false);
    txtEndereco.setText(".......");
    txtEndereco.setToolTipText("Endereço");
    txtEndereco.setEnabled(false);

    jCheckLimpar.setText("Limpar");
    jCheckLimpar.setToolTipText("Limpa Clientes, ao usar certifique-se corretamente");
    jCheckLimpar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCheckLimparActionPerformed(evt);
        }
    });

    txtTelefone.setEditable(false);
    txtTelefone.setBackground(new java.awt.Color(204, 255, 204));
    txtTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    txtTelefone.setForeground(new java.awt.Color(0, 153, 0));
    txtTelefone.setText(".....");
    txtTelefone.setEnabled(false);
    txtTelefone.setFocusable(false);

    txtHora.setEditable(false);
    txtHora.setText(".........");
    txtHora.setEnabled(false);

    txtNome.setEditable(false);
    txtNome.setText(".......................");
    txtNome.setEnabled(false);

    txtconferir.setEditable(false);
    txtconferir.setText("conferir");
    txtconferir.setEnabled(false);

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/Dial.png"))); // NOI18N
    jLabel3.setText(".......");

    txtDesconto.setEditable(false);
    txtDesconto.setBackground(new java.awt.Color(255, 102, 0));
    txtDesconto.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
    txtDesconto.setText("0");
    txtDesconto.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtDescontoMouseClicked(evt);
        }
    });
    txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txtDescontoFocusGained(evt);
        }
    });

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 51, 51));
    jLabel4.setText("Desconto");

    tableindice.setEditable(false);
    tableindice.setEnabled(false);

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(txtValorrecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtTrocos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorFinal))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDesconto)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTelefone)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtconferir)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPede, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(52, 52, 52)
                    .addComponent(tableindice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(62, 62, 62))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addComponent(jCount, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(171, 171, 171))))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addGap(0, 2, Short.MAX_VALUE)
                            .addComponent(btTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckLimpar)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtconferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jPede)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(tableindice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(2, 15, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCount))
                        .addComponent(txtValorFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4))))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtValorrecebido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTrocos, javax.swing.GroupLayout.Alignment.LEADING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );

    cebola.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
    cebola.setForeground(new java.awt.Color(255, 0, 0));
    cebola.setText(".");

    ervilha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
    ervilha.setForeground(new java.awt.Color(255, 0, 0));
    ervilha.setText(".");

    jPanel7.setBackground(new java.awt.Color(255, 51, 0));
    jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("HOT-DOG"));

    jPanel9.setBackground(new java.awt.Color(255, 204, 0));

    btDogcalaChedar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/calabresa_cheddar.jpg"))); // NOI18N
    btDogcalaChedar.setText("Cheddar");
    btDogcalaChedar.setToolTipText("DOG-CALABRESA E CHEDDAR");
    btDogcalaChedar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogcalaChedarActionPerformed(evt);
        }
    });

    btDogCalaBacon.setBackground(new java.awt.Color(255, 255, 153));
    btDogCalaBacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/dog-baccon.jpg"))); // NOI18N
    btDogCalaBacon.setText("CalaBacon");
    btDogCalaBacon.setToolTipText("Dog-C.Bacon");
    btDogCalaBacon.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogCalaBaconActionPerformed(evt);
        }
    });

    btFranCalabresa.setBackground(new java.awt.Color(255, 51, 51));
    btFranCalabresa.setForeground(new java.awt.Color(102, 102, 0));
    btFranCalabresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/calabresa1.jpg"))); // NOI18N
    btFranCalabresa.setText("Calabresa");
    btFranCalabresa.setToolTipText("Dog-F.Calabresa");
    btFranCalabresa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btFranCalabresaActionPerformed(evt);
        }
    });

    btFranCatupiri.setBackground(new java.awt.Color(153, 153, 153));
    btFranCatupiri.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btFranCatupiri.setForeground(new java.awt.Color(0, 255, 0));
    btFranCatupiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/catupiri.jpg"))); // NOI18N
    btFranCatupiri.setText("F.Catupiry");
    btFranCatupiri.setToolTipText("Dog-F.Catupiry");
    btFranCatupiri.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btFranCatupiriActionPerformed(evt);
        }
    });

    btFranCheder.setBackground(new java.awt.Color(102, 102, 255));
    btFranCheder.setForeground(new java.awt.Color(255, 51, 51));
    btFranCheder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/frango_cheddar.jpg"))); // NOI18N
    btFranCheder.setText("Frang Chedda");
    btFranCheder.setToolTipText("DOG-FRANGO E CHEDDAR");
    btFranCheder.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btFranChederActionPerformed(evt);
        }
    });

    btDogfrango.setBackground(new java.awt.Color(255, 255, 0));
    btDogfrango.setForeground(new java.awt.Color(204, 0, 51));
    btDogfrango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/frango_baccon.jpg"))); // NOI18N
    btDogfrango.setText("FrangBacon");
    btDogfrango.setToolTipText("DOG FRANGO E BACON");
    btDogfrango.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogfrangoActionPerformed(evt);
        }
    });

    btQueijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/queijo.jpg"))); // NOI18N
    btQueijo.setText("3");
    btQueijo.setToolTipText("DOG QUEIJO-QUENTE");
    btQueijo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btQueijoActionPerformed(evt);
        }
    });

    btPrensado.setBackground(new java.awt.Color(204, 255, 204));
    btPrensado.setForeground(new java.awt.Color(204, 0, 204));
    btPrensado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/prensado.jpg"))); // NOI18N
    btPrensado.setText("Prensado");
    btPrensado.setToolTipText("DOG-PRENSADO");
    btPrensado.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btPrensadoActionPerformed(evt);
        }
    });

    btTradicional.setBackground(new java.awt.Color(255, 153, 51));
    btTradicional.setForeground(new java.awt.Color(255, 0, 0));
    btTradicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/tradicional.jpg"))); // NOI18N
    btTradicional.setText("Tradicional");
    btTradicional.setToolTipText("DOG-TRADICIONAL");
    btTradicional.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btTradicionalActionPerformed(evt);
        }
    });

    btDogcalaCatu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/calabres_catupiry.jpg"))); // NOI18N
    btDogcalaCatu.setText("CalabCatup");
    btDogcalaCatu.setToolTipText("DOG-CALABRESA CATUPIRY");
    btDogcalaCatu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogcalaCatuActionPerformed(evt);
        }
    });

    btDogBacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/lanche.png"))); // NOI18N
    btDogBacon.setText("6");
    btDogBacon.setToolTipText("Dog-Bacon");
    btDogBacon.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogBaconActionPerformed(evt);
        }
    });

    btDogbaconChedar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/bac_cheddar.jpg"))); // NOI18N
    btDogbaconChedar.setText("Dog - Cheddar");
    btDogbaconChedar.setToolTipText("Dog-B.Cheddar");
    btDogbaconChedar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogbaconChedarActionPerformed(evt);
        }
    });

    btDogbaconCatupiry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/b-catupiry.jpg"))); // NOI18N
    btDogbaconCatupiry.setText("7");
    btDogbaconCatupiry.setToolTipText("Dog-B.Catupiry");
    btDogbaconCatupiry.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogbaconCatupiryActionPerformed(evt);
        }
    });

    btDogEspecialCatupiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/esp.png"))); // NOI18N
    btDogEspecialCatupiri.setText("14");
    btDogEspecialCatupiri.setToolTipText("DOG-ESPECIAL CATUPIRY");
    btDogEspecialCatupiri.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogEspecialCatupiriActionPerformed(evt);
        }
    });

    btDogEspecialChedar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btDogEspecialChedar.setText("Dog-E.Cheddar");
    btDogEspecialChedar.setToolTipText("Dog-E.Cheddar");
    btDogEspecialChedar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogEspecialChedarActionPerformed(evt);
        }
    });

    pedindo.setBackground(new java.awt.Color(255, 204, 0));
    pedindo.setText("Pedidos ++");
    pedindo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            pedindoActionPerformed(evt);
        }
    });

    detalhe.setText("Completo");

    acrescimo.setText("....");

    acrescimo1.setText("....");

    acrescimo2.setText("....");

    acrescimo3.setText("....");

    acrescimo4.setText("....");

    btDogbacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/botao/dog-baccon2.jpg"))); // NOI18N
    btDogbacon.setText("DogBacc");
    btDogbacon.setToolTipText("Dog e Baccon");
    btDogbacon.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogbaconActionPerformed(evt);
        }
    });

    btDogEspecial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btDogEspecial.setText("Dog-E.Catupiry");
    btDogEspecial.setToolTipText("Dog-E.Catupiry");
    btDogEspecial.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDogEspecialActionPerformed(evt);
        }
    });

    dogcalabresa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    dogcalabresa.setText("{.Dog Calabresa.}-fora-do-cardapio");
    dogcalabresa.setToolTipText("");
    dogcalabresa.setEnabled(false);
    dogcalabresa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dogcalabresaActionPerformed(evt);
        }
    });

    dogsimplao.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    dogsimplao.setText("|----Dog Kids---|");
    dogsimplao.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dogsimplaoActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btFranCheder, 0, 1, Short.MAX_VALUE)
                        .addComponent(btTradicional, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btFranCatupiri, 0, 1, Short.MAX_VALUE)
                        .addComponent(btPrensado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btFranCalabresa, 0, 71, Short.MAX_VALUE)
                        .addComponent(btQueijo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addComponent(dogsimplao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btDogCalaBacon, 0, 0, Short.MAX_VALUE)
                        .addComponent(btDogfrango, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btDogcalaChedar, 0, 65, Short.MAX_VALUE)
                        .addComponent(btDogcalaCatu, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btDogbaconChedar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(btDogbaconCatupiry, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btDogbacon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14))
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(dogcalabresa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btDogEspecialChedar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btDogEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
            .addComponent(btDogBacon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(115, 115, 115)
            .addComponent(btDogEspecialCatupiri, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addComponent(pedindo)
            .addGap(18, 18, 18)
            .addComponent(detalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(acrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(acrescimo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(acrescimo2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(acrescimo3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(82, 82, 82)
            .addComponent(acrescimo4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel9Layout.setVerticalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btDogbacon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTradicional, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPrensado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQueijo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDogfrango, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDogcalaCatu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btDogbaconChedar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDogbaconCatupiry, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDogBacon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDogEspecialCatupiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btDogcalaChedar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btFranCheder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFranCatupiri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btDogCalaBacon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFranCalabresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dogcalabresa)
                        .addComponent(dogsimplao)
                        .addComponent(btDogEspecialChedar)
                        .addComponent(btDogEspecial))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(pedindo)
                .addComponent(detalhe)
                .addComponent(acrescimo4)
                .addComponent(acrescimo)
                .addComponent(acrescimo1)
                .addComponent(acrescimo2)
                .addComponent(acrescimo3))
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    txtValorsemacrescimo.setEditable(false);
    txtValorsemacrescimo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtValorsemacrescimoActionPerformed(evt);
        }
    });

    tfValorsem.setText("........................");

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cebola)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(1015, 1015, 1015)
                            .addComponent(ervilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(538, 538, 538))))
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addComponent(txtValorsemacrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tfValorsem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(cebola)
                    .addGap(92, 92, 92)
                    .addComponent(ervilha))
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValorsemacrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfValorsem))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTVisor.setEditable(false);
    jTVisor.setText("-------------");
    jTVisor.setEnabled(false);

    txtTotal.setEditable(false);
    txtTotal.setText("........");

    txtAcrecimo.setEditable(false);
    txtAcrecimo.setText("0");
    txtAcrecimo.setEnabled(false);

    txtAcresce.setEditable(false);
    txtAcresce.setEnabled(false);

    txtCliente.setEditable(false);
    txtCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
    txtCliente.setForeground(new java.awt.Color(0, 153, 153));
    txtCliente.setText("Venda Local");

    jLabel2.setText("Quantidade");

    jIdCliente.setEditable(false);
    jIdCliente.setText("0");
    jIdCliente.setEnabled(false);

    txtEntrega.setEditable(false);
    txtEntrega.setText("0");
    txtEntrega.setEnabled(false);
    txtEntrega.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEntregaActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(cbQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAcresce, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAcrecimo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(77, 77, 77))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtAcresce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtAcrecimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(99, 99, 99))
    );

    jMenu1.setText("Arquivo");
    jMenu1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenu1ActionPerformed(evt);
        }
    });

    print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
    print.setText("Imprimir Tela");
    print.setToolTipText("Faça aqui sua sequencia de pedidos");
    print.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            printActionPerformed(evt);
        }
    });
    jMenu1.add(print);

    jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
    jMenuItem3.setText("Sobre o Sistema");
    jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem3);

    jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
    jMenuItem4.setText("Sair");
    jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem4ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem4);

    jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
    jMenuItem1.setText("Cancela Tudo");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem1);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Registrar");

    Vendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
    Vendas.setText("Vendas");
    Vendas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            VendasActionPerformed(evt);
        }
    });
    jMenu2.add(Vendas);

    jMenuBar1.add(jMenu2);

    jData.setText("Data das Vendas");

    jVendasDia.setText("Data");
    jData.add(jVendasDia);

    jvendaHora.setSelected(true);
    jvendaHora.setText("Hora");
    jData.add(jvendaHora);

    jMenuBar1.add(jData);

    jMenu4.setText("Utilitarios");

    jMenuItem2.setText("Calculadora");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem2ActionPerformed(evt);
        }
    });
    jMenu4.add(jMenuItem2);

    jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
    jMenuItem5.setText("Deleta Venda");
    jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem5ActionPerformed(evt);
        }
    });
    jMenu4.add(jMenuItem5);

    jMenuBar1.add(jMenu4);

    jMenu5.setText("Operador");

    jMenuOperador.setText(".....");
    jMenu5.add(jMenuOperador);

    jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
    jMenuItem6.setText("Clientes");
    jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem6ActionPerformed(evt);
        }
    });
    jMenu5.add(jMenuItem6);

    jMenuBar1.add(jMenu5);

    jMenuCliente.setText("Clientes");
    jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuClienteActionPerformed(evt);
        }
    });

    jMenuClientes.setText("Clientes");
    jMenuClientes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuClientesActionPerformed(evt);
        }
    });
    jMenuCliente.add(jMenuClientes);

    jMenuPesquisa.setText("PesquisaCliente");
    jMenuPesquisa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuPesquisaActionPerformed(evt);
        }
    });
    jMenuCliente.add(jMenuPesquisa);

    jMenuBar1.add(jMenuCliente);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel5, 0, 559, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        atualizaagora();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/icones/pedidos.jpg")));
        //setBounds(20,10,1200,1250);
    }//GEN-LAST:event_formWindowOpened
     protected boolean verificarQuantidadedd(){
        if (txtQuantidade.getText().equals("um")){//se campo for vazio
            //JOptionPane.showMessageDialog(this,"Observar a quantidade de Pedidos!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showInputDialog(null,"Informe um valor inteiro:\n(ou 0 para sair)"
            ,"Retirar", JOptionPane.QUESTION_MESSAGE);         
            cbQtd.requestFocus();
            txtQuantidade.setText("1");//limpa Campo
            return false;
        }
        return true;
    }
     protected boolean VerificarEntrega(){
      if (txtEntrega.getText().equals("")){
           //JOptionPane.showMessageDialog(this,"Observar a quantidade do Pedido!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);  
            nome = JOptionPane.showInputDialog(null, "Digite o valor da Entrega?");
          //Pedidos.Tabela.setValueAt(nome, Pedidos.Tabela.getSelectedRow(), 3);
            //--txtEntrega.setText(String.valueOf((nome).replace(" ", ",")));
            txtEntrega.setText(String.valueOf((nome)));
                //EscolhaEntraga();
                 return false;
            
           }
             //JOptionPane.showInputDialog(null, "Velores da Entrega com pontos Ex:. 2.5");
             //sair();
             dispose();//fecha caixa dialogo
             return true;
         }
             
    
     protected boolean verificarEntrega(){
        //se campo for vazio
         
           //JOptionPane.showMessageDialog(this,"Observar valor Entrega!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showInputDialog(null,"Informe um valor inteiro:\n(ou 0 para sair)"
           // ,"Retirar", JOptionPane.QUESTION_MESSAGE);         
           String[] choices = {"0.0", "2.5", "5.0", "4.0", "3.0", "6.0", "7.6","outros" };
           String input = (String) JOptionPane.showInputDialog(null, "Entrega...",
              "Valor do pedido", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
               choices, // Array of choices
               choices[1]); // Initial choice
        if (txtEntrega.getText().equals("") && choices.equals("outros")){
               // System.out.println(input);
              //System.out.println(Arrays.toString(list.getSelectedIndices()));
              //EscolhaEntraga();
        }else{
              
             txtEntrega.setText(input);
             return false;
            
             
        }
              
             //txtEntrega.requestFocus();
           // txtQuantidade.setText("1");//limpa Campo
           
            return true;
        //}
        
    }
     
        protected boolean verificarQuantidade(){
        if (txtQuantidade.getText().equals("")){//se campo for vazio
           JOptionPane.showMessageDialog(this,"Observar a quantidade de Pedidos!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showInputDialog(null,"Informe um valor inteiro:\n(ou 0 para sair)"
           // ,"Retirar", JOptionPane.QUESTION_MESSAGE);         
            cbQtd.requestFocus();
            txtQuantidade.setText("1");//limpa Campo
            
            return false;
        }
        return true;
    }
     protected boolean verificarCamposVazio(){
        if (txtQuantidade.getText().trim().equals("")){//se campo for vazio
            JOptionPane.showMessageDialog(this,"Observar a quantidade do Pedido!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            cbQtd.requestFocus();
            return false;
    }
             
        return true;
    }
    private void Mascara(){
        try {
           mascaraCPF = new MaskFormatter("###.00");
        } catch (java.text.ParseException ex) {
            Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void btXsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXsaladaActionPerformed
     
      if (verificarCamposVazio() && verificarQuantidade()){ 
         
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
       //---- double valoritem = 9.0;//valor do lanche
        double valoritem = 10.5;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Salada",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio e somente Numeros!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btXsaladaActionPerformed

    private void btXfrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXfrangoActionPerformed
        
       if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        //----double valoritem = 14.0;//valor do lanche
        double valoritem = 16.0;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        //tfValor.setText(String.valueOf(total));
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Frango",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+acrescimo.getText()+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
        
    }//GEN-LAST:event_btXfrangoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ProcessBuilder builder = new ProcessBuilder("C:\\Windows\\System32\\calc.exe");
         try {builder.start();
         } catch (IOException e) {
//             e.printStackTrace();
         }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCocaActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
      //  double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 12.5;//valor do lanche era 11
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Coca 2litros",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
        
    }//GEN-LAST:event_btCocaActionPerformed

    private void btCocalataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCocalataActionPerformed
        // TODO add your handling code here:
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
    //    double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 5.0;//valor do lanche era 4.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
       // tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Refri Lata",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, e1+"Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
    }//GEN-LAST:event_btCocalataActionPerformed

    private void btCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCervejaActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
       // double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 9.0;//valor do lanche era 8
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
       // tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Coca Litro",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, e1+"Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
   
    }//GEN-LAST:event_btCervejaActionPerformed
    
    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       if (JOptionPane.showConfirmDialog(null,"Deseja imprimir o Pedido teste?")==JOptionPane.OK_OPTION){  
           try {
               //ContaTable();
               //------> calculaTotalProdutos();
               //viadois();
               //Boteco();
               //------> txtQuantidade.setText("1");
               //setExtendedState(Pedidos.ICONIFIED); //miniminiza a tela.
               //pedindo.setSelected(true); //marca a opcao dos pedidos em sequencia
               //esopedir();
               
               // Jacliquei();
               //imprimir("C:\\pedido\\pedidos.txt");
               abrirComanda(); //chama o metodo
           } catch (JRException ex) {
               Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
           }
         
       } 
        
    }//GEN-LAST:event_btnImprimirActionPerformed
    private void CinquentaCents(){
         
    }    private void Real(){
        
    }   
    private void calculaJuros (){

    if (verificarCampos()){   
    double valorRecebido, taxaJuros, diasAtraso, valorFinalPagar, calcTaxa;
    valorRecebido = Double.parseDouble(txtValorrecebido.getText());
    diasAtraso =   Double.parseDouble(txtValorrecebido.getText());
    taxaJuros  =   Double.parseDouble(txtValorrecebido.getText());

    calcTaxa  =   (taxaJuros/100);
    //ValorFinal = ValorParcela * (1+TaxaJuros) ^ diasAtraso
    valorFinalPagar = valorRecebido * Math.pow((1+calcTaxa), diasAtraso);

    jLabel1.setText("Voce vai pagar"+" R$ "+valorFinalPagar);
 
    }

}
    private void calculaTroco (){

    try{    
        
    if (verificarCampos()){   
        double valorRecebido, tfTotal, taxaJuros, diasAtraso, valorFinalTroco, calcTroco;
        valorRecebido = Double.parseDouble(txtValorrecebido.getText());
        tfTotal =   Double.parseDouble(tfValor.getText());
        //taxaJuros  =   Double.parseDouble(txtValorrecebido.getText());

        calcTroco  =   Double.valueOf (valorRecebido - tfTotal);
       //ValorFinal = ValorParcela * (1+TaxaJuros) ^ diasAtraso
       //valorFinalPagar = valorRecebido * Math.pow((1+calcTaxa), diasAtraso);
       ///valorFinalTroco = valorRecebido * Math.pow((1+calcTaxa), diasAtraso);
       
        txtTrocos.setValue(Double.valueOf(calcTroco));
       //jLabel1.setText("Voce vai pagar"+" R$ "+valorFinalPagar);
       }
    
    }catch (NumberFormatException ex){ 
        //JOptionPane.showMessageDialog(null, "Erro,!!"+ex); 
        JOptionPane.showMessageDialog(null, "Erro ao calcular troco, !!!! " +ex);  
    
 
    }

}
    private void Troco(){
     
    try{
        double valorRecebido  = Float.valueOf(txtValorrecebido.getText());//valor que vai receber     
        double tudo = Float.valueOf(tfValor.getText());
       // double valoritem = 3.5;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valorRecebido - tudo);//valor recebido menos o total
        //total += Double.valueOf(Result); 
        //txtTroco.setValue(Result);
        txtTrocos.setText(String.valueOf(Result));
    
    } catch (Exception ex){ 
        //JOptionPane.showMessageDialog(null, "Erro,!!"+ex); 
        JOptionPane.showMessageDialog(null, "Erro ao calcular troco" +ex);  
    }
        
        
        
    
        
}
    public void removeRow(String valor){  
    tmVendas.removeRow(tmVendas.getRowCount()-1);//exclui uma linha     
        total -= Double.parseDouble(valor);
            //tfValor.setValue(total);
            tfValor.setText(String.valueOf(total));
            //vb.setTudo(valor);
            //tmVendas.removeRow(tmVendas.getRowCount()-1);
            //vb.setCodigo(venda.get(tbVendas.getSelectedRow()).getCodigo());
            //LimpaTable();
            
}  
    public void adicionaNaTabela()  
{  
   String a=txtValorrecebido.getText();  //txtProduto
   String b=txtQuantidade.getText(); //valor unitario 
   String c=txtQuantidade.getText();  
  
   double n1 = Double.parseDouble(b);  //valor unitario
   double n2 = Double.parseDouble(c);  //quantidade
  
    DefaultTableModel modelo = (DefaultTableModel)Tabela.getModel();  
    modelo.addRow(new Object [] {a,c,b,(n1*n2)});
    Result = (n1 * n2);//armazena as variavel e multiplica quantidade vezes valor unitario
    total += Double.valueOf(Result); //variavel total armazena e vai acrecentando
//    tfValor.setValue(total);// seta no campo total o resultado do result
    tfValor.setText(String.valueOf(total));
    
}  
    private void gravar(){
        
     //if (venda.isEmpty()){// se tabela estiver vazia
           // JOptionPane.showMessageDialog(this, "Inclua pelo menos um produto!");
        
     //} else {
      

    // Prepara as Variaveis e os componentes usados para gravar. Dividindo os mesmos para o cabeçalho e o item.
    //AcessoAcess bd = new AcessoAcess();
    AcessoMySql bd = new AcessoMySql();
    //Connection con_proc = ConectorFire.getTestConnection();
    //PreparedStatement stmt_proc = null;
    DefaultTableModel tmVendas = (DefaultTableModel)this.Tabela.getModel();
    //String stmt_cab = null;
    PreparedStatement pstm;
    //stmt_item = null;
    //con_cab = ConectorFire.getTestConnection();
    //con_item = ConectorFire.getTestConnection();            
    String comando_cab = "insert into venda values(?,?,?,?,?)";
    //String comando_item = "insert into bc_venda_item values(?,?,?,?,?,?,?)";
        
    try{
       //stmt_cab.executeUpdate();
        

       //grava os itens.
        for (int i = 0; i<Tabela.getRowCount();i++)
        {
          //pstm = con_item.prepareStatement(comando_item);
          pstm = bd.conectar().prepareStatement(comando_cab);
              
          pstm.setInt(1, (i+1));//insere codigo auto increment
          //pstm.setInt(1, Integer.parseInt(txtValorUnitario.getText()));//e para pegaar o Codigo digitado
          //pstm.setInt(2, Integer.parseInt(Tabela.getValueAt(i, 0).toString()));
          pstm.setString(2, (Tabela.getValueAt(i, 0).toString()));//produto
          pstm.setString(3, (Tabela.getValueAt(i, 1).toString()));//
          pstm.setString(4, (Tabela.getValueAt(i, 2).toString()));
         // pstm.setInt(2, Integer.parseInt(Tabela.getValueAt(i, 1).toString()));
          //pstm.setFloat(2, Float.parseFloat(Tabela.getValueAt(i, 1).toString()));
          pstm.setString(5, (jVendasDia.getText().toString()));//pega e grava data
          //pstm.setInt(4, Integer.parseInt(Tabela.getValueAt(i, 2).toString()));//valor
          
          //pstm.setString(4, "ABC");
//          pstm.setDouble(5, Double.parseDouble(Tabela.getValueAt(i, 2).toString()));
          //pstm.setDouble(7, Double.parseDouble(Tabela.getValueAt(i, 4).toString()));
             
          pstm.executeUpdate();
          
          //atualiza saldo dos produtos via storedProcedure.
         // stmt_proc = con_proc.prepareStatement("EXECUTE PROCEDURE PROC_ATUALIZA_SALDO_PR(?,?)");
          //stmt_proc.setInt(1, Integer.parseInt(tabela.getValueAt(i, 0).toString()));
          //stmt_proc.setFloat(2, Integer.parseInt(tabela.getValueAt(i, 2).toString()));
          //stmt_proc.execute();                      
        }                                                          
        
        //fecha as conexões.    
        //con_cab.close();           
        //con_item.close();
         //bloqueio(true);
        JOptionPane.showMessageDialog(rootPane, "Status: Registro gravado com sucesso!!!");            
      //} else
        {  
          //JOptionPane.showMessageDialog(rootPane, "Status: Registro já existente! Verifique!");
          //con_cab.close();
        }
    } catch (Exception ex) 
      {
//        ex.printStackTrace();    
      }
   
  
}
    public void Gravar(){       
          
      try{       
         // o true significa q o arquivo será constante       
           StringBuilder b;       
           String local = "d:/arquivo.txt";    
           FileWriter x = new FileWriter(local,true);       
           String conteudo = txtQuantidade.getText().toString();       
           ArrayList<StringBuilder> linhas = new ArrayList<StringBuilder>();       
               
           for(int i = 0; i< Tabela.getRowCount(); i++){       
           b = new StringBuilder();       
           for(int j = 0; j < Tabela.getColumnCount(); j++){       
                b.append(Tabela.getValueAt(i,j)).append(";");       
           }       
           linhas.add(b);       
         }//é pra fechar aqui!! e por isso que existe indentação!  
                
             
         //conteudo += "\n\r"; // criando nova linha e recuo no arquivo                
           x.write(conteudo); // armazena o texto no objeto x, que aponta para o arquivo                
           for(StringBuilder c: linhas){       
            x.write(c.toString());       
            }      
    
         x.close(); // cria o arquivo        
          // }    //não é pra fechar aqui!  
                    
         JOptionPane.showMessageDialog(null,"Arquivo gravado com sucesso","Concluído",JOptionPane.INFORMATION_MESSAGE);       
      }       
      // em caso de erro apreenta mensagem abaixo       
      catch(Exception e){       
         JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);       
      }       
   }      


  
  
/** 
 * Remove a linha pelo valor da coluna informada 
 * @param val 
 * @param col 
 * @return 
 */  


        private void Doisreis(){
        
    }
    private void btTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrocoActionPerformed
        // TODO add your handling code here:
        //Troco();
        if (txtValorrecebido.getText().equals("")){
            
            JOptionPane.showConfirmDialog(null,"VALOR RECEBIDO NAO PODE SER VAZIO");
            txtValorrecebido.requestFocus();
            return;
            
        }else{
            calculaTroco();
        
        }
        
        
    }//GEN-LAST:event_btTrocoActionPerformed
    private void CancelaTudo(){
        if (JOptionPane.showConfirmDialog(null,"DESEJA CANCELAR TODAS OS PEDIDOS?")==JOptionPane.OK_OPTION){  
            //removeRow(null);
        cancelarVenda();
        cancelarVendaBebidas();
        txtQuantidade.setText("1");
        txtValorFinal.setText("0");
        txtDesconto.setText("0");
                
       // RemoveLinha();
        LimpaCampos();
    }          
    }
    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
     
        CancelaTudo();
        
        
    }//GEN-LAST:event_btRemoveActionPerformed
    private void Excluipedido() {
        Writer out;  
        try {
            out = new FileWriter("C:\\pedido\\pedidos.txt");
            //limpa  
            out.write("");  
            out.flush(); 
        } catch (IOException ex) {
            //Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null,"Nao limpou o arquivo?"+ex);
        }
         
    }
    public void ImprimiaoSair(){
        //       if(contador == 1){ 
               
           // contador++;  
           // this.jCount.setText(contador+""); 
   if  (JOptionPane.showConfirmDialog(null,"Deseja imprimir o Pedido?")==JOptionPane.OK_OPTION){  
       //ContaTable();
       //CalcTotalAcrescimo();
       //txtValorFinal.setText(tfValor.getText());
       //PegaClientes();
       //--txtconferir.setText("cliente");
       PegaClientes();
       calculaTotalProdutos();
       calculaTotalBebidas();
       SomarPedido();//pega botao valor total
       PedidosCozinha();
       PedidosTela();
       Comanda();//grava somentente nao imprimi
       setExtendedState(Pedidos.ICONIFIED); //miniminiza a tela.
       pedindo.setSelected(true);
       txtQuantidade.setText("1");
       //btTroco.setEnabled(false);
      
       SomaProdutos();
       esopedir();
     //--  PegaClientes();
       
       cadastrandoPedidos();//cadastra no banco somente pedidos
       
       
       // Jacliquei();
   }else{//se nao semente grava sem imprimir      
       //se textEntrega for vazio e escolhe o primeiro
       //--- if (txtEntrega.getText().equals("") & JOptionPane.showConfirmDialog(null,"Deseja imprimir o Pedido?")!=JOptionPane.OK_OPTION ){//se nao semente grava sem imprimir
       //Comanda();
       //CalcTotalAcrescimo();
       //txtValorFinal.setText(tfValor.getText());
      //-- PegaClientes();
       //LimpaCliente();
       PegaClientes();
       calculaTotalProdutos();
       calculaTotalBebidas();
       SomarPedido();//pega botao valor total
      // PedidosCozinha();
       PedidosTela();
       Comanda();//grava somentente nao imprimi
       btFinal.setEnabled(false);
       setExtendedState(Pedidos.ICONIFIED); //miniminiza a tela.
       pedindo.setSelected(true);
       txtQuantidade.setText("1");
       //btTroco.setEnabled(false);
       SomaProdutos();
       esopedir();
       cadastrandoPedidos();//cadastra no banco somente pedidos
       //SomaPedidos();//pega botao valor total
       //JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio e somente Numeros!");
      } 
      
    }
   
        
    
    private void btFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalActionPerformed

        
    
    
  
        //JTextField escolha = new JTextField(10); 
        String[] choices = {"Imprimir","Cliente"};
           String escolhas = (String) JOptionPane.showInputDialog(null, "Escolha o Pedido.",
              "Pedido", JOptionPane.QUESTION_MESSAGE, null, // Use
                  // (JOptionPane.showConfirmDialog(null,"Deseja imprimir o Pedido?")==JOptionPane.OK_OPTION)                                                     // default
                                                                        // icon
               choices, // Array of choices
               choices[0]); // Initial choice
        //String decisao = String.valueOf(escolha.getText());
      try {
             switch (escolhas) {
                          
              case "Imprimir":
                            
                
                ImprimiaoSair();
                  
                
                break;
            case "Cliente":
                //PegaClientes();
                PesquisaCliente();
                              
                break;
                       
                default:
                
               //--- dispose();
                //ImprimiaoSair();
                //    break;
                break;
           }
       
    
           } catch (HeadlessException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio e somente Numeros!" + e1);
         // TODO add your handling code here:
        }
      
      

    }//GEN-LAST:event_btFinalActionPerformed
     public void Recebendo(String recebe){//recebe do PesquisaClientes, os dados vem por paramentro
         
        jIdCliente.setText(recebe); 
        txtNome.setText(recebe);
        txtTelefone.setText(recebe);
        txtEndereco.setText(recebe);
        txtEntrega.setText(recebe);
     
     }
    private void PesquisaCliente(){
          
        PegaClientes clientesPesquisar = new  PegaClientes();
               //chama pesquisa clientes
           clientesPesquisar.setVisible(true);
               //ImprimiaoSair();
    }
    
    private void LimpaCampos(){
        cebola.setText("");
        //cheddar.setText("");
        ervilha.setText("");
        //pimentao.setText("");
        //porcao.setText("");
        tfValor.setText("");
        txtValorrecebido.setText("");
        txtTrocos.setText("");
        tableindice.setText("");
        //jCheckcebola.setSelected(false);
        //jCalabresa.setSelected(false); 
        //jCheckcheddar.setSelected(false); 
        //jCheckpimentao.setSelected(false); 
        //jCheckporcao.setSelected(false); 
        txtTotal.setText("");
        jTVisor.setText("");
        txtAcrecimo.setText("");
        
       // txtQuantidade.setText("");
    }
    private void btXeggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXeggActionPerformed
        // TODO add your handling code here:
        if (verificarCamposVazio() && verificarQuantidade()){ 
         
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 14.0;//valor do lanche era 12.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Egg",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio e somente Numeros!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
                             
    }//GEN-LAST:event_btXeggActionPerformed

    private void cbQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQtdActionPerformed
        // TODO add your handling code here:
        String str = (String) cbQtd.getSelectedItem();
        txtQuantidade.setText(str);
    }//GEN-LAST:event_cbQtdActionPerformed
    private void SaidoPedido(){
        if (JOptionPane.showConfirmDialog(null,"Deseja Sair da Tela dos PEDIDOS?")==JOptionPane.OK_OPTION){  
            
            //cadastrando();
            calculaTroco();
            sair();
        }else{
                    
            
            
           //System.exit(0);
        }   
    }
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here: pedindo.isSelected(); 
         SaidoPedido();
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "O Sistema de Vendas Facil, Auxilia no controle de pedidos em varias situaçoes,"+"\n"+" Controlam os pedidos em fila, como anotações criadas em uma GRADE armazenadas no PC em forma de blocos de anotações,"+"\n"+""+"\n"+"Duvidas ou sugestões Sistema de Vendas - digopri@ig.com.br");
        //JOptionPane.showMessageDialog(null, "O Sistema de Vendas Facil, Auxilia no controle de pedidos em varias situaçoes, controlam os pedidos em fila, como anotaçoes criadas em uma grade e armazenadas no PC em forma de blocos de anotações, duvidas ou sugestões Sistema de Vendas - digopri@ig.com.br");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed
    
    private void btXbacconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXbacconActionPerformed
        if (verificarCamposVazio()&& verificarQuantidade()){ 
         
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
       //---- double valoritem = 14.0;//valor do lanche
        double valoritem = 16.0;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Bacon",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio e somente Numeros!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
        
    }//GEN-LAST:event_btXbacconActionPerformed
    private void Concatenapedido(){
        int valor;
        int soma = 0;

    // Lê continuamente até o usuário informar 0
    do{
      // efetua a próxima leitura
      //String str = JOptionPane.showInputDialog(null,"Informe um valor inteiro:\n(ou 0 para sair)","Estudos", JOptionPane.QUESTION_MESSAGE);
      String str = (tfValor.getText());
      valor = Integer.parseInt(str);

      soma += valor;
    }while(valor != 0);
    
    
    JOptionPane.showMessageDialog(null, "A soma é: " + soma,
       "Estudos", JOptionPane.INFORMATION_MESSAGE);
  }
    private void esopedir(){
        if (pedindo.isSelected()== true) {
       //System.out.println("A soma é " + soma); 
          Double valor =1.0;
          //Double soma = 0.0;//usado para somar
          do{
             
             Double qtd = Double.parseDouble(pedir.getText());
             
             Result = (qtd + valor);
             //str += valor; //soma o que pegou em pedir mais valor
             totalpedidos += Double.valueOf(Result);
             Pedidos ped = new Pedidos();
             pedir.setText(String.valueOf(totalpedidos));  
             jPede.setText(String.valueOf(pedir.getText()));  
             
             ped.setVisible(true);         
         
            pedindo.setEnabled(false);
          }while(valor == 0);
            // Pedidos.jMenuOperador.setText(opera.getText());
            jMenuOperador.setText(Principal.lbPrincipal.getText());//pega o texto que esta nessa variavel la na tela principal
           //Principal.jMe.getText(jMenuOperador.getText());//pega o texto que esta nessa variavel
             //JOptionPane.showMessageDialog(null, "A soma é: " + soma,"Estudos", JOptionPane.INFORMATION_MESSAGE);
           Pedidos.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
       
      }
    }     
    
    private void btXfrangoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXfrangoMouseClicked
        
        
    }//GEN-LAST:event_btXfrangoMouseClicked
    protected boolean VerificaLinhas(){
        //if (tmVendas.getRowCount() == 0)){//se a tabela nao tiver dados nela
            //Principal.ped1.setForeground(Color.green);
           // JOptionPane.showMessageDialog(this,"Nenuma Linha na Tabela",JOptionPane.INFORMATION_MESSAGE);
           // return false;
        //}
            return true;
    }
    public void Removeitem(){
           
        
   
     if (txtValorFinal.getText().contains("0")){//se campo acrescimos tiver "0" exclui a linha selecionada
         
         try{
             
             int selecionado = Tabela.getSelectedRow();
             tmVendas.removeRow(selecionado);
             //int qtd = Integer.parseInt(txtQuantidade.getText());
             //double valoritem = 1.0;//valor do acrescimo 50 centavos
             //double valoritem = tmVendas.getValueAt(qtd, qtd);                      //Tabela.getRowCount()-1;//ultima linha
             //      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
             Result = (Double.valueOf(tableindice.getText()) * (Double.valueOf(txtQtd.getText())));//calcula com o indicemveses a
             //Result = (Double.valueOf(txtQuantidade.getText()));//calcula com o campo
             total -= Double.valueOf(Result);
             //tfValor.setValue(total);
             tfValor.setText(String.valueOf(total));
             txtAcrecimo.setText("");// limpa o campo acrescimo
             //tfValor
             // pimentao.setText("");//limapa o texto
         }catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Nenhuma Linha Selecionada!");
         }
     }else{
         
         JOptionPane.showMessageDialog(this, "Acrescimos inclusos, melhor refazer o pedido antes de excluir!");
         // RemoveLinha();
         //LimpaCampos();
     }
    }
    private void RemovelinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovelinhaActionPerformed

        //if (tmVendas.isEmpty){
            
       // }
     if (JOptionPane.showConfirmDialog(null,"Deseja cancelar o Pedido selecionado?")==JOptionPane.OK_OPTION){  
            //removeRow(null);
         Removeitem();
         
     }
        
        
    }//GEN-LAST:event_RemovelinhaActionPerformed
    private void DetalhePedido(){
         
        //variaveil
       
       //int c;
       //c = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero:"+"\n"+"Nº1 - Completo,"
              // +"\n"+"Nº2 - Maionese e Cebola,"+"\n"+"Nº3 - Ervilha, Batata e Cebola"));
    
    for(int i=1;i<=3;i++){//seleciona a quantidade de opces para selecionar
        Object[] selectionValues = { "Opção 1","Opção 2", "Opção 3", "Personalizado","Acrescimo","Remover Venda", "Sair"};
        String initialSelection = "Opção 1";
        Object selection = JOptionPane.showInputDialog(null, "Qual seu Pedido Favorito?\n\n"
                +"Opção 1 - Completo\n"
                +"Opção 2 - S/Cebo,S/Milho\n"
                +"Opção 3 - S/Ervi,S/Pimen\n"
                +"Personalizado - Faça a sua escolha\n"
                +"Acrescimo - Facilite para o Cliente\n"
                +"Remover Venda - Remove venda selecionada\n"
                +"Sair - Sai dessa Tela\n",
        "Detalhe do Pedido", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
    try{
        //int count=1; 
         
        //while(count<=10){ //faz um laço 
            //System.out.println(count); 
            //count++; 
         
        if(selection.equals("Completo")){// se escolher competo sai do laço
          //JOptionPane.showMessageDialog(null,"Seu pedido é Completo");
         // System.out.format("%-5s:%10s\n", "Name", "Nemo");
         // System.out.format("%-5s:%10d\n", "Age", 120);
            //System.out.println((char)27 +"[31m testing bold");//muda a cor para vermelho
          Tabela.setValueAt(selection, Tabela.getSelectedRow(), 3); //insere na tabela que pegou do combo
          //return;
          break; //sai do laço
        }
          if(selection.equals("Opção 1")){// se escolher competo sai do laço
          Tabela.setValueAt("Completo", Tabela.getSelectedRow(), 3); //insere na tabela que pegou do combo
          //return;
          break; //sai do laço
         }
          if(selection.equals("Opção 2")){// se escolher competo sai do laço
          Tabela.setValueAt("S/Cebo,S/Milho", Tabela.getSelectedRow(), 3); //insere na tabela que pegou do combo
          break; //sai do laço
         }
          if(selection.equals("Opção 3")){// se escolher competo sai do laço
          Tabela.setValueAt("S/Ervi,S/Pimen", Tabela.getSelectedRow(), 3); //insere na tabela que pegou do combo
          break; //sai do laço
         }
          if(selection.equals("Personalizado")){// se escolher competo sai do laço
          //String nome= null;
          nome = JOptionPane.showInputDialog(null, "Digite sua escolha?");
          Tabela.setValueAt(nome, Tabela.getSelectedRow(), 3); //insere na tabela que pegou do combo
          break; //sai do laço
         }
          if(selection.equals("Acrescimo")){// se escolher competo sai do laço
          //String nome= null;
          //acres = JOptionPane.showInputDialog(null, "Simplifique a Digitação");
          //Tabela.setValueAt(acres, Tabela.getSelectedRow(), 4); //insere na tabela que pegou do combo
          //FiltroJTable filtroJTable = new FiltroJTable();
          //filtroJTable.setVisible(true);//chama outro frame
                    //JOptionPane.showMessageDialog(null, "Nao esqueça de adicionar o valor do acrescimo");
                     
          break; //sai do laço
         }
          
          if(selection.equals("Remover Venda")){// se escolher competo sai do laço
          //Tabela.setValueAt("S/ Maionese", Tabela.getSelectedRow(), 3); //insere na tabela que pegou do combo
            if (JOptionPane.showConfirmDialog(null,"Deseja remover esse Pedido?")==JOptionPane.OK_OPTION){  
              Removeitem();
           }       
              break; //sai do laço
           }
          if(selection.equals("Sair")){// se escolher competo sai do laço
          //Tabela.setValueAt("S/ Maionese", Tabela.getSelectedRow(), 3); //insere na tabela que pegou do combo
          Tabela.getSelectionModel().clearSelection(); //desmarca a linha selecionada 
              break; //sai do laço
         }
        
         //}
                  
         } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Voce saiu sem escolher nada");
        
        }                
    }     
}//fim do metodo
      
      
    
    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
    
    if(evt.getClickCount() == 0){    
       JOptionPane.showMessageDialog(null,"Selecione uma Linha, antes de Cancelar!");
       }else if(evt.getClickCount() != -1){//diferente de -1
         Object obj  = (tmVendas.getValueAt(Tabela.getSelectedRow(), 1));  //pega o valoritem
         String Id = obj.toString(); 
         tableindice.setText(Id);//aqui pego o valor da linha selecionada na coluna 0 e adiciono ao jtextfield    
         Object obje  = (tmVendas.getValueAt(Tabela.getSelectedRow(), 2));  //pega o valoritem
         String Idr = obje.toString(); 
         txtQtd.setText(Idr);//aqui pego o valor da linha selecionada na coluna 0 e adiciono ao jtextfield 
         txtQuantidade.setText("1");
         this.cbQtd.setSelectedIndex(0);
         //DetalhePedido(); //puxa o joptiopane
         jTVisor.setText("");//limpa as string
         txtAcrecimo.setText("0");//zera esse campo calcula acrscimo
          //Escolhas();
         //Escolher();
         PedidoDetalhado vem = new PedidoDetalhado();
         vem.setVisible(true);
         
         
       }  
    }//GEN-LAST:event_TabelaMouseClicked

    private void btAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAguaActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 3.0;//valor do lanche era 2.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Água Mineral",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, e1+"Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
    }//GEN-LAST:event_btAguaActionPerformed

    private void btTampicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTampicoActionPerformed
       if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
    //    double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 4.5;//valor do lanche era 4.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Tampico&Chá",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, e1+"Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
    }//GEN-LAST:event_btTampicoActionPerformed

    private void btKaiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKaiserActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 5.0;//valor do lanche era 4.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Cervejas",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+"R$ 00,00"});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
    }//GEN-LAST:event_btKaiserActionPerformed

    private void bt600mlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt600mlActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
  //      double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 8.0;//valor do lanche era 7
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Ref.600ml",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, e1+"Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
    }//GEN-LAST:event_bt600mlActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
        if (verificarVendas()){
            //JOptionPane.showMessageDialog(this,"Venda Registrada","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(this,"É preciso implementar essa opcao","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
             //new CheckBoxItemListener();
             //cadastrando();
             //dispose();
               
        }
        
    }//GEN-LAST:event_VendasActionPerformed

    private void btXBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXBurgerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btXBurgerMouseClicked

    private void btXBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXBurgerActionPerformed
         
       if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 9.5;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Burger",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btXBurgerActionPerformed

    private void btBauruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBauruMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btBauruMouseClicked

    private void btBauruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBauruActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
  //      double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        //---double valoritem = 7.0;//valor do lanche//----
        double valoritem = 8.0;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Bauru",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btBauruActionPerformed

    private void btXqueijoquenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXqueijoquenteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btXqueijoquenteMouseClicked

    private void btXqueijoquenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXqueijoquenteActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 18.0;//valor do lanche era 15.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Gourmet",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btXqueijoquenteActionPerformed

    private void btXCalabresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXCalabresaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btXCalabresaMouseClicked

    private void btXCalabresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXCalabresaActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
   //     double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 16.0;//valor do lanche era 14
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
       //---.usava assim antes---- total += Double.valueOf(Result);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Calabresa",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btXCalabresaActionPerformed
   protected boolean Jacliquei(){
       //||(JOptionPane.showConfirmDialog(null,"Deseja imprimir novamente o Pedido?")==JOptionPane.OK_OPTION))
      if (jCount.getText().equals("jacliquei")){
        int response = JOptionPane.showConfirmDialog(null, "Deseja imprimir o Pedido?", "Confirme",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return false;
       }else if(response == JOptionPane.YES_OPTION){
           //ContaTable();
           calculaTotalProdutos();
           PedidosCozinha();
           setExtendedState(Pedidos.ICONIFIED); //miniminiza a tela. 
           pedindo.setSelected(true); 
           esopedir();
          return false;
       }else if ((response == JOptionPane.NO_OPTION) || jCount.getText().equals("2")){
           JOptionPane.showMessageDialog(this, "Voce ja imprimiu esse pedido!");
           dispose();
           return false;
       } 
           return true;
   
     
   }
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            //Jacliquei();
            captura();
        } catch (AWTException ex) {
            //Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao capturar tela!"+ ex);
        }
        
    }//GEN-LAST:event_printActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btTradicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTradicionalActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
   //     double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 10.5;//valor do lanche era 9
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-Tradicional",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btTradicionalActionPerformed

    private void btPrensadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrensadoActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 11.0;//valor do lanche era 9.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-Prensado",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btPrensadoActionPerformed

    private void btQueijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQueijoActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 14.0;//valor do lanche era 12
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-Queijo",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btQueijoActionPerformed

    private void btDogfrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogfrangoActionPerformed
       if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 16.0;//valor do lanche era 14
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-F.Bacon",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogfrangoActionPerformed

    private void btFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinalMouseClicked
        jCount.setText("Pedido ja Impresso");          
        btFinal.setEnabled(false); 
               

        
    }//GEN-LAST:event_btFinalMouseClicked

    private void btFranChederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFranChederActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
       // double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 16.0;//valor do lanche 14
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-F.Cheddar",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btFranChederActionPerformed

    private void btFranCatupiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFranCatupiriActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
   //     double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 15.5;//valor do lanche 13.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-F.Ctupiry",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btFranCatupiriActionPerformed

    private void btFranCalabresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFranCalabresaActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 16.0;//valor do lanche era 14
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-F.Calabresa",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btFranCalabresaActionPerformed

    private void btDogCalaBaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogCalaBaconActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 16.0;//valor do lanche era 14
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-C.Bacon",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogCalaBaconActionPerformed

    private void btDogcalaChedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogcalaChedarActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
   //     double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 16.0;//valor do lanche era 14
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-C.Cheddar",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogcalaChedarActionPerformed

    private void btDogcalaCatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogcalaCatuActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
      //  double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 15.5;//valor do lanche era 13.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-C.Ctup",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogcalaCatuActionPerformed

    private void btDogBaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogBaconActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 5.5;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-Bacon",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"});
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogBaconActionPerformed

    private void btDogbaconChedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogbaconChedarActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 16.0;//valor do lanche era 14
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-B.Cheddar",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogbaconChedarActionPerformed

    private void btDogbaconCatupiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogbaconCatupiryActionPerformed
         if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
     //   double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 15.5;//valor do lanche era 13.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-B.Ctupiry",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogbaconCatupiryActionPerformed

    private void btDogEspecialCatupiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogEspecialCatupiriActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
     //   double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 8.0;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-E.Catupiry",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"});
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogEspecialCatupiriActionPerformed

    private void btXtudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXtudoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btXtudoMouseClicked

    private void btXtudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXtudoActionPerformed
         if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 23.0;//valor do lanche era 20
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Tudo",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btXtudoActionPerformed

    private void btXdogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXdogMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btXdogMouseClicked

    private void btXdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXdogActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 14.0;//valor do lanche era 12.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Dog",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btXdogActionPerformed

    private void pedindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedindoActionPerformed

        if (JOptionPane.showConfirmDialog(null,"Deseja ABRIR uma nova TELA DE PEDIDOS?")==JOptionPane.OK_OPTION){  
            esopedir();
            setExtendedState(Pedidos.ICONIFIED);
        }
        pedindo.setSelected(false);
        
    }//GEN-LAST:event_pedindoActionPerformed

    private void btDogEspecialChedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogEspecialChedarActionPerformed
       if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
     //   double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 23.0;//valor do lanche era 20
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-E.Cheddar",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogEspecialChedarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CancelaTudo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CancelaTudo();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btSaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaboresActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
  //      double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 11.0;//valor do lanche era 10.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Sabo.2Lts",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, e1+"Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
    }//GEN-LAST:event_btSaboresActionPerformed

    private void btPicanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPicanhaActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 22.0;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Picanha",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btPicanhaActionPerformed

    private void btMignomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMignomActionPerformed
       if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 22.0;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"X-Mignom",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btMignomActionPerformed
     
    private void bt200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt200ActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
  //      double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 3.0;//valor do lanche era 2.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)TabelaBebidas.getModel();
        dtm.addRow(new Object[]{"Refri200",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Bebida"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, e1+"Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
        
    }//GEN-LAST:event_bt200ActionPerformed
  
          
    private void txtTrocosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTrocosFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txtTrocosFocusLost

    private void txtValorrecebidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorrecebidoFocusLost
        // TODO add your handling code here:
        //Troco();
        //calculaTroco();
        //txtValorrecebido.setText(".0");
}//GEN-LAST:event_txtValorrecebidoFocusLost

    private void txtValorrecebidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorrecebidoKeyTyped
       //txtValorFinal.setText(tfValor.getText());
}//GEN-LAST:event_txtValorrecebidoKeyTyped

    private void txtValorrecebidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorrecebidoMouseClicked
        //txtValorFinal.setText(tfValor.getText());
    }//GEN-LAST:event_txtValorrecebidoMouseClicked

    private void btDogbaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogbaconActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){  
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
  //      double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 15.5;//valor do lanche era 13.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"DogBacc",""+valoritem+"",""+txtQuantidade.getText()+"",""+"Completo"+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, e1+"Campo quantidade não pode ser Vazio!");
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    
    }//GEN-LAST:event_btDogbaconActionPerformed

    private void btDogEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogEspecialActionPerformed
         if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
     //   double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 22.5;//valor do lanche 19.5
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-E.Ctup",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_btDogEspecialActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        SaidoPedido();
}//GEN-LAST:event_btSairActionPerformed

    private void dogcalabresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogcalabresaActionPerformed
         if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 13.5;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Double.valueOf(Result);
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-Calabre",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (Exception e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
    }//GEN-LAST:event_dogcalabresaActionPerformed

    private void txtValorsemacrescimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorsemacrescimoActionPerformed
       
    }//GEN-LAST:event_txtValorsemacrescimoActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       Clientes clientes = new Clientes();
             clientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void cbPedidosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPedidosItemStateChanged
        onClickLocalizaPedido();
    }//GEN-LAST:event_cbPedidosItemStateChanged

    public void onClickLocalizaPedido() {
        ContatoController cc = new ContatoController();
        //if (verificarCartao()){
        
        try {
            //"%" + tfPesquisaCliente.getText().trim()+ "%"
            //Contato c = cc.buscaContatoPorNome(txtPesquisa.getText());//verifica nome
            //Contato c = cc.buscaContatoPorNome("%" + txtPesquisa.getText().trim()+ "%");//verifica 
            Contato c = cc.buscaContatoPorDoc("%" + cbPedidos.getSelectedItem().toString()+ "%");//verifica 
            //Contato c = cc.buscaContatoPorAcess(tfDataSaida.getText());
           // jIdCliente.setText(String.valueOf(c.getTelefone()));
            //--txtPedido.setText(c.getNome_acess());
            //jIdCliente.setText(c.getTelefone());
            txtTelefone.setText(c.getTelefone());
            //txtNome.setText(c.getNome());
            //--txtFavorito.setText(c.getCondicao());//favoritos
            //txtEndereco.setText(c.getFunc());
            //txtObs.setText(c.getObservacoes());
            //txtData.setText(c.getEntrada());
            //txtTelefone.setText(c.getTelefone());
            //txtPesquisa.setText(c.getTelefone());
           // tfDataSaida.setText(c.getSaida_acess());
            //verificarCartao();
            
            //txtDtNascimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(c.getDtNascimento()));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao localizar historico, tente novamente!\n" + e.getLocalizedMessage());
        } catch (NullPointerException e){
            //JOptionPane.showMessageDialog(this, "Cartao não localizado ou não existe!\n" + e.getLocalizedMessage());
           // atualizaagora();
        }
     //}
   }
    private void cbPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPedidosMouseClicked
       List<CliBean> pedido = new CliControl().listarPedidos("%%");
        cbPedidos.removeAllItems();
        //--txtEntrega.setText("");//limpa campo entrega

        for (int i = 0; i < pedido.size(); i++){
            cbPedidos.addItem(pedido.get(i).getNome_vigi());
            //String conta = String.valueOf("Total de "+ cliente.size()+"  "+"Clientes cadastrados");//conta quantidade de servidores no banco
            //contacli.setText(conta);
        }
    }//GEN-LAST:event_cbPedidosMouseClicked

    private void cbPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPedidosActionPerformed
        
        String fav = (String)cbPedidos.getSelectedItem();
        txtCliente.setText(fav+" | "+"Rua, "+ txtEndereco.getText());
        jIdCliente.setText(fav);//id Cliente
        txtNome.setText(fav);//nome
        txtEntrega.setText(fav);//entrega
        onClickLocalizar();
        
    }//GEN-LAST:event_cbPedidosActionPerformed

    private void LimpaCliente(){
            
            jIdCliente.setText("0");
            txtCliente.setText("Balcao");
            txtNome.setText("Balcao");
            txtTelefone.setText("....");
            txtEndereco.setText("....");
            txtEntrega.setText("0.0");
           //-- txtconferir.setText("");
    }
    private void jCheckLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckLimparActionPerformed
        // clicar no botao limpar cliente
        if (jCheckLimpar.isSelected()) {
            jIdCliente.setText("0");
            txtCliente.setText("Balcao");
            txtNome.setText("Balcao");
            txtTelefone.setText("....");
            txtEndereco.setText("....");
            txtEntrega.setText("0.0");
          //nomeDigitadodetalhes("s/maione,");
          //Pedidos.Tabela.setValueAt(jTVisorRetira.getText(), Pedidos.Tabela.getSelectedRow(), 3);
          
        }
    }//GEN-LAST:event_jCheckLimparActionPerformed

    private void txtValorFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorFinalActionPerformed

    private void txtEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntregaActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
      
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesActionPerformed
        Clientes clientes = new Clientes();
        clientes.setVisible(true);
    }//GEN-LAST:event_jMenuClientesActionPerformed

    private void jMenuPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPesquisaActionPerformed
         PegaClientes clientesPesquisar = new PegaClientes();
           //chama pesquisa clientes
            clientesPesquisar.setVisible(true);
    }//GEN-LAST:event_jMenuPesquisaActionPerformed

    private void PassaVlorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassaVlorActionPerformed
        //PassaValor();
        PegaClientes();
    }//GEN-LAST:event_PassaVlorActionPerformed

    private void PegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PegaActionPerformed
         PegaClientes();
    }//GEN-LAST:event_PegaActionPerformed

    private void TabelaBebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaBebidasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaBebidasMouseClicked

    private void txtDescontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescontoMouseClicked
        if (JOptionPane.showConfirmDialog(null,"QUE TAL UM DESCONTO?")==JOptionPane.OK_OPTION) {
            
          nome = JOptionPane.showInputDialog(null, "DIGITE O DESCONTO?");
         // Pedidos.Tabela.setValueAt(nome, Pedidos.Tabela.getSelectedRow(), 3);
          //txtDesconto.setText(nome.replace(".", "")+"0");
        //--  txtDesconto.setText(nome.replace(",", ".")+"0");
          txtDesconto.setText(nome.replace(",", "."));
      }else{
          //dispose();
       }
    }//GEN-LAST:event_txtDescontoMouseClicked

    private void txtDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusGained
        // TODO add your handling code here:
        //txtDesconto.getText().replace(".", ".")+"0");
    }//GEN-LAST:event_txtDescontoFocusGained

    private void dogsimplaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogsimplaoActionPerformed
        if (verificarCamposVazio() || verificarQuantidade()){ 
           
        try{
        //if (verificarCamposVazio() || verificarQuantidade()){
//        double valor  = Double.parseDouble(txtQuantidade.getText());;     
        int qtd = Integer.parseInt(txtQuantidade.getText());
        double valoritem = 9.0;//valor do lanche era 8
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valoritem * qtd);
        total += Result;
        //tfValor.setValue(total);
        tfValor.setText(String.valueOf(total));
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)Tabela.getModel();
        dtm.addRow(new Object[]{"Dog-Kids",""+valoritem+"",""+txtQuantidade.getText()+"",""+detalhe.getText()+"",""+"......"+"",""+""});
        txtQuantidade.setText("1");
        this.cbQtd.setSelectedItem("1");
        }catch (NumberFormatException e1){ 
           JOptionPane.showMessageDialog(this, "Campo quantidade não pode ser Vazio!"+ e1);
         // TODO add your handling code here:
        }
      }else{
        JOptionPane.showMessageDialog(this, "Quantidade inválida!");
      }
                                       
   
    }//GEN-LAST:event_dogsimplaoActionPerformed

    private void btVale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVale1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVale1ActionPerformed

    public void onClickLocalizar() {
        ContatoController cc = new ContatoController();
        //if (verificarCartao()){
        
        try {
            //"%" + tfPesquisaCliente.getText().trim()+ "%"
            //Contato c = cc.buscaContatoPorNome(txtPesquisa.getText());//verifica nome
            //Contato c = cc.buscaContatoPorNome("%" + txtPesquisa.getText().trim()+ "%");//verifica 
            Contato c = cc.buscaContatoPorNome("%" + cbPedidos.getSelectedItem().toString()+ "%");//verifica 
            //Contato c = cc.buscaContatoPorAcess(tfDataSaida.getText());
            jIdCliente.setText(String.valueOf(c.getIdindex()));//pega ID, Clientes
            //txtNome.setText(c.getNome_acess());
            txtTelefone.setText(c.getTelefone());
           //-- txtNome.setText(c.getNome());
           //--- txtFavorito.setText(c.getCondicao());//favoritos
            txtEndereco.setText(c.getFunc());//rua
            txtEntrega.setText(c.getSaida());
            //tfDatahoje.setText(c.getEntrada());
            //tfDataAtual.setText(c.getSaida());
            //-- txtData.setText(c.getEntrada());
            //ccbFuncao.setSelectedItem(c.getCondicao().toString());
            //CBSETOR.setSelectedItem(c.getSetor().toString());
            //ccbEmpresas.setSelectedItem(c.getEmpresa().toString());
            //cbcargo.setSelectedItem(VGT.get(tb.getSelectedRow()).getCargo_vigi().toString());
            //tfDataSaida.setText(c.getSaida_acess());
            //lbAtualizado.setText(c.getSaida_acess());//atualizado
            //quefez.setText(c.getCartao_acess());//quem fez
            //jTFoto.setText(c.getFoto());
            //lbicon.setIcon (new ImageIcon("C:/WebCam/"+jTFoto.getText()));
          //--  txtData.setText(c.getEntrada());
         //--   txtTelefone.setText(c.getTelefone());
         //--   txtPesquisa.setText(c.getNome());
           // tfDataSaida.setText(c.getSaida_acess());
            //verificarCartao();
            
            //txtDtNascimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(c.getDtNascimento()));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro, tente novamente!\n" + e.getLocalizedMessage());
        } catch (NullPointerException e){
            //JOptionPane.showMessageDialog(this, "Cartao não localizado ou não existe!\n" + e.getLocalizedMessage());
           // atualizaagora();
        }
     //}
   }
   
    private void SomarPedido(){
     try{
        double valorAgora  = Double.valueOf(tfValor.getText());//valor que vai receber 
        //double valorAtual  = Double.valueOf(Pedidos.txtAcresce.getText());//valor que vai receber  
        double acrescenta = Double.valueOf(txtValorFinal.getText());
        double entrega = Double.valueOf(txtEntrega.getText());
        double desconto = Double.valueOf(txtDesconto.getText());
       // double valoritem = 3.5;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = ((valorAgora + acrescenta + entrega)-desconto);//valor recebido menos o total
        //total += Double.valueOf(Result); 
        tfValor.setText((String.valueOf(Result)));
        txtValorsemacrescimo.setText((String.valueOf(valorAgora)));//pega valor sem acrescimos
         //jTextField1.setText((String.valueOf(Result-acrescenta)));//pega valor sem acrescimos
       } catch (NumberFormatException ex){ 
        //JOptionPane.showMessageDialog(null, "Erro,!!"+ex); 
        JOptionPane.showMessageDialog(null, "Erro na soma Acrescimo"+ ex);  
          tfValor.setText((String.valueOf(Result)));
        }
    }    
    protected boolean verificarVendas(){
        if (txtValorrecebido.getText().equals("")){//se campo for vazio
            //Principal.ped1.setForeground(Color.green);
            JOptionPane.showMessageDialog(this,"Valor Recebido não pode ficar vazio","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtValorrecebido.requestFocus();
            //recebido.setVisible(true);
            return false;
        }
        return true;
    }
    
    protected boolean verificarPedidos(){
        if (pedir.getText().equals("Pedido Nº (01)")){//se campo for vazio
            //Principal.ped1.setForeground(Color.green);
            JOptionPane.showMessageDialog(this,"Pedido Nº 01 Livre!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (pedir.getText().equals("Pedido Nº (02)")){//se campo for vazio
            //Principal.ped2.setForeground(Color.green);
            JOptionPane.showMessageDialog(this,"Pedido Nº 02 Livre!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (pedir.getText().equals("Pedido Nº (03)")){//se campo for vazio
            //Principal.ped3.setForeground(Color.green);
            JOptionPane.showMessageDialog(this,"Pedido Nº 03 Livre!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (pedir.getText().equals("Pedido Nº (04)")){//se campo for vazio
            //Principal.ped4.setForeground(Color.green);
            JOptionPane.showMessageDialog(this,"Pedido Nº 04 Livre!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
             
        return true;
    }
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               new Pedidos().setVisible(true);
               // new Principal().setVisible(true);
            }
        });
    }
    public void Entrar(){  
  
        // Cria campo onde o usuario entra com a senha  
        JTextField password = new JTextField(10); 
        //JPasswordField password = new JPasswordField(10); 
        
        //password.setEchoChar('*');   //faz prencher com esses caracter
        password.setToolTipText("Entre com o seu Nome"); 
        //password.setFocusable(rootPaneCheckingEnabled);
        password.setHorizontalAlignment(JTextField.RIGHT); 
      
        // Cria um rótulo para o campo  
        JLabel rotulo = new JLabel("Operador:");  
                  
        // Coloca o rótulo e a caixa de entrada numa JPanel:  
        JPanel entUsuario = new JPanel();  
        entUsuario.add(rotulo);  
        entUsuario.add(password);  
      
        // Mostra o rótulo e a caixa de entrada de password para o usuario fornecer a senha:  
        JOptionPane.showMessageDialog(null, entUsuario, "Entrada", JOptionPane.PLAIN_MESSAGE);  
  
        // O programa só prossegue quando o usuário clicar o botao de OK do showMessageDialog.   
        // Aí, é só pegar a senha:  
  
        // Captura a senha:  
        String senha = password.getText();
        
        if ("".equals(senha)){//se a variavel senha for vazio
            JOptionPane.showMessageDialog(null, "Campo vazio Sistema não encontrado");
            System.exit(0);
        }else{
            ////se nao a variavel senha for prenchida
            //JOptionPane.showMessageDialog(null, "Campo preenchido Sistema a Iniciar");
        }
  
        // mostra a senha no terminal:  
        //System.out.println("Você digitou: "+senha+"\nFim de execucao.");  
        //lbOperador.setText(senha);//grava o operador
    } 
    private void atualizaagora(){
    String FormatData = new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()));
    String FormatHora = new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
    //tfDatahoje.setText(FormatData);//passa por parametro a data atual
    //tfDataAtual.setText(FormatData);
    jVendasDia.setText(FormatData);
    jvendaHora.setText(FormatHora);
    txtHora.setText(FormatHora);
}
    public void Entra(){     
         
        
         passa p = new passa();  
      // FOR QUE INSERE OS 10 NOMES DENTRO DO VETOR CHAMADO LISTA     
         for(int i = 0; i < p.getLista().length;i++){     
         p.setListaItem(JOptionPane.showInputDialog("Digite o nome do Operador"),i);     
              
      } 
                   
      // FOR QUE IMPRIME OS 2 NOMES INSERIDOS NA ORDEM NA QUAL FORAM INSERIDOS     
      for(int i = 0; i < p.getLista().length;i++){     
         //System.out.println(p.getListaItem(i)); 
       //  lbOperador.setText(p.getListaItem(i));//grava o operador
          
              
      } 
      
       
    }
    public void criaTxt(){
      try{
            File arquivo = new File("c:/cria/comanda.txt");
            if(arquivo.exists()){
                //se existir
                FileWriter arquivoTxt = new FileWriter(arquivo, true);
                PrintWriter linhasTxt = new PrintWriter(arquivoTxt);
                
                linhasTxt.println("===========================================");
                linhasTxt.println("       HOT DOG LEANDRO E ISABELE           ");
                linhasTxt.println("===========================================");
                linhasTxt.println("********** CUPOM NAO FISCAL ***************");
                linhasTxt.println("===========================================");
                linhasTxt.println("PRODUTO        VALOR UN.     QTDE     VALOR");
                //dados da tabela
                for(int x = 0; x < tmVendas.getRowCount(); x++){
                    linhasTxt.print(String.format("%-10.10s",Tabela.getModel().getValueAt(x, 0)));//produto
                    linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 1)));//quantidade
                    linhasTxt.print(String.format("%10s    ",Tabela.getModel().getValueAt(x, 2)));//valor unitario
                    linhasTxt.print(String.format("%7s     ",
                                  jVendasDia.getText()));//vator total
                    linhasTxt.println();
                }
                linhasTxt.println("===========================================");
               // linhasTxt.println(""+cheddar.getText()
                        //+cebola.getText()+pimentao.getText()
                        //+ervilha.getText() );
                linhasTxt.println("===========================================");
                linhasTxt.println("   DATA             OPERADOR          ITENS");
                linhasTxt.print(String.format("%7s  %18s  %10s",
                                 jVendasDia.getText(),//data
                                  jMenuOperador.getText(),//OPERADOR
                                  //ftfQuantidade.getText(),//valorporpessoa
                                  //ftfQuantidade.getText(),//cover
                                  //ftfDesconto.getText()//descontoConta
                                  conte.getText()//itens
                                  ));
                linhasTxt.println();
                linhasTxt.println("===========================================");
                linhasTxt.println("Valor Recebido            "+"R$"+txtValorrecebido.getText()+",00");
                linhasTxt.println("-------------------------------------------");
                linhasTxt.println("Troco                     "+"R$"+txtTrocos.getText()+",00");
                linhasTxt.println("                   ------------------------");
                //linhasTxt.println("Total                     "+"R$"+tfValor.getText()+",00");
                linhasTxt.println("Total a Pagar ----------->  "+"R$"+" "+tfValor.getText().replace(".", ",0"));
                linhasTxt.println("===========================================");
                linhasTxt.println("       OBRIGADO PELA PREFERENCIA           ");
                linhasTxt.println("             VOLTE SEMPRE                  ");

                int i = 0;
                while(i < 10){
                    i++;
                    linhasTxt.println();
                }                
                arquivoTxt.close();
                //emiteComanda();
                JOptionPane.showMessageDialog(this, "Boleto impresso com Sucesso!");
                //arquivo.delete();// precisa habilitar esse parar excluir o arquivo
            }else{
                //se naum existir
                arquivo.createNewFile();
                criaTxt();
            }
      }catch(IOException error){
          System.out.println("nao encontrei arquivo"+error);
      }

       
   }
              
           
    
//imprime txt detalhado 
 public void emiteComanda(){
       try {
            java.io.InputStream is = new FileInputStream("c:/cria/comanda.txt");
            Scanner sc = new Scanner(is);
            //fos = new FileOutputStream("PORTAUSB:");
            FileOutputStream fs = new FileOutputStream("LPT1:");
            //fs = new FileOutputStream("LPT1:");
            PrintStream ps = new PrintStream(fs);
              
           // FileOutputStream outputFile = null;
            //outputFile = new FileOutputStream("USB002");
            //PrintWriter out = new PrintWriter(outputFile);
      
            
            while(sc.hasNextLine()){
                String linhas = sc.nextLine();
                ps.println(linhas);
            }
            fs.close();
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro encontrado ao imprimir comanda.");
        }        
   }

        
 
 
 public void emitePedido() throws IOException{//MANDA NA IMPRESSORA EPSON TM-T20
       
     
     
     try {
        
                
            
            //java.io.InputStream is = new FileInputStream("C:\\pedido\\pedidos"+pedir.getText()+".txt");
            java.io.InputStream is = new FileInputStream("C:\\pedido\\pedidos.txt");
            Scanner sc = new Scanner(is);
            //FileOutputStream fs = new FileOutputStream("LPT1:");
            //--FileOutputStream fs = new FileOutputStream("prn:");//usava esse na impressora lpt1:
            FileOutputStream fs = new FileOutputStream("//localhost//EPSON TM-T20:"); 
            //FileOutputStream fs = new FileOutputStream("//CANTINHODOG-PC//EPSON TM-T20:"); 
            //--FileOutputStream fs = new FileOutputStream("//localhost//pos58:"); 
            //--FileOutputStream fs = new FileOutputStream("//rox//EPSON TM-T20:"); 
            //COMPARTILHA IMPRESSORA CRIADA
            //FileOutputStream fs = new FileOutputStream("USB:");
            //--FileOutputStream fs = new FileOutputStream("ESDPRT001:");
            PrintStream ps = new PrintStream(fs);
            //File printer = new File("lpt1");  
            // se lpt1 nao funcionar, testa prn  
            //File printer = new File("prn");
            
            while(sc.hasNextLine()){
                String linhas = sc.nextLine();
                ps.println(linhas);
                
            }
            fs.close();
            //cadastrandoPedidos();
            JOptionPane.showMessageDialog(this, "Pedido impresso com Sucesso!");
       } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro encontrado ao imprimir pedido.");
            
       }
        
       }
   
 public void geraPDF() {
   
  
   }
  private void cancelarVenda(){
        while (tmVendas.getRowCount()> 0){
               tmVendas.removeRow(0);
           
        }
        total = 0;
        //tfValor.setValue(0);
        tfValor.setText(String.valueOf(0));
        //tmVendas.removeRow(4); 
        venda.clear();
        //this.dispose();
        }

 private void cancelarVendaBebidas(){
        while (tmVendasBebidas.getRowCount() > 0){
            //tmVendas.removeRow(0);
             tmVendasBebidas.removeRow(0);
        }
        total = 0;
        //tfValor.setValue(0);
        tfValor.setText(String.valueOf(0));
        //tmVendas.removeRow(4); 
        venda.clear();
        //this.dispose();
        }
 /** 
 * Remove a linha do modelo. 
 * @param linha 
 */  
    
 private void ContaTable(){
        int cont = 0;
         //int indice = Tabela.getSelectedRow(); // mostra o valor da linha selecionada  
        //System.out.println(indice); // somente para testes  mostra o indice selecionado
       //conta quantas pessoas estão selecionadas na tabela obs; i = linha e 0 = coluna. obs: matriz  
        for (int i = 0; i < Tabela.getRowCount(); i++) { // percorre todas as linhas da tabela para verificar a existência de itens  
            if (Tabela.getValueAt(i, 0) != null) { // se houver algum valor na coluna 0 cont++  
                cont++;
                //System.out.println(cont);
           conte.setText(String.valueOf(cont));//conta quantos itens tem na tabela
            }
        }
 }
 public void CalcTotalAcrescimo(){
     
     try{
        double valorAtual  = Double.valueOf(tfValor.getText());//valor que vai receber     
        double acresce = Double.valueOf(txtAcrecimo.getText());
       // double valoritem = 3.5;//valor do lanche
//      String valor = String.valueOf(txtValor.getSelectedText().toString() + Integer.parseInt(quantidade));
        Result = (valorAtual + acresce);//valor recebido menos o total
        //total += Double.valueOf(Result); 
        tfValor.setText((String.valueOf(Result)));
        //txtAcrecimo.setText(String.valueOf(0));//zera esse campo
    
       } catch (Exception ex){ 
        //JOptionPane.showMessageDialog(null, "Erro,!!"+ex); 
        JOptionPane.showMessageDialog(null, "Erro na soma Acrescimo"+ ex);  
    }
        
     
 }
 private void calculaTotalProdutos(){  
   int soma = 0;
   
     //for (int i=0; i < Tabela.getColumnCount(); i++) {
     for (int i = 0 ; i < Tabela.getRowCount() ; i++){  
     //if (Tabela.getValueAt(i, 0)!= null){  
         //soma ++;
         int  valor = Integer.parseInt( String.valueOf( Tabela.getValueAt(i,2) ) );     
         soma += valor;
         //int valorAux =(int) Tabela.getValueAt(i, 2 );  
         //soma+= valorAux; 
         
     
     
    }  
    
          conte.setText(String.valueOf(soma));  
         //-- SomarPedido();
          SomaProdutos();
     
   //}  
}  
 private void calculaTotalBebidas(){  
   int soma = 0;
   
     //for (int i=0; i < Tabela.getColumnCount(); i++) {
     for (int i = 0 ; i < TabelaBebidas.getRowCount() ; i++){  
     //if (Tabela.getValueAt(i, 0)!= null){  
         //soma ++;
         int  valor = Integer.parseInt( String.valueOf( TabelaBebidas.getValueAt(i,2) ) );     
         soma += valor;
         //int valorAux =(int) Tabela.getValueAt(i, 2 );  
         //soma+= valorAux; 
         
     
     
    }  
    
           contebebidas.setText(String.valueOf(soma));  
          //-- SomarPedido();
           SomaProdutos();
     
   //}  
}  
   private void SomaProdutos(){
       
        try{
        double contebebid = Double.valueOf(contebebidas.getText());//valor que vai receber 
        //double valorAtual  = Double.valueOf(Pedidos.txtAcresce.getText());//valor que vai receber  
        double conteLanche = Double.valueOf(conte.getText());
        Result = (contebebid + conteLanche);//valor recebido menos o total
        //total += Double.valueOf(Result); 
        txtSomaProdutos.setText((String.valueOf(Result)));
        
       } catch (NumberFormatException ex){ 
        //JOptionPane.showMessageDialog(null, "Erro,!!"+ex); 
          JOptionPane.showMessageDialog(null, "Erro na soma Acrescimo"+ ex);  
          txtSomaProdutos.setText((String.valueOf(Result)));
        
       }
       
   }
  
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JToggleButton PassaVlor;
    public static javax.swing.JButton Pega;
    private javax.swing.JButton Removelinha;
    public static javax.swing.JTable Tabela;
    public static javax.swing.JTable TabelaBebidas;
    private javax.swing.JMenuItem Vendas;
    private javax.swing.JLabel acrescimo;
    private javax.swing.JLabel acrescimo1;
    private javax.swing.JLabel acrescimo2;
    private javax.swing.JLabel acrescimo3;
    private javax.swing.JLabel acrescimo4;
    private javax.swing.JButton bt200;
    private javax.swing.JButton bt600ml;
    private javax.swing.JButton btAgua;
    private javax.swing.JButton btBauru;
    private javax.swing.JButton btCerveja;
    private javax.swing.JButton btCoca;
    private javax.swing.JButton btCocalata;
    private javax.swing.JButton btDogBacon;
    private javax.swing.JButton btDogCalaBacon;
    private javax.swing.JButton btDogEspecial;
    private javax.swing.JButton btDogEspecialCatupiri;
    private javax.swing.JButton btDogEspecialChedar;
    private javax.swing.JButton btDogbacon;
    private javax.swing.JButton btDogbaconCatupiry;
    private javax.swing.JButton btDogbaconChedar;
    private javax.swing.JButton btDogcalaCatu;
    private javax.swing.JButton btDogcalaChedar;
    private javax.swing.JButton btDogfrango;
    private javax.swing.JButton btFinal;
    private javax.swing.JButton btFranCalabresa;
    private javax.swing.JButton btFranCatupiri;
    private javax.swing.JButton btFranCheder;
    private javax.swing.JButton btKaiser;
    private javax.swing.JButton btMignom;
    private javax.swing.JButton btPicanha;
    private javax.swing.JButton btPrensado;
    private javax.swing.JButton btQueijo;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btSabores;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btTampico;
    private javax.swing.JButton btTradicional;
    private javax.swing.JButton btTroco;
    private javax.swing.JButton btVale1;
    private javax.swing.JButton btXBurger;
    private javax.swing.JButton btXCalabresa;
    private javax.swing.JButton btXbaccon;
    private javax.swing.JButton btXdog;
    private javax.swing.JButton btXegg;
    private javax.swing.JButton btXfrango;
    private javax.swing.JButton btXqueijoquente;
    private javax.swing.JButton btXsalada;
    private javax.swing.JButton btXtudo;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox cbPedidos;
    private javax.swing.JComboBox cbQtd;
    private javax.swing.JLabel cebola;
    private javax.swing.JLabel conte;
    private javax.swing.JLabel contebebidas;
    public static javax.swing.JLabel detalhe;
    private javax.swing.JButton dogcalabresa;
    private javax.swing.JButton dogsimplao;
    private javax.swing.JLabel ervilha;
    private javax.swing.JCheckBox jCheckLimpar;
    private javax.swing.JLabel jCount;
    private javax.swing.JMenu jData;
    public javax.swing.JTextField jIdCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuClientes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    public static javax.swing.JMenuItem jMenuOperador;
    private javax.swing.JMenuItem jMenuPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jPede;
    private javax.swing.JLabel jPede1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTVisor;
    private javax.swing.JMenuItem jVendasDia;
    private javax.swing.JCheckBoxMenuItem jvendaHora;
    private javax.swing.JCheckBox pedindo;
    public static javax.swing.JTextField pedir;
    private javax.swing.JMenuItem print;
    private javax.swing.JTextField tableindice;
    private javax.swing.JTextField tfValor;
    private javax.swing.JLabel tfValorsem;
    public static javax.swing.JTextField txtAcrecimo;
    public static javax.swing.JTextField txtAcresce;
    public static javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDesconto;
    public javax.swing.JTextField txtEndereco;
    public javax.swing.JTextField txtEntrega;
    private javax.swing.JTextField txtHora;
    public javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtSomaProdutos;
    public javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JFormattedTextField txtTrocos;
    public static javax.swing.JTextField txtValorFinal;
    private javax.swing.JFormattedTextField txtValorrecebido;
    private javax.swing.JTextField txtValorsemacrescimo;
    public static javax.swing.JTextField txtconferir;
    // End of variables declaration//GEN-END:variables
    protected boolean VerificaVenda(){
     
    int response = JOptionPane.showConfirmDialog(null, "Deseja Sair do Pedido?", "Confirme",
           //verificarCampos();
           // JOptionPane.showMessageDialog(this, "DEVE ESTAR FALTANDO DADOS FAVOR VERIFICAR!","Por Favor",JOptionPane.INFORMATION_MESSAGE);
           // return false;
                    
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if(response == JOptionPane.NO_OPTION && verificarCampos()) {// se clicar me nao volta tudo ao normal
             
             return false;
         //System.out.println("No button clicked");
         } else if (response == JOptionPane.YES_OPTION && verificarCampos()) {//se clicar em sim da baixa
             
             //JOptionPane.showMessageDialog(null, "Você não esta Registrando essa Venda, !", "Informação", JOptionPane.QUESTION_MESSAGE);
             //atualizaSaida();
             cadastrando();
             //ImprimiaoSair();
             dispose();
             return false;
             
         }
         
           
           return true;
           
        }
        
     

    private void sair() {
        
        VerificaVenda();
        
      
    }
    
     private void Comanda() {
        //esse é usado na impressao detalhada 23/08/2018
       try{
            //File arquivoped = new File("C:\\pedido\\pedidos"+pedir.getText()+".txt");
            File arquivo = new File("C:\\pedido\\comanda.txt");
            if(arquivo.exists()){
                try (FileWriter pedirme = new FileWriter(arquivo, true)) {
                    PrintWriter linhasTxt = new PrintWriter(pedirme);
                    linhasTxt.println("=============================================");
                    linhasTxt.println("      Rua Chapeco 1523 - Borda do Campo      ");
                    linhasTxt.println("          Telefone - 41-99910-1536           ");
                    linhasTxt.println("=============================================");
                   // linhasTxt.println(" CLIENTE:......................              ");
                    linhasTxt.println("Cliente:." +" "+txtNome.getText()+"");
                    linhasTxt.println("Endereco:." +" "+txtEndereco.getText()+"");
                    linhasTxt.println("Fone:."+txtTelefone.getText()+"");
                    linhasTxt.println("Entrega:."+"R$ "+txtEntrega.getText().replace(".", ",")+"0");//valor da entrega;
                    linhasTxt.println("                                             ");
                    linhasTxt.println("======= CANTINHO DO DOG - CNPJ 000000123  ===");
                    //linhasTxt.println("===========================================");
                    linhasTxt.println("................ CUPOM NAO FISCAL .............");
                    linhasTxt.println("===============================================");
                    linhasTxt.println("*********** Pedido No"+" "+pedir.getText()+" **");
                    linhasTxt.println("===============================================");
                    linhasTxt.println("PRODUTOS    VALOR    QTD    DETALHE      ACRESCIMOS");
                    //dados da tabela
                    for(int x = 0; x < tmVendas.getRowCount(); x++){
                        linhasTxt.print(String.format("%-10.08s",Tabela.getModel().getValueAt(x, 0)));//produto
                        linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 1)));//valor
                        linhasTxt.print(String.format("%2s     ",Tabela.getModel().getValueAt(x, 2)));//qtd
                        linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 3)));//detalhes
                        linhasTxt.print(String.format("%8s     ",Tabela.getModel().getValueAt(x, 4)));//ACRESCIMOS
                        //linhasTxt.print(String.format("%9s     ",Tabela.getModel().getValueAt(x, 5)));//ACRESCIMOS
                        linhasTxt.println();
                        //String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
                    }                          
                    //linhasTxt.println("================================================");
                    //linhasTxt.println("-------------------- ACRESCIMOS ----------------");
                    linhasTxt.println("=============== ACRESCIMOS/VALOR==================");
                       for(int x = 0; x < tmVendas.getRowCount(); x++){
                        linhasTxt.print(String.format("%-10.08s",Tabela.getModel().getValueAt(x, 0)));//produto
                        //linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 5)).replace(".", ","));//ACRESCIMOS_Detalhe
                        linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 5)));//ACRESCIMOS_Detalhe
                        linhasTxt.print(String.format(txtEntrega.getText()));
                        linhasTxt.println();
                        //linhasTxt.println();
                        
                        //String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
                    } 
                     linhasTxt.println("--------------------------------------------------");
                     linhasTxt.println("Total Acrescimos ------ R$ "+txtValorFinal.getText().replace(".", ",")+"0");//valor dos acrescimos
                    //linhasTxt.println(""+ Tabela.getModel().getValueAt(0,4));
                    //linhasTxt.println(""+maionese.getText()+"    "+ervilha.getText()+"   "+porcao.getText());
                    //linhasTxt.println(""+ervilha.getText());
                     linhasTxt.println("Desconto-----------> R$ "+txtDesconto.getText().replace(".", ".")+"0");
                    //linhasTxt.println(""+porcao.getText());
                    linhasTxt.println("------------------------------------------------------");
                    linhasTxt.println("   DATA/HORA           OPERADOR             ITENS     ");
                    linhasTxt.print(String.format("%4s  %10s  %17s",
                                     // jVendasDia.getText(),//data
                                      jVendasDia.getText()+"-"+txtHora.getText(),//data + hora
                                      jMenuOperador.getText(),//OPERADOR
                                      conte.getText()//itens
                                      ));
                    linhasTxt.println();
                    linhasTxt.println("=====================================================");
                    linhasTxt.println("Valor Recebido ----------> "+"R$"+" "+txtValorrecebido.getText());
                    //linhasTxt.println("Valor Recebido ----------> "+"R$"+" "+txtValorrecebido.getText().replace(".", ",")+"0");
                    linhasTxt.println(".....................................................");
                    linhasTxt.println("Troco         ----------->  "+"R$"+" "+txtTrocos.getText());
                    //linhasTxt.println("Troco         ----------->  "+"R$"+" "+txtTroco.getText().replace(".", ",")+"0");
                    linhasTxt.println("                           ..........................");
                    linhasTxt.println("total S/Acrescimos------->  "+"R$"+" "+txtValorsemacrescimo.getText().replace(".", ",")+"0");
                     linhasTxt.println("         ............................................");
                    linhasTxt.println("TOTAL A PAGAR ----------->  "+"R$"+" "+tfValor.getText().replace(".", ",")+"0");
                    linhasTxt.println("======================================================");
                    //linhasTxt.println((char)27 +"[============================");
                    linhasTxt.println("       OBRIGADO PELA PREFERENCIA           ");
                    linhasTxt.println("             VOLTE SEMPRE                  ");
                    linhasTxt.println("      Telefone - 41-99910-1536 - WhatsApp  ");
                    linhasTxt.println("=================================================");
                    linhasTxt.println("-------------- Via do Cliente -------------------");
                    linhasTxt.println("-------------------------------------------------");
                    linhasTxt.println("=================================================");
                    linhasTxt.println("**** Aguarde o seu Pedido No"+" "+pedir.getText()+" *****************");
                    linhasTxt.println("=================================================");
                    int i = 0;
                    while(i < 2) //limita espaçamento entre blocos txt
                    i++;
                       
                     linhasTxt.println();
                        //linhasTxt.write("");  
                        //linhasTxt.flush(); 
                    
                }
                
                //emitePedido();
                                
                //JOptionPane.showMessageDialog(this, "Comanda impressa com Sucesso!");
                //Excluipedido();
                //Comanda();
                 btFinal.setEnabled(false);
                //arquivoped.delete();// precisa habilitar esse parar excluir o arquivo
                //Excluipedido();
            }else{
                //se naum existir
                arquivo.createNewFile();
                //Pedidos();
                //Comanda();
                //Excluipedido(); LIMPA ARQUIVO
                //arquivoped.delete();// precisa habilitar esse parar excluir o arquivo
            }
      }catch(IOException error){
          JOptionPane.showMessageDialog(this, "nao encontrei arquivo,"+"\n"+"Para resolver esse problema crie uma pasta no disco C:/ com nome pedidos");
          //System.out.println("nao encontrei arquivo"+error);
          btFinal.setEnabled(false);
          
      }

     
   }
   
     
    
    private void PedidosTela(){//esse que imprime na bematech, agora EPSON TM-T20
        
         try{
             //FileWriter arq = new FileWriter("C:/BLVendasPdvMySQL/relImprimir.txt");
            // PrintWriter gravarArq = new PrintWriter(arq);
            //File arquivoped = new File("C:\\pedido\\pedidos"+pedir.getText()+".txt");
            File arquivoTela = new File("C:\\pedido\\tela.txt");
            if(arquivoTela.exists()){
               try (FileWriter pedidosTela = new FileWriter(arquivoTela, true)) {
                    PrintWriter linhasTxt = new PrintWriter(pedidosTela);//+txtTelefone
                    linhasTxt.println("________________________________________________");
                    linhasTxt.println("DATA|HORA           OPERADOR         TOTAL_ITENS");
                    //--linhasTxt.print(String.format("%4s  %9s  %16s",
                    linhasTxt.println(String.format("%4s  %9s  %15s",jVendasDia.getText()+"|"+
                            txtHora.getText(),jMenuOperador.getText(),txtSomaProdutos.getText())); 
                    linhasTxt.println("________________________________________________");
                    linhasTxt.println("Pedido No"+" "+pedir.getText()+"                ");
                    linhasTxt.println("________________________________________________");
                    linhasTxt.println("Cliente:." +" "+txtNome.getText()+"");
                    linhasTxt.println("Endereco:." +" "+txtEndereco.getText()+"");
                    linhasTxt.println("Fone:."+txtTelefone.getText()+"");
                    // linhasTxt.println("Entrega:."+txtEntrega.getText().replace(".", ",")+"0");//valor da entrega;
                    linhasTxt.println("________________________________________________");
                    linhasTxt.println("LANCHES     VALOR     QTD      DETALHE    ACRESC");
                    linhasTxt.println("________________________________________________");
                    //dados da tabela
                    for(int x = 0; x < tmVendas.getRowCount(); x++){
                        //for(int x = 0; x < Tabela.size(); x++){
                        linhasTxt.print(String.format("%-10.08s",Tabela.getModel().getValueAt(x, 0)));//produto
                        linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 1)));//valor
                        linhasTxt.print(String.format("%2s     ",Tabela.getModel().getValueAt(x, 2)));//qtd
                        linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 3)));//detalhes
                        linhasTxt.print(String.format("%8s     ",Tabela.getModel().getValueAt(x, 4)));//ACRESCIMOS
                        //--linhasTxt.print(String.format("%9s     ",Tabela.getModel().getValueAt(x, 5)));//ACRESCIMOS
                        //--linhasTxt.println();
                        linhasTxt.println();
                        //String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
                    }
                               
                               
                    linhasTxt.println("__________________________________________________");
                    linhasTxt.println("BEBIDAS     VALOR      QTD                        ");
                    linhasTxt.println("__________________________________________________");
                    //dados da tabela
                    for(int x = 0; x < tmVendasBebidas.getRowCount(); x++){
                        //for(int x = 0; x < Tabela.size(); x++){
                        linhasTxt.print(String.format("%-10.08s",TabelaBebidas.getModel().getValueAt(x, 0)));//bebida
                        linhasTxt.print(String.format("%7s     ",TabelaBebidas.getModel().getValueAt(x, 1)));//valor
                        linhasTxt.print(String.format("%2s     ",TabelaBebidas.getModel().getValueAt(x, 2)));//qtd
                        //linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 3)));//detalhes
                       // linhasTxt.print(String.format("%8s     ",Tabela.getModel().getValueAt(x, 4)));//ACRESCIMOS
                       // linhasTxt.print(String.format("%9s     ",Tabela.getModel().getValueAt(x, 5)));//ACRESCIMOS
                        //--linhasTxt.println();
                        linhasTxt.println();
                        //String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
                    } 
                              //---linhasTxt.println( ""+(char )27+(char)109); // corta para entrega
                     linhasTxt.println("________________________________________________");
                     linhasTxt.println("DADOS     | ENTREGA");
                     linhasTxt.println("                                                ");
                     linhasTxt.println("Endereco:." +" "+txtEndereco.getText()+"");
                     linhasTxt.println("Fone:."+txtTelefone.getText()+"");
                     linhasTxt.println("Taxa_Entrega:." +txtEntrega.getText().replace(".", ",")+"0");//valor da entrega;
                     linhasTxt.println("________________________________________________");
                     linhasTxt.println("VALOR_TOTAL | ACRESCIMOS                        ");
                     linhasTxt.println("                                                ");
                     //txtValorsemacrescimo
                     linhasTxt.println("SubTotal-----------> R$ "+txtValorsemacrescimo.getText().replace(".", ",")+"0");
                     linhasTxt.println("Acrescimos---------> R$ "+txtValorFinal.getText().replace(".", ",")+"0");//valor dos acrescimos
                     linhasTxt.println("Entrega------------> R$ "+txtEntrega.getText().replace(".", ",")+"0");//valor da entrega;
                     linhasTxt.println("________________________________________________");
                     linhasTxt.println("Desconto-----------> R$ "+txtDesconto.getText().replace(".", ".")+"0");
                     linhasTxt.println("________________________________________________");
                     linhasTxt.println("Total--------------> R$ "+tfValor.getText().replace(".", ",")+"0"+"");
                     linhasTxt.println("________________________________________________");
                     int i = 0;
                     while(i < 2){
                        i++;
                        //linhasTxt.print("teste");
                        linhasTxt.println();
                        //linhasTxt.write("");
                        //linhasTxt.flush();
                    }
                    
                   //-- pedidos.flush(); 
                    //linhasTxt.println( ""+(char )27+(char)119); // aciona guilhotina bematech
                   // linhasTxt.println( ""+(char )27+(char)109), Len(char(27) + char (109)); // aciona guilhotina epson
                    //Chr(27) + Chr(109), Len(Chr(27) + Chr(109)) 
                    // linhasTxt.println( ""+(char )27+(char)109), Len(char)(27)+(char)109)); // aciona guilhotina epson
                  //   linhasTxt.println("--");
                     linhasTxt.println("");
                     linhasTxt.println( ""+(char )27+(char)109); // aciona guilhotina epson
           }
                
               
                  
               //-- emitePedido(); //chama metodo imprimir em rede agora
               //-- Excluipedido();//LIMPA PEDIDOS 
              //--  Comanda();
               //--
               
               
               btFinal.setEnabled(false);
                //arquivoped.delete();// precisa habilitar esse parar excluir o arquivo
               //-- Excluipedido();
                
            }else{
                //se naum existir
                arquivoTela.createNewFile();
               //-- PedidosCozinha();
               //-- Comanda();
              //--  Excluipedido();
                //arquivoped.delete();// precisa habilitar esse parar excluir o arquivo
               btFinal.setEnabled(false);
            }
      }catch(IOException error){
          JOptionPane.showMessageDialog(this, "nao encontrei arquivo,"+"\n"+"Para resolver esse problema crie uma pasta no disco C:/ com nome pedido" +error);
          //System.out.println("nao encontrei arquivo"+error);
          btFinal.setEnabled(false);
          
      }
  }
    
    private void PedidosCozinha(){//esse que imprime na bematech, agora EPSON TM-T20
        
         try{
             //FileWriter arq = new FileWriter("C:/BLVendasPdvMySQL/relImprimir.txt");
            // PrintWriter gravarArq = new PrintWriter(arq);
            //File arquivoped = new File("C:\\pedido\\pedidos"+pedir.getText()+".txt");
            File arquivoped = new File("C:\\pedido\\pedidos.txt");
            if(arquivoped.exists()){
               try (FileWriter pedidos = new FileWriter(arquivoped, true)) {
                    PrintWriter linhasTxt = new PrintWriter(pedidos);//+txtTelefone
                    linhasTxt.println("_________________________________________");
                    linhasTxt.println("DATA|HORA           OPERADOR       ITENS ");
                    //--linhasTxt.print(String.format("%4s  %9s  %16s",
                    linhasTxt.println(String.format("%4s  %9s  %9s",jVendasDia.getText()+"|"+
                            txtHora.getText(),jMenuOperador.getText(),txtSomaProdutos.getText())); 
                    linhasTxt.println("_________________________________________");
                    linhasTxt.println("Pedido No"+" "+pedir.getText()+"         ");
                    linhasTxt.println("_________________________________________");
                    linhasTxt.println("Cliente:." +" "+txtNome.getText()+"");
                    linhasTxt.println("Endereco:." +" "+txtEndereco.getText()+"");
                    linhasTxt.println("Fone:."+txtTelefone.getText()+"");
                    // linhasTxt.println("Entrega:."+txtEntrega.getText().replace(".", ",")+"0");//valor da entrega;
                    linhasTxt.println("__________________________________________");
                    linhasTxt.println("LANCHES     VALOR    QTD   DETALHE  ACRESC");
                    linhasTxt.println("__________________________________________");
                    //dados da tabela
                    for(int x = 0; x < tmVendas.getRowCount(); x++){
                        //for(int x = 0; x < Tabela.size(); x++){
                        linhasTxt.print(String.format("%-13.08s",Tabela.getModel().getValueAt(x, 0)));//produto
                        linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 1)));//valor
                        linhasTxt.print(String.format("%2s     ",Tabela.getModel().getValueAt(x, 2)));//qtd
                        linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 3)));//detalhes
                        linhasTxt.print(String.format("%8s     ",Tabela.getModel().getValueAt(x, 4)));//ACRESCIMOS
                        //--linhasTxt.print(String.format("%9s     ",Tabela.getModel().getValueAt(x, 5)));//ACRESCIMOS
                        //--linhasTxt.println();
                        linhasTxt.println();
                        //String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
                    }                          
                     
                               
                    linhasTxt.println("_____________________________________________");
                    linhasTxt.println("BEBIDAS     VALOR      QTD                   ");
                    linhasTxt.println("_____________________________________________");
                    //dados da tabela
                    for(int x = 0; x < tmVendasBebidas.getRowCount(); x++){
                        //for(int x = 0; x < Tabela.size(); x++){
                        linhasTxt.print(String.format("%-10.08s",TabelaBebidas.getModel().getValueAt(x, 0)));//bebida
                        linhasTxt.print(String.format("%7s     ",TabelaBebidas.getModel().getValueAt(x, 1)));//valor
                        linhasTxt.print(String.format("%2s     ",TabelaBebidas.getModel().getValueAt(x, 2)));//qtd
                        //linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 3)));//detalhes
                       // linhasTxt.print(String.format("%8s     ",Tabela.getModel().getValueAt(x, 4)));//ACRESCIMOS
                       // linhasTxt.print(String.format("%9s     ",Tabela.getModel().getValueAt(x, 5)));//ACRESCIMOS
                        //--linhasTxt.println();
                        linhasTxt.println();
                        //String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
                    }     
                                
                     linhasTxt.println("___________________________________________");
                     linhasTxt.println("DADOS     | ENTREGA");
                     linhasTxt.println("___________________________________________");
                     //---linhasTxt.println( ""+(char )27+(char)109); // corta para entrega
                     linhasTxt.println("Cliente:." + " "+txtNome.getText()+"");       
                     linhasTxt.println("Endereco:." +" "+txtEndereco.getText()+"");
                     linhasTxt.println("Fone:."+txtTelefone.getText()+"");
                     linhasTxt.println("Taxa_Entrega:." +txtEntrega.getText().replace(".", ",")+"0");//valor da entrega;
                     linhasTxt.println("___________________________________________");
                     linhasTxt.println("VALOR_TOTAL | ACRESCIMOS                   ");
                     //linhasTxt.println("                                            ");
                     //txtValorsemacrescimo
                     linhasTxt.println("SubTotal-----------> R$ "+txtValorsemacrescimo.getText().replace(".", ",")+"0");
                     linhasTxt.println("Acrescimos---------> R$ "+txtValorFinal.getText().replace(".", ",")+"0");//valor dos acrescimos
                     linhasTxt.println("Entrega------------> R$ "+txtEntrega.getText().replace(".", ",")+"0");//valor da entrega;
                     linhasTxt.println("___________________________________________");
                     linhasTxt.println("Desconto-----------> R$ "+txtDesconto.getText().replace(".", ".")+"0");
                     linhasTxt.println("___________________________________________");
                     linhasTxt.println("Total--------------> R$ "+tfValor.getText().replace(".", ",")+"0"+"");
                     linhasTxt.println("___________________________________________");
                     
                     int i = 0;
                     while(i < 2){
                        i++;
                        //linhasTxt.print("teste");
                        linhasTxt.println();
                        //linhasTxt.write("");
                        //linhasTxt.flush();
                    }
                    
                    pedidos.flush(); 
                    //linhasTxt.println( ""+(char )27+(char)119); // aciona guilhotina bematech
                   // linhasTxt.println( ""+(char )27+(char)109), Len(char(27) + char (109)); // aciona guilhotina epson
                    //Chr(27) + Chr(109), Len(Chr(27) + Chr(109)) 
                    // linhasTxt.println( ""+(char )27+(char)109), Len(char)(27)+(char)109)); // aciona guilhotina epson
                  //   linhasTxt.println("--");
                     linhasTxt.println("");
                     linhasTxt.println( ""+(char )27+(char)109); // aciona guilhotina epson
           }
                
               
                  
                emitePedido(); //chama metodo imprimir em rede agora
                Excluipedido();//LIMPA PEDIDOS 
                Comanda();
                PedidosTela();
                btFinal.setEnabled(false);
                //arquivoped.delete();// precisa habilitar esse parar excluir o arquivo
                Excluipedido();
                
            }else{
                //se naum existir
                arquivoped.createNewFile();
                PedidosCozinha();
                Comanda();
                PedidosTela();
                Excluipedido();
                //arquivoped.delete();// precisa habilitar esse parar excluir o arquivo
                btFinal.setEnabled(false);
            }
      }catch(IOException error){
          JOptionPane.showMessageDialog(this, "nao encontrei arquivo,"+"\n"+"Para resolver esse problema crie uma pasta no disco C:/ com nome pedido");
          //System.out.println("nao encontrei arquivo"+error);
          btFinal.setEnabled(false);
          
      }
   
        
    }          
    
    public void acionarGuilhotina(){
       // imprime(""+(char)27+(char)109);
    }
    //passando valores para  um relatorio ireport sem conexao no banco e pegando valores da jtable
//metodo chamado em um jbutton
public void abrirComanda() throws JRException {
        try {
            CalcTotalAcrescimo();
            DefaultTableModel de = (DefaultTableModel) Tabela.getModel();
            JRTableModelDataSource datasource = new JRTableModelDataSource(de);
            String reportSource = "./example.jrxml";
            //String reportSource = "./example.jasper";
            //String reportSource = "c:/pedido/example.jrxml";

            JasperReport jr = JasperCompileManager.compileReport(reportSource);

            Map<String, Object> params = new HashMap<String, Object>();
           // params.put("title1", "Cantinho Dog");
            params.put("title1", "ToTal de Vendas - R$"+tfValor.getText());//total Geral
            params.put("title2", "Acrescimos - R$"+txtValorFinal.getText());//acrescimos
            params.put("dataVenda", "Data/hora"+jVendasDia.getText());//acrescimos
            

            JasperPrint jp = JasperFillManager.fillReport(jr, params, datasource);
           
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public void abrirComandas() throws JRException{
        //String arquivo = "Relatorios/EmitirComanda.jasper"; //arquivo de relatorio
        String arquivo = "./example.jrxml";
        java.io.InputStream file = getClass().getClassLoader().getResourceAsStream(arquivo); //carrego o arquivo
        JRTableModelDataSource tabela = new JRTableModelDataSource(Tabela.getModel()); //aqui eu crio um datasource usando a propria jtable
        Map parametros = new HashMap(); //apenas crio um map, mas nem passo parametro nem nada, os parametros sao as colunas da jtable
        JasperPrint printer = JasperFillManager.fillReport(file, parametros, tabela); //aqui eu passo a jtable(tabela) para o relatorio
        JRViewer view = new JRViewer(printer); //preview
        JDialog dialog = new JDialog(); //jdialog que contem o preview
        dialog.getContentPane().add(view); //adiciono o preview
        dialog.setSize(800,600);
        dialog.setLocationRelativeTo(this);
        dialog.setModalityType(ModalityType.APPLICATION_MODAL);
        dialog.setModal(true);
        dialog.setVisible(true);
    }
public void botaoActionPerformed() throws JRException{
            abrirComanda(); //chama o metodo
}
        
   private void Pedidos_old() {
        
      try{
            //File arquivoped = new File("C:\\pedido\\pedidos"+pedir.getText()+".txt");
            File arquivoped = new File("C:\\pedido\\pedidos.txt");
            if(arquivoped.exists()){
                try (FileWriter pedidos = new FileWriter(arquivoped, true)) {
                    PrintWriter linhasTxt = new PrintWriter(pedidos);
                    linhasTxt.println("=========== PEDIDOS DE LANCHES ============");
                    linhasTxt.println("   Telefones: 41-9910-1536     ");
                    //linhasTxt.println("===========================================");
                    //linhasTxt.println("...........................................");
                    linhasTxt.println("===============================================");
                    linhasTxt.println("*********** Pedido No"+" "+pedir.getText()+" *****************");
                    linhasTxt.println("===============================================");
                    linhasTxt.println("PROD    VALOR.UN    QTD   DETAL    ACRESC");
                    //dados da tabela
                    for(int x = 0; x < tmVendas.getRowCount(); x++){
                        linhasTxt.print(String.format("%-10.10s",Tabela.getModel().getValueAt(x, 0)));//produto
                        linhasTxt.print(String.format("%5s     ",Tabela.getModel().getValueAt(x, 1)));//valor
                        linhasTxt.print(String.format("%1s    ",Tabela.getModel().getValueAt(x, 2)));//qtd
                        linhasTxt.print(String.format("%5s     ",Tabela.getModel().getValueAt(x, 3)));//detalhes
                        linhasTxt.print(String.format("%6s     ",Tabela.getModel().getValueAt(x, 4)));//ACRESCIMOS
                        linhasTxt.println();
                        //String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
                    }
                    //linhasTxt.println("================================================");
                    //linhasTxt.println("-------------------- ACRESCIMOS ----------------");
                    linhasTxt.println("================================================");
                    //linhasTxt.println(""+cebola.getText()+"         "+pimentao.getText());
                    //linhasTxt.println(""+pimentao.getText());
                    //linhasTxt.println(""+maionese.getText()+"    "+ervilha.getText()+"   "+porcao.getText());
                    //linhasTxt.println(""+ervilha.getText());
                    //linhasTxt.println(""+porcao.getText());
                    linhasTxt.println("=================================================");
                    linhasTxt.println("   DATA          OPER.          ITENS ");
                    linhasTxt.print(String.format("%5s  %9s  %16s",
                            jVendasDia.getText(),//data
                            jMenuOperador.getText(),//OPERADOR
                            conte.getText()//itens
                    ));
                    linhasTxt.println();
                    linhasTxt.println("=================================================");
                    linhasTxt.println("Valor Recebido ----------> "+"R$"+""+txtValorrecebido.getText());
                    linhasTxt.println("...........................................");
                    linhasTxt.println("Troco         ----------->  "+"R$"+""+txtTrocos.getText());
                    linhasTxt.println("                           ................");
                    //linhasTxt.println("Total a Pagar ----------->  "+"R$"+""+tfValor.getText().replace(".", ","));
                    linhasTxt.println("Total a Pagar ----------->  "+"R$"+" "+tfValor.getText().replace(".", ",")+"0");
                    linhasTxt.println("==================================================");
                    //linhasTxt.println((char)27 +"[============================");
                    linhasTxt.println("       OBRIGADO PELA PREFERENCIA           ");
                    linhasTxt.println("             VOLTE SEMPRE                  ");
                    linhasTxt.println("   Telefones: 41-9910-1536    ");
                    linhasTxt.println("=================================================");
                    //linhasTxt.println("-------------- Via do Cliente -------------------");
                    //linhasTxt.println("-------------------------------------------------");
                    //linhasTxt.println("=================================================");
                    //linhasTxt.println("=================================================");
                    // linhasTxt.println("**** Aguarde o seu Pedido No"+" "+pedir.getText()+" *****************");
                    //linhasTxt.println("=================================================");
                    int i = 0;
                    while(i < 2){
                        i++;
                        linhasTxt.println();
                        //linhasTxt.write("");
                        //linhasTxt.flush();
                    }
                    
                    pedidos.flush();
                }
                
                emitePedido();
                
                
                JOptionPane.showMessageDialog(this, "Pedido impresso com Sucesso!");
                Excluipedido();
                Comanda();
                btFinal.setEnabled(false);
                //arquivoped.delete();// precisa habilitar esse parar excluir o arquivo
                Excluipedido();
            }else{
                //se naum existir
                arquivoped.createNewFile();
                PedidosCozinha();
                Comanda();
                Excluipedido();
                //arquivoped.delete();// precisa habilitar esse parar excluir o arquivo
                btFinal.setEnabled(false);
            }
      }catch(IOException error){
          JOptionPane.showMessageDialog(this, "nao encontrei arquivo,"+"\n"+"Para resolver esse problema crie uma pasta no disco C:/ com nome pedidos");
          //System.out.println("nao encontrei arquivo"+error);
          btFinal.setEnabled(false);
          
      }

   }
   private void captura() throws AWTException{
    File diretorio = new File("C:\\telas");
                File bck = new File("C:\\telas\\screencapture.jpg");
                               
                if(!diretorio.isDirectory()) {
               new File("C:\\telas").mkdir();
            } else {

            }
 
        // Save as JPEG
        try {
            
                  if(!bck.isFile()) {
                  // capture the whole screen
                BufferedImage screencapture = new Robot()
                .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit()
                        .getScreenSize()));
                ImageIO.write(screencapture, "jpg", bck);
                        JOptionPane.showMessageDialog(null,"Gravou em C:/telas","ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
                  JOptionPane.showMessageDialog(null, "Seu Arquivo foi gerado na Pasta c: telas!");
                } else {
                  
                while(bck.isFile()) {
                        conta++;  //ciei essa variavel do tipo int para incrementar
                        bck = new File("c:\\telas\\screencapture000000"+conta+".jpg");
                       // SiscomPE ++;
                       
                    }
                BufferedImage screencapture = new Robot()
                .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit()
                        .getScreenSize()));
                ImageIO.write(screencapture, "jpg", bck);
                        JOptionPane.showMessageDialog(null,"Gravou em C:/telas","Grava tela do Sistema",JOptionPane.INFORMATION_MESSAGE);
        // Save as PNG
        // File file = new File("screencapture.png");
        // ImageIO.write(screencapture, "png", file);
 
        //System.out.println("gravou!");
        
                  }
                } catch (IOException ex) {
                //ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro na Gravacao, nao foi gerado na Pasta c: telas!"+ex);
                }
        
}
    
   private void Boteco(){
       //ESCREVER TXT      
  try{  
      //File arquivo = new File("teste.txt"); 
      File arquivo = new File("C:\\pedido\\comandas.txt");
      if(arquivo.exists()){  
          //se existir  
          FileWriter arquivoTxt = new FileWriter(arquivo, true);  
          PrintWriter linhasTxt = new PrintWriter(arquivoTxt);  
          //ACREDITO QUE SO PODE TER 42 CARACTERES  
          linhasTxt.println("==========================================");  
          linhasTxt.println("          Cantinho do DOG - CNPJ 000000123 ");  
          linhasTxt.println("===========================================");  
          linhasTxt.println("********** NAO E DOCUMENTO FISCAL *********");  
          linhasTxt.println("===========================================");  
          linhasTxt.println("PRODUTO      QTDE      VALOR UN.      VALOR");  
          //dados da tabela  
          /*for(int x = 0; x < tabelaConsumo.getRowCount(); x++){ 
              linhasTxt.print(String.format("%-10.10s",tabelaConsumo.getModel().getValueAt(x, 1))); 
              linhasTxt.print(String.format("%7s     ",tabelaConsumo.getModel().getValueAt(x, 5))); 
              linhasTxt.print(String.format("%10s    ",tabelaConsumo.getModel().getValueAt(x, 4))); 
              linhasTxt.print(String.format("%7s    ",tabelaConsumo.getModel().getValueAt(x, 6))); 
              linhasTxt.println(); 
          }*/  
          for(int x = 0; x < Tabela.getRowCount(); x++){ 
              linhasTxt.print(String.format("%-10.10s",Tabela.getModel().getValueAt(x, 0))); 
              linhasTxt.print(String.format("%7s     ",Tabela.getModel().getValueAt(x, 1))); 
              linhasTxt.print(String.format("%10s    ",Tabela.getModel().getValueAt(x, 2))); 
              linhasTxt.print(String.format("%7s    ",Tabela.getModel().getValueAt(x, 3))); 
              linhasTxt.println(); 
          }
          linhasTxt.println("===========================================");  
          linhasTxt.println("   INFORMACOES PARA FECHAMENTO DE CONTA    ");  
          linhasTxt.println("===========================================");  
          linhasTxt.println(" GARCOM  CONTA.DIV.  VAL.PESS. COVER  DESC.");  
          linhasTxt.print(String.format("%7s  %9s  %9s  %5s   %s",  
                            "garcom",  
                            "dividirconta",  
                            "vlpessoa",  
                            "cover",  
                            "desconto"  
                            //garcom.getText(),  
                            //dividirConta.getText(),  
                            //valorPorPessoa.getText(),  
                            //cover.getText(),  
                            //descontoConta.getText()  
                            ));  
          linhasTxt.println();  
          linhasTxt.println("===========================================");  
          //linhasTxt.println("SubTotal                            " + valorBruto.getText());  
          linhasTxt.println("SubTotal                            " + "10,00");  
          linhasTxt.println("                   ------------------------");  
          //linhasTxt.println("Total                                " + valorBruto.getText());  
          linhasTxt.println("Total                                " + "10,00");  
          linhasTxt.println("===========================================");  
          linhasTxt.println("       MENSAGEM DA EMPRESA VAI AQUI        ");  
          linhasTxt.println("   INFORMACOES PARA FECHAMENTO DE CONTA    ");  
  
          int i = 0;  
          while(i < 10){  
              i++;  
              linhasTxt.println();  
          }                  
          arquivoTxt.close();  
          //emiteComanda();  
            
      }else{  
          //se naum existir  
          arquivo.createNewFile();  
          //criaTxt();  
      }  
}catch(IOException error){  
    System.out.println("nao encontrei arquivo");  
}  
    
    
  // imprime arquivo   
  try {  
      java.io.InputStream is = new FileInputStream("C:\\pedido\\comandas.txt");  
      Scanner sc = new Scanner(is);  
      FileOutputStream fs = new FileOutputStream("LPT1:");  
      PrintStream ps = new PrintStream(fs);  
  
      while(sc.hasNextLine()){  
          String linhas = sc.nextLine();  
          ps.println(linhas);  
      }  
        fs.close();  
    }    catch (IOException ex) {  
        JOptionPane.showMessageDialog(null, "Erro encontrado ao imprimir comanda.");  
  }    
   }
  public void imprimirf(String pCaminhoDoArquivo) {

        Desktop desktop = Desktop.getDesktop();

        try {
            File arquivoAImprimir = new File(pCaminhoDoArquivo);
            desktop.print(arquivoAImprimir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
   
    
   
        private void Rezise(){
        Tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  
        Tabela.getColumnModel().getColumn(0).setPreferredWidth(180);//nome
        Tabela.getColumnModel().getColumn(1).setPreferredWidth(55); //doc
        Tabela.getColumnModel().getColumn(2).setPreferredWidth(30);//DETALHE
        Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);//telefone
        Tabela.getColumnModel().getColumn(4).setPreferredWidth(330);//ACRESCIMOS
      //  Tabela.getColumnModel().getColumn(5).setPreferredWidth(580);//ACRESCIMOS_Detalhes
        // Tabela.getColumnModel().getColumn(6).setPreferredWidth(1230);//ACRESCIMOS
       
    }

    private void emiteViadois() {
        try {
            //java.io.InputStream is = new FileInputStream("C:\\pedido\\pedidos"+pedir.getText()+".txt");
            java.io.InputStream is = new FileInputStream("C:\\pedido\\2via.txt");
            Scanner sc = new Scanner(is);
            FileOutputStream fs = new FileOutputStream("LPT1:");
            PrintStream ps = new PrintStream(fs);

            while(sc.hasNextLine()){
                String linhas = sc.nextLine();
                ps.println(linhas);
                
            }
            fs.close();
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro encontrado ao imprimir comanda.");
            
        }        
    }

    private boolean verificarCampos() {
        if (txtValorrecebido.getText().equals("")){//se campo for vazio
           JOptionPane.showMessageDialog(this,"Observar o campo Valor Recebido!","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
           // JOptionPane.showInputDialog(null,"Informe um valor inteiro:\n(ou 0 para sair)"
           // ,"Retirar", JOptionPane.QUESTION_MESSAGE);         
           //txtValorFinal.setText(tfValor.getText());
            txtValorrecebido.requestFocus();
            txtQuantidade.setText("1");//limpa Campo
            return false;
        }
        return true;
        
    }

      
}
