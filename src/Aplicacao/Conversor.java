package Aplicacao;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public abstract class Conversor implements ConversorInterface{
    //ATRIBUTOS
    protected String SimboloConversao;
    protected double ValorParaSerConvertido;

    //METODOS ESPECIAIS

    public Conversor(){
        super();
        this.SimboloConversao = SimboloConversao;
        this.ValorParaSerConvertido = ValorParaSerConvertido;
    }

    public String getSimboloConversao() {
        return SimboloConversao;
    }

    public void setSimboloConversao(String simboloConversao) {
        SimboloConversao = simboloConversao;
    }

    public double getValorParaSerConvertido() {
        return ValorParaSerConvertido;
    }

    public void setValorParaSerConvertido(double valorConvertido) {
        ValorParaSerConvertido = valorConvertido;
    }

    public void inflacaoEUA() {
        System.out.println("A taxa de inflação do dólar é de 6,0%. \n");
    }
    public void inflacaoReal(){
        System.out.println("A inflação Brasileira no final de 2022 foi fechada em 5,79%. \n");
    }
    public void inflacaoLibra(){
        System.out.println("A Libra Esterlina desvalorizou 20,7% no ano de 2022. \n");
    }
    public void inflacaoEuro(){
        System.out.println("A inflação do EURO anual caiu para 6,9% em Março de 2023. \n");
    }
    public void inflacaoFrancoSuico(){
        System.out.println("A inflação do Franco Suíço atualmente é de 0.6%. \n");
    }
    public void inflacaoPesoArgentino(){System.out.println("A inflação do Peso Argetino atualmente é de 126.4% \n");}
    public void inflacaoDolarCanadense(){System.out.println("A inflação do dólar canadense no ano de 2022 fechou em 6,8%. \n");}


}