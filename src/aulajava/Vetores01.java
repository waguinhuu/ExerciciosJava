package aulajava;

public class Vetores01 {
    public static void main(String[] args) {

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun","Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31 , 30, 31};
        int ano = 2021;

        if(ano % 4 == 0){
            tot[1] = 29;
        }

        for(int i = 0; i< mes.length; i++){
            System.out.println("O mês de " + mes[i] + " tem " + tot[i] + " dias ao todo.");
        }

    }
}
