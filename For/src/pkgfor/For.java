package pkgfor;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos números inteiros você vai entrar: ");
        int n = sc.nextInt();
        
        int soma  = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("Valor #" +i+" : ");
            int x = sc.nextInt();
            soma += x;
        }
        
        System.out.println("Soma = "+soma);
        
        
        sc.close();
    }
    
}
 