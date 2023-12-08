package alura;

import alura.descontoChainOfResponsability.CalculadoraDeDescontos;
import alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 5);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println("O desconto é : " + calculadora.calcular(primeiro));
        System.out.println("O desconto é : " + calculadora.calcular(segundo));
    }
}
