package exerciciosjava;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        for(int i=0; i<=4; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            numero = scanner.nextInt();
            soma+=numero;
        }
        System.out.print("Soma dos numeros: " + soma);
    }
}
