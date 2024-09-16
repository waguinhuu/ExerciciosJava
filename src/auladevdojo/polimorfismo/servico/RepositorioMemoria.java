package auladevdojo.polimorfismo.servico;

import auladevdojo.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
