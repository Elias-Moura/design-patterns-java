package alura.descontoChainOfResponsability;

import alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDe5Itens extends Desconto{
    public DescontoParaOrcamentoComMaisDe5Itens(Desconto proximo) {
        super(proximo);
    }
    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQunatidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
