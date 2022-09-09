package br.com.Util;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Relogio extends JLabel implements ActionListener {  
  
    private SimpleDateFormat df = new SimpleDateFormat("HH:mm");  
    private Date tempDate = new Date();  
    private Timer timer = new Timer(60 * 1000, this);  
      
    public Relogio() {  
        //super("off");  
        timer.setRepeats(true);  
        //setFont("Monospaced", Font.BOLD, 32);  
       // timer.setCoalesce(true);  
        timer.setRepeats(true);  
        start();
    }  
      
    public void start() {  
        setTime();  
        timer.start();  
    }  
  
    public void stop() {  
        timer.stop();  
        this.setText("off");  
    }  
      
    private void setTime() {  
        tempDate.setTime(System.currentTimeMillis());  
        super.setText(df.format(tempDate));  
    }  
  
    /* implements ActionListener */  
    public void actionPerformed(ActionEvent e) {  
        setTime();  
    }  
}  


//Read more: http://javafree.uol.com.br/topic-9982-Sisteminha-de-Ponto-como-inserir-relogio-digital-em-java.html#ixzz2CXM39QII