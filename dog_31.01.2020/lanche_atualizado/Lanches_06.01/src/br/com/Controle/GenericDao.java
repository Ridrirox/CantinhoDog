package br.com.Controle;

import br.com.Acessobd.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public abstract class GenericDao {
        //private Connection connection;
        public Statement statement;  
        public ResultSet resultset;  
        public PreparedStatement prep;
        //private Connection conexao;
        private final Connection connection;
        private Connection con;
        

    protected GenericDao() {
        
	this.connection = conexao.abreConexao();
	//this.connection = ConnectionDataBase.getConnection();//usava esse antes
    }

    protected Connection getConnection() {
        return connection;
        
    }
    public Connection conectar() {
      
      try {
    
      Class.forName("org.sqlite.JDBC");
    con =  DriverManager.getConnection("jdbc:sqlite:lanches.db");
    statement = con.createStatement();
   con.setAutoCommit(false);
    con.setAutoCommit(true);
      } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            //System.out.println("Nao encontrou o Driver!");
            JOptionPane.showMessageDialog(null,"Nao encontrou o Driver!"+ex);  
        } catch (SQLException ex) {
            ex.printStackTrace();
             //System.out.println("Nao conectou ao banco!");
             JOptionPane.showMessageDialog(null,"Nao conectou ao banco!!"+ex);  
        }
        return con;
       
  
  }
    public Connection desconectar()  
       {  
            boolean result = true;  
            try  
            {  
                con.close();  
                //JOptionPane.showMessageDialog(null,"banco fechado");  
            }  
            catch(SQLException fecha)  
            {  
                JOptionPane.showMessageDialog(null,"Não foi possivel "+  
                        "fechar o banco de dados: "+fecha);  
                result = false;  
            }  
            return con;
  
       }  

    protected void save(String insertSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++) {
		pstmt.setObject(i+1, parametros[i]);
        }

	pstmt.execute();
	pstmt.close();
    }

    protected void update(String updateSql, Object id, Object... parametros) throws SQLException {
	PreparedStatement pstmt = getConnection().prepareStatement(updateSql);
	for (int i = 0; i < parametros.length; i++) {
                pstmt.setObject(i+1, parametros[i]);
	}
	pstmt.setObject(parametros.length + 1, id);
	pstmt.execute();
	pstmt.close();
    }

    protected void delete(String deleteSql, Object... parametros) throws SQLException {
	PreparedStatement pstmt = getConnection().prepareStatement(deleteSql);
	for (int i = 0; i < parametros.length; i++) {
                pstmt.setObject(i+1, parametros[i]);
	}

	pstmt.execute();
	pstmt.close();
    }
}
