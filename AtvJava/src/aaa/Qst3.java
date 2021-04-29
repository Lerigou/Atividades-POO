package aaa;

import java.util.Scanner;

public class Qst3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o código do item: ");
        int item = reader.nextInt();

        System.out.print("Digite a quantidade: ");
        double qnt = reader.nextDouble();

        double price = 0;

        switch (item) {
            case 1:
                price = 4;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 5;
                break;
            case 4:
                price = 2;
                break;
            case 5:
                price = 1.50;
                break;
        }

        double total = price * qnt;
        
        System.out.println("Preço total: " + total);

    }

}
