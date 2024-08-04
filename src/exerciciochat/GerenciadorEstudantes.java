package exerciciochat;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstudantes {
    private List<Estudante> estudantes;

    public GerenciadorEstudantes() {
        estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public List<Estudante> listarEstudantes() {
        return estudantes;
    }

    public Estudante buscarEstudantePorId(int id) {
        for (Estudante estudante : estudantes) {
            if (estudante.getId() == id) {
                return estudante;
            }
        }
        return null; // Retorna null se o estudante não for encontrado
    }
}

