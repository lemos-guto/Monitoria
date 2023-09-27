package Java.Padaria;

public class Pedido extends Produto {
    double peso;
    int quantidade;

    public Pedido(int id, String name, double preco_produto, int quantidade) {
        super(id, name, preco_produto);
        this.quantidade = quantidade;
    }

    public Pedido(int id, String name, double preco_produto, double peso) {
        super(id, name, preco_produto);
        this.peso = peso;
    }

    public double calcularValor(Pedido p) {
        if (quantidade == 0) {
            return preco_produto * peso;
        } else if (peso == 0) {
            return quantidade * preco_produto;
        } else {
            return 0;
        }
    }
}
