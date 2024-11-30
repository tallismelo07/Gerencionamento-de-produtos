package GerencionamentoDeProdutos.Classes;

import GerencionamentoDeProdutos.ClasseMae.ItensEstoque;

public class Produto implements ItensEstoque {
    public String name;
    public Integer quantity;
    public Double precoUtilitario;

    public Double getPrecoUtilitario() {
        return precoUtilitario;
    }

    @Override
    public void getNome() {
        this.name += name;
    }

    @Override
    public double calcularValorTotal(double valor) {
        return this.getPrecoUtilitario() + valor;
    }
}
