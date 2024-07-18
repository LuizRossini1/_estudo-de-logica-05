/* 5 - Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por
exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop
para calcular e imprimir a área de cada forma. */
package Desafio05;
import java.util.ArrayList;

public class Circulo implements Forma {
    //variables
    private double raio;

    //constructor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //getter
    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        var circulo1 = new Circulo(5);
        var circulo2 = new Circulo(10);
        var circulo3 = new Circulo(20);

        ArrayList<Circulo> lista = new ArrayList<>();
        lista.add(circulo1);
        lista.add(circulo2);
        lista.add(circulo3);

        for (Circulo circulo : lista) {
            System.out.println(circulo.calcularArea());
        }
    }
}