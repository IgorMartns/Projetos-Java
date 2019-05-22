package dowhile;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        char resp;
        do {
        System.out.println("Digite um número");
        double n = sc.nextDouble();
        double sq = Math.sqrt(n);
        System.out.printf("Raiz quadrada = %.3f%n", sq);
        
            System.out.println("Repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        
        
        
        sc.close();
    }
    
}
