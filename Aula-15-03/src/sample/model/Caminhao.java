package sample.model;

public class Caminhao extends Veiculo{

    //Atributos
    private int nEixos;

    //Construtor
    public Caminhao(String nome) {
        super(nome);
    }

    public Caminhao(String nome, String desc){
        super(nome, desc);
    }

    //Getters e Setters
    public int getnEixos() {
        return nEixos;
    }

    public void setnEixos(int nEixos) {
        this.nEixos = nEixos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Eixos: " + nEixos;
    }
}
