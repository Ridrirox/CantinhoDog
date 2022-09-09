package br.com.dialog;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * 
 */
public class Main extends JFrame
{

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JDesktopPane dskPane = null;

    /**
     * This method initializes dskPane	
     * 	
     * @return javax.swing.JDesktopPane	
     */
    private JDesktopPane getDskPane()
    {
        if (dskPane == null)
        {
            FrmInformacao internalFrame = new FrmInformacao();
            
            dskPane = new JDesktopPane();
            dskPane.add(internalFrame);
            
            internalFrame.setVisible(true);
        }
        return dskPane;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                Main thisClass = new Main();
                thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thisClass.setVisible(true);
            }
        });
    }

    /**
     * This is the default constructor
     */
    public Main()
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
        this.setSize(534, 340);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
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
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getDskPane(), BorderLayout.CENTER);
        }
        return jContentPane;
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
