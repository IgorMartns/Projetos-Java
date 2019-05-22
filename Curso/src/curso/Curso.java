package curso;

import java.util.Scanner;

public class Curso {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String nome = sc.nextLine();
        String quartos = sc.next();
        double preçoProduto = sc.nextDouble();
        int idade = sc.nextInt();
        double altura = sc.nextDouble();
        
        System.out.println(nome);
        System.out.println(quartos);
        System.out.println(preçoProduto);
        System.out.println(idade);
        System.out.println(altura);
        
        System.out.println("------------------------------");
        
        
    }
    
}
