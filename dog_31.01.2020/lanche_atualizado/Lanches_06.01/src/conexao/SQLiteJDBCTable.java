package conexao;

import java.sql.*;

public class SQLiteJDBCTable
{
  public static void main( String args[] )
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      //c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ROX\\Documents\\NetBeansProjects\\Igreja\\dist\\bd\\igreja.db");
      c = DriverManager.getConnection("jdbc:sqlite:igreja.db");
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      String sql = "CREATE TABLE MEMBROS " +
                   "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                   " NOME           TEXT    , " + 
                   " MATRICULA      INT     , " +
                   " TELEFONE       TEXT    , " + 
                   " CEP            INT     , " + 
                   " ENDERECO       TEXT    , " +
                   " BAIRRO         TEXT    , " +
                   " CIDADE         TEXT    , " + 
                   " ESTADO         CHAR(3), " +
                   " EMAIL          TEXT   , " + 
                   " OBSERVACOES    TEXT   , " +
                   " DESDE          TEXT    , " + 
                   " FOTO           TEXT    )"; 
                   
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Table created successfully");
  }
}