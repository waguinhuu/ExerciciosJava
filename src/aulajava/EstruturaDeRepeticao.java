package aulajava;
import java.util.Scanner;
public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Digite um numero: ");
            n = input.nextInt();
            s+=n;

            System.out.print("Deseja continuar? [S/N]");
            resp = input.next();
        }while (resp.equals("S"));
        System.out.println("Soma: " + s);
    }

}
