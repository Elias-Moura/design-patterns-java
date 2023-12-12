package alura.orcamento.situacao;

import alura.orcamento.Orcamento;
import alura.orcamento.situacao.exception.InvalidOperationException;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal aplicarDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
    public void aprovar(Orcamento orcamento){
        throw new InvalidOperationException("O orçamento não pode ser aprovado.");
    }
    public void reprovar(Orcamento orcamento){
        throw new InvalidOperationException("O orçamento não pode ser reprovado.");
    }
    public void finalizar(Orcamento orcamento){
        throw new InvalidOperationException("O orçamento não pode ser finalizar!");
    }
}
