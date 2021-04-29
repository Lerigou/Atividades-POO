package sample.model;

public class Pessoa {

    //atributos
    private String nome;
    private String dtNasceu;
    private Endereco endereco;

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasceu() {
        return dtNasceu;
    }

    public void setDtNasceu(String dtNasceu) {
        this.dtNasceu = dtNasceu;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    //toString
    @Override
    public String toString() {
        return "Pessoa: \n" +
                "nome:'" + nome + '\'' +
                ", data de nascimento:'" + dtNasceu + '\'' +
                '.';
    }
}
