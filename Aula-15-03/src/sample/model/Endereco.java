package sample.model;

public class Endereco {

    //atributos
    private String rua;
    private int numero;
    private String bairro;
    private String cep;

    //getters and setters
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "\n〜(>.<)〜 Endereco 〜(>.<)〜" +
                "\nRua: " + rua+
                "\nNumero: " + numero +
                "\nBairro: " + bairro +
                "\nCep: " + cep;
    }
}
