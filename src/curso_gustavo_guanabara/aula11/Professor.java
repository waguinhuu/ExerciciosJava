package curso_gustavo_guanabara.aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(int porcentual){
        float aumento = this.getSalario() + (this.getSalario() *  porcentual / 100);
        this.setSalario(aumento);
        System.out.println("Com o aumento de " + porcentual + "%, o salário passou a ser " + getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
