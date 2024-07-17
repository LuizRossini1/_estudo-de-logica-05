/* Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista. */
package Desafio01;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Principal> lista = new ArrayList<>();

        var objeto01 = new Principal();
        var objeto02 = new Principal();
        var objeto03 = new Principal();

        lista.add(objeto01);
        lista.add(objeto02);
        lista.add(objeto03);

        for (Principal index: lista) {
            System.out.println(index);
        }

    }
}