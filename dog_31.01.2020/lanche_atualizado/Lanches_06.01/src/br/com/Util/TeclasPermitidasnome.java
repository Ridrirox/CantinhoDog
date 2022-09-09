package br.com.Util;

import javax.swing.text.AttributeSet;    
 import javax.swing.text.BadLocationException;    
 import javax.swing.text.DocumentFilter;    
import javax.swing.text.PlainDocument;
     
 public class TeclasPermitidasnome extends PlainDocument {    
     
   
     public void insertString(int offset,String str, javax.swing.text.AttributeSet attr)    
         throws BadLocationException {    
         super.insertString(offset, str.replaceAll("[^a-z | ^A-Z | ^]", ""), attr);     
        
               
     }    
         
     public void replace(int offset,String str, javax.swing.text.AttributeSet attr)    
         throws BadLocationException {    
          
             super.insertString (offset, str.replaceAll("[^a-z | ^A-Z | ^]", ""), attr);
         }    
     }    


//Read more: http://javafree.uol.com.br/topic-869436-resolvido-JFormattedTextField.html#ixzz2D9wbCl9j