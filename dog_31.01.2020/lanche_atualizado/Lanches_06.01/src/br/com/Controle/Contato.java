package br.com.Controle;

import java.sql.Date;

public class Contato {
    private Long id;
    private Integer idcad;//retorna o codigo do cadastro
    private String idindex;
    private String nome;
    private String func;
    private String login;
    private String senha;
    private String empresa;
    private Integer doc;
    private String nome_acess;
    private String Turno;
    private String Cartao_acess;
    private String Codca_acess;
    private String telefone;
    private String documento;
    private String observacoes;
    private String cartao;
    private String saida;
    private String condicao;
    private String saida_acess;
    private String entrada;
    private String foto;
    private String setor;
    //private Date dtNascimento;
    private String dtNascimento;
    //gere os métodos getters and setters

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the apelido
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the dtNascimento
     */
    public String getDtNascimento() {
        return dtNascimento;
    }

    /**
     * @param dtNascimento the dtNascimento to set
     */
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the cartao
     */
    public String getCartao() {
        return cartao;
    }

    /**
     * @param cartao the cartao to set
     */
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    
    /**
     * @return the entrada
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the idindex
     */
    public String getIdindex() {
        return idindex;
    }

    /**
     * @param idindex the idindex to set
     */
    public void setIdindex(String idindex) {
        this.idindex = idindex;
    }

    /**
     * @return the nome_acess
     */
    public String getNome_acess() {
        return nome_acess;
    }

    /**
     * @param nome_acess the nome_acess to set
     */
    public void setNome_acess(String nome_acess) {
        this.nome_acess = nome_acess;
    }

    /**
     * @return the Telefone_acess
     */
    public String getTurno() {
        return Turno;
    }

    /**
     * @param Telefone_acess the Telefone_acess to set
     */
    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    /**
     * @return the Cartao_acess
     */
    public String getCartao_acess() {
        return Cartao_acess;
    }

    /**
     * @param Cartao_acess the Cartao_acess to set
     */
    public void setCartao_acess(String Cartao_acess) {
        this.Cartao_acess = Cartao_acess;
    }

    /**
     * @return the Codca_acess
     */
    public String getCodca_acess() {
        return Codca_acess;
    }

    /**
     * @param Codca_acess the Codca_acess to set
     */
    public void setCodca_acess(String Codca_acess) {
        this.Codca_acess = Codca_acess;
    }

    /**
     * @return the saida_acess
     */
    public String getSaida_acess() {
        return saida_acess;
    }

    /**
     * @param saida_acess the saida_acess to set
     */
    public void setSaida_acess(String saida_acess) {
        this.saida_acess = saida_acess;
    }

    /**
     * @return the saida
     */
    public String getSaida() {
        return saida;
    }

    /**
     * @param saida the saida to set
     */
    public void setSaida(String saida) {
        this.saida = saida;
    }

    /**
     * @return the condicao
     */
    public String getCondicao() {
        return condicao;
    }

    /**
     * @param condicao the condicao to set
     */
    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    /**
     * @return the idcad
     */
    public Integer getIdcad() {
        return idcad;
    }

    /**
     * @param idcad the idcad to set
     */
    public void setIdcad(Integer idcad) {
        this.idcad = idcad;
    }

    /**
     * @return the func
     */
    public String getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(String func) {
        this.func = func;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the doc
     */
    public Integer getDoc() {
        return doc;
    }

    /**
     * @param doc the doc to set
     */
    public void setDoc(Integer doc) {
        this.doc = doc;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the Portaria
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param Portaria the Portaria to set
     */
    public void setEmpresa(String Empresa) {
        this.empresa = Empresa;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

}