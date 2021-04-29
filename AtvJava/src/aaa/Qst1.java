package aaa;

import java.util.Scanner;

public class Qst1 {

    public static void main(String[] args) {
    	
	// Pega a primeira nota
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        double grade1 = reader.nextDouble();
        
	// Pega a segunda nota
        System.out.print("Digite sua segunda nota: ");
        double grade2 = reader.nextDouble();
	//Média das duas notas inseridas
        double finalGrade = (grade1 + grade2) / 2;
        
	//Compara e diz se as notas são suficientes para passar de ano ou não
        if (finalGrade >= 6) {
            System.out.println("Sua nota foi: " + finalGrade + ", Passou");
        } else {
            System.out.print("Você pegou recuperação, digite sua nota: ");
            double retake = reader.nextDouble();
        
            double newFinalGrade = (retake + finalGrade) / 2;
            
            if (newFinalGrade >= 6) {
                System.out.println("Sua nota foi: " + newFinalGrade + ", Passou após recuperação");
            } else {
                System.out.println("Sua nota foi: " + finalGrade + ", Reprovou");
            }
        }
    }
}