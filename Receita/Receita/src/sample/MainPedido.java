package sample;

import sample.model.ItensDoPedido;
import sample.model.Pedido;

public class MainPedido {

    public static void main(String[] args) {
//        ItensDoPedido itensDoPedido = new ItensDoPedido();
//
//        itensDoPedido.setProduto("uva", 1.50);
//        System.out.println(itensDoPedido);

        Pedido pedido = new Pedido();
        pedido.setDescricao("Comida");
        pedido.setDate("11/11/2011");
        pedido.addProduto("Lasanha", 5.50);
        pedido.addProduto("Suco de laranja", 2.50);

        System.out.println(pedido);

    }
}
