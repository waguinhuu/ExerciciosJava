package curso_gustavo_guanabara.aula11;

public class Tecnico  extends Aluno {
    private int registroProfissional;

    public void praticar(){
        System.out.println(getNome() + " esta praticando...");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
