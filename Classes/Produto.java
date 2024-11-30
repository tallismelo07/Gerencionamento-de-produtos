package GerencionamentoDeProdutos.Classes;

import GerencionamentoDeProdutos.ClasseMae.ItensEstoque;

public class Produto implements ItensEstoque {
    public String name;
    public int quantity;
    public double precoUtilitario;

    public Produto() {

    }

    public Produto(String name, int quantity, double precoUtilitario) {
        this.name = name;
        this.quantity = quantity;
        this.precoUtilitario = precoUtilitario;
    }

    public double getPrecoUtilitario() {
        return precoUtilitario;
    }

    @Override
    public void getNome() {
        this.name += name;
    }

    @Override
    public double calcularValorTotal() {
       return this.getPrecoUtilitario() * quantity;
    }

    public String toString() {
        return name + " - Quantidade: " + quantity + ", Valor Total: R$ " + calcularValorTotal();
    }
}
