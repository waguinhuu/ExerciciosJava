package curso_gustavo_guanabara.aula07;

public class Funcionario {
    private String funcionario;
    private float salarioFuncionario;
    private String cargoFuncionario;


    public Funcionario(String fun, float sal, String car) { // metodo construtor
        this.funcionario = fun;
        this.salarioFuncionario = sal;
        this.cargoFuncionario = car;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String fun) {
        this.funcionario = fun;
    }

    public float getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(float salarioFuncionario) {
        if(this.getSalarioFuncionario() > 0){
            this.salarioFuncionario = salarioFuncionario;
        }
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String car) {
        this.cargoFuncionario = car;
    }

    public void mostrarStatus(){
        if(this.getSalarioFuncionario() > 0) {
            System.out.println("Nome: " + getFuncionario());
            System.out.println("Cargo: " + getCargoFuncionario());
            System.out.println("Salario: " + getSalarioFuncionario());
        }else{
            System.out.println("Erro! Salario negativo.");
        }

    }
    public void aumentoSalario(int porcentagem){
        if(porcentagem > 0){
            float aumentoSalario = this.getSalarioFuncionario() + (this.getSalarioFuncionario() * porcentagem / 100);
            this.setSalarioFuncionario(aumentoSalario);
        }else{
            System.out.println("Erro! Porcentagem tem que ser maior que 0.");
        }
    }
}
