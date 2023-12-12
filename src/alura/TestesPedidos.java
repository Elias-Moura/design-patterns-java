package alura;

import alura.orcamento.Orcamento;
import alura.pedido.GeraPedido;
import alura.pedido.GeraPedidoHandler;
import alura.pedido.Pedido;
import alura.pedido.acao.EnviarEmailPedido;
import alura.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Elias";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido dados = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler gerador = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido()
                )
        );
        gerador.execute(dados);
    }
}
