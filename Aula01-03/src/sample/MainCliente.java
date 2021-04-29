package sample;

import sample.model.Cliente;

public class MainCliente {

    public static void main(String[] args) {
	
	//Insere as informações nos setters
        Cliente cliente = new Cliente();
        cliente.setNome("Marcia");
        cliente.setIdade(17);
        cliente.setEmail("marcia_ravadelli@estudante.sc.senai.br");
        cliente.setTelefone("(48) 9 9999-9999");

        System.out.println("Nome: " + cliente.getNome() + "\nIdade: " + cliente.getIdade()
                + "\nEmail: " + cliente.getEmail() + "\nTelefone: " + cliente.getTelefone());
    }
}
