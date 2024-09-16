package auladevdojo.polimorfismo.test;

import auladevdojo.polimorfismo.dominio.Computador;
import auladevdojo.polimorfismo.dominio.Tomate;
import auladevdojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate ciciliano",10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
