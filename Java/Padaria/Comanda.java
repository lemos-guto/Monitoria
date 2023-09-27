package Java.Padaria;

import java.util.HashMap;
import java.util.Map;

public class Comanda {
    int id;
    Map<String, Double> produtos = new HashMap<String, Double>();
    double valorTotal = 0.0;

    public Comanda(int id) {
        this.id = id;
    }

    public void calcularValorTotal() {
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            valorTotal += entry.getValue();
        }
    }

    public void adicionarProduto(Pedido p, int quantidade) {
        produtos.put(p.name, p.calcularValor(p));
    }

}
