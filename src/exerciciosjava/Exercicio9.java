package exerciciosjava;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorA, valorB, resultado = 0;
        String operador;

        System.out.print("Valor A: ");
        valorA = scanner.nextInt();
        
        System.out.print("Valor B: ");
        valorB = scanner.nextInt();

        System.out.print("Digite o operador desejado: ");
        operador = scanner.next();
        
        switch (operador){
            case "+":
                resultado = valorA + valorB;
                break;
            case "-":
                resultado = valorA - valorB;
                break;
            case "*":
                resultado = valorA * valorB;
                break;
            case "/":
                resultado = valorA / valorB;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Resultado: " + resultado);
    }
}
