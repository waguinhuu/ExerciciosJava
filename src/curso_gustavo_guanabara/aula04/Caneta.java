package curso_gustavo_guanabara.aula04;

public class Caneta {
   private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, float p, String c) { // metodo construtor
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }


    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void tampar(){
        this.tampada = true;
    }
    public  void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getCor());
        System.out.println("Cor: " + this.getPonta());
        System.out.println("Tampada: " + this.tampada);
    }
}
