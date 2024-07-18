package Desafio05;
import java.util.ArrayList;

public class Quadrado implements Forma {
    //variables
    private int base;
    private int altura;

    //constructor
    public Quadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //getters
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public static void main(String[] args) {
        var quadrado1 = new Quadrado(5, 5);
        var quadrado2 = new Quadrado(10, 10);
        var quadrado3 = new Quadrado(20, 20);

        ArrayList<Quadrado> lista = new ArrayList<>();
        lista.add(quadrado1);
        lista.add(quadrado2);
        lista.add(quadrado3);

        for (Quadrado quadrado : lista) {
            System.out.println(quadrado.calcularArea());
        }
    }
}