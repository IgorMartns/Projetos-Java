package ex5_trocadevalores;

import java.util.Scanner;

public class Ex5_TrocaDeValores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da primeira variavel: ");
        int a = sc.nextInt();
        
        System.out.println("Valor da sugunda variavel: ");
        int b = sc.nextInt();
        
        System.out.println("Variavel A: "+a);
        System.out.println("Variavel B: "+b);
        
        System.out.println("-----------------------------");
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Variavel A: "+a);
        System.out.println("Variavel B: "+b);
    }
    
}
