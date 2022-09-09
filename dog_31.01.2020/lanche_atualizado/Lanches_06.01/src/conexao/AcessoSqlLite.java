package conexao;

import java.sql.*;  
import javax.swing.JOptionPane;
  
public class AcessoSqlLite {  
        public Connection conexao;  
        public Statement statement;  
        public ResultSet resultset;  
        public PreparedStatement prep;  
        //Connection con;
  public Connection conectar() {
      
      try {
    
      Class.forName("org.sqlite.JDBC");  
      conexao = DriverManager.getConnection("jdbc:sqlite:lanches.db"); 
      //conexao = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ROX\\Documents\\NetBeansProjects\\Igreja\\dist\\bd\\igreja.db");
      statement = conexao.createStatement();  
      //conexao.setAutoCommit(false);  
      //conexao.setAutoCommit(true);  
      } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            //System.out.println("Nao encontrou o Driver!");
            JOptionPane.showMessageDialog(null,"Nao encontrou o Driver!"+ex);  
        } catch (SQLException ex) {
            ex.printStackTrace();
             //System.out.println("Nao conectou ao banco!");
             JOptionPane.showMessageDialog(null,"Nao conectou ao banco!!"+ex);  
        }
        return conexao;
       
  
  }  
  public void exec(String sql) {  
        try {
            resultset = statement.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
  }  
public void desconectar()  
       {  
            boolean result = true;  
            try  
            {  
                conexao.close();  
                //JOptionPane.showMessageDialog(null,"banco fechado");  
            }  
            catch(SQLException fecha)  
            {  
                JOptionPane.showMessageDialog(null,"Não foi possivel "+  
                        "fechar o banco de dados: "+fecha);  
                result = false;  
            }  
  
       }  
}  