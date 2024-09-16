package curso_gustavo_guanabara.aula14;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistidos;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistidos = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistidos() {
        return totAssistidos;
    }

    public void setTotAssistidos(int totAssistidos) {
        this.totAssistidos = totAssistidos;
    }

    public void viuMaisUm(){
        this.totAssistidos++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistidos=" + totAssistidos +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", experiencia=" + experiencia +
                '}';
    }
}
