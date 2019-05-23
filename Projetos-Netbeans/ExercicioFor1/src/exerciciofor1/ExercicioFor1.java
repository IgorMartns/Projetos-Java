package exerciciofor1;

import java.util.Scanner;

public class ExercicioFor1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        
        for (int i = 1; i <= x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        
        
    }
}