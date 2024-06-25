package exerciciosjava;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, estdadoCivil, sexo;
        int tempoDeCasamento = 0;

        System.out.print("Nome: ");
        nome = scanner.next();

        System.out.print("Sexo (F/M): ");
        sexo = scanner.next().toLowerCase();  // Convertendo para minúsculas para evitar problemas de case sensitivity;

        System.out.print("Estado Cívil: ");
        estdadoCivil = scanner.next().toLowerCase();  // Convertendo para minúsculas para evitar problemas de case sensitivity;

        if(sexo.equals("f") && estdadoCivil.equals("casada")){
            System.out.print("Tempo de casamento (Anos): ");
            tempoDeCasamento = scanner.nextInt();
            
        }

        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Cívil: " + estdadoCivil);

        if(sexo.equals("f") && estdadoCivil.equals("casada")){
            System.out.printf("Tempo de casamento: %s Anos", tempoDeCasamento);
            

        }
    }
}
