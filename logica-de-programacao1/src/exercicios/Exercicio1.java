package exercicios;

import java.sql.SQLOutput;

public class Exercicio1 {

    public static void main(String[]args){

        String gameRPG = "Hogwarts Legacy";
        String gameIndie = "Hollow Knight";

        int idade = 35;
        int codigo = 2367;
        char genero = 'M';

        double precoRPG = 107.80;
        double precoIndie = 46.99;

        double media;

        media = (precoRPG + precoIndie) / 2;

        System.out.println("Média de valor: R$ " + media);
        System.out.println("Média de valor arredondado: R$ " + (float) media);
        System.out.println("Média de valor no padrão amaericano: R$ " + media);

        System.out.printf("O comprador tinha %d anos, código %d e gênero: %s%n", idade, codigo, genero);

        System.out.println("Média de valor no padrão americano: R$ " + media);

        System.out.printf("A média de preço dos produtos é igual a %.2f", media);


    }
}
