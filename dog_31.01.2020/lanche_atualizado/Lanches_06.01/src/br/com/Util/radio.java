package br.com.Util;

import java.awt.event.*;
import javax.swing.*;

public class radio {
public static void main(String[]args) {

JFrame tela = new JFrame("Checks!");
tela.setBounds(10,10,800,600);
tela.setLayout(null);

final JCheckBox pizza = new JCheckBox("Quero uma Pizza.");
final JCheckBox refri = new JCheckBox("Quero um refri.");

pizza.setBounds(100,30,200,35);
refri.setBounds(100,80,200,35);

pizza.setSelected(true);

JButton botao = new JButton("Fazer pedido");
botao.setBounds(100,150,200,35);
botao.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {
if (pizza.isSelected()) {

JOptionPane.showMessageDialog(null, "O sujeito quer uma pizza.", "Pedido",
JOptionPane.INFORMATION_MESSAGE);

}
if (refri.isSelected()) {

JOptionPane.showMessageDialog(null, "O sujeito quer um refrigerante.", "Pedido",
JOptionPane.INFORMATION_MESSAGE);

}
}

});

tela.add(botao);

tela.add(pizza);
tela.add(refri);
tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
tela.setVisible(true);

}
}
