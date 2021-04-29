package sample;

import sample.model.Contato;
import sample.model.Pessoa;

public class MainPessoaContato {

    public static void main(String[] args){
        //Adiciona as informações
        Pessoa pessoa = new Pessoa("Marcia");
        pessoa.setContato("48 9586-8545",
                "marcia_ravadelli@estudante.sc.senai.br",
                "xuxu_beleza");

        //Imprime
        System.out.println(pessoa);

    }
}
