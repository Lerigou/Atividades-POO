package sample;

import sample.model.Livro;

public class Main{


    public static void main(String[] args) {

	//adiciona as informações
        Livro livro = new Livro();
        livro.setTitulo("Senhor dos Anéis");
        livro.setAutor("J. R. R. Tolkien");
        livro.setEditora("HarperCollins Brasil");
        livro.setAno(2019);
        System.out.println(livro);

	//imprime 
        System.out.println("Livro " + livro.getTitulo());
        System.out.println("Senhor dos Anéis: duas torres ");
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Ano de publicação: " + livro.getAno());
    }
}
