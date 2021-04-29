package sample.model;

public class Cliente extends Pessoa{

    //Atributos
    private String dataCadastro;

    public Cliente(String nome, String sobrenome){
        super(nome, sobrenome);
    }

    public String getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String toString(){
        return super.toString() +
                "\nData de Cadastro: " + dataCadastro;
    }

}
