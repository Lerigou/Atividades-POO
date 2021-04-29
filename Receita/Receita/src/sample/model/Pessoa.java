package sample.model;

public class Pessoa {

    private String nome;
    private Contato contato;

    public Pessoa(String nome) {
        this.nome = nome;
        contato = new Contato();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(String wpp, String email, String twitter) {
        contato.setWpp(wpp);
        contato.setTwitter(twitter);
        contato.setEmail(email);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", \n" + contato;
    }
}
