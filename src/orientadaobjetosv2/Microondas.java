package orientadaobjetosv2;

public class Microondas {
    String marca;
    String cor;
    float potenicia;
    String modelo;
    boolean funciona;

    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Potência: " + this.potenicia);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Está funcionado? " + this.funciona);
    }

    void esquentar() {
        if(funciona == true){
            System.out.println("Esquentando a comida.");
        }else {
            System.out.println("Não é possivel esquentar a comida.");
        }
    }
    void ligado(){
        funciona = true;
    }
    void desligado(){
        funciona = false;
    }
}
