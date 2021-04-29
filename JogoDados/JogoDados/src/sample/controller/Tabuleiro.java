package sample.controller;

import sample.model.Dado;
import sample.model.Jogador;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    //Atributos
    List<Jogador> jogadores;


    public Tabuleiro(List<String> nomesJogadores){

        jogadores = new ArrayList<>();

        for (int i = 0; i < nomesJogadores.size(); i++){
        Jogador jogador = new Jogador();
            jogador.setNome(nomesJogadores.get(i));

            jogadores.add(jogador);
        }
    }

    //iniciar rodada
    public void jogar(){
        for(int i = 0; i < jogadores.size(); i++){

            //Para cada jogador cria-se 2 dados
            Dado dado1 = new Dado();
            Dado dado2 = new Dado();
            dado1.lancar();
            dado2.lancar();
            //calcular total dos valores da face e salvar em jogador
            jogadores.get(i).setTotalPontos(dado1.getFace() + dado2.getFace());
            //boolean venceu = jogadores.get(i).getTotalPontos() == 7;
            jogadores.get(i).setVenceu(jogadores.get(i).getTotalPontos() == 7);
        }
    }

    //imprimir
    public String toString(){
        return jogadores.toString();
    }
}
