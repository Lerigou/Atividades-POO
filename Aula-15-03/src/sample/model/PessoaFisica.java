package sample.model;

public class PessoaFisica extends Pessoa{

    //atributos
    private String cpf;
    private String rg;

    //construtor
    public PessoaFisica(String nome){
        super(nome);
    }

    public PessoaFisica(String nome, Endereco endereco){
        super(nome, endereco);
    }

    //Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "\n〜(>.<)〜 PessoaFisica 〜(>.<)〜" +
                "\nCPF: " + cpf +
                "\nRG: " + rg;
    }
}
