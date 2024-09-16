package auladevdojo.polimorfismo.test;

import auladevdojo.polimorfismo.repositorio.Repositorio;
import auladevdojo.polimorfismo.servico.RepositorioArquivo;
import auladevdojo.polimorfismo.servico.RepositorioBancoDeDados;
import auladevdojo.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
