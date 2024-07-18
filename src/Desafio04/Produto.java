/* 4 - Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e
utilize um loop para calcular e imprimir o preço médio dos produtos. */
package Desafio04;
import java.util.ArrayList;

public class Produto {
    //variables
    private String nome;
    private double preco;

    //constructor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        //objects
        var produto01 = new Produto("Mouse", 159.99);
        var produto02 = new Produto("Teclado", 130.50);
        var produto03 = new Produto("Headset", 199.99);

        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(produto01);
        lista.add(produto02);
        lista.add(produto03);

        //loop to add prices
        double somaPreco = 0;
        for (Produto produto : lista) {
            somaPreco += produto.getPreco();
        }

        //calculate average prices
        double precoMedio = somaPreco / lista.size();

        System.out.println(precoMedio);
    }
}