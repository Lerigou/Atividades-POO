package sample.model;

public abstract class Veiculo {

    private String nome;
    private Marca marca;
    private String desc;

    //Construtor da classe
    public Veiculo(String nome){
        this.nome = nome;
    }

    public Veiculo(String nome, String desc){
        this.nome = nome;
        this.desc = desc;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(String nome, String desc) {
        Marca marca = new Marca();
        marca.setNome(nome);
        marca.setDesc(desc);
        this.marca = marca;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return   "Veiculo: " + nome + marca + "\nDescrição do automóvel: " + ((desc == null) ? "Descrição inexistente" : desc);
    }
}
