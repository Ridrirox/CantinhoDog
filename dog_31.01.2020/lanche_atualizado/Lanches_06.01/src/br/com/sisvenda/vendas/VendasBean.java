/*
 * VendasBean.java
 *
 * Created on 23 de Fevereiro de 2008, 02:18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.com.sisvenda.vendas;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Cl�udio
 */
public class VendasBean {
    
    /** Creates a new instance of VendasBean */
    public VendasBean() {
    }
    
    
    private Integer codigo;
    private Integer servico;
    private Integer codigoProduto;
    private Integer codigoCliente;
    private Date dataVenda;
    private Integer quantidade;
    private Double valor;
    private Double pediro;
    private String pedido;
    private String recebido;
    private String troco; 
    private String datVenda;
    private String detalhes;
    private String itens; 
    private Double entrega;
    private Time hora;
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the servico
     */
    public Integer getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(Integer servico) {
        this.servico = servico;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the pedido
     */
    public String getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the recebido
     */
    public String getRecebido() {
        return recebido;
    }

    /**
     * @param recebido the recebido to set
     */
    public void setRecebido(String recebido) {
        this.recebido = recebido;
    }

    /**
     * @return the datVenda
     */
    public String getDatVenda() {
        return datVenda;
    }

    /**
     * @param datVenda the datVenda to set
     */
    public void setDatVenda(String datVenda) {
        this.datVenda = datVenda;
    }

    /**
     * @return the detalhes
     */
    public String getDetalhes() {
        return detalhes;
    }

    /**
     * @param detalhes the detalhes to set
     */
    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    /**
     * @return the troco
     */
    public String getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(String troco) {
        this.troco = troco;
    }

    /**
     * @return the itens
     */
    public String getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(String itens) {
        this.itens = itens;
    }

    /**
     * @return the entrega
     */
    public Double getEntrega() {
        return entrega;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntrega(Double entrega) {
        this.entrega = entrega;
    }

    /**
     * @return the hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }

    /**
     * @return the pedir
     */
    public Double getPediro() {
        return pediro;
    }

    /**
     * @param pedir the pedir to set
     */
    public void setPediro(Double pediro) {
        this.pediro = pediro;
    }
}
