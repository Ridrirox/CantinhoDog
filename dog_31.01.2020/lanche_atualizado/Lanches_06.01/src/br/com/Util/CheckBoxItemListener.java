package br.com.Util;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckBoxItemListener {
    public static void main(String[] args) {
        final JCheckBox checkBox = new JCheckBox("Click me");
        final JCheckBox checkBoxx = new JCheckBox("Click me cc");

        JFrame frame = new JFrame("CheckBox Item Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 300);
        frame.add(checkBox);
        frame.add(checkBoxx);
        frame.setVisible(true);

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                if (evt.getStateChange() == ItemEvent.SELECTED){
                    JOptionPane.showMessageDialog(null,  "Message", "Alert",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}