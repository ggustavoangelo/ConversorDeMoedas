package Aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ConverterMoeda extends Conversor {
    public ConverterMoeda() {
        super();
    }

    public void converterMoeda() {
        try (Scanner entrada = new Scanner(System.in)) {
            int escolha = 0;
            String opcao1;
            String opcao2;
            boolean continuar = true;

            while (continuar) {
                try {
                    double vl = 0;
                    System.out.println("Bem vindo ao conversor de moedas! \nPara continuar selecione uma das opções abaixo:\n" +
                            "1 - Converter\n" +
                            "2 - Sair do programa");
                    escolha = entrada.nextInt();
                    if (escolha == 2) {
                        System.out.println("Finalizando...");
                    } else if (escolha == 1) {
                        System.out.println("Selecione a moeda a ser convertida:\n" +
                                "BRL - Real brasileiro\n" +
                                "USD - Dolar\n" +
                                "EUR - Euro\n" +
                                "GBP - Libra esterlina\n" +
                                "CHF - Franco suico \n" +
                                "ARS - Peso Argentino \n" +
                                "CAD - Dólar Canadense ");
                        entrada.nextLine();
                        opcao1 = entrada.nextLine().toUpperCase();
                        System.out.println("Para: \n" +
                                "BRL - Real brasileiro\n" +
                                "USD - Dolar\n" +
                                "EUR - Euro\n" +
                                "GBP - Libra esterlina\n" +
                                "CHF - Franco suico \n" +
                                "ARS - Peso Argentino \n" +
                                "CAD - Dólar Canadense");
                        opcao2 = entrada.nextLine().toUpperCase();
                        System.out.println("Informe o valor: ");
                        double valorintro = entrada.nextDouble();
                        if ((opcao1.equals("BRL")) && (opcao2.equals("USD"))) {
                            vl = valorintro / MoedaEnum.USD.getValor();
                            System.out.printf("De Real para dolar: $%.2f%n", vl);
                            inflacaoReal();
                        } else if ((opcao1.equals("BRL")) && (opcao2.equals("EUR"))) {
                            vl = valorintro / MoedaEnum.EUR.getValor();
                            System.out.printf("De Real para euro: €%.2f%n.", vl);
                            inflacaoReal();
                        } else if ((opcao1.equals("BRL")) && (opcao2.equals("GBP"))) {
                            vl = valorintro / MoedaEnum.GBP.getValor();
                            System.out.printf("De Real para libra esterlina: £%.2f%n.", vl);
                            inflacaoReal();
                        } else if ((opcao1.equals("BRL")) && (opcao2.equals("CHF"))) {
                            vl = valorintro / MoedaEnum.CHF.getValor();
                            System.out.printf("De Real para Franco Suico: CHF%.2f%n.", vl);
                            inflacaoReal();
                        } else if ((opcao1.equals("BRL")) && (opcao2.equals("ARS"))) {
                            vl = valorintro / 0.021;
                            System.out.printf("De Real para Peso Argentino: %.2f%n. ", vl);
                            inflacaoReal();

                        } else if ((opcao1.equals("BRL")) && (opcao2.equals("CAD"))) {
                            vl = valorintro / 3.68;
                            System.out.printf("De Real para Dólar Canadense: %.2f%n.", vl);
                            inflacaoReal();
                        }

                        if ((opcao1.equals("USD")) && (opcao2.equals("BRL"))) {
                            vl = valorintro / 0.19;
                            System.out.printf("De Dolar para Real: R$%.2f%n.", vl);
                            inflacaoEUA();
                        } else if (opcao1.equals("USD") && (opcao2.equals("EUR"))) {
                            vl = valorintro / 1.08;
                            System.out.printf("De Dolar para Euro: €%.2f%n.", vl);
                            inflacaoEUA();
                        } else if (opcao1.equals("USD") && (opcao2.equals("GBP"))) {
                            vl = valorintro / 1.22;
                            System.out.printf("De Dolar para Libra Esterlina: £%.2f%n.", vl);
                            inflacaoEUA();
                        } else if (opcao1.equals("USD") && (opcao2.equals("CHF"))) {
                            vl = valorintro / 1.09;
                            System.out.printf("De Dolar para Franco Suico: CHF%.2f%n.", vl);
                            inflacaoEUA();
                        } else if ((opcao1.equals("USD")) && (opcao2.equals("ARS"))) {
                            vl = valorintro / 234.32;
                            System.out.printf("De Dólar para Peso Argentino: £%.2f%n.", vl);

                            inflacaoEUA();
                        } else if ((opcao1.equals("USD")) && (opcao2.equals("CAD"))) {
                            vl = valorintro / 1.35;
                            System.out.printf("De Dólar para Dólar Canadense: £%.2f%n.", vl);

                            inflacaoEUA();
                        }

                        if ((opcao1.equals("EUR")) && (opcao2.equals("BRL"))) {
                            vl = valorintro / 0.18;
                            System.out.printf("De euro para Real: R$%.2f%n.", vl);
                            inflacaoEuro();
                        } else if ((opcao1.equals("EUR")) && (opcao2.equals("USD"))) {
                            vl = valorintro / 0.93;
                            System.out.printf("De euro para Dolar: $%.2f%n.", vl);
                            inflacaoEuro();
                        } else if ((opcao1.equals("EUR")) && (opcao2.equals("GBP"))) {
                            vl = valorintro / 0.88;
                            System.out.printf("De euro para Libra Esterlina: £%.2f%n.", vl);
                            inflacaoEuro();
                        } else if ((opcao1.equals("EUR")) && (opcao2.equals("CHF"))) {
                            vl = valorintro / 0.99;
                            System.out.printf("De euro para Franco Suico: CHF%.2f%n.", vl);
                            inflacaoEuro();
                        } else if ((opcao1.equals("EUR")) && (opcao2.equals("ARS"))) {
                            vl = valorintro / 253.43;
                            System.out.printf("De euro para Peso Argentino: %.2f%n.", vl);

                            inflacaoEuro();

                        } else if ((opcao1.equals("EUR")) && (opcao2.equals("CAD"))) {
                            vl = valorintro / 1.46;
                            System.out.printf("De euro para Dólar Canadense: CHF%.2f%n.", vl);

                            inflacaoEuro();

                        }

                        if ((opcao1.equals("GBP")) && (opcao2.equals("BRL"))) {
                            vl = valorintro / 0.16;
                            System.out.printf("De Libra Esterlina para Real: R$%.2f%n.", vl);
                            inflacaoLibra();
                        } else if ((opcao1.equals("GBP")) && (opcao2.equals("USD"))) {
                            vl = valorintro / 0.82;
                            System.out.printf("De Libra Esterlina para Dolar: $%.2f%n.", vl);
                            inflacaoLibra();
                        } else if ((opcao1.equals("GBP")) && (opcao2.equals("EUR"))) {
                            vl = valorintro / 0.88;
                            System.out.printf("De Libra Esterlina para Euro: €%.2f%n.", vl);
                            inflacaoLibra();
                        } else if ((opcao1.equals("GBP")) && (opcao2.equals("CHF"))) {
                            vl = valorintro / 0.89;
                            System.out.printf("De Libra Esterlina para Franco Suico: CHF%.2f%n.", vl);
                            inflacaoLibra();
                        } else if ((opcao1.equals("GBP")) && (opcao2.equals("ARS"))) {
                            vl = valorintro / 291.41;
                            System.out.printf("De Libra Esterlina para Peso Argentino: €%.2f%n.", vl);

                            inflacaoLibra();

                        } else if ((opcao1.equals("GBP")) && (opcao2.equals("CAD"))) {
                            vl = valorintro / 1.68;
                            System.out.printf("De Libra Esterlina para Dólar Canadense: €%.2f%n.", vl);
                            inflacaoLibra();

                        }

                        if ((opcao1.equals("CHF")) && (opcao2.equals("BRL"))) {
                            vl = valorintro / 0.18;
                            System.out.printf("De Franco Suico para Real: R$%.2f%n.", vl);
                            inflacaoFrancoSuico();
                        } else if ((opcao1.equals("CHF")) && (opcao2.equals("USD"))) {
                            vl = valorintro / 0.92;
                            System.out.printf("De Franco Suico para Dolar: $%.2f%n.", vl);
                            inflacaoFrancoSuico();
                        } else if ((opcao1.equals("CHF")) && (opcao2.equals("EUR"))) {
                            vl = valorintro / 0.99;
                            System.out.printf("De Franco Suico para Euro: €%.2f%n.", vl);
                            inflacaoFrancoSuico();
                        } else if ((opcao1.equals("CHF")) && (opcao2.equals("GBP"))) {
                            vl = valorintro / 1.13;
                            System.out.printf("De Franco Suico para Libra Esterlina: £%.2f%n.", vl);
                            inflacaoFrancoSuico();
                        } else if ((opcao1.equals("CHF")) && (opcao2.equals("ARS"))) {
                            vl = valorintro / 260.98;
                            System.out.printf("De Franco Suico para Peso Argentino: £%.2f%n.", vl);
                            inflacaoFrancoSuico();
                        } else if ((opcao1.equals("CHF")) && (opcao2.equals("CAD"))) {
                            vl = valorintro / 1.50;
                            System.out.printf("De Franco Suico para Dólar Canadense: £%.2f%n.", vl);
                            inflacaoFrancoSuico();
                        }
                        if ((opcao1.equals("ARS")) && (opcao2.equals("BRL"))) {
                            vl = valorintro * 0.021;
                            System.out.printf("De Peso Argentino para Real: R$ %.2f%n. ", vl);
                            inflacaoPesoArgentino();
                        } else if ((opcao1.equals("ARS")) && (opcao2.equals("USD"))) {
                            vl = valorintro * 0.0042;
                            System.out.printf("De Peso Argentino para Dolar: $ %.2f%n.", vl);
                            inflacaoPesoArgentino();
                        } else if ((opcao1.equals("ARS")) && (opcao2.equals("EUR"))) {
                            vl = valorintro * 0.0039;
                            System.out.printf("De Peso Argentino para Euro: € %.2f%n.", vl);
                            inflacaoPesoArgentino();
                        } else if ((opcao1.equals("ARS")) && (opcao2.equals("GBP"))) {
                            vl = valorintro * 0.0034;
                            System.out.printf("De Peso Argentino para Libra Esterlina: £ %.2f%n. ", vl);
                            inflacaoPesoArgentino();
                        } else if ((opcao1.equals("ARS")) && (opcao2.equals("CHF"))) {
                            vl = valorintro * 0.0038;
                            System.out.printf("De Peso Argentino para Franco Suiço: £ %.2f%n.", vl);


                            inflacaoPesoArgentino();
                        } else if ((opcao1.equals("ARS")) && (opcao2.equals("CAD"))) {
                            vl = valorintro * 0.006;
                            System.out.printf("De Peso Argentino para Dólar Canadense: %.2f%n. ", vl);
                            inflacaoPesoArgentino();
                        }

                        if ((opcao1.equals("CAD")) && (opcao2.equals("BRL"))) {
                            vl = valorintro * 3.68;
                            System.out.printf("De Dólar Canadense para Real: R$%.2f%n.", vl);
                            System.out.println("teste");
                            inflacaoDolarCanadense();
                        } else if ((opcao1.equals("CAD")) && (opcao2.equals("USD"))) {
                            vl = valorintro * 0.74;
                            System.out.printf("De Dólar Canadense para Dolar: $%.2f%n.", vl);
                            inflacaoDolarCanadense();
                        } else if ((opcao1.equals("CAD")) && (opcao2.equals("EUR"))) {
                            vl = valorintro * 0.68;
                            System.out.printf("De Dólar Canadense para Euro: %.2f%n.", vl);
                            inflacaoDolarCanadense();
                        } else if ((opcao1.equals("CAD")) && (opcao2.equals("GBP"))) {
                            vl = valorintro * 0.60;
                            System.out.printf("De Dólar Canadense para Libra Esterlina: %.2f%n.", vl);
                            inflacaoDolarCanadense();
                        } else if ((opcao1.equals("CAD")) && (opcao2.equals("ARS"))) {
                            vl = valorintro * 173.49;
                            System.out.printf("De Dólar Canadense para Peso Argentino: %.2f%n.", vl);
                            inflacaoDolarCanadense();

                        } else if ((opcao1.equals("CAD")) && (opcao2.equals("CHF"))) {
                            vl = valorintro * 0.66;
                            System.out.printf("De Dólar Canadense para Franco Suiço: £%.2f%n.", vl);
                            inflacaoDolarCanadense();
                        }
                    }
                } catch (InputMismatchException | IllegalStateException e) {
                    while (escolha != 1 && escolha != 2 && escolha != 3) {
                        System.out.println("ERRO. Finalizando...");
                        break;
                    }
                }

                if (continuar) {
                    boolean opcaoValida = false;
                    while (!opcaoValida) {
                        System.out.println("Selecione uma das opções:\n" +
                                "1 - Nova conversão\n" +
                                "2 - Finalizar");
                        int opcaoContinuar = entrada.nextInt();
                        if (opcaoContinuar == 2) {
                            continuar = false;
                            System.out.println("Finalizando...");
                            opcaoValida = true;
                        } else if (opcaoContinuar == 1) {
                            opcaoValida = true;
                        } else {
                            System.out.println("Opção inválida. Por favor, tente novamente.");
                        }
                    }
                }
            } entrada.close();
        }
    }
}


