package exerciciosjava;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para tabuada: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, i * numero);
        }

    }
}
