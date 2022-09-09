package br.com.dialog;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 */
public class DlgAlterarDados extends JDialog
{

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JLabel lblNome = null;
    private JComboBox cmbNome = null;
    private JLabel lblIdade = null;
    private JTextField txtIdade = null;
    private JPanel pnlButtons = null;
    private JButton btnOk = null;
    private JButton btnCancelar = null;
    protected boolean okSelecionado;
    /**
     * @param owner
     */
    public DlgAlterarDados(Frame owner)
    {
        super(owner);
        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize()
    {
        this.setSize(411, 151);
        this.setTitle("Alterar dados do usu�rio");
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
            GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
            gridBagConstraints9.gridx = 1;
            gridBagConstraints9.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraints9.gridy = 2;
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.fill = GridBagConstraints.VERTICAL;
            gridBagConstraints7.gridy = 1;
            gridBagConstraints7.weightx = 1.0;
            gridBagConstraints7.anchor = GridBagConstraints.WEST;
            gridBagConstraints7.ipadx = 30;
            gridBagConstraints7.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints7.gridx = 1;
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.gridx = 0;
            gridBagConstraints5.anchor = GridBagConstraints.EAST;
            gridBagConstraints5.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints5.gridy = 1;
            lblIdade = new JLabel();
            lblIdade.setText("Idade:");
            GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
            gridBagConstraints1.fill = GridBagConstraints.BOTH;
            gridBagConstraints1.gridy = 0;
            gridBagConstraints1.weightx = 1.0;
            gridBagConstraints1.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints1.gridx = 1;
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.anchor = GridBagConstraints.EAST;
            gridBagConstraints.insets = new Insets(3, 3, 3, 3);
            gridBagConstraints.gridy = 0;
            lblNome = new JLabel();
            lblNome.setText("Nome do usu�rio:");
            jContentPane = new JPanel();
            jContentPane.setLayout(new GridBagLayout());
            jContentPane.add(lblNome, gridBagConstraints);
            jContentPane.add(getCmbNome(), gridBagConstraints1);
            jContentPane.add(lblIdade, gridBagConstraints5);
            jContentPane.add(getTxtIdade(), gridBagConstraints7);
            jContentPane.add(getPnlButtons(), gridBagConstraints9);
        }
        return jContentPane;
    }

    /**
     * This method initializes cmbNome	
     * 	
     * @return javax.swing.JComboBox	
     */
    private JComboBox getCmbNome()
    {
        if (cmbNome == null)
        {
            cmbNome = new JComboBox(new String[] {"Ana", "Beto", "Lucas", "Tavares", "Vin�cius"});
        }
        return cmbNome;
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
        }
        return txtIdade;
    }

    /**
     * This method initializes pnlButtons	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getPnlButtons()
    {
        if (pnlButtons == null)
        {
            FlowLayout flowLayout = new FlowLayout();
            flowLayout.setAlignment(FlowLayout.RIGHT);
            flowLayout.setVgap(0);
            flowLayout.setHgap(3);
            pnlButtons = new JPanel();
            pnlButtons.setLayout(flowLayout);
            pnlButtons.add(getBtnOk(), null);
            pnlButtons.add(getBtnCancelar(), null);
        }
        return pnlButtons;
    }

    /**
     * This method initializes btnOk	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getBtnOk()
    {
        if (btnOk == null)
        {
            btnOk = new JButton();
            btnOk.setText("Ok");
            btnOk.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent e)
                {
                    //Um pouco de valida��o, para n�o aceitar uma idade textual.
                    try
                    {
                        Integer.parseInt(txtIdade.getText());
                    }
                    catch (NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(DlgAlterarDados.this, "A idade deve ser um n�mero!");
                    }
                    
                    okSelecionado = true; //Dizemos que o ok foi selecionado.
                    setVisible(false);
                }
            });
        }
        return btnOk;
    }

    /**
     * This method initializes btnCancelar	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getBtnCancelar()
    {
        if (btnCancelar == null)
        {
            btnCancelar = new JButton();
            btnCancelar.setText("Cancelar");
            btnCancelar.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent e)
                {
                    //Fechamos a janela diretamente. 
                    //N�o h� necessidade de dizer que o ok n�o foi selecionado.
                    setVisible(false);
                }
            });
        }
        return btnCancelar;
    }
    
    public boolean alterarDados()    
    {        
        okSelecionado = false;  //Marcamos que o ok n�o foi selecionado
        setModal(true);         //A dialog tem que ser modal. S� pode retornar do setVisible ap�s ficar invis�vel.
        setVisible(true);       //Mostramos a dialog e esperamos o usu�rio escolher alguma coisa.
        return okSelecionado;   //Retornamos true, se ele pressionou ok.
    }
    
    public int getIdade()
    {
        return Integer.parseInt(txtIdade.getText());        
    }
    
    public String getNome()
    {
        return cmbNome.getSelectedItem().toString(); 
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
