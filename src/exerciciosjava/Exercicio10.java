package exerciciosjava;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantidadeDeMaca, quantidadeDeMorango, precoMaca = 0, precoMorango = 0, precoTotal, quantidadeTotalDefrutas;
        double desconto;

        System.out.print("Quantidade de maça (KG): ");
        quantidadeDeMaca = scanner.nextFloat();

        System.out.print("Quantidade de morango (KG): ");
        quantidadeDeMorango = scanner.nextFloat();

        quantidadeTotalDefrutas = quantidadeDeMaca + quantidadeDeMorango;

        if(quantidadeDeMaca > 5){
            precoMaca = 1.50;
        } else if (quantidadeDeMorango > 5) {
            precoMorango = 2.20;
        }else{
            precoMaca = 1.80;
            precoMorango = 2.50;
        }
        precoTotal = quantidadeTotalDefrutas * (precoMaca + precoMorango);

        if(quantidadeTotalDefrutas > 8 || precoTotal > 25){
            desconto = precoTotal - (precoTotal * 10/100);
        }

        System.out.printf("Preço total: %.2f", precoTotal);




    }
}
