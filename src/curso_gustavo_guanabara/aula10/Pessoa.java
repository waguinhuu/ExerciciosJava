package curso_gustavo_guanabara.aula10;

// Classe Mãe
public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;

    public void fazerAniv(){
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome ='" + nome +
                ",\n sexo =" + sexo +
                ",\n idade =" + idade +
                '}';
    }
}
