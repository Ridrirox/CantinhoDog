package br.com.Acessobd;

/*
 * ClassCadFuncao.java
 *
 * Created on 6 de Dezembro de 2005, 13:21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo.tavares
 */
import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.JOptionPane;
public class ClassCadVenda {
    
    /** Creates a new instance of ClassCadFuncao */
    public ClassCadVenda() {    }
    
    private String nome;
    private String data;
    private String qtd;
    private String valor;
    
    public void setNome(String _nome){
        this.nome = _nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    //ClassDatas data = new ClassDatas();
    //ClassConecta conexao = new ClassConecta();
    AcessoAcess conexao = new AcessoAcess();
    //ClassAuditoria audita = new ClassAuditoria();
    Statement stmt = null;
    
    void incluiFuncao(){
        conexao.conectar();
        try{
           stmt = conexao.con.createStatement();
           stmt.executeUpdate("insert into vendas(pedido,quantidade,valor,dia) values ('" + getNome() +"','"+ getQtd() +"','"+ getValor() +"','"+ getData() +"')");           
           JOptionPane.showMessageDialog(null,"VENDA CADASTRADA COM SUCESSO");
           stmt.close();
           conexao.con.close();
           //audita.setTxt("Fun��o "+ getNome() + "Cadastrada");
           //audita.incluiAuditoria();
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n"+ e,"ATEN��O",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }
    //SELECT SUM(campo) AS soma FROM tabela
    void MostraFuncaoSoma(){
        conexao.conectar();
        try{
           stmt = conexao.con.createStatement();
           //stmt.executeUpdate("insert into vendas(pedido,quantidade,valor,dia) values ('" + getNome() +"','"+ getQtd() +"','"+ getValor() +"','"+ getData() +"')");           
           int sum = 0;
        //Class.forName("com.mysql.jdbc.Driver");
        //Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://ROX-PC:3306/seguranca",
        //"root", "0013");
        //Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://fc396979:3306/seguranca",
        //"root", "furiododigo");
        Statement st = (Statement) conexao.conectar();// where tipo = ('TETRA')"));
        ResultSet res = (ResultSet) st.executeQuery(("SELECT SUM(valor) FROM vendas where dia = ('dia')"));   
        while (res.next()) {
        int c = res.getInt(1);
        sum = sum + c;
    }
           //JOptionPane.showMessageDialog(null,"VENDA CADASTRADA COM SUCESSO");
        JOptionPane.showMessageDialog(null,"Quantidade das Vendas de Hoje = " + sum);
           stmt.close();
           conexao.con.close();
           //audita.setTxt("Fun��o "+ getNome() + "Cadastrada");
           //audita.incluiAuditoria();
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n"+ e,"ATEN��O",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the qtd
     */
    public String getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    
    
}
