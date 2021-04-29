package sample;

import sample.model.Caminhao;
import sample.model.Carro;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Fiesta");
        carro.setMarca("Ford", "vrum");
        carro.setnPortas(4);

        System.out.println(carro + "\n");

        Carro carro2 = new Carro("Palio");
        carro2.setMarca("Fiat", " Vrum vrum");
        carro2.setnPortas(4);

        System.out.println(carro2 + "\n");

        Caminhao caminhao = new Caminhao("S460");
        caminhao.setMarca("Scania", "Vrum vrum vrum");
        caminhao.setDesc("Esse caminhão tem descrição");
        caminhao.setnEixos(6);

        System.out.println(caminhao);
    }
}
