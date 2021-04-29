package sample.model;

public class PessoaJuridica {

    //atributos
    private String cnpj;
    private String ie;

    //construtor
    public PessoaJuridica(String cnpj, String ie){
        this.ie = ie;
        this.cnpj = cnpj;
    }

    //getters and setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return "\n〜(>.<)〜 PessoaJuridica 〜(>.<)〜" +
                "\ncnpj: " + cnpj +
                "\nie: " + ie;
    }
}
