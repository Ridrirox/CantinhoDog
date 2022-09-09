package br.com.Pedidos;


import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class CheckBoxMnemonic extends JPanel {
  public CheckBoxMnemonic() {
    JCheckBox m_chkBold = new JCheckBox("Bold");
    m_chkBold.setMnemonic('b');
    m_chkBold.setToolTipText("Bold font");
    add(m_chkBold);
    setBorder(new TitledBorder(new EtchedBorder(), "Effects"));
    JCheckBox m_chkItalic = new JCheckBox("Italic");
    m_chkItalic.setMnemonic('i');
    m_chkItalic.setToolTipText("Italic font");
    add(m_chkItalic);
    JCheckBox m_chkUnderline = new JCheckBox("Underline");
    m_chkUnderline.setMnemonic('u');
    m_chkUnderline.setToolTipText("Underline font");
    add(m_chkUnderline);
    JCheckBox m_chkStrikethrough = new JCheckBox("Strikethrough");
    m_chkStrikethrough.setMnemonic('r');
    m_chkStrikethrough.setToolTipText("Strikethrough font");
    add(m_chkStrikethrough);
    JCheckBox m_chkSubscript = new JCheckBox("Subscript");
    m_chkSubscript.setMnemonic('t');
    m_chkSubscript.setToolTipText("Subscript font");
    add(m_chkSubscript);
    JCheckBox m_chkSuperscript = new JCheckBox("Superscript");
    m_chkSuperscript.setMnemonic('p');
    m_chkSuperscript.setToolTipText("Superscript font");
    add(m_chkSuperscript);
    JCheckBox m_chkSuperscriptf = new JCheckBox("Superscripv");
    m_chkSuperscriptf.setMnemonic('p');
    m_chkSuperscript.setToolTipText("Superscript font");
    add(m_chkSuperscript);

  }

  public static void main(String[] a) {
    JFrame f = new JFrame();
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    f.getContentPane().add(new CheckBoxMnemonic());
    f.pack();
    f.setSize(new Dimension(300, 200));
    f.show();

  }
}
