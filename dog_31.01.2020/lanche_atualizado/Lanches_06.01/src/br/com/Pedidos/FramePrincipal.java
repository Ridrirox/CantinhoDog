package br.com.Pedidos;

import br.com.Util.FrameCadastro;
    import java.awt.BorderLayout;  
    import java.awt.EventQueue;  
    import java.awt.event.ActionEvent;  
    import java.awt.event.ActionListener;  
    import java.awt.event.WindowAdapter;  
    import java.awt.event.WindowEvent;  
    import javax.swing.JFrame;  
    import javax.swing.JMenu;  
    import javax.swing.JMenuBar;  
    import javax.swing.JMenuItem;  
    import javax.swing.JOptionPane;  
      
    public class FramePrincipal extends JFrame {  
        private FrameCadastro frmCadastro;  
      
        public FramePrincipal()  
        {  
            setSize(640,480);  
            setLocationRelativeTo(null);  
            setLayout(new BorderLayout());  
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
            addWindowListener(new WindowAdapter()  
            {  
                @Override  
                public void windowClosing(WindowEvent e) {  
                    fechar();  
                }  
      
            });  
              
            JMenu mnuArquivo = new JMenu("Arquivo");  
            JMenuItem mniFechar = new JMenuItem("Fechar");  
      
            mniFechar.addActionListener(new ActionListener() {  
                @Override  
                public void actionPerformed(ActionEvent evt)  
                {  
                    fechar();  
                }  
            });  
            mnuArquivo.add(mniFechar);  
      
            JMenu mnuCadastro = new JMenu("Cadastro");  
            JMenuItem mniAbrir = new JMenuItem("Abrir");  
            mniAbrir.addActionListener(new ActionListener() {  
                @Override  
                public void actionPerformed(ActionEvent evt)  
                {  
                    abrirCadastro();  
                }  
            });  
            mnuCadastro.add(mniAbrir);  
      
            JMenuItem mniFecharCadastro = new JMenuItem("Fechar");  
            mniFecharCadastro.addActionListener(new ActionListener() {  
                @Override  
                public void actionPerformed(ActionEvent evt)  
                {  
                    fecharCadastro();  
                }  
            });  
            mnuCadastro.add(mniFecharCadastro);  
      
            JMenuBar mb = new JMenuBar();  
            mb.add(mnuArquivo);  
            mb.add(mnuCadastro);  
            add(mb, BorderLayout.NORTH);  
              
            frmCadastro = new FrameCadastro(this);  
        }  
      
        private void abrirCadastro()  
        {  
            frmCadastro.setVisible(true);  
        }  
      
        private void fecharCadastro()  
        {  
            frmCadastro.dispose();  
        }  
      
        private void fechar()  
        {  
            if (JOptionPane.showConfirmDialog(this, "Vai fechar tudo. Continua?",   
                    "Confirme o fechamento",  
                    JOptionPane.YES_NO_OPTION) != JOptionPane.OK_OPTION)  
            {  
                return;  
            }  
      
            //Fecha o sistema inteiro  
            System.exit(0);  
      
            /*Se você quisesse fechar só o painel de cadastro, você faria: 
            fc.dispose();            
            */  
        }  
        public static void main(String[] args)  
        {  
            EventQueue.invokeLater(new Runnable()  
            {  
                public void run() {  
                    new FramePrincipal().setVisible(true);  
                }  
            });  
        }  
    }  