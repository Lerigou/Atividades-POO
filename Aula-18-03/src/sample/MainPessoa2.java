package sample;

import sample.model.Aluno;
import sample.model.Pessoa2;
import sample.model.Professor;

public class MainPessoa2 {

    public static void main(String[] args) {

        Pessoa2 pessoa2 = new Pessoa2("Marcia");

        Aluno aluno = new Aluno("Marcia", 7.5, 10.0);
        aluno.getMedia();
        System.out.println(aluno);

        Professor professor = new Professor("Marcia", 8, 15);
        professor.getSalario();
        System.out.println(professor);

    }
}
