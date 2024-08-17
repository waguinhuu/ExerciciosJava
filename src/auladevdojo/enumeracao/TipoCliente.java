package auladevdojo.enumeracao;

public enum TipoCliente {
    FISICA(1,"Pessoa Física"),
    JURIDICA(2,"Pessoa Jurídica");

    private int codigo;
    private String nomeRelatorio;

    private TipoCliente(int codigo, String nomeRelatorio) {
        this.codigo = codigo;
        this.nomeRelatorio = nomeRelatorio;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }


}
