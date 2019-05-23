package exerciciofor2;

import java.util.Scanner;

public class ExercicioFor2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        
        int n = sc.nextInt();
        
        if (n % 2 == 0){
            System.out.println("PAR");
            }
        else {
            System.out.println("IMPAR");
        }
        
        
    }
    
}
