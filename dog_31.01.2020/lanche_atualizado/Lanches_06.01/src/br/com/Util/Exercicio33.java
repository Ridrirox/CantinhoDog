package br.com.Util;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Gerlandio da Silva Lucena(WebForCraft)
 * @download SqlManagementStudio Para administração do banco de dados http://www.microsoft.com/pt-br/download/details.aspx?id=7593
 * @download Banco de dados para utilizar nas proximas video aulas  http://www.microsoft.com/pt-br/download/details.aspx?id=23650
 * @download Driver para conectarmos com nossa aplicação http://www.microsoft.com/pt-br/download/details.aspx?id=11774
 */
public class Exercicio33 extends JFrame implements ActionListener
{
    JLabel lblcodigo,lblnome,lblemail;
    JButton btngrava, btnabre, btnlimpa, btnfecha;
    JTextField txtcodigo,txtnome,txtemail;
    FileDialog salvarq, abrearq;
    
    public Exercicio33()
    {
        
        setTitle("Gravando arquivo txt");
        setBounds(250,50,400,160);
        getContentPane().setBackground(new Color(150,150,150));
        lblcodigo = new JLabel("Codigo");
        lblnome = new JLabel("Nome");
        lblemail = new JLabel("Email");
        
        btngrava = new JButton("Gravar");
        btngrava.addActionListener(this);
        
        btnabre = new JButton("Abre");
        btnabre.addActionListener(this);
        
        btnlimpa = new JButton("Limpa");
        btnlimpa.addActionListener(this);
        
        btnfecha = new JButton("Fecha");
        btnfecha.addActionListener(this);
        
        txtcodigo = new JTextField();
        txtnome = new JTextField();
        txtemail = new JTextField();
        setLayout(null);
        
        //setBounds(x,y, larg, alt);
        //35+5 onde 5 é espaçamento
        lblcodigo.setBounds(10,15,40,20);
        lblnome.setBounds(10,40,45,20);
        lblemail.setBounds(10,65,45,20);
        // começa alinhado com as labels
        // tamanho de 75 de todos os botoes
        // 10 + 75 = 85 + 10 de espaçamento 95+75...
        btnabre.setBounds(10,100,75,20);
        btngrava.setBounds(95,100,75,20);
        btnfecha.setBounds(180,100,75,20);
        btnlimpa.setBounds(265,100,75,20);
        
        //alinhados ao lado das labels
        // lar + posicao em Y
        txtcodigo.setBounds(60,15,55,20);
        txtnome.setBounds(60,40,255,20);
        txtemail.setBounds(60,65,255,20);
        // não interfere no layout desde que nulo 
        add(lblcodigo);
        add(lblnome);
        add(lblemail);
        add(btngrava);
        add(btnabre);
        add(btnfecha);
        add(btnlimpa);
        add(txtnome);
        add(txtcodigo);
        add(txtemail);
       
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnlimpa)
        {
           txtnome.setText("");
           txtcodigo.setText("");
           txtemail.setText("");
        }
        if(e.getSource() == btnfecha)
        {
          System.exit(0);
        }
        if(e.getSource() == btngrava)
        {  
            try
            {
            salvarq = new  FileDialog(new Dialog(this),"Salvando arquivo cadastro", FileDialog.SAVE);   
            salvarq.setVisible(true);
            
            PrintWriter arq = new PrintWriter(salvarq.getDirectory()+salvarq.getFile());
            arq.println(txtcodigo.getText());
            arq.println(txtnome.getText());
            arq.println(txtemail.getText());
            arq.close();
            JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
            }
            catch(Exception erro)
            {JOptionPane.showMessageDialog(null, "Arquivo não foi salvo.Erro:"+erro.getMessage());
            
            }
            
        }
        if(e.getSource() == btnabre)
        {
            
         try
         {
           abrearq = new FileDialog(new Dialog(this),"Selecione o arquivo",FileDialog.LOAD);
           abrearq.setVisible(true);
           //String codigo = JOptionPane.showInputDialog(null,"Digite o codigo do cliente a ser aberto!");
           String codigo = abrearq.getDirectory()+abrearq.getFile(); 
           BufferedReader arq = new BufferedReader(new FileReader(codigo));
           txtcodigo.setText(arq.readLine());
           txtnome.setText(arq.readLine());
           txtemail.setText(arq.readLine());
           arq.close();
            }catch(Exception erro)
            {
             JOptionPane.showMessageDialog(null, "Erro:"+erro.getMessage());
            }
        }
        
     
    }
    public static void main(String[] args) 
    {
       
        JFrame janela = new Exercicio33();
        janela.setUndecorated(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setVisible(true);
    }
        
}
