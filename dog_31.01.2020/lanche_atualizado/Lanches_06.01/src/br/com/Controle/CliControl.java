/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.Acessobd.AcessoMySql;
import conexao.AcessoSqlLite;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DIGO
 */
public class CliControl {
    
    PreparedStatement pstm;
    ResultSet rs;
    
    //String foto = ("c:\\fotos\\");//usava no metodo direto
    String conta = "SELECT COUNT(*) FROM FUNCIONARIOS";
    String consultaEstagiarios = "SELECT ID,NOME,MATRICULA,FOTO FROM FUNCIONARIOS WHERE  NOME LIKE ?";
    String consultaFuncionarios = "SELECT * FROM FUNCIONARIOS WHERE ID_FUNCIONARIOS LIKE ?";
    String consultaClientes = "SELECT * FROM CLIENTES WHERE NOME LIKE ? ORDER BY NOME ASC";
    String consultaEntrega = "SELECT * FROM PEDIDOS WHERE CLIENTE LIKE ? ORDER BY CLIENTE ASC";
    String consultaPedidos = "SELECT * FROM CLIENTES WHERE TELEFONE LIKE ?";
    String consultaNome = "SELECT * FROM CLIENTES WHERE NOME LIKE ?";
    String cadastraFuncionarios = "INSERT INTO FUNCIONARIOS (EMPRESAS_NOME_EMPRE, EMPRESAS_ID_EMPRESAS, NOME_FUNCI, RG_FUNCI, TELEFONE_FUNC, EMPRESA_FUNC, "+
            "DATAIN_FUNC, DATAOUT_FUNC, OBS_FUNC, FOTO_FUNC, FOTO, CELULAR) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    String cadastraClientes = "INSERT INTO CLIENTES (NOME, TELEFONE, RUA, NOTAS, COMPLEMENTO, DATA_REGISTRO, ENTREGA) VALUES (?,?,?,?,?,?,?)";
    String alterasClientes = "UPDATE CLIENTES SET NOME =?, TELEFONE=?, RUA=?, NOTAS=?, COMPLEMENTO=?, ENTREGA=? WHERE ID = ?";
    String alteraEntrega = "UPDATE CLIENTES SET ENTREGA =? WHERE ID = ?";
    String excluiCliente = "DELETE FROM CLIENTES WHERE ID = ?";    
     AcessoMySql bd = new AcessoMySql();//importa a classe CONEXAO
     //AcessoSqlLite bd = new AcessoSqlLite(); //importa a classe CONEXAO
    
    //File file = new File(foto);//passa por parametro o que armazenando na variavel foto
    FileInputStream fis = null;
    
    //AcessoFirebird bd = new AcessoFirebird();
    
  
    

    public void alterarClientes(CliBean VIG){
        
       try{
            pstm = bd.conectar().prepareStatement(alterasClientes);
            pstm.setString(1, VIG.getNome_vigi());
            pstm.setString(2, VIG.getTelefone_vigi());
            //pstm.setInt(2, VIGI.getMatricula_vigi());
            pstm.setString(3, VIG.getPosto_vigi());//endereco/EMAIL
            pstm.setString(4, VIG.getAtualiza());//PEDIDO
            pstm.setString(5, VIG.getTurno_vigi());//favorito
            //pstm.setInt(6, VIGI.getEmpresas_id_empresas());
            //pstm.setString(6, VIG.getDatain_vigi()); //clidesde
            pstm.setDouble(6,VIG.getEntrega());
            pstm.setInt(7, VIG.getId_vigilancia());
            pstm.executeUpdate();            
            pstm.close();
           // bd.desconectar();
            JOptionPane.showMessageDialog(null, "CLIENTE ALTERADO COM SUSCESSO!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "NADA FOI ALTERADO!" + e);
        }

    }

    
public void cadastrarCliente(CliBean VIGI){
        try{
            pstm = bd.conectar().prepareStatement(cadastraClientes);
            pstm.setString(1, VIGI.getNome_vigi());
            pstm.setString(2, VIGI.getTelefone_vigi());
            //pstm.setInt(2, VIGI.getMatricula_vigi());
            pstm.setString(3, VIGI.getPosto_vigi());//endereco/EMAIL
            pstm.setString(4, VIGI.getAtualiza());//PEDIDO
            pstm.setString(5, VIGI.getTurno_vigi());//favorito
            //pstm.setInt(6, VIGI.getEmpresas_id_empresas());
            pstm.setString(6, VIGI.getDatain_vigi()); //clidesde
            pstm.setDouble(7,VIGI.getEntrega());
            pstm.execute();            
            pstm.close();
           // bd.desconectar();
            JOptionPane.showMessageDialog(null, "CLIENTE ADICIONADO COM SUSCESSO!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NADA FOI ADICIONADO...RRaquiR..!" + e);
        }
    }
   public void alterarEntrega(CliBean VIGI){
        try{
            pstm = bd.conectar().prepareStatement(alteraEntrega);
            pstm.setDouble(1, VIGI.getEntrega());
            pstm.setInt(2, VIGI.getId_vigilancia());
            pstm.executeUpdate();
            pstm.close();
           // bd.desconectar();
            JOptionPane.showMessageDialog(null, "ATUALIZADO ENTREGA COM SUSCESSO!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "NAO FOI ALTERADO NA ENTREGA.!" + e);
        }
    }
       

    public List<CliBean> listarCliente(String nome) {
        List<CliBean> VGTS = new ArrayList();
        try{
            pstm = bd.conectar().prepareStatement(consultaClientes);
            pstm.setString(1, nome);//SELECT * FROM SETOR WHERE NOME LIKE Rodrigo
            rs = pstm.executeQuery();
            CliBean VGT;
            while (rs.next()){
                VGT = new CliBean();
                VGT.setId_vigilancia(rs.getInt("ID"));
                VGT.setNome_vigi(rs.getString("NOME"));
                VGT.setTelefone_vigi(rs.getString("TELEFONE"));
                VGT.setPosto_vigi(rs.getString("RUA"));//endereco
                VGT.setTurno_vigi(rs.getString("COMPLEMENTO"));//favoritos
                VGT.setAtualiza(rs.getString("NOTAS"));//PEDIDOS
                VGT.setDatain_vigi(rs.getString("DATA_REGISTRO"));
                VGT.setEntrega(rs.getDouble("ENTREGA"));
                //--VGT.setMatricula_vigi(rs.getInt("TELEFONE"));
                // //VGT.setCargo_vigi(rs.getString("CARGO_VIGI"));
                 //VGT.setEmpresas_Nome_empre(rs.getString("EMPRESAS_NOME_EMPRE"));
                //VGT.setEmpresas_id_empresas(rs.getInt("PEDIDOS_ID_PEDIDO"));
                //VGT.setDataout_vigi(rs.getString("DATAOUT_VIGI"));
                //VGT.setObs_vigi(rs.getString("OBSERVACOES"));
                //VGT.setFoto_vigi(rs.getString("FOTO"));  
                //VGT.setCelular_vigi(rs.getString("CELULAR_VIGI"));
                
                //VGT.setPlaca(rs.getString("PLACA"));
                //VGT.setVigilante(rs.getString("VIG_IDENTIFICA"));
                VGTS.add(VGT);
                
                
           }
               // bd.desconectar();
                //pstm.clearParameters();//nao tinha essa funcao da dando erro nesse banco MySql 6.0
                
        } catch(SQLException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Nenhum Cliente encontrado!"+e);
        }
        return VGTS;
    }
    public List<CliBean> listarEntrega(String nome) {
        List<CliBean> VGTS = new ArrayList();
        try{
            pstm = bd.conectar().prepareStatement(consultaEntrega);
            pstm.setString(1, nome);//SELECT * FROM SETOR WHERE NOME LIKE Rodrigo
            rs = pstm.executeQuery();
            CliBean VGT;
            while (rs.next()){
                VGT = new CliBean();
                VGT.setId_vigilancia(rs.getInt("ID"));
                VGT.setNome_vigi(rs.getString("CLIENTE"));
                VGT.setTelefone_vigi(rs.getString("HORA"));
                VGT.setPosto_vigi(rs.getString("QUANTIDADE"));//endereco
                VGT.setTurno_vigi(rs.getString("ENTREGA"));//entrega
                VGT.setAtualiza(rs.getString("DESCONTO"));//PEDIDOS
                VGT.setDatain_vigi(rs.getString("DATA"));
                  // VGT.setCnv_vigi(rs.getInt("CNV_VIGI"));
                //--VGT.setMatricula_vigi(rs.getInt("TELEFONE"));
                // //VGT.setCargo_vigi(rs.getString("CARGO_VIGI"));
                 //VGT.setEmpresas_Nome_empre(rs.getString("EMPRESAS_NOME_EMPRE"));
                //VGT.setEmpresas_id_empresas(rs.getInt("PEDIDOS_ID_PEDIDO"));
                //VGT.setDataout_vigi(rs.getString("DATAOUT_VIGI"));
                //VGT.setObs_vigi(rs.getString("OBSERVACOES"));
                //VGT.setFoto_vigi(rs.getString("FOTO"));  
                //VGT.setCelular_vigi(rs.getString("CELULAR_VIGI"));
                
                //VGT.setPlaca(rs.getString("PLACA"));
                //VGT.setVigilante(rs.getString("VIG_IDENTIFICA"));
                VGTS.add(VGT);
                
                
           }
               // bd.desconectar();
                //pstm.clearParameters();//nao tinha essa funcao da dando erro nesse banco MySql 6.0
                
        } catch(SQLException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Nenhum Cliente encontrado!"+e);
        }
        return VGTS;
    
}
    public List<CliBean> listarPedidos(String telefone) {
        List<CliBean> pedido = new ArrayList();
        try{
            pstm = bd.conectar().prepareStatement(consultaPedidos);//consulta telefone
            pstm.setString(1, telefone);//SELECT * FROM SETOR WHERE telefone LIKE Rodrigo
            rs = pstm.executeQuery();
            CliBean ped;
            while (rs.next()){
                ped = new CliBean();
                ped.setId_vigilancia(rs.getInt("ID"));
                ped.setNome_vigi(rs.getString("NOME"));
                ped.setTelefone_vigi(rs.getString("TELEFONE"));
                ped.setPosto_vigi(rs.getString("RUA"));//endereco
                ped.setTurno_vigi(rs.getString("COMPLEMENTO"));//favoritos
                ped.setAtualiza(rs.getString("NOTAS"));
                ped.setDatain_vigi(rs.getString("DATA_REGISTRO"));
                ped.setEntrega(rs.getDouble("ENTREGA"));
                 //VGT.setEmpresas_Nome_empre(rs.getString("EMPRESAS_NOME_EMPRE"));
                //VGT.setEmpresas_id_empresas(rs.getInt("PEDIDOS_ID_PEDIDO"));
                // //VGT.setCargo_vigi(rs.getString("CARGO_VIGI"));
                // ped.setTelefone_vigi(rs.getInt("TELEFONE"));
               ////// VGT.setCnv_vigi(rs.getInt("CNV_VIGI"));
                //VGT.setDataout_vigi(rs.getString("DATAOUT_VIGI"));
                //VGT.setObs_vigi(rs.getString("OBSERVACOES"));
                //VGT.setFoto_vigi(rs.getString("FOTO"));  
                //VGT.setCelular_vigi(rs.getString("CELULAR_VIGI"));
                
                //VGT.setPlaca(rs.getString("PLACA"));
                //VGT.setVigilante(rs.getString("VIG_IDENTIFICA"));
                pedido.add(ped);
                //bd.desconectar();
            }
               //bd.desconectar();
        } catch(SQLException e){
        }
        return pedido;
    }
    public List<CliBean> listarNomes(String nome) {
        List<CliBean> pedido = new ArrayList();
        try{
            pstm = bd.conectar().prepareStatement(consultaNome);//consulta telefone
            pstm.setString(1, nome);//SELECT * FROM SETOR WHERE telefone LIKE Rodrigo
            rs = pstm.executeQuery();
            CliBean ped;
            while (rs.next()){
                ped = new CliBean();
                ped.setId_vigilancia(rs.getInt("ID"));
                ped.setNome_vigi(rs.getString("NOME"));
                ped.setTelefone_vigi(rs.getString("TELEFONE"));
                ped.setPosto_vigi(rs.getString("RUA"));//endereco
                ped.setTurno_vigi(rs.getString("COMPLEMENTO"));//favoritos
                ped.setAtualiza(rs.getString("NOTAS"));
                ped.setDatain_vigi(rs.getString("DATA_REGISTRO"));
                ped.setEntrega(rs.getDouble("ENTREGA"));
                
                pedido.add(ped);
                //bd.desconectar();
            }
               //bd.desconectar();
        } catch(SQLException e){
        }
        return pedido;
    }
     public void excluirCliente(int codigoCliente){
        try{
            pstm = bd.conectar().prepareStatement(excluiCliente);
            pstm.setInt(1, codigoCliente);
            pstm.executeUpdate();
            bd.desconectar();
        }catch(SQLException e){
       
        }
    }
    
}
