package br.com.Controle;

//import br.mb.tutorialJdbcSwingMysql.model.Contato;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao extends GenericDao {
    
    

    public void salvar(Contato contato) throws SQLException {
        String insert = "INSERT INTO CLIENTES (NOME, TELEFONES, ENDERECO, OBSERVACOES, FAVORITOS, PEDIDOS_ID_PEDIDO, CLIDESDE (?,?,?,?,?,?,?)";
        save(insert, contato.getNome(), contato.getTelefone(), contato.getDtNascimento());
    }

    public void alterar(Contato contato) throws SQLException {
        String update = "UPDATE CADASTRO " +
                "SET nome = ?, telefone = ?, documento = ?, obs = ? " +
                "WHERE codcad = ?";
        update(update, contato.getIdindex(), contato.getNome(), contato.getTelefone(), contato.getDtNascimento(), contato.getObservacoes());
    }
    public void salvarUser(Contato contato) throws SQLException {
        String insert = "INSERT INTO USUARIO(FUNCIONARIO, LOGIN, SENHA, DOCUMENTO, TELEFONE, OBSERVACOES) VALUES(?,?,?,?,?,?)";
        save(insert, contato.getFunc(), contato.getLogin(),contato.getSenha(), contato.getDoc(), contato.getTelefone(), contato.getObservacoes());
    }
    public void alterarUser(Contato contato) throws SQLException {
        String update = "UPDATE USUARIO " +
                "SET FUNCIONARIO = ?, LOGIN = ?, SENHA = ?, DOCUMENTO = ?, TELEFONE = ? , OBSERVACOES = ?" +
                "WHERE CODUSER = ?";
        update(update, contato.getIdindex(), contato.getFunc(), contato.getLogin(), contato.getSenha(), contato.getDoc(), contato.getTelefone(), contato.getObservacoes());
    }
    public void alterarSaida(Contato contato) throws SQLException {
        String update = "UPDATE ACESSOS " +
                "SET saida = ?, condicao = ? WHERE codacess = ?";
        update(update, contato.getIdindex(), contato.getSaida_acess(), contato.getCondicao());
    }

    public void excluir(long id) throws SQLException {
        String delete = "DELETE FROM Cadastro WHERE codcad = ?";
        delete(delete, id);
    }
    public List<Contato> findUsers() throws SQLException {
        List<Contato> usa = new ArrayList<Contato>();
        
        String select = "SELECT * FROM CLIENTES";

        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Contato contato = new Contato();
            //contato.setIdindex(rs.getInt("CODUSER"));//usava esse antes
            //contato.setIdcad(rs.getInt("CODCAD"));
            contato.setIdindex(String.valueOf(rs.getLong("id")));
            contato.setFunc(rs.getString("Nome"));
            //contato.setLogin(rs.getString("LOGIN"));
            //contato.setSenha(rs.getString("SENHA"));
            //contato.setDoc(Integer.valueOf(rs.getString("DOCUMENTO")));
             contato.setTelefone(rs.getString("TELEFONE"));
            //contato.setObservacoes(rs.getString("OBSERVACOES"));
           // contato.setPortaria(rs.getString("PORTARIA"));
            usa.add(contato);
        }

        rs.close();
        stmt.close();

        return usa;
    }
    

    public List<Contato> findContatos() throws SQLException {
        List<Contato> contatos = new ArrayList<Contato>();
        
        String select = "SELECT * FROM CLIENTES";

        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Contato contato = new Contato();
            contato.setIdindex(String.valueOf(rs.getLong("id")));
            //contato.setId(rs.getLong("CODCAD"));
            contato.setNome(rs.getString("Nome"));
            contato.setTelefone(rs.getString("Telefone"));
            
            //contato.setCartao_acess(rs.getString("Vig_Identifica"));//quem fez
            
            //contato.setFoto(rs.getString("Foto"));
            //contato.setDtNascimento(rs.getDate("DOCUMENTO"));
            //contato.setDocumento(rs.getString("Matricula_vigi"));
            //contato.setObservacoes(rs.getString("Obs_vigi"));
            //contato.setDtNascimento(rs.getString("DOCUMENTO"));
        }

        rs.close();
        stmt.close();

        return contatos;
    }
    public List<Contato> findAcess() throws SQLException {
        List<Contato> acess = new ArrayList<Contato>();
        
        String select = "SELECT * FROM CLIENTES";

        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Contato acessar = new Contato();
            acessar.setIdindex(String.valueOf(rs.getLong("id")));
            acessar.setTelefone(rs.getString("Telefone"));
            acessar.setNome_acess(rs.getString("NOME"));
            ///acessar.setCartao_acess(rs.getString("CARTAO"));
            //acessar.setEntrada(rs.getString("ENTRADA"));
            //acessar.setSaida_acess(rs.getString("SAIDA"));
            //acessar.setCondicao(rs.getString("CONDICAO"));
            //contato.setDtNascimento(rs.getDate("DOCUMENTO"));
            //contato.setDtNascimento(rs.getString("DOCUMENTO"));
            acess.add(acessar);
        }

        rs.close();
        stmt.close();

        return acess;
    }


    public Contato findByName(String nome) throws SQLException {//like '%pedro%'
        String select = "SELECT ID, NOME, TELEFONE, RUA, NOTAS, COMPLEMENTO, DATA_REGISTRO, ENTREGA FROM CLIENTES WHERE Nome LIKE ?"; //pega dados cbPedidos
        //String select = "SELECT * FROM VIGILANCIA WHERE Nome_vigi = ?";
        Contato contato = null;
        try (PreparedStatement stmt = getConnection().prepareStatement(select)) {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                contato = new Contato();
                contato.setIdindex(String.valueOf(rs.getInt("ID")));
                //contato.setId(rs.getLong("CODCAD"));
                contato.setNome(rs.getString("NOME"));
                contato.setTelefone(rs.getString("TELEFONE"));
                contato.setFunc(rs.getString("RUA"));
                contato.setCondicao(rs.getString("NOTAS"));
                contato.setEntrada(rs.getString("DATA_REGISTRO"));
                contato.setDocumento(rs.getString("COMPLEMENTO"));
                contato.setSaida(rs.getString("ENTREGA"));
                //contato.setTurno(rs.getString("Turno_vigi"));
                //contato.setSaida(rs.getString("Dataout_vigi"));
                //contato.setEmpresa(rs.getString("Empresas_Nome_empre"));
                //contato.setSaida_acess(rs.getString("atualizado"));
                //contato.setCartao_acess(rs.getString("Vig_Identifica"));//quem fez
                
                ///contato.setFoto(rs.getString("Foto"));
                //contato.setDtNascimento(rs.getDate("DOCUMENTO"));
                //contato.setObservacoes(rs.getString("observacoes"));
                //contato.setDtNascimento(rs.getString("DOCUMENTO"));
            }
            
            rs.close();
        }
        return contato; 
}
     public Contato findByNameEntrega(String nome) throws SQLException {//like '%pedro%'
        String select = "SELECT ID, CLIENTE, HORA, QUANTIDADE, ENTREGA, DESCONTO, DATA FROM PEDIDOS WHERE CLIENTE LIKE ?"; //pega dados cbPedidos
        //String select = "SELECT * FROM VIGILANCIA WHERE Nome_vigi = ?";
        Contato contato = null;
        try (PreparedStatement stmt = getConnection().prepareStatement(select)) {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                contato = new Contato();
                contato.setIdindex(String.valueOf(rs.getLong("ID")));
                //contato.setId(rs.getLong("CODCAD"));
                contato.setNome(rs.getString("CLIENTE"));
                contato.setTelefone(rs.getString("HORA"));
                contato.setFunc(rs.getString("QUANTIDADE"));
                contato.setCondicao(rs.getString("ENTREGA"));
                contato.setEntrada(rs.getString("DATA"));
                contato.setDocumento(rs.getString("DESCONTO"));
                
                //contato.setSetor(rs.getString("Posto_vigi"));
                //contato.setTurno(rs.getString("Turno_vigi"));
                //contato.setSaida(rs.getString("Dataout_vigi"));
                //contato.setEmpresa(rs.getString("Empresas_Nome_empre"));
                //contato.setSaida_acess(rs.getString("atualizado"));
                //contato.setCartao_acess(rs.getString("Vig_Identifica"));//quem fez
                
                ///contato.setFoto(rs.getString("Foto"));
                //contato.setDtNascimento(rs.getDate("DOCUMENTO"));
                //contato.setObservacoes(rs.getString("observacoes"));
                //contato.setDtNascimento(rs.getString("DOCUMENTO"));
            }
            
            rs.close();
        }
        return contato; 
}
    public Contato findByPedidos(String ped) throws SQLException {//like '%pedro%'
        String select = "SELECT * FROM CLIENTES WHERE ID LIKE ?";
        //String select = "SELECT * FROM VIGILANCIA WHERE Nome_vigi = ?";
        Contato contato = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, ped);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            contato = new Contato();
            contato.setIdindex(String.valueOf(rs.getLong("ID")));
            //contato.setId(rs.getLong("CODCAD"));
           // contato.setNome_acess(rs.getString("NOME"));
           // contato.setTelefone(rs.getString("Telefone"));
            //contato.setFunc(rs.getString("endereco"));
            contato.setCondicao(rs.getString("NOTAS"));
            //contato.setSetor(rs.getString("Posto_vigi"));
            //contato.setTurno(rs.getString("Turno_vigi"));
            //contato.setEntrada(rs.getString("clidesde"));
            //contato.setSaida(rs.getString("Dataout_vigi"));
            //contato.setEmpresa(rs.getString("Empresas_Nome_empre"));
            //contato.setSaida_acess(rs.getString("atualizado"));
            //contato.setCartao_acess(rs.getString("Vig_Identifica"));//quem fez
            
            ///contato.setFoto(rs.getString("Foto"));
            //contato.setDtNascimento(rs.getDate("DOCUMENTO"));
            //contato.setDocumento(rs.getString("Matricula_vigi"));
             //contato.setObservacoes(rs.getString("observacoes"));
            //contato.setDtNascimento(rs.getString("DOCUMENTO"));
        }

        rs.close();
        stmt.close();
        return contato; 
}
    public Contato findByDoc(String doc) throws SQLException {
        String select = "SELECT * FROM CLIENTES WHERE NOME LIKE ?";
        //String select = "SELECT id_pedido, detalhes FROM PEDIDOS";
        Contato contato = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, doc);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            contato = new Contato();
            //contato.setIdindex(String.valueOf(rs.getLong("CODCAD")));
            //contato.setId(rs.getLong("CODCAD"));//usava esse antes
            contato.setIdindex(String.valueOf(rs.getLong("id")));
            //contato.setId(rs.getLong("CODCAD"));
            //contato.setNome_acess(rs.getString("detalhes"));
            //contato.setTelefone(rs.getString("Telefone_vigi"));
            //contato.setFunc(rs.getString("Posto_vigi"));
            contato.setCondicao(rs.getString("NOTAS"));
            //contato.setSetor(rs.getString("Posto_vigi"));
            //contato.setTurno(rs.getString("Turno_vigi"));
            //contato.setEntrada(rs.getString("Datain_vigi"));
            //contato.setSaida(rs.getString("Dataout_vigi"));
            //contato.setEmpresa(rs.getString("Empresas_Nome_empre"));
            //contato.setSaida_acess(rs.getString("atualizado"));
            //contato.setCartao_acess(rs.getString("Vig_Identifica"));//quem fez
            
            //contato.setFoto(rs.getString("Foto"));
            //contato.setDtNascimento(rs.getDate("DOCUMENTO"));
            //contato.setDocumento(rs.getString("Matricula_vigi"));
            //contato.setObservacoes(rs.getString("Obs_vigi"));
            //contato.setDtNascimento(rs.getString("DOCUMENTO"));
        }

        rs.close();
        stmt.close();
        return contato; 
}
    public Contato findByAcess(String acer) throws SQLException {
        //String select = "SELECT * FROM ACESSOS WHERE CARTAO = ? ";
       // String select = "SELECT * FROM RANGE_ACESSOS WHERE SAIDA IS NULL";//VAZIO
        //SELECT * FROM range_table WHERE key_column = 10;
        //String select = "SELECT * FROM PEDIDOS WHERE CARTAO = ? AND SAIDA IS NULL";//VAZIO
        String select = "SELECT * FROM CLIENTES WHERE ID LIKE ? ";//VAZIO
        Contato contato = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, acer);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            contato = new Contato();
            contato.setIdindex(String.valueOf(rs.getLong("ID")));
            //contato.setId(rs.getLong("CODACESS"));
            //contato.setTelefone_acess(rs.getString("CADASTRO_TELEFONE"));
            contato.setNome_acess(rs.getString("NOME"));
            //contato.setCartao_acess(rs.getString("CARTAO"));
            //contato.setEntrada(rs.getString("ENTRADA"));
            contato.setCondicao(rs.getString("NOTAS"));
            
            //contato.setDtNascimento(rs.getDate("DOCUMENTO"));
            //contato.setDocumento(rs.getString("DOCUMENTO"));
            //contato.setObservacoes(rs.getString("OBS"));
            //contato.setDtNascimento(rs.getString("DOCUMENTO"));
        }

        rs.close();
        stmt.close();
        return contato; 
}
    
    public Contato findByUser(String login) throws SQLException {
        //String select = "SELECT * FROM USUARIOS WHERE Nome_usu = ?";
        String select = "SELECT * FROM USUARIOS WHERE Senha_usu Like ?";
        Contato usuario = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, login);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            usuario = new Contato();
            //contato.setIdindex(String.valueOf(rs.getLong("CODCAD")));
            //contato.setId(rs.getLong("CODCAD"));//usava esse antes
            usuario.setIdindex(String.valueOf(rs.getInt("id_usuarios")));
            //usuario.setFunc(rs.getString("FUNCIONARIO"));
            usuario.setLogin(rs.getString("Nome_usu"));
            usuario.setSenha(rs.getString("Senha_usu"));
            usuario.setCartao(rs.getString("Auditoria_usu"));
           // usuario.setDoc(Integer.valueOf(rs.getString("DOCUMENTO")));
          //  usuario.setTelefone(rs.getString("TELEFONE"));
           // usuario.setObservacoes(rs.getString("OBSERVACOES"));
          //  usuario.setPortaria(rs.getString("PORTARIA"));
            
            //contato.setDtNascimento(rs.getString("DOCUMENTO"));
        }

        rs.close();
        stmt.close();
        return usuario; 
}
public Contato findByUserAlter(String login) throws SQLException {
        String select = "SELECT * FROM USUARIOS WHERE Nome_usu = ?";
        //String select = "SELECT * FROM USUARIOS WHERE Senha_usu Like ?";
        Contato usuario = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, login);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            usuario = new Contato();
            //contato.setIdindex(String.valueOf(rs.getLong("CODCAD")));
            //contato.setId(rs.getLong("CODCAD"));//usava esse antes
            usuario.setIdindex(String.valueOf(rs.getLong("id_usuarios")));
            //usuario.setFunc(rs.getString("FUNCIONARIO"));
            usuario.setLogin(rs.getString("Nome_usu"));
            usuario.setSenha(rs.getString("Senha_usu"));
            usuario.setCartao(rs.getString("Auditoria_usu"));
           // usuario.setDoc(Integer.valueOf(rs.getString("DOCUMENTO")));
          //  usuario.setTelefone(rs.getString("TELEFONE"));
           // usuario.setObservacoes(rs.getString("OBSERVACOES"));
          //  usuario.setPortaria(rs.getString("PORTARIA"));
            
            //contato.setDtNascimento(rs.getString("DOCUMENTO"));
        }

        rs.close();
        stmt.close();
        return usuario; 
}
    public void alterarSuaSenha(Contato contato) throws SQLException{
        String update = "UPDATE USUARIOS " +
                "SET Senha_usu = ? WHERE id_usuarios = ?";
        update(update, contato.getId(), contato.getSenha());
    }

        
}
    
