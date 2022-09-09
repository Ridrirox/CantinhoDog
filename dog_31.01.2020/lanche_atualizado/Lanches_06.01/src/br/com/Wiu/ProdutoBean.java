/*
 * ProdutoBean.java
 *
 * Created on 17 de Fevereiro de 2008, 05:22
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.com.Wiu;

/**
 *
 * @author Cl�udio
 */
public class ProdutoBean {
    
    /** Creates a new instance of ProdutoBean */
    public ProdutoBean() {
    }
    
    private Integer codigo;
    private Integer fornecedores_codigo;
    private String nome;
    private Double valor;
    private Integer quantidade;
    private Integer estoque;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getFornecedores_codigo() {
        return fornecedores_codigo;
    }

    public void setFornecedores_codigo(Integer fornecedores_codigo) {
        this.fornecedores_codigo = fornecedores_codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
}
