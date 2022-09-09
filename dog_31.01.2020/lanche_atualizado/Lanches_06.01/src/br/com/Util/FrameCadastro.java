package br.com.Util;

import br.com.Pedidos.FramePrincipal;
    import java.awt.BorderLayout;  
    import java.awt.event.ActionEvent;  
    import java.awt.event.ActionListener;  
    import java.awt.event.WindowAdapter;  
    import java.awt.event.WindowEvent;  
    import javax.swing.JFrame;  
    import javax.swing.JMenu;  
    import javax.swing.JMenuBar;  
    import javax.swing.JMenuItem;  
      
    public class FrameCadastro extends JFrame {  
      
        private FramePrincipal frmPrincipal;  
      
        public FrameCadastro(FramePrincipal frmPrincipal) {  
            setSize(320, 200);  
            setLocationRelativeTo(frmPrincipal);  
            setLayout(new BorderLayout());  
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
            addWindowListener(new WindowAdapter()  
            {  
                @Override  
                public void windowClosing(WindowEvent e) {  
                    fechar();  
                }  
            });  
      
            this.frmPrincipal = frmPrincipal;  
            JMenu mnuArquivo = new JMenu("Arquivo");  
            JMenuItem mniFechar = new JMenuItem("Fechar");  
            mniFechar.addActionListener(new ActionListener() {  
      
                @Override  
                public void actionPerformed(ActionEvent evt) {  
                    fechar();  
                }  
            });  
      
            mnuArquivo.add(mniFechar);  
      
            JMenu mnuPrincipal = new JMenu("Principal");  
      
            JMenuItem mniAbrirPrincipal = new JMenuItem("Abrir");  
            mniAbrirPrincipal.addActionListener(new ActionListener() {  
      
                @Override  
                public void actionPerformed(ActionEvent evt) {  
                    abrirPrincipal();  
                }  
            });  
            mnuPrincipal.add(mniAbrirPrincipal);  
      
            JMenuItem mniFecharPrincipal = new JMenuItem("Fechar");  
            mniFecharPrincipal.addActionListener(new ActionListener() {  
      
                @Override  
                public void actionPerformed(ActionEvent evt) {  
                    fecharPrincipal();  
                }  
            });  
            mnuPrincipal.add(mniFecharPrincipal);  
      
            JMenuBar mb = new JMenuBar();  
            mb.add(mnuArquivo);  
            mb.add(mnuPrincipal);  
            add(mb, BorderLayout.NORTH);  
        }  
      
        private void fechar() {  
            dispose();  
        }  
      
        private void abrirPrincipal() {  
            frmPrincipal.setVisible(true);  
        }  
      
        private void fecharPrincipal() {  
            frmPrincipal.dispose();  
        }  
    }  