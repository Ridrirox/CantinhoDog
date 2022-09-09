package br.com.Util;

    import java.awt.Dimension;  
    import java.awt.Toolkit;  
    import java.awt.event.ActionEvent;  
    import java.awt.event.ActionListener;  
      
    import javax.swing.JButton;  
    import javax.swing.JFrame;  
    import javax.swing.JLabel;  
    import javax.swing.JTextField;  
      
      
    public class Frame2 extends JFrame{  
         
       public Frame2(final JTextField nome) {  
          setSize(300, 100);  
          getContentPane().setLayout(null);  
          setDefaultCloseOperation(EXIT_ON_CLOSE);  
          centralizar();  
            
          JLabel lnome = new JLabel("Nome");  
          lnome.setSize(80,20);  
          lnome.setLocation(5,20);  
          add(lnome);  
            
          final JTextField campoNome = new JTextField();  
          campoNome.setSize(140,20);  
          campoNome.setLocation(45,20);  
          add(campoNome);  
            
          JButton b = new JButton();  
          b.setSize(60,20);  
          b.setLocation(200, 20);  
          b.setText("OK");  
          b.addActionListener(new ActionListener() {  
               
             @Override  
             public void actionPerformed(ActionEvent arg0) {  
                nome.setText(campoNome.getText());  
                dispose();  
                  
             }  
          });  
          add(b);  
       }  
            
      
       public void centralizar() {  
            Dimension dScreen = Toolkit.getDefaultToolkit().getScreenSize();  
            Dimension dJanela = this.getSize();  
      
            if (dJanela.height > dScreen.height) {  
                setSize(dJanela.width, dScreen.height);  
            }  
            if (dJanela.width > dScreen.width) {  
                setSize(dScreen.width, dJanela.height);  
            }  
            this.setLocation((dScreen.width - dJanela.width) / 2, (dScreen.height - dJanela.height) / 2);  
        }  
      
    }  


