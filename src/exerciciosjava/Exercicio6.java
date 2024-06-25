package exerciciosjava;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota, media = 0;
        int i;
        float soma = 0;

        for(i=0; i<4; i++){
            System.out.printf("%dª Nota: ", i+1);
            nota = scanner.nextFloat();
            soma+=nota;
        }
        media = soma / i;
        System.out.printf("Média: %.1f", media);
    }
}
