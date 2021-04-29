package sample.model;

public class Ingrediente {
    //atributos
    private String nome;
    private double qtde;
    private String um;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    //toString
    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                ", qtde=" + qtde +
                ", um='" + um + '\'' +
                '}';
    }
}