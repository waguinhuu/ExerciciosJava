package exerciciosjava;

import java.util.Scanner;

public class TesteRapido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, maior = 0;

        for(int i=0; i<3; i++){
            System.out.print("numero: ");
            numero = scanner.nextInt();
            maior = Math.max(maior, numero);

        }
        System.out.println(maior);
    }
}
