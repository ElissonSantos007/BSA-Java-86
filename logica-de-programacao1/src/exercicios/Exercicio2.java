package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {


    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double pi = 3.1415;
        double raio;
        double area_circulo;

        System.out.print("Por favor escreva a medida do raio: ");
        raio = sc.nextDouble();

        area_circulo = pi * (raio * raio);

        System.out.printf("A área do círculo é: %.2f", area_circulo);

        sc.close();

    }
}
