package aulajava;

import java.util.Arrays;

public class Vetores04 {
    public static void main(String[] args) {
        int num[] = new int[20];
        Arrays.fill(num, 0);
        for(int valor:num){
            System.out.print(valor + " ");
        }
    }
}