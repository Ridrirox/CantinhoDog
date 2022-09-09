package br.com.Controle;

//import br.mb.tutorialJdbcSwingMysql.dao.ContatoDao;
//import br.mb.tutorialJdbcSwingMysql.model.Contato;

import javax.swing.*;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class ContatoController {

    private Date formatarData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return new Date( formatter.parse(data).getTime() );
    }

    public void salvar(String nome, String telefone, String endereco, String obs, String favorito, String pedido_id, String cadastrado) throws SQLException, ParseException {
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        //contato.setDtNascimento(formatarData(dtNascimento));
        contato.setDtNascimento(endereco);
        contato.setObservacoes(obs);
        contato.setEntrada(favorito);
        contato.setIdindex(pedido_id);
        contato.setSaida(cadastrado);

        new ContatoDao().salvar(contato);
    }
    public void salvarUsuario(String func, String login, String senha, Integer doc, String telefone, String obs) throws SQLException, ParseException {
        Contato contato = new Contato();
        contato.setFunc(func);
        contato.setLogin(login);
        contato.setSenha(senha);
        contato.setDoc(Integer.valueOf(doc));
        contato.setTelefone(telefone);
        contato.setObservacoes(obs);

        new ContatoDao().salvarUser(contato);
    }

    public void alterar(String id, String nome, String telefone, String dtNascimento, String obs) throws ParseException, SQLException {
        Contato contato = new Contato();
        contato.setIdindex(id);
        contato.setNome(nome);
        contato.setTelefone(telefone);
        //contato.setDtNascimento(formatarData(dtNascimento));
        contato.setDtNascimento((dtNascimento));//doc
        contato.setObservacoes((obs));

        new ContatoDao().alterar(contato);
    }
    public void alterarUser(String iduser, String func, String login, String senha, Integer doc, String telefone, String obs) throws ParseException, SQLException {
        Contato contato = new Contato();
        contato.setIdindex(iduser);
        contato.setFunc(func);
        contato.setLogin(login);
        contato.setSenha(senha);
        contato.setDoc(Integer.valueOf(doc));
        contato.setTelefone(telefone);
        contato.setObservacoes((obs));

        new ContatoDao().alterarUser(contato);
    }
    public void alterarSai(String id_sai, String sai, String condica) throws ParseException, SQLException {
        Contato contato = new Contato();
        contato.setIdindex(String.valueOf(id_sai));
        //contato.setId_acess(contato.getSelectedIndex()).getId();
        //contato.setNome_acess(nome_sai);
       // contato.setTelefone_acess(telefone_sai);
        //contato.setDtNascimento(formatarData(dtNascimento));
        contato.setSaida_acess(sai);
        contato.setCondicao(condica);//condicao

        new ContatoDao().alterarSaida(contato);
    }
    public void alterarSenha(String id_senha, String senha) throws ParseException, SQLException {
        Contato contato = new Contato();
        contato.setId(Long.valueOf(id_senha));
        //contato.setId_acess(contato.getSelectedIndex()).getId();
        //contato.setNome_acess(nome_sai);
       // contato.setTelefone_acess(telefone_sai);
        //contato.setDtNascimento(formatarData(dtNascimento));
        contato.setSenha(senha);
        //contato.setCondicao(condica);//condicao

        new ContatoDao().alterarSuaSenha(contato);
    }
    public List<Contato> listaUsuarios() {
        ContatoDao dao = new ContatoDao();
        try {
            return dao.findUsers();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar o Usuario\n" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Contato> listaContatos() {
        ContatoDao dao = new ContatoDao();
        try {
            return dao.findContatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar o Usuario\n" + e.getLocalizedMessage());
        }
        return null;
    }
    public List<Contato> listaAcesso() {
        ContatoDao dao = new ContatoDao();
        try {
            return dao.findAcess();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar o Acesso\n" + e.getLocalizedMessage());
        }
        return null;
    }
    public List<Contato> listaPedido() {
        ContatoDao dao = new ContatoDao();
        try {
            return dao.findAcess();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar o Pedigo\n" + e.getLocalizedMessage());
        }
        return null;
    }
    

    public void excluir(long id) throws SQLException {
        new ContatoDao().excluir(id);
    }

    public Contato buscaContatoPorEntrega(String nome) throws SQLException {
        ContatoDao dao = new ContatoDao();
        return dao.findByNameEntrega(nome);
    }
    public Contato buscaContatoPorNome(String nome) throws SQLException {
        ContatoDao dao = new ContatoDao();
        return dao.findByName(nome);
    }
    public Contato buscaContatoPorDoc(String doc) throws SQLException {
        ContatoDao dao = new ContatoDao();
        return dao.findByDoc(doc);
    }
    public Contato buscaContatoPorAcess(String acess) throws SQLException {
        ContatoDao dao = new ContatoDao();
        return dao.findByAcess(acess);
    }
    public Contato buscaContatoPorUser(String usas) throws SQLException {
        ContatoDao dao = new ContatoDao();
        return dao.findByUser(usas);
    }
    public Contato buscaContatoPorUserSenha(String usas) throws SQLException {
        ContatoDao dao = new ContatoDao();
        return dao.findByUserAlter(usas);
    }
    public Contato buscaContatoPorPedido(String ped) throws SQLException {
        ContatoDao dao = new ContatoDao();
        return dao.findByPedidos(ped);
    }
}
