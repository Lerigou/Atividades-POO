package sample.model;

public class Jogador {

    //Atributos
    private String nome;
    private boolean venceu;
    int totalPontos;

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVenceu() {
        return venceu;
    }

    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    @Override
    public String toString() {
        return "\nJogador: " +
                "\nNome: " + nome +
                "\n" + (venceu?"Ganhou o jogo" : "Perdeu o jogo") +
                "\nPontos: " + totalPontos;
    }
}
