package alura.descontoChainOfResponsability;

import alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoComMaisDe5Itens(
                new DescontoParaOrcamentoComvalorMairQue500(
                        new SemDesconto()
                ));

        return desconto.calcular(orcamento);
    }
}
