/* 4 - Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e
utilize um loop para calcular e imprimir o preço médio dos produtos. */
package Desafio04;

public class Produto {
    //Variables
    private String nome;
    private double preco;

    //Constructor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        //Objects
        var produto01 = new Produto("Mouse", 99.99);
        var produto02 = new Produto("Teclado", 110.50);
        var produto03 = new Produto("Headset", 150.15);
    }
}