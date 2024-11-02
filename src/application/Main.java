package application;

import entities.StringManipulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Iniciando o Scanner
        Scanner sc = new Scanner(System.in);

        //Solicitando dados ao usuário
        System.out.print("Digite a frase: ");

        //Armazenando os dados em uma variável do tipo String
        String phrase = sc.nextLine();

        //Armazenando o número de vogais em uma varívael utilizando função da classe String manipulator
        int vowels = StringManipulator.countVowels(phrase);

        //Imprimindo o resultado na tela
        System.out.println("Número de vogais na frase: "+ vowels);

        sc.close();


    }
}