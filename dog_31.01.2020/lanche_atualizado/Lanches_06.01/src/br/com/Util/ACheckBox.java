package br.com.Util;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ACheckBox {
  public static void main(String args[]) {
    String title = (args.length == 0 ? "Acrecimos" : args[0]);
    JFrame frame = new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(380,100,400,300);
    JPanel panel = new JPanel(new GridLayout(0, 1));
    Border border = BorderFactory.createTitledBorder("Escolha o acrescimo no Pedido");
    panel.setBorder(border);
    JCheckBox check = new JCheckBox("Ovo");
    panel.add(check);
    check = new JCheckBox("Batata");
    panel.add(check);
    check = new JCheckBox("Ervilha");
    panel.add(check);
    check = new JCheckBox("Milho");
    panel.add(check);
    check = new JCheckBox("Spinach");
    panel.add(check);
    JButton button = new JButton("Confirmar");
    Container contentPane = frame.getContentPane();
    contentPane.add(panel, BorderLayout.CENTER);
    contentPane.add(button, BorderLayout.SOUTH);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}