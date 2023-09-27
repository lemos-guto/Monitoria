package Java.Padaria;

import java.util.Scanner;

public class Padaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto pao = new Produto(1, "Pão Francês", 0.50);
        Produto paoDoce = new Produto(2, "Pão Doce", 0.75);
        Produto paoIntegral = new Produto(3, "Pão Integral", 1.00);
        Produto paoIntegralDoce = new Produto(4, "Pão Integral Doce", 1.25);
        Produto cafe = new Produto(5, "Café Preto", 5.00);
        boolean continuar = true;

        System.out
                .println("Bem-vindo a Padaria do Mateus Cruzatto! Deseja realizar alguma compra?\n 1 - Sim\n 2 - Não");
        int inicio = sc.nextInt();

        if (inicio == 1) {
            while (continuar == true) {
                System.out.println(
                        "Qual produto deseja comprar?\n 1 - Pão Francês\n 2 - Pão Doce\n 3 - Pão Integral\n 4 - Pão Integral Doce\n 5 - Café Preto");
                int produto = sc.nextInt();

                switch (produto) {
                    case 1:
                        System.out.println("Quantos pães deseja comprar?");
                        break;

                    default:
                        break;
                }
            }
        }

        else if (inicio == 2) {
            System.out.println("Obrigado pela visita!");
            System.exit(0);
        }

        else {
            System.out.println("Opção inválida!");
            System.exit(0);
        }
    }

}
