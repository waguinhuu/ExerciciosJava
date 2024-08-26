package exerciciochat.sistema_biblioteca;

public class Pessoa {
    private String nome;
    private int idade;
    private int id;

    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "\nNome = " + nome +
                "\nIdade = " + idade +
                "\nId = " + id;
    }
}
