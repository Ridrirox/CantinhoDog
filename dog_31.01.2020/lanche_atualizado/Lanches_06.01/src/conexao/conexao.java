/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexao;
//import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao {
  public Connection con = null;
  public Statement statement;
        public ResultSet resultset;
        private Connection conexao;
    public static Connection abreConexao() {
       Connection con = null;
        if (con == null) {
            try {

            //Class.forName("com.mysql.jdbc.Driver");
                Class.forName("org.sqlite.JDBC");
           con = DriverManager.getConnection("jdbc:sqlite:igreja.db");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tijucas?user=root&password=furiododigo");
          //con = DriverManager.getConnection("jdbc:mysql://fc396979:3306/SEGURANCA?user=root&password=furiododigo");
                //con = DriverManager.getConnection("jdbc:mysql://ROX-PC:3306/mydb?user=root&password=");  
            } catch (SQLException s) {
                System.out.println("SQL Error: " + s.toString() + " " + s.getErrorCode() + " " + s.getSQLState());

            } catch (Exception e) {
                System.out.println("Error: " + e.toString() + e.getMessage());
            }
        }
        return con;
    }
    public Connection conectar(){
        try {
            //Class.forName("com.mysql.jdbc.Driver");//banco sisvenda //127.0.0.1
            Class.forName("org.sqlite.JDBC");
           con = DriverManager.getConnection("jdbc:sqlite:igreja.db");
           //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tijucas?user=root&password=furiododigo");
            
        } catch (ClassNotFoundException ex) {
            //ex.printStackTrace();
            System.out.println("Nao foi possivel encontrar o Driver!");
        } catch (SQLException ex) {
            //ex.printStackTrace();
            System.out.println("Nao foi possivel conectar ao banco!");
        }
        return con;
    }
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
           // ex.printStackTrace();
        }
    }

    public void executeSQL(String sql)  {
            try 
            {
                statement = (Statement) conexao.createStatement(
                        ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                resultset = statement.executeQuery(sql);
            }
            catch(SQLException sqlex) 
            {
               JOptionPane.showMessageDialog(null,"Não foi possível "+
                "executar o comando sql,"+sqlex+", o sql passado foi "+sql);
            }

       }
       
}