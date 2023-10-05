package Java.Padaria;

import java.util.LinkedList;
import java.util.Queue;

public class Comanda {
    private int id;
    private Queue<ItemVenda> produtos;

    public Comanda(int id) {
        setId(id);
        produtos = new LinkedList<ItemVenda>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Queue<ItemVenda> getProdutos() {
        return produtos;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (ItemVenda produto : produtos) {
            valorTotal += produto.calcularValor();
        }
        return valorTotal;
    }

    public void adicionarProduto(ItemVenda produto) {
        for (ItemVenda produto2 : produtos) {
            if (produto2.getProduto().getId() == produto.getProduto().getId()) {
                if (produto.getQuantidade() != 0) {
                    produto2.setQuantidade(produto2.getQuantidade() + produto.getQuantidade());
                } else {
                    produto2.setPeso(produto2.getPeso() + produto.getPeso());
                }
                return;
            }
        }
        produtos.offer(produto);
    }

    public void removerProduto(ItemVenda produto) {
        produtos.remove(produto);
    }

}
