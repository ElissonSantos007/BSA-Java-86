package exercicios;
import java.util.Scanner;

public class Exercicio4 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        double diaria_aluguel = 86.75;
        double preco_km = 1.23;
        int total_dias;
        double total_km;

        System.out.print("Digite o total de dias que você ficou com o carro: ");

        total_dias = sc.nextInt();

        System.out.print("Digite o total de quilômetros que você percorreu: ");

        total_km = sc.nextDouble();

        System.out.println("O total de dias que o carro ficou alugado foi: " + total_dias);
        System.out.println("O total de quilômetros rodados foi: " + total_km);
        System.out.println("O total de diárias a se pagar é: " + total_dias * diaria_aluguel);
        System.out.println("O total de quilômetros a serem pagos é de: " + preco_km * total_km);

    }
}
