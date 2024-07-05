package aula07;

import java.io.PipedWriter;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        LivroP[] l = new LivroP[2];

        p[0] = new Pessoa(19, "Wagner", "Masculino");
        p[1] = new Pessoa(14, "Maria", "Feminino");

        l[0] = new LivroP("Harry Potter", "J.K", 300, p[0]);
        l[1] = new LivroP("HP, Pedra filosofal", "J.K", 350,p[1]);

        l[0].abrir();
        l[0].folhear(29);
        l[0].avancarPag();
        l[0].voltarPag();
        l[0].fechar();
        System.out.println(l[0].detalhes());
    }

}
