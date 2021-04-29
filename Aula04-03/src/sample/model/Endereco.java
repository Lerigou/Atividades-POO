package sample.model;

public class Endereco {

    //Atributos
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    //Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //toString
    @Override
    public String toString() {
        return "Endereco: \n" +
                "rua:'" + rua + '\'' +
                ", numero:" + numero +
                ", bairro:'" + bairro + '\'' +
                ", cidade:'" + cidade + '\'' +
                ';';
    }
}
