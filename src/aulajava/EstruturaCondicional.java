package aulajava;

public class EstruturaCondicional {
    public static void main(String[] args) {
        /*int n1, n2;
        String r;
        n1 = 14;
        n2 = 8;

        r = ((n1>n2)?"MEnor":"Maior");
        System.out.println(r);*/
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome2.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);
    }
}
