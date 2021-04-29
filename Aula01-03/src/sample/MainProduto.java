package sample;


import sample.model.Produto;

public class MainProduto {

//Insere as informações nos setters
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Danoninho");
        produto.setPreco(1.50);

        System.out.println("produto: " + produto.getNome() + "\nPreço: " + produto.getPreco());
    }
}
