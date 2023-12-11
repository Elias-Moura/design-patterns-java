package alura.descontoChainOfResponsability;

import alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDe5Itens(
                new DescontoParaOrcamentoComvalorMairQue500(
                        new SemDesconto()
                ));

        return cadeiaDeDescontos.efetuarCalculo(orcamento);
    }
}
