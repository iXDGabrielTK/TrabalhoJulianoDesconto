package Descontos;

public class DescontoClienteVIP implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.20; // Retorna 20% do preço como desconto
    }
}


