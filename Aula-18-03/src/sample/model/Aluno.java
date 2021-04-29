package sample.model;

public class Aluno extends Pessoa2 {

    //Atributos
    private double n1;
    private double n2;
    private double media;

    //Construtor
    public Aluno(String nome, double n1, double n2){
        super(nome);
        this.n1 = n1;
        this.n2 = n2;
        this.media = (n1 + n2) / 2;
    }

    //Getters and setters
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return  "＼(￣▽￣)／ Aluno ＼(￣▽￣)／ \n" + super.toString() +
                "\n ↪ Nota 1: " + n1  + " ↩"+
                "\n ↪ Nota 2: " + n2 + " ↩" +
                "\n ↪ Media: " + media + " ↩";
    }

}
