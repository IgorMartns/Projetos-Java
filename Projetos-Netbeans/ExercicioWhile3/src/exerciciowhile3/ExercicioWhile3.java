package exerciciowhile3;

import java.util.Scanner;

public class ExercicioWhile3 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;  
        int disel = 0;
        
        int tipo = sc.nextInt();
        
        while(tipo != 4){
            if(tipo == 1){
                alcool = alcool + 1;
            }
            else if (tipo == 2){
                gasolina = gasolina + 1;
            }
            else if (tipo == 3){
                disel = disel + 1;
            }
            tipo = sc.nextInt();
        }
        
        System.out.println("Muito obrigado!");
        System.out.println("Álcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Disel "+disel);
        
        sc.close();
    }
    
}
