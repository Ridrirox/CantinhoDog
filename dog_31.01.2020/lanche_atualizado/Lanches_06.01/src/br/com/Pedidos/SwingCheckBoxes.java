package br.com.Pedidos;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingCheckBoxes extends JApplet {
  private JTextArea t = new JTextArea(5, 20);
 
  private JCheckBox cb1 = new JCheckBox("Ovo"), cb2 = new JCheckBox(
      "Batata"), cb3 = new JCheckBox("Milho"), cb4 = new JCheckBox("Ervilha"), cb5 = new JCheckBox("Catupiry")
          , cb6 = new JCheckBox("Saldicha"), cb7 = new JCheckBox("Hamburguer"), cb8 = new JCheckBox("Presunto")
          , cb9 = new JCheckBox("Mussarela"), cb10 = new JCheckBox("Cheddar"), cb11 = new JCheckBox("Calabresa")
          , cb12 = new JCheckBox("Baccon"), cb13 = new JCheckBox("Frango"), cb14 = new JCheckBox("Porcao Maionese");

     
  
  public void init() {
    cb1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Ovo", cb1);
        
      }
    });
    cb2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Batata", cb2);
      }
    });
    cb3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Milho", cb3);
      }
    });
    cb4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Ervilha", cb4);
      }
    });
    cb5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Catupiry", cb5);
      }
    });
    cb6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Salsicha", cb6);
      }
    });
    cb7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Hamburguer", cb7);
      }
    });
    cb8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Presunto", cb8);
      }
    });
    cb9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Mussrela", cb9);
      }
    });
    cb10.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Cheddar", cb10);
      }
    });
    cb11.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Calabresa", cb11);
      }
    });
    cb12.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Baccon", cb12);
      }
    });
    cb13.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Frango", cb13);
      }
    });
    cb14.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        trace("Porcao Maionese", cb14);
      }
    });
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(new JScrollPane(t));
    cp.add(cb1);
    cp.add(cb2);
    cp.add(cb3);
    cp.add(cb4);
    cp.add(cb5);
    cp.add(cb6);
    cp.add(cb7);
    cp.add(cb8);
    cp.add(cb9);
    cp.add(cb10);
    cp.add(cb11);
    cp.add(cb12);
    cp.add(cb13);
    cp.add(cb14);
  }

  private void trace(String b, JCheckBox cb) {
    if (cb.isSelected())
      t.append("Box " + b + " Set\n");
    else
      t.append("Box " + b + " Cleared\n");
  }

  public static void main(String[] args) {
    run(new SwingCheckBoxes(), 550, 280);
    
  }

  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
    applet.init();
    applet.start();
    frame.setVisible(true);
  }
} ///:~

