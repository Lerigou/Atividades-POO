package sample;

import sample.model.Cliente;
import sample.model.Funcionario;
import sample.model.Pessoa;

public class MainPessoa {

        public static void main(String[] args) {
            Funcionario pessoa1 = new Funcionario();
            pessoa1.setNome("Pedro");
            pessoa1.setSobrenome("Silva");
            pessoa1.setEmail("pedro@silva.com");
            pessoa1.setTelefone("48 91234 0991");
            pessoa1.setFuncao("Gerente");
            pessoa1.setSalario(30, 160);
            System.out.println(pessoa1);

            Cliente pessoa2 = new Cliente("Pedro","Vilela");
            pessoa2.setEmail("pedro@vivlela.com");
            pessoa2.setDataCadastro("22/3/21");
            pessoa2.setTelefone("48 9123 9999");

            System.out.println(pessoa2);

        }
}
