package br.com.dialog;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmInformacao extends JInternalFrame
{
    private JPanel jContentPane = null;
    private JLabel lblNome = null;
    private JLabel lblNomeSelecionado = null;
    private JTextField txtNomeSelecionado = null;
    private JLabel lblIdade = null;
    private JTextField txtIdade = null;
    private JButton btnAbrir = null;
    /**
     * This is the xxx default constructor
     */
    public FrmInformacao()
    {
        super();
        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize()
    {
        this.setSize(364, 146);
        this.setTitle("Exibir informa��es");
        this.setContentPane(getJContentPane());
    }

    /**
     * This method initializes jContentPane
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane()
    {
        if (jContentPane == null)
        {
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.gridx = 1;
            gridBagConstraints4.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints4.anchor = GridBagConstraints.EAST;
            gridBagConstraints4.gridy = 2;
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.fill = GridBagConstraints.BOTH;
            gridBagConstraints3.gridy = 1;
            gridBagConstraints3.weightx = 1.0;
            gridBagConstraints3.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints3.gridx = 1;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 0;
            gridBagConstraints2.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints2.anchor = GridBagConstraints.EAST;
            gridBagConstraints2.gridy = 1;
            lblIdade = new JLabel();
            lblIdade.setText("Idade digitada:");
            GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
            gridBagConstraints11.fill = GridBagConstraints.BOTH;
            gridBagConstraints11.gridy = 0;
            gridBagConstraints11.weightx = 1.0;
            gridBagConstraints11.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints11.gridx = 1;
            GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
            gridBagConstraints1.gridx = 1;
            gridBagConstraints1.gridy = 0;
            lblNomeSelecionado = new JLabel();
            lblNomeSelecionado.setText("JLabel");
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints.anchor = GridBagConstraints.EAST;
            gridBagConstraints.gridy = 0;
            lblNome = new JLabel();
            lblNome.setText("Nome selecionado:");
            jContentPane = new JPanel();
            jContentPane.setLayout(new GridBagLayout());
            jContentPane.add(lblNome, gridBagConstraints);
            jContentPane.add(getTxtNomeSelecionado(), gridBagConstraints11);
            jContentPane.add(lblIdade, gridBagConstraints2);
            jContentPane.add(getTxtIdade(), gridBagConstraints3);
            jContentPane.add(getBtnAbrir(), gridBagConstraints4);
            jContentPane.add(lblNomeSelecionado, gridBagConstraints1);
        }
        return jContentPane;
    }

    /**
     * This method initializes txtNomeSelecionado	
     * 	
     * @return javax.swing.JTextField	
     */
    private JTextField getTxtNomeSelecionado()
    {
        if (txtNomeSelecionado == null)
        {
            txtNomeSelecionado = new JTextField();
            txtNomeSelecionado.setEditable(false);
        }
        return txtNomeSelecionado;
    }

    /**
     * This method initializes txtIdade	
     * 	
     * @return javax.swing.JTextField	
     */
    private JTextField getTxtIdade()
    {
        if (txtIdade == null)
        {
            txtIdade = new JTextField();
            txtIdade.setEditable(false);
        }
        return txtIdade;
    }

    /**
     * This method initializes btnAbrir	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getBtnAbrir()
    {
        if (btnAbrir == null)
        {
            btnAbrir = new JButton();
            btnAbrir.setText("Alterar");
            btnAbrir.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent e)
                {
                    onAlterarDados();
                }
            });
        }
        return btnAbrir;
    }

    protected void onAlterarDados()
    {
        DlgAlterarDados dialog = new DlgAlterarDados(null);
        if (dialog.alterarDados())
        {
            txtNomeSelecionado.setText(dialog.getNome());
            txtIdade.setText(String.valueOf(dialog.getIdade()));
        }
        dialog.dispose();
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
