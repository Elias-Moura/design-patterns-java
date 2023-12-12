package alura.pedido;

import java.math.BigDecimal;

//Command
public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    // injecao de dependencias: PedidoRepository, EmailService, ...
    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quanntidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quanntidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
