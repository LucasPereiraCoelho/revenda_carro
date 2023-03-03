package Atividade_Revenda_Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Revenda_Carro {

    public static void main(String[] args) {

        List<String> carros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int contador = 0;

        System.out.println("======= POO Revendedora =======\n");

        for (int a = 0; a < 6; a++) {

            System.out.println("Informe o " + ++contador + "° carro para ser adicionado a lista: ");
            String carroLista = input.next();

            carros.add(carroLista);

        }

        System.out.println("\nDeseja adicionar mais algum carro? (Sim ou Não) ");
        String resposta = input.next();

        if (resposta.toUpperCase().equals("SIM")) {

            while (resposta.toUpperCase().equals("SIM")) {

                System.out.println("\nInforme o " + ++contador + "º carro para ser adicionado a lista: ");
                String carroLista = input.next();

                carros.add(carroLista);

                System.out.println("\nDeseja adicionar mais algum carro? (Sim ou Não) ");
                resposta = input.next();

            }

        } else if (resposta.toUpperCase().equals("NÃO")) {

        } else if (resposta.toUpperCase().equals("NAO")) {

        } else {

            System.out.println("Valor inválido, continuando para a escolha do veículo.");

        }

        System.out.println("\nPossuimoes em estoques o seguintes carros: " + carros);
        System.out.println("Qual carro você deseja comprar? ");
        String verificacaoCarro = input.next();

        while (true) {

            if (carros.contains(verificacaoCarro)) {

                System.out.println("\nVocê deseja comprar o " + verificacaoCarro + "?  (SIm ou Não)");
                String compraCarro = input.next();

                if (compraCarro.toUpperCase().equals("SIM")) {

                    System.out.println("\nDeseja dar o seu antigo carro na troca? ");
                    String troca = input.next();

                    if (troca.toUpperCase().equals("SIM")) {

                        System.out.println("\nQual seu carro atual? ");
                        String carroAtual = input.next();

                        System.out.println("\nParabéns, você adquiriu um " + verificacaoCarro);
                        int indiceCarro = carros.indexOf(verificacaoCarro);
                        carros.set(indiceCarro, carroAtual);
                        System.out.println("Restaram no estoque os carros: " + carros);
                        break;

                    } else if (troca.toUpperCase().equals("NAO")) {

                        System.out.println("\nParabéns, você adquiriu um " + verificacaoCarro);
                        carros.remove(verificacaoCarro);
                        System.out.println("Restaram no estoque os carros: " + carros);
                        break;

                    } else {

                        System.out.println("\nValor inválido, tente novamente.\nO carro que você escolheu é: " + verificacaoCarro);

                    }
                } else if (compraCarro.toUpperCase().equals("NÃO")) {

                    System.out.println("Volte sempre!");
                    break;

                } else if (compraCarro.toUpperCase().equals("NAO")) {

                    System.out.println("Volte sempre!");
                    break;

                } else {

                    System.out.println("\nValor inválido.\nO carro que você escolheu é: " + verificacaoCarro);

                }

            } else {

                System.out.println("\nO carro não existe");
                System.out.println("Os carros que possuimos em estoque são: " + carros);
                System.out.println("Deseja continuar a comprar um carro no estoque? (Sim ou Não)");
                String escolhaCarro = input.next();

                if (escolhaCarro.toUpperCase().equals("SIM")) {

                    System.out.println("\nQual carro você deseja comprar? ");
                    verificacaoCarro = input.next();

                } else {

                    System.out.println("Volte sempre!");
                    break;

                }

            }

        }
    }

}
