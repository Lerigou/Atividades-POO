package aaa;

import java.util.Scanner;

public class Qst2 {

    public static void main(String[] args) {

	//Pega a idade do atleta
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        double age = reader.nextDouble();
	
	//Compara e classifica a idade dele
        if (age <= 10) {
            System.out.print("Categoria: Infantil");
        } else if (age > 10 && age <= 13) {
            System.out.print("Categoria: Infanto Juvenil");
        } else if (age > 13 && age <= 17) {
            System.out.print("Categoria: Juvenil");
        } else if (age > 17) {
            System.out.print("Categoria: Adulto");
        }

    }
}
