package curso_gustavo_guanabara.orientadaobjetos.orientadaobjetosv2;

public class Aula2M {
    public static void main(String[] args) {
        Microondas m1 = new Microondas();

        m1.marca = "PANASONIC";
        m1.cor = "PRATA";
        m1.modelo = "DIGITAL";
        m1.potenicia = 23.4f;

        m1.ligado();
        m1.status();
        m1.esquentar();
    }
}
