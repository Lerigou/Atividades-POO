package sample;

import sample.model.Endereco;
import sample.model.Pessoa;
import sample.model.PessoaFisica;
import sample.model.PessoaJuridica;

public class MainPessoa {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Av. Rio Branco");
        endereco.setNumero(344);
        endereco.setBairro("Centro");
        endereco.setCep("88912-010");
        System.out.println(endereco);

        PessoaFisica pessoa2 = new PessoaFisica("Sofia", endereco);
        pessoa2.setRg("123132131");
        pessoa2.setCpf("13123123");
        System.out.println(pessoa2);

        PessoaJuridica juridica = new PessoaJuridica("n sei o q colocar aqui", "nem aqui");
        System.out.println(juridica);

    }
}
