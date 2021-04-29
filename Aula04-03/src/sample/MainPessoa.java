package sample;

import sample.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class MainPessoa {

    public static void main(String []args){

	//adiciona as informaçÕes
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Andre");
        pessoa.setDtNasceu("29/04/2007");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Pedro");
        pessoa2.setDtNasceu("10/12/1991");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Maria");
        pessoa3.setDtNasceu("26/07/2005");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        System.out.println(pessoas);

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Fernanda");
        pessoa4.setDtNasceu("05/08/2001");

        pessoas.add(pessoa4);
	
	//imprime
        System.out.println(pessoas);
    }
}

