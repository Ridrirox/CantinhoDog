/*
 * AcessoMySql.java
 *
 * Created on 3 de Fevereiro de 2008, 16:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.com.Acessobd;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cl�udio
 */
public class AcessoMySql {
    
    Connection con;
    private Statement statement;
    public ResultSet resultset;
    
    /** Creates a new instance of AcessoMySql */
    public AcessoMySql() {
    }
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/burger?user=root&password=");
            //con = DriverManager.getConnection("jdbc:mysql://ROX-PC:3306/mydb?user=root&password=furiododigo");
            //con = DriverManager.getConnection("jdbc:mysql://localhost/burger?user=root&password=furiododigo");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Nao foi poss�vel encontrar o Driver!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Nao foi poss�velvv conectar ao banco!");
        }
        return con;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void executeSQL(String sql) {
        try
            {
                statement = (Statement) con.createStatement(
                        ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                resultset = (ResultSet) statement.executeQuery(sql);
            }
            catch(SQLException sqlex)
            {
               JOptionPane.showMessageDialog(null,"Nao foi possivel "+
                "executar o comando sql,"+sqlex+", o sql passado foi "+sql);
            }


    }
}
