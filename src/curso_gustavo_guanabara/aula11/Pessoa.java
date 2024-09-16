package curso_gustavo_guanabara.aula11;

public abstract class  Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;

    public void fazerAniv(){
        this.idade++;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome = " + nome +
                ", \nidade = " + idade +
                ", \nsexo = " + sexo +
                '}';
    }
}
