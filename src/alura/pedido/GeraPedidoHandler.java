package alura.pedido;

import alura.orcamento.Orcamento;
import alura.pedido.acao.AcaoAposGerarPedido;
import alura.pedido.acao.EnviarEmailPedido;
import alura.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    //contrutor com injecao de dependencia: repository, service, etc.

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        var orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        var pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));

        /*
        EnviarEmailPedido enviarEmail = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        enviarEmail.executar(pedido);
        salvar.executar(pedido);
        */
        /*
        * Essa classe continua a crescer indefinidamente a depender de quantas ações devem ser executadas
        * após a finalização de um pedido.
        * Mesmo que sejá utilizado a injeção de dependências no contrutor da classe.
        *
        * Vamos implementar o padrão observer para desacoplar e simplificar o código.
        * */
    }
}
