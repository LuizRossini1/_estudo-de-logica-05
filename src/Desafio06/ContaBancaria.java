/* 6 - Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de
contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo. */
package Desafio06;
import java.util.ArrayList;

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
        var conta1 = new ContaBancaria(123, 2100);
        var conta2 = new ContaBancaria(456, 1600);
        var conta3 = new ContaBancaria(789, 1389);

        ArrayList<ContaBancaria> lista = new ArrayList<>();
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);

        ContaBancaria contaComMaiorSaldo = null;
        double maiorSaldo = Double.NEGATIVE_INFINITY;
        for (ContaBancaria contaBancaria : lista) {
            if (contaBancaria.getSaldo() > maiorSaldo) {
                maiorSaldo = contaBancaria.getSaldo();
                contaComMaiorSaldo = contaBancaria;
            }
        }

        System.out.println(contaComMaiorSaldo.getNumeroDaConta());
    }
}