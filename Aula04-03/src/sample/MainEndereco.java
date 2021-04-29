package sample;

import sample.model.Endereco;

public class MainEndereco {

    public static void main(String[] args) {

	//adiciona as informações
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das margaridas");
        endereco.setNumero(109);
        endereco.setBairro("Centro");
        endereco.setCidade("Florianópolis");

        System.out.println(endereco);
    }
}
