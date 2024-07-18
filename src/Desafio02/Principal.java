/* 3 - Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir
que o objeto seja do tipo correto antes de fazer o casting. */
package Desafio02;

public class Principal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();

        if (meuCachorro instanceof Cachorro) {
            System.out.println("É um cachorro");
            Animal novoAnimal = (Animal) meuCachorro;
        } else {
            System.out.println("Não é um cachorro");
        }
    }
}