package aulajava;

import java.util.Scanner;

public class AulaTeste {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       /*System.out.print("Digite sua nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua nota: ");
        float nota = scanner.nextFloat();*/

        double ale = Math.random();
        int n = (int)(15 + ale * (50 - 15));
        System.out.println(n);
    }
}
