package exerciciosjava;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero[] = new int[2], soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, produto = 1;
        double media = 0;

        for(int i=0; i<2; i++){
            System.out.printf("%dº Número: ", i+1);
            numero[i] = scanner.nextInt();
            soma+=numero[i];
            produto*=numero[i];
            maior = Math.max(maior, numero[i]);
            menor = Math.min(menor, numero[i]);

        }
        media = soma / 2;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Produto: " + produto);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);


    }
}