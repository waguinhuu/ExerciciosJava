package auladevdojo.polimorfismo.test;

import auladevdojo.polimorfismo.dominio.Computador;
import auladevdojo.polimorfismo.dominio.Produto;
import auladevdojo.polimorfismo.dominio.Tomate;
import auladevdojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate ciciliano",10);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);


    }
}
