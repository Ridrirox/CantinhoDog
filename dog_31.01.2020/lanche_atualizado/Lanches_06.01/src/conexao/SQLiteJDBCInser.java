package conexao;

import java.sql.*;

public class SQLiteJDBCInser
{
  public static void main( String args[] )
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:igreja.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      String sql = "INSERT INTO MEMBROS (ID,NOME,MATRICULA,TELEFONE,CEP,ENDERECO,BAIRRO,CIDADE,ESTADO,EMAIL,OBSERVACOES,DESDE,FOTO) " +
                   "VALUES (1, 'Paulo', 32, '2187', 835678,'videira','borda','sao jose','PR','digo','lindo','13/06/1977','32.jpg' );"; 
      stmt.executeUpdate(sql);

      //sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
           // "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );"; 
      //stmt.executeUpdate(sql);

      //sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
           // "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );"; 
      //stmt.executeUpdate(sql);

      //sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
           // "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );"; 
      //stmt.executeUpdate(sql);

      stmt.close();
      c.commit();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Records created successfully");
  }
}