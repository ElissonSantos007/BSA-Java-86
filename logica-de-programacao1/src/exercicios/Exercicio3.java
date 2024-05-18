package exercicios;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celsius: ");

        double Celsius;

        Celsius = sc.nextDouble();

        double Fahrenheit = (Celsius * 9/5) + 32;
        double Kelvin = (Celsius + 273.15);
        double Reaumur = (Celsius / 1.25);
        double Rankine = (Celsius * 9/5) + 491.67;

        System.out.printf("Temperatura em Celsius: %.1fº%n", Celsius);
        System.out.printf("Temperatura em Fahrenheit: %.1fº%n", Fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.1fº%n", Kelvin);
        System.out.printf("Temperatura em Reaumur: %.1fº%n", Reaumur);
        System.out.printf("Temperatura em Rankine: %.1fº%n", Rankine);


        sc.close();

    }
}
