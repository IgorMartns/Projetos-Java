package exerciciowhile1;

import java.util.Scanner;

public class ExercicioWhile1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Password: ");
        
        int p = sc.nextInt();
        
        while (p != 2002){
            System.out.println("Acesso negado!");
            
            p = sc.nextInt();
        }
        if (p == 2002){
        System.out.println("Acesso Permitido!");
        }
        
        sc.close();
    }
    
}
