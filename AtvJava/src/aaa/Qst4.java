package aaa;

import java.util.Scanner;

public class Qst4 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o preço do item: ");
        int price = reader.nextInt();

        System.out.print("Digite a classificação: ");
        char abcd = reader.next().charAt(0);

        double off = 0;

        switch (abcd) {
            case 'a':
                off = 0.10;
                break;
            case 'b':
                off = 0.15;
                break;
            case 'c':
                off = 0.20;
                break;
            case 'd':
                off = 1.05;
                break;
        }

        double fullPrice = 0;

        if (off < 1) {
            fullPrice = price - (price * off);
            System.out.println("Preço final: " + fullPrice + ", ouve um desconto de " + off * 100 + "%");
        } else {
            fullPrice = price * off;
            System.out.println("Preço final: " + fullPrice + ", ouve um acressimo " + (off - 1) * 100 + "%");
        }

    }
}
