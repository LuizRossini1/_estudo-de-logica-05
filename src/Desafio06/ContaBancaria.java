/* 6 - Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de
contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo. */
package Desafio06;

public class ContaBancaria {
    //variables
    private int numeroDaConta;
    private int saldo;

    //constructor
    public ContaBancaria(int numeroDaConta, int saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    //getters
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {

    }
}