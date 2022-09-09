package br.com.Pedidos;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.print.*;

// instalada, recebe o texto e o imprime.   
public class ImpressaoGeneric {   

  // variavel estatica porque serÃ¡ utilizada por inumeras threads
  private static PrintService impressora;

    @SuppressWarnings("OverridableMethodCallInConstructor") 
    public ImpressaoGeneric() {
    detectaImpressoras();
  }

  // O metodo verifica se existe impressora conectada e a
  // define como padrao.
    @SuppressWarnings("CallToThreadDumpStack")
  public void detectaImpressoras() {

    try {

      DocFlavor df = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
      PrintService[] ps = PrintServiceLookup.lookupPrintServices(df, null);

      for (PrintService p: ps) {

        System.out.println("Impressora encontrada: " + p.getName());

        if (p.getName().contains("Text") || p.getName().contains("Generic")){
            System.out.println("Impressora Selecionada: " + p.getName());
            impressora = p;
            break;}
      }

    }catch (Exception e){
       e.printStackTrace();
    }
  }

    @SuppressWarnings("CallToThreadDumpStack")
  public synchronized boolean imprime(String sTexto) {

    // se nao existir impressora, entao avisa usuario
    // senao imprime o texto
    if (impressora == null) {
        String msg = "Nenhuma impressora foi encontrada. " +
                     "Instale uma impressora padrão \r\n" +
                     "(Generic Text Only) e reinicie o programa.";
        System.out.println(msg);
    }else {

       try {

        DocPrintJob dpj    = impressora.createPrintJob();
        InputStream stream = new ByteArrayInputStream(sTexto.getBytes());

        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc doc          = new SimpleDoc(stream, flavor, null);
        dpj.print(doc, null);
        return true;

       }catch (PrintException e) {
            e.printStackTrace();
       }
    }
    return false;
  }
}