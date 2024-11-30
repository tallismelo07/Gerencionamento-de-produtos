package GerencionamentoDeProdutos;

import GerencionamentoDeProdutos.Classes.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        byte numerosDeProdutos = sc.nextByte();
        List<Produto> listaDeProduto = new ArrayList<>();
        Produto produto = new Produto();
        for (int i = 0; i < numerosDeProdutos; i++) {
            System.out.println("------- CONFIGURANDO ESTOQUE --------");
            System.out.print("Nome Produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Quantidade do Produto: ");
            int quantidadeProduto = sc.nextInt();
            System.out.print("Preço dos Produtos: ");
            double precoProduto = sc.nextDouble();

            listaDeProduto.add(new Produto(nomeProduto, quantidadeProduto, precoProduto));
        }


        System.out.println("\n----- PRODUTOS ESTOQUE --------");
        double valorEmEstoque = 0.0;
        for (Produto calculos : listaDeProduto){
            System.out.println(calculos.toString());
            valorEmEstoque += calculos.calcularValorTotal();
        }

        System.out.println("\n-----  TOTAL VALOR ------");
        System.out.printf("Valor Total do Estoque R$ %.2f%n", valorEmEstoque);

    }
}
