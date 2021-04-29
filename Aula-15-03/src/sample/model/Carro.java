package sample.model;


//Final == quer dizer q eu n vou poder criar um filho de Carro;
public final class Carro extends Veiculo{

    //Atributos
    private int nPortas;

    //Construtor
    public Carro(String nome){
        super(nome);
    }

    public Carro(String nome, String desc){
        super(nome, desc);
    }

    //Getters and Setters
    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Portas: " + nPortas;
    }
}
