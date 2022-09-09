package br.com.Acessobd;

import java.sql.*;
import java.util.Date;  
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;  
  
public class Somavalor {
    Date hoje = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
    
    public Somavalor(){
        //Date data = new Date();  
        //SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
    }
    //FCadFuncao chama = new FCadFuncao();
    
    //public void main(String[] args) {
        public void Soma(){
        
        final String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";  
        //final String URL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:/bancoAccess/meuBanco.mdb"; // caminho onde está o banco  
        final String URL = "jdbc:odbc:dog";
        Connection conn = null; 
        String sql = ("SELECT SUM(valor) as Total FROM vendas WHERE dia = '" + sdf.format(hoje)+ "'");
        //String sql = ("SELECT SUM(valor) as Total FROM vendas WHERE dia = '" + FCadFuncao.tfdata.getText() + "'");
        Double total = null;  //SELECT SUM(estoque) FROM chave where tipo = ('TETRA')"
        try {  
            Class.forName(DRIVER);  
            conn = DriverManager.getConnection(URL);  
            JOptionPane.showMessageDialog(null, "Conexao realizada com sucesso");  
            Statement st = conn.createStatement();  
            ResultSet rs = st.executeQuery(sql);  
            while(rs.next()){ // o resultset é como um cursor que retorna o resultado da sua query e pode retornar de 0 a n linhas   
                
                total = rs.getDouble("Total"); // guarda na variavel o retorno do select  
            
                       
            }  
              JOptionPane.showMessageDialog(null, "Total de Vendas do dia"+"\n"+sdf.format(hoje)+"\n"+total+"\n"); 
              //System.out.println( sdf.format(hoje));
              
              
        } catch (ClassNotFoundException erro) {  
            JOptionPane.showMessageDialog(null, "Driver JDBC-ODBC não encontrado!");  
        } catch (SQLException e) {  
            JOptionPane.showMessageDialog(null, "Problemas na conexao");  
            e.printStackTrace();  
        } finally {  
            try {  
                conn.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
  
    }

    

    
         
}  
