package alura.pedido.acao;

import alura.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido!");
    }

}
