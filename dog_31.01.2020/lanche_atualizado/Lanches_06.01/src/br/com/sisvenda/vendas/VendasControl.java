/*
 * VendasControl.java
 *
 * Created on 23 de Fevereiro de 2008, 02:20
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.com.sisvenda.vendas;

//import br.com.sisvenda.acessobd.AcessoFirebird;
//import br.com.Acessobd.AcessoMySql;
import br.com.Acessobd.AcessoMySql;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import conexao.AcessoSqlLite;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Cl�udio
 */
public class VendasControl {
    
    PreparedStatement pstm;
    ResultSet rs; //SELECT SUM(total) AS soma FROM lanches //somar valor da coluna total
    String cadastraVenda = "INSERT INTO LANCHES (ITENS, DATAVENDA, PEDIDO, RECEBIDO, TROCO, TOTAL)" +
            " VALUES(?,?,?,?,?,?)";
    String cadastraPedido = "INSERT INTO LANCHES (ITENS, DATAVENDA, PEDIDO, RECEBIDO, TROCO, TOTAL)" +
            " VALUES(?,?,?,?,?,?)";
    //atualizei para cadastrar pedidos, quantidade em 13/08/2022
    String cadastraPedidoMysql = "INSERT INTO PEDIDOS (DATA, HORA, ID_CLIENTE, CLIENTE, QUANTIDADE,  ENTREGA, OBS, TOTAL)" +
            " VALUES(?,?,?,?,?,?,?,?)";
    String buscaUltimoCodigo = "SELECT MAX(CODIGO) AS CODIGO FROM VENDAS";
    String consultaVendasDia = "SELECT * FROM LANCHES WHERE DATA BETWEEN ? AND ?";
     String consultaVendas = "SELECT * FROM LANCHES WHERE DATAVENDA LIKE ?";
     String calculaVendas = "SUM(total) AS soma FROM LANCHES"; //somar valor da coluna total
    String vendaDia = "SELECT SUM(total) AS soma FROM lanches WHERE DATAVENDA BETWEEN ?";
    String excluiVenda = "DELETE FROM LANCHES WHERE ID LIKE ?";
    
    AcessoMySql bd = new AcessoMySql();
    //--AcessoSqlLite bd = new AcessoSqlLite();
    //AcessoFirebird bd = new AcessoFirebird();
    
    /** Creates a new instance of VendasControl */
    public VendasControl() {
    }
    
    public List<VendasBean> listarVendas(String dataInicial){
        try {
            pstm = bd.conectar().prepareStatement(consultaVendas);
            pstm.setString(1, dataInicial);
            //pstm.setDate(2, dataFinal);
            rs = pstm.executeQuery();
            List<VendasBean> venda = new ArrayList<>();
            //List<VendasBean> venda = new ArrayList<VendasBean>();
            while (rs.next()){
                VendasBean vb = new VendasBean();
                vb.setCodigo(rs.getInt("id"));
                vb.setItens(rs.getString("itens"));
                vb.setDatVenda(rs.getString("datavenda"));
                vb.setPedido(rs.getString("pedido"));
                vb.setRecebido(rs.getString("recebido"));
                vb.setTroco(rs.getString("troco"));
                vb.setValor(rs.getDouble("total"));
                venda.add(vb);
            }
            //bd.desconectar();
            return venda;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Nenhum registro encontrado!"+ex);
        }
        return null;
    }
     public List<VendasBean> listarVendasDia(String dataInicial, String dataFinal){
        try {
            pstm = bd.conectar().prepareStatement(consultaVendasDia);
            pstm.setString(1, dataInicial);
            pstm.setString(2, dataFinal);
            rs = pstm.executeQuery();
            List<VendasBean> venda = new ArrayList<>();
            //List<VendasBean> venda = new ArrayList<VendasBean>();
            while (rs.next()){
                VendasBean vb = new VendasBean();
                vb.setCodigo(rs.getInt("id"));
                vb.setItens(rs.getString("itens"));
                vb.setDatVenda(rs.getString("datavenda"));
                vb.setPedido(rs.getString("pedido"));
                vb.setRecebido(rs.getString("recebido"));
                vb.setTroco(rs.getString("troco"));
                vb.setValor(rs.getDouble("total"));
                venda.add(vb);
            }
            //bd.desconectar();
            return venda;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Nenhum registro encontrado dia a dia!"+ex);
        }
        return null;
    }
    public List<VendasBean> listarVendasDiadia(String dataInicial, String dataFinal){
        try {
            pstm = bd.conectar().prepareStatement(consultaVendasDia);
            pstm.setString(1, dataInicial);
            pstm.setString(2, dataFinal);
            rs = pstm.executeQuery();
            List<VendasBean> venda = new ArrayList<VendasBean>();
            while (rs.next()){
                VendasBean vb = new VendasBean();
                  vb.setCodigo(rs.getInt("id"));
                vb.setItens(rs.getString("itens"));
                vb.setDatVenda(rs.getString("datavenda"));
                vb.setPedido(rs.getString("pedido"));
                vb.setRecebido(rs.getString("recebido"));
                vb.setTroco(rs.getString("troco"));
                vb.setValor(rs.getDouble("total"));
                venda.add(vb);
               
            }
            bd.desconectar();
            return venda;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     public List<VendasBean> listarVendasDiaOld(Date dataInicial, Date dataFinal){
        try {
            pstm = bd.conectar().prepareStatement(consultaVendas);
            pstm.setDate(1, dataInicial);
            pstm.setDate(2, dataFinal);
            rs = pstm.executeQuery();
            List<VendasBean> venda = new ArrayList<VendasBean>();
            while (rs.next()){
                VendasBean vb = new VendasBean();
                 vb.setCodigo(rs.getInt("id"));
                 vb.setCodigoCliente(rs.getInt("itens"));
                 vb.setItens(rs.getString("itens"));
                 vb.setDataVenda(rs.getDate("datavenda"));
                 vb.setPedido(rs.getString("pedido"));
                 vb.setRecebido(rs.getString("recebido"));
                 vb.setTroco(rs.getString("troco"));
                 vb.setValor(rs.getDouble("total"));
                venda.add(vb);
            }
            bd.desconectar();
            return venda;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public int buscarCodigoUltimaVenda(){
        try {
            pstm = bd.conectar().prepareStatement(buscaUltimoCodigo);
            rs = pstm.executeQuery();
            if (rs.last()){
                return rs.getInt("codigo");
            }
            bd.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public void  buscarCalculoVenda(){
        try {
            pstm = bd.conectar().prepareStatement(calculaVendas);
            rs = pstm.executeQuery();
            if (rs.last()){
               // return rs.getInt("total");
            }
            bd.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //return 0;
    }
     
    public void cadastrarVenda(VendasBean venda){
        try {
            
            pstm = bd.conectar().prepareStatement(cadastraVenda);
            //pstm.setString(1, venda.getPedido());
            pstm.setString(1, venda.getItens());
            pstm.setString(2, venda.getDatVenda());
            pstm.setString(3, venda.getPedido());
            pstm.setString(4, venda.getRecebido());
            pstm.setString(5, venda.getTroco());
            pstm.setDouble(6, venda.getValor());//TOTAL
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "VENDA ADICIONADA COM SUCESSO!");
            pstm.close();
            bd.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nada foi adicionaduuuuo!" + ex);
        }
    }

    public void cadastrarPedido(VendasBean pedido) {
        try {
            
            pstm = bd.conectar().prepareStatement(cadastraPedido);
            pstm.setString(1, pedido.getItens());
            pstm.setString(2, pedido.getDatVenda());
            pstm.setString(3, pedido.getPedido());
            pstm.setString(4, pedido.getRecebido());
            pstm.setString(5, pedido.getTroco());
            pstm.setDouble(6, pedido.getValor());//TOTAL
            pstm.executeUpdate();
            //JOptionPane.showMessageDialog(null, "PEDIDO ADICIONADO COM SUCESSO!");
            pstm.close();
            bd.desconectar();
        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null, "Nada foi adicionado!" + ex);
            //pstm.close();
            bd.desconectar();
        }
    }
    public void cadastrarPedidoMysql(VendasBean pedido) {
        try {
            
            pstm = bd.conectar().prepareStatement(cadastraPedidoMysql);
            pstm.setString(1, pedido.getDatVenda()); //data
            pstm.setTime  (2, pedido.getHora()); //hora
            pstm.setInt   (3, pedido.getCodigoCliente());//;id_cliente
            pstm.setString(4, pedido.getPedido()); //cliente
            pstm.setInt   (5, pedido.getQuantidade()); //qtd itens
            pstm.setDouble(6, pedido.getEntrega());//entrega
            pstm.setDouble(7, pedido.getPediro());//pedido total / NA COLUNA DESCONTO
            pstm.setDouble(8, pedido.getValor());//TOTAL
            //pstm.executeUpdate();
            pstm.execute();
            pstm.close();
             //--JOptionPane.showMessageDialog(null, "PEDIDO ADICIONADO COM SUCESSO!");
           //--nao usa no mysql// bd.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nada foi adicionado burger!" + ex);
            //pstm.close();
            //bd.desconectar();
        }
    }
    public void excluirVendas(int codigoMembro){
        try{
            pstm = bd.conectar().prepareStatement(excluiVenda);
            pstm.setInt(1, codigoMembro);
            pstm.executeUpdate();
            //bd.desconectar();
            JOptionPane.showMessageDialog(null, "VENDA EXCLUIDA COM SUCESSO!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     public void excluirVenda(VendasBean codigoVenda){
        try{
            pstm = bd.conectar().prepareStatement(excluiVenda);
            pstm.setInt(1, codigoVenda.getCodigo());
            pstm.executeUpdate();
            bd.desconectar();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
