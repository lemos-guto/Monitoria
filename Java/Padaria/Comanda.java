package Java.Padaria;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Comanda {
    int id;
    Queue<ItemVenda> produtos;
    double valorTotal;

    public Comanda(int id) {
        this.id = id;
        produtos = new LinkedList<ItemVenda>(); 
        valorTotal = 0.0;
    }

    public void calcularValorTotal() {
        for (ItemVenda produto : produtos) {
            valorTotal += produto.calcularValor();
        }
    }

    public void adicionarProduto(ItemVenda produto) {
        produtos.offer(produto);
    }

}
