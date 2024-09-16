package curso_gustavo_guanabara.aula07;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade++;
    }

    public Pessoa(int idade, String nome, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
