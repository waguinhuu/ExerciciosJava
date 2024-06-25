package exerciciosjava;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double preco, total, quantidade, total_a_pagar, desconto = 0;

        System.out.print("Nome do produto: ");
        nome = scanner.next();

        System.out.print("Quantidade do produto: ");
        quantidade = scanner.nextFloat();

        System.out.print("Preço do produto: ");
        preco = scanner.nextFloat();

        total = quantidade * preco;

        if(quantidade <= 5){
            total_a_pagar = total - (total * 2/100);
        } else if (quantidade <= 10) {
            total_a_pagar = total - (total * 3/100);
        } else {
            total_a_pagar = total - (total * 5/100);
        }

        System.out.println("Total pelo produto: " + total_a_pagar);


    }
}
