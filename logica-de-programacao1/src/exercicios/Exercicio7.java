package exercicios;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        String aluno_nome = "Silvio";
        int RA = 1441417;
        double nota1 = 6;
        double nota2 = 7;
        double nota3 = 5;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Querido Aluno " + aluno_nome + " do RA: " + RA + " sua média foi igual a: " + media + ". Obrigado pela atenção!");
    }
}
