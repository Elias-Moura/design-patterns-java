package alura.descontoChainOfResponsability;

import alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDe5Itens extends Desconto {
    public DescontoParaOrcamentoComMaisDe5Itens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQunatidadeItens() > 5;
    }
}
