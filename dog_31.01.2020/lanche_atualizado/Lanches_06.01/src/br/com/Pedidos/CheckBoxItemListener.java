package br.com.Pedidos;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckBoxItemListener {
    public static void main(String[] args) {
        final JCheckBox checkBox = new JCheckBox("Click me");

        JFrame frame = new JFrame("CheckBox Item Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 300);
        frame.add(checkBox);
        frame.setVisible(true);

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                if (evt.getStateChange() == ItemEvent.SELECTED){
                    JOptionPane.showMessageDialog(null,  "Message", "Alert",
                            JOptionPane.INFORMATION_MESSAGE);
                   // Pedidos.Tabela.setValueAt("teste", Pedidos.Tabela.getSelectedRow(), 4); //insere na tabela que pegou do combo
                
                
                
                }
            }
        });
    }
}