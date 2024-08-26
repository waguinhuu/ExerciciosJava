package exerciciochat.gerenciamento_funcionario;

public enum Cargo {
    DESENVOLVEDOR("Desenvolvedor"),
    GERENTE("Gerente"),
    ANALISTA("Analista");

    String texto;

    Cargo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
