package aulajava;

public class MetodoComRetorno {
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        int somar = soma(5, 2);
        System.out.println(somar);

    }
}
