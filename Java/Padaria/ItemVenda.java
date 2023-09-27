package Java.Padaria;

public class ItemVenda{
    private int id;
    private Produto produto;
    private int quantidade;
    private double peso;

    public ItemVenda(int id, Produto produto, int quantidade){
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        peso = 0;
    }

    public ItemVenda(int id, Produto produto, double peso) {
        this.id = id;
        this.produto = produto;
        this.peso = peso;
        quantidade = 0;
    }

    public double calcularValor() {
        if (quantidade == 0) {
            return produto.getPreco() * peso;
        } else {
            return quantidade * produto.getPreco();
        } 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if(produto.equals(null)) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade não pode ser igual ou menor que zero.");
        }
        this.quantidade = quantidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso <= 0) {
            throw new IllegalArgumentException("O peso não pode ser igual ou menor que zero.");
        }
        this.peso = peso;
    }
}
