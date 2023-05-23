package Aplicacao;
public enum MoedaEnum {
    USD(4.97, "Dolar"),
    EUR(5.37, "Euro"),
    GBP(6.18, "Libra esterlina"),
    CHF(5.53, "Franco Suico"),
    ARS(0.021,"Peso Argentino"),
    CAD(3.68, "Dólar Canadense");


    private double valor;
    private String descricao;

    MoedaEnum(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}