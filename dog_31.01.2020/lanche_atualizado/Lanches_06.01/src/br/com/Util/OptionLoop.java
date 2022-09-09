package br.com.Util;

import javax.swing.JOptionPane;

public class OptionLoop {
    public static void main(String[] args) {
        System.out.printf("JOptionPane.YES_OPTION    = %d%n" +
                          "JOptionPane.NO_OPTION     = %d%n" +
                          "JOptionPane.CLOSED_OPTION = %d%n",
                           JOptionPane.YES_OPTION,
                           JOptionPane.NO_OPTION,
                           JOptionPane.CLOSED_OPTION);
        int more = JOptionPane.YES_OPTION;
        do {
            more = JOptionPane.showConfirmDialog(null, "Want more?", "Input",
                                      JOptionPane.YES_NO_OPTION);
            System.out.println("more = " + more);
        } while(more == JOptionPane.YES_OPTION);
    }
}