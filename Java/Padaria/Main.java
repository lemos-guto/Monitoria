package Java.Padaria;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    static Padaria padaria;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Produto pao = new Produto(1, "Pão Francês", 0.50);
        Produto pao_de_queijo = new Produto(2, "Pão de Queijo", 1.00);
        Produto pao_na_chapa = new Produto(3, "Pão na Chapa", 2.50);
        Produto donnout = new Produto(4, "Donnout", 1.50);
        Produto cafe_500ml = new Produto(5, "Café Preto 500ml", 3.50);
        Produto cafe_700ml = new Produto(6, "Café Preto 700ml", 5.00);
        Produto cafe_900ml = new Produto(7, "Café Preto 900", 7.50);
        Produto torta_de_limão = new Produto(8, "Torta de Limão", 5.00);
        Produto mussarela = new Produto(9, "Mussarela", 5.00);
        Produto presunto = new Produto(10, "Presunto", 5.00);
        padaria = new Padaria();

        padaria.adicionarProduto(pao);
        padaria.adicionarProduto(pao_de_queijo);
        padaria.adicionarProduto(pao_na_chapa);
        padaria.adicionarProduto(donnout);
        padaria.adicionarProduto(cafe_500ml);
        padaria.adicionarProduto(cafe_700ml);
        padaria.adicionarProduto(cafe_900ml);
        padaria.adicionarProduto(torta_de_limão);
        padaria.adicionarProduto(mussarela);
        padaria.adicionarProduto(presunto);

        System.out.print(
                "Bem-vindo a Padaria do Mateus Cruzatto! Deseja realizar alguma compra?\n 1 - Sim\n 2 - Não\nDecisão:");
        int inicio = sc.nextInt();

        if (inicio == 1) {
            int i = 1;
            Comanda comanda = new Comanda(1);
            while (true) {
                System.out.print("\nO que deseja comprar?\n");
                listarEstoque();
                System.out.print("11 - Finalizar compra\nProduto:");
                int id_opcao = sc.nextInt();
                if (padaria.buscarProduto(id_opcao) != null) {
                    if (id_opcao == 9 || id_opcao == 10) {
                        System.out.print("\nQuantos gramas de \"" + padaria.buscarProduto(id_opcao).getNome()
                                + "\" deseja comprar? (Caso não queira comprar o produto, digite 0)\nExemplo:2,50\nPeso:");
                        double peso = sc.nextDouble();
                        if (peso == 0) {
                            continue;
                        }
                        ItemVenda item = new ItemVenda(i, padaria.buscarProduto(id_opcao), peso);
                        comanda.adicionarProduto(item);
                        verificarContinuação(i, comanda, item);
                    } else {
                        System.out.print("\nQuantos \"" + padaria.buscarProduto(id_opcao).getNome()
                                + "\" deseja comprar? (Caso não queira comprar o produto, digite 0)\nQuantidade:");
                        int quantidade = sc.nextInt();
                        if (quantidade == 0) {
                            continue;
                        }
                        ItemVenda item = new ItemVenda(i, padaria.buscarProduto(id_opcao), quantidade);
                        comanda.adicionarProduto(item);
                        verificarContinuação(i, comanda, item);
                    }
                }
                if (id_opcao == 11) {
                    if (comanda.getProdutos().isEmpty()) {
                        agraderVisita();
                    }
                    listarProdutos(comanda, comanda.getId());
                    calcularValorTotal(comanda);
                    agraderVisita();
                } else if (padaria.buscarProduto(id_opcao) == null) {
                    opcaoInvalida();
                }
            }
        } else if (inicio == 2) {
            agraderVisita();
        } else {
            opcaoInvalida();
        }
    }

    public static void listarEstoque() {
        for (Produto produto : padaria.getEstoque()) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - R$" + produto.getPreco());
        }
    }

    public static void listarProdutos(Comanda comanda, int id) {
        System.out.println("\nProdutos da comanda " + id + ":");
        System.out.println("Produto - Valor - Quantidade");
        for (ItemVenda produto : comanda.getProdutos()) {
            if (produto.getQuantidade() != 0) {
                System.out.println(produto.getProduto().getNome() + " - R$" + produto.calcularValor() + " - "
                        + produto.getQuantidade() + " unidade (s)");
            } else {
                System.out.println(produto.getProduto().getNome() + " - R$" + produto.calcularValor() + " - "
                        + produto.getPeso() + "Kg");
            }
        }
    }

    public static void opcaoInvalida() {
        System.out.println("\nOpção inválida!");
    }

    public static void agraderVisita() {
        System.out.println("\nObrigado pela visita!");
        System.exit(0);
    }

    public static void calcularValorTotal(Comanda comanda) {
        System.out.println("O valor total da sua compra é: R$" + comanda.calcularValorTotal());
    }

    public static void verificarContinuação(int i, Comanda comanda, ItemVenda item) {
        while (true) {
            System.out.print("\nDeseja continuar a comprar?\n1 - Sim\n2 - Não\n3 - Cancelar compra anterior\nOpção:");
            int continuar_compra = sc.nextInt();
            if (continuar_compra == 1) {
                i++;
                break;
            } else if (continuar_compra == 2) {
                listarProdutos(comanda, comanda.getId());
                calcularValorTotal(comanda);
                agraderVisita();
            } else if (continuar_compra == 3) {
                comanda.removerProduto(item);
                i--;
                break;
            } else {
                opcaoInvalida();
            }
        }
    }

}
