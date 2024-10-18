package Compras;

import Compras.Produto;
import Descontos.DescontoStrategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotalComDesconto() {
        double total = 0.0;
        for (Produto produto : produtos) {
            double precoOriginal = produto.getPreco(); // Obtém o preço original do produto
            double descontoAplicado = descontoStrategy.calcularDesconto(precoOriginal); // Calcula o valor do desconto
            double precoComDesconto = precoOriginal - descontoAplicado; // Subtrai o desconto do preço original
            total += precoComDesconto; // Adiciona o preço com desconto ao total
        }
        return total;
    }
}
