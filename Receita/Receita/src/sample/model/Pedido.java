package sample.model;

import javax.xml.crypto.Data;

public class Pedido {

    private String descricao;
    private String date;
    private double total;
    private ItensDoPedido itens;

    public Pedido(){
        itens = new ItensDoPedido();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void addProduto(String nomeProduto, double valor){
        itens.setProduto(nomeProduto, valor);
        total += valor;
    }

    public String toString(){
        return "Pedido: \n" +
                 descricao + "\n" +
                "Data: " + date +
                "\n" + itens +
                "Total: " + total;
    }

}
