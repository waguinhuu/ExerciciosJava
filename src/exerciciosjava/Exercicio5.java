package exerciciosjava;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0, impares = 0;
        int numero;

        for(int i=0; i<=4; i++){
            System.out.printf("%dº Número: ", i+1);
            numero = scanner.nextInt();
            if(numero % 2==0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
    }
}
