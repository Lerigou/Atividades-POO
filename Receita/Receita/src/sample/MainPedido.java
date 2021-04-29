package sample;

import sample.model.ItensDoPedido;
import sample.model.Pedido;

public class MainPedido {

    public static void main(String[] args) {
        //Adiciona as informações
        Pedido pedido = new Pedido();
        pedido.setDescricao("Comida");
        pedido.setDate("11/11/2011");
        pedido.addProduto("Lasanha", 5.50);
        pedido.addProduto("Suco de laranja", 2.50);
    
        //Imprime
        System.out.println(pedido);

    }
}
