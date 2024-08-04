package exerciciochat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorEstudantes gerenciador = new GerenciadorEstudantes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Estudante");
            System.out.println("2. Listar Estudantes");
            System.out.println("3. Buscar Estudante por ID");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do estudante: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    System.out.print("Digite o nome do estudante: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade do estudante: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    Estudante estudante = new Estudante(id, nome, idade);
                    gerenciador.adicionarEstudante(estudante);
                    System.out.println("Estudante adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de Estudantes:");
                    for (Estudante e : gerenciador.listarEstudantes()) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do estudante que deseja buscar: ");
                    int buscaId = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    Estudante estudanteEncontrado = gerenciador.buscarEstudantePorId(buscaId);
                    if (estudanteEncontrado != null) {
                        System.out.println("Estudante encontrado: " + estudanteEncontrado);
                    } else {
                        System.out.println("Estudante não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}

