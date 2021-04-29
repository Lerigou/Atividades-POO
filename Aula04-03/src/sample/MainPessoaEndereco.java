package sample;

import sample.model.Endereco;
import sample.model.Pessoa;

public class MainPessoaEndereco {

    public static void main(String[] args) {

	//adiciona as informações
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setDtNasceu("12/4/2001");

        Endereco endereco = new Endereco();
        endereco.setRua("Sete de setembro");
        endereco.setNumero(109);
        endereco.setBairro("Centro");
        endereco.setCidade("Florianópolis");
        System.out.println(endereco);

        pessoa.setEndereco(endereco);

	//imprime
        System.out.println(pessoa);
    }
}
