package aulajava;

public class AulaTesteV2 {
    public static void main(String[] args) throws InterruptedException {

        int i;

        for(i = 1  ; i <=10; i++){
            System.out.print("\r" + i);
            Thread.sleep(1000);

        }
    }
}
