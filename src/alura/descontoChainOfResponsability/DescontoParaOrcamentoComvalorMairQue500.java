package alura.descontoChainOfResponsability;

import alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComvalorMairQue500 extends Desconto {
    public DescontoParaOrcamentoComvalorMairQue500(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
