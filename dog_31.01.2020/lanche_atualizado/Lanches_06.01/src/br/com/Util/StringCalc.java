package br.com.Util;

import java.text.NumberFormat;  
import java.text.ParseException;  
import java.util.Locale;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  
  
public class StringCalc {  
   public StringCalc() {  
        
      double soma = convertToDouble("R$ 1,25") + convertToDouble("R$ 1,00");  
      double soma2 = convertToDouble("FEIJAO 1,25") + convertToDouble("MERDA 1,20");  
        
      System.out.println(soma);  
      System.out.println(soma2);  
   }  
  
   public static void main(String[] args) throws ParseException {  
      new StringCalc();  
   }  
  
   private double convertToDouble(String value, Locale locale) {  
      double ret = 0;  
  
      try {  
         // Verificação  
         if (value != null) {  
            // Extrair somente os números  
            Pattern pattern = Pattern.compile("[-]?[0-9]+[,]?[0-9]*");  
            Matcher matcher = pattern.matcher(value);  
  
            // Encontrar número  
            if (matcher.find()) {  
               NumberFormat nf_in = NumberFormat.getNumberInstance(locale);  
               ret = nf_in.parse(value.substring(matcher.start(), matcher.end())).doubleValue();  
            }  
         }  
  
      } catch (Exception e) {  
         e.printStackTrace();  
      }  
        
      return ret;  
   }  
  
   private double convertToDouble(String value) {  
      return convertToDouble(value, new Locale("pt", "BR"));  
   }  
  
}  


