package exerciciosjava;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Não pode votar.");
        } else if (idade < 18) {
            System.out.println("Voto opcional.");
        } else if (idade < 65) {
            System.out.println("Voto obrigátorio");
        }else {
            System.out.println("Voto não obrigatório.");
        }
    }
}
