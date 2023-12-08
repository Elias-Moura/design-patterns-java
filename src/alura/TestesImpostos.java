package alura;

import alura.impostoStrategy.ICMS;
import alura.impostoStrategy.ISS;
import alura.orcamento.Orcamento;
import alura.impostoStrategy.CalculadoraDeImpostos;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println("O impost ICMS é : " + calculadora.calcular(orcamento, new ICMS()));
        System.out.println("O impost ISS é : " + calculadora.calcular(orcamento, new ISS()));
    }
}
