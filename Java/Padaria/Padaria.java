package Java.Padaria;

import java.util.ArrayList;
import java.util.List;

public class Padaria {
    private List<Produto> estoque = new ArrayList<Produto>();

    public List<Produto> getEstoque() {
        return estoque;
    }

    public void adicionarProduto(Produto produto) {
        this.estoque.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.estoque.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : estoque) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void alterarProduto(Produto produto) {
        for (Produto produto2 : estoque) {
            if (produto2.getId() == produto.getId()) {
                produto2.setNome(produto.getNome());
                produto2.setPreco(produto.getPreco());
                return;
            }
        }
    }
}
