package aulajava;

import java.util.Arrays;

public class Vetores03 {
    public static void main(String[] args) {
        int vet[] = {3, 4, 6, 1, 9, 4, 2};
        int p = Arrays.binarySearch(vet, 1);
        System.out.print("Valor na posição " + p );
    }
}
