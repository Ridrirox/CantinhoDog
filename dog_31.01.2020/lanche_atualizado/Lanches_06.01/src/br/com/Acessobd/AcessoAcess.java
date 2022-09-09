package br.com.Acessobd;

import java.sql.*;  
import javax.swing.*;  
  
public class AcessoAcess {
    private Statement statement;
    public ResultSet resultset;
    
     /** Creates a new instance of ClassConecta */
    public AcessoAcess() {    }
   
    //fun��o para conex�o com Banco   
    //CADASTRO_TJPR
    //private String url = "jdbc:odbc:CADASTRO_TJPR";//usado na conexao do acess via fontes de dados odbc
    private String url = "jdbc:odbc:dog";//usado na conexao do acess via fontes de dados odbc
    //private String url = "jdbc:odbc:DBDiaria";
    //private String url = "jdbc:mysql://localhost/DBDiaria";
    private String driver ="sun.jdbc.odbc.JdbcOdbcDriver";//usado no acess
    //private String driver = "org.gjt.mm.mysql.Driver";
    private String user ="ok"; //usado esse com acess
    //private String user ="root";
    private String pwd = "";//Senha do Banco de dados
    //private String pwd = "123";
    Connection con = null;    
     
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
    public Connection conectar(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user,pwd);
            //JOptionPane.showMessageDialog(null,"Conectou" );
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n Driver n�o encontrado!\n"+ e,"ATEN��O",JOptionPane.WARNING_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n Erro na Conex�o com Banco\n"+ e,"ATEN��O",JOptionPane.WARNING_MESSAGE);            
}
        //System.out.println("Conectado");
        return con;  
    }
    //fim da conexao
    //========================================================
}

 