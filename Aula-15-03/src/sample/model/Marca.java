package sample.model;

public class Marca {

    //Atributos
    private String nome;
    private String desc;

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "\nMarca: " + nome + "\nDescrição: " +
                (desc == null ? " Descrição inexistente" : desc);
    }
}
