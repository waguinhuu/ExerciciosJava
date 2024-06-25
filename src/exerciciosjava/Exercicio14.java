package exerciciosjava;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        System.out.print("Usuario: ");
        usuario = scanner.next().toLowerCase();

        System.out.print("Senha: ");
        senha = scanner.next();

        if (usuario.equals("wagner") && senha.equals("123")){
            System.out.println("Bem vindo!");

        }else {
            System.out.println("Erro!");
        }
    }
}
