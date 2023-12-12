package alura.orcamento;

import alura.orcamento.situacao.EmAnalise;
import alura.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private int qunatidadeItens;

    public Orcamento(BigDecimal valor, int qunatidadeItens) {
        this.valor = valor;
        this.qunatidadeItens = qunatidadeItens;
        this.situacao = new EmAnalise();
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void aplicarDecontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.aplicarDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reporvar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }
    public int getQunatidadeItens() {
        return qunatidadeItens;
    }
    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
    public SituacaoOrcamento getSituacao() {
        return situacao;
    }
}
