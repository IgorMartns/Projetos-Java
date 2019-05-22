package ex3;

import entities.Notas;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Notas estudante = new Notas();
        
        System.out.println("Qual seu nome? ");
        estudante.nome = sc.nextLine();
        
        System.out.println("Qual sua média no 1°Trimestre");
        estudante.Trimestre1 = sc.nextDouble();
        
        System.out.println("Qual sua média no 2°Trimestre");
        estudante.Trimestre2 = sc.nextDouble();
        
        System.out.println("Qual sua média no 3°Trimestre");
        estudante.Trimestre3 = sc.nextDouble();

        System.out.println("Final do semestre: "+estudante.finalSemestre());
       
       if (estudante.finalSemestre()< 60.0) {
            System.out.println("Reprovado!!!");
            System.out.println("Faltaram "+estudante.notaMinima()
                    +" pontos para passar de semestre");
        } else {
            System.out.println("Aprovado, parabéns!!!");
        }
        sc.close();
    }

}