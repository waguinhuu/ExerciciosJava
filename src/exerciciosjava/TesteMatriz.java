package exerciciosjava;
import java.util.Scanner;

public class TesteMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[][] notas = new float[2][3];
        String[] alunos = new String[2];
        float[] media = new float[2];
        float[] soma = new float[2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            alunos[i] = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite a %dª nota: \n", j + 1);
                notas[i][j] = scanner.nextFloat();
                soma[i]+= notas[i][j];
            }
            scanner.nextLine();// Limpar o buffer do scanner
            media[i] = soma[i] / 3;
        }


        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.printf("%dº aluno: %s\n", i + 1, alunos[i]);

            for (int j = 0; j < 3; j++) {
                System.out.printf("%dª nota: %.1f \n", j + 1, notas[i][j]);
            }
            System.out.println("Média: " + media[i]);
        }

        scanner.close();
    }


}
