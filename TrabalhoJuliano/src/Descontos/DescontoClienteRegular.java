package Descontos;

public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.10; // Retorna 10% do preço como desconto
    }
}


