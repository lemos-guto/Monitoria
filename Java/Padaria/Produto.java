package Java.Padaria;

public class Produto {
    int id;
    String name;
    double preco_produto;
    double peso;
    int quantidade;

    public Produto(int id, String name, double preco_produto) {
        this.id = id;
        this.name = name;
        this.preco_produto = preco_produto;

    }

    public Produto(int id, String name, double preco_produto, int quantidade) {
        this.id = id;
        this.name = name;
        this.preco_produto = preco_produto;
        this.quantidade = quantidade;

    }

    public Produto(int id, String name, double preco_produto, double peso) {
        this.id = id;
        this.name = name;
        this.preco_produto = preco_produto;
        this.peso = peso;

    }

    public double calcularValor(Produto p) {
        if (quantidade == 0) {
            return preco_produto * peso;
        } else if (peso == 0) {
            return quantidade * preco_produto;
        } else {
            return 0;
        }
    }
}
