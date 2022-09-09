package conexao;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
 
public class GravarProperties {
 
    public void gravaProperties(){
 
        try{
 
            //File file = new File("C:\\cria\\arquivo.properties");
            File file = new File("arquivo.properties");//grava local do jar
 
            Properties props = new Properties();
            props.setProperty("urlBanco", "localhost");//senha
 
            FileOutputStream fos = new FileOutputStream(file);
 
            props.store(fos, "#Meu arquivo properties");
 
            fos.flush();
            fos.close();
 
        }catch(Exception x){
            x.printStackTrace();
        }
    }
}
