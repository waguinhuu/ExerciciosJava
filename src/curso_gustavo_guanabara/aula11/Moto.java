package curso_gustavo_guanabara.aula11;

public class Moto extends Veiculo {
    private int cilindradas;
    private int marcha;

    @Override
    public void exibirInfo() {
        System.out.println("MOTO");
        super.exibirInfo();
        System.out.println("Cilindradas: " + getCilindradas());
    }

    public void passarMarcha(){
        if(this.marcha < 5){
            this.marcha++;
            System.out.println("Marcha: " + getMarcha());
        }else {
            System.out.println("A moto já está na marcha máxima");
        }


    }
    public void reduzirMarcha(){
        if(this.marcha > 0){
            this.marcha--;
            System.out.println("Marcha: " + getMarcha());
        }else {
            System.out.println("A marcha já está na marcha mínima");
        }
    }
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.setMarcha(0);
    }


    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;

    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
