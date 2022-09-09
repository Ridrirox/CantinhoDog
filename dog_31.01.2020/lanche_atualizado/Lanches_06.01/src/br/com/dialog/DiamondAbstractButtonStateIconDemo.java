package br.com.dialog;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class DiamondAbstractButtonStateIcon implements Icon {
  public DiamondAbstractButtonStateIcon() {
  }

  public int getIconHeight() {
    return 20;
  }

  public int getIconWidth() {
    return 20;
  }

  public void paintIcon(Component component, Graphics g, int x, int y) {
    if (component instanceof AbstractButton) {
      AbstractButton abstractButton = (AbstractButton) component;
      boolean selected = abstractButton.isSelected();

      if (selected) {
        g.setColor(Color.RED);
      } else {
        g.setColor(Color.BLUE);
      }
      g.drawRect(0, 0, 20, 20);
    
    }
  }
}

public class DiamondAbstractButtonStateIconDemo {

  public static void main(String[] a) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JCheckBox bn = new JCheckBox("Click to change the icon color");
    bn.setIcon(new DiamondAbstractButtonStateIcon());

    frame.add(bn);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }

}