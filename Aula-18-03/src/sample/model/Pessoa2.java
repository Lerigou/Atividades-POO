package sample.model;

public class Pessoa2 {

    //Atriutos
    private String nome;

    //Construtor
    public Pessoa2(String nome){
        this.nome = nome;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n ↪ Nome: " + nome + " ↩";
    }

}
