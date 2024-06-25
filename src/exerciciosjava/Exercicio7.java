package exerciciosjava;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float soma = 0, media = 0;
        float nota;
        String condicao;

        for(int i=0; i<3; i++){
            System.out.printf("%dª Nota: ",i+1);
            nota = scanner.nextFloat();
            soma+=nota;
        }
        media = soma / 3;
        if(media >= 7){
            condicao = "Aprovado";
        } else if (media >=4){
            condicao = "Recuperação";
        }else {
            condicao = "Reprovado";
        }
        System.out.println("Média: " + media);
        System.out.println(condicao);
    }
}
