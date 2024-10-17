import Compras.CarrinhoDeCompras;
import Compras.Produto;
import Descontos.DescontoClienteNovo;
import Descontos.DescontoClienteRegular;
import Descontos.DescontoClienteVIP;

public class LojaOnline {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);
        Produto produto3 = new Produto("Tênis", 200.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para Cliente Novo: R$ " + carrinho.calcularTotalComDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para Cliente Regular: R$ " + carrinho.calcularTotalComDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para Cliente VIP: R$ " + carrinho.calcularTotalComDesconto());
    }
}
