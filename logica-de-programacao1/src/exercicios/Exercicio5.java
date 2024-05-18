package exercicios;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio5 {

    public static void main(String[]args){

        int ano_nascimento;
        int ano_atual;
        int idade;

        Scanner sc = new Scanner(System. in);
        LocalDate data = LocalDate.now();

        System.out.println("Digite o seu ano de nascimento: ");

        ano_nascimento = sc.nextInt();

        ano_atual = LocalDate.now().getYear();

        idade = ano_atual - ano_nascimento;

        System.out.println("A idade da pessoa é: " + idade);
    }
}
