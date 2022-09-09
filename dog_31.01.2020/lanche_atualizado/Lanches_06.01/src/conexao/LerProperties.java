package conexao;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
 
public class LerProperties {
 
    private static Properties properties;
 
    static{
 
        try {
 
            FileInputStream fis = null;
            //File file = new File("C:\\cria\\arquivo.properties");
            File file = new File("arquivo.properties");
 
            if(file.exists()){
                properties = new Properties();
                fis = new FileInputStream(file);
                properties.load(fis);
                fis.close();
            }
 
        }catch(Exception x){
            x.printStackTrace();
        }
    }
 
    public static String lerProperties(String atributo){
 
        String retorno = null;
 
        try {
 
            FileInputStream fis = null;
            //File file = new File("C:\\cria\\arquivo.properties");
            File file = new File("arquivo.properties");
 
            if(properties != null){
                retorno = properties.getProperty(atributo);
            }
 
        }catch(Exception x){
            x.printStackTrace();
        }
 
        return retorno;
    }
}
