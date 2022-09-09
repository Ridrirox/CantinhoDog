import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JTextField;  
import java.awt.Container;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
public class calculadora extends JFrame {  
    JButton num1, num2, num3;  
    JTextField visor;  
    JLabel exibir;  
    JButton soma, limpar, igual;  
  
    public calculadora() {  
        super("Calculadora");  
        Container tela = getContentPane();  
        setLayout(null);  
  
        num1 = new JButton("1");  
        num2 = new JButton("2");  
        num3 = new JButton("3");  
        exibir = new JLabel("");  
  
        visor = new JTextField(5);  
        soma = new JButton("+");  
        limpar = new JButton("Ce");  
        igual = new JButton("=");  
  
        exibir.setBounds(10, 10, 50, 30);  
        visor.setBounds(10, 5, 218, 30);  
  
        num1.setBounds(10, 40, 50, 30);  
        num2.setBounds(10, 75, 50, 30);  
        num3.setBounds(10, 110, 50, 30);  
  
        limpar.setBounds(70, 40, 50, 30);  
        soma.setBounds(70, 75, 50, 30);  
        igual.setBounds(70, 110, 50, 30);  
  
        num1.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent event) {  
                // TODO Auto-generated method stub  
                visor.setText(visor.getText() + num1.getText());  
  
            }  
        });  
        num2.addActionListener(new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent event) {  
                // TODO Auto-generated method stub  
                visor.setText(visor.getText() + num2.getText());  
            }  
        });  
        num3.addActionListener(new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent event) {  
                // TODO Auto-generated method stub  
                visor.setText(visor.getText() + num3.getText());  
  
            }  
        });  
  
        limpar.addActionListener(new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent event) {  
                visor.setText(null);  
                visor.requestFocus();  
            }  
        });  
  
        soma.addActionListener(new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent event) {  
                // TODO Auto-generated method stub  
                visor.setText(visor.getText() + soma.getText());  
            }  
        });  
  
        igual.addActionListener(new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent event) {  
                visor.setText(visor.getText() + igual.getText());  
                // Realizar a SOMA????  
  
            }  
        });  
  
        tela.add(num1);  
        tela.add(num2);  
        tela.add(num3);  
        tela.add(visor);  
  
        tela.add(soma);  
        tela.add(limpar);  
        tela.add(igual);  
        tela.add(exibir);  
  
        setSize(250, 220);  
        setVisible(true);  
  
    }  
  
    public static void main(String[] args) {  
        calculadora appSoma = new calculadora();  
        appSoma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
    }  
}  