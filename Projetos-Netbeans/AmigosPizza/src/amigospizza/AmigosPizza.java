package amigospizza;

import java.util.Scanner;

public class AmigosPizza {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos amigos vão rachar a pizza?");
        int qtdAmigos = sc.nextInt();
        
        System.out.println("Qual o sabor da pizza?");
        String sabor = sc.next();
        
        System.out.println("Qual o valor da pizza?");
        double valor = sc.nextDouble();
        
        double valorDividido = valor / qtdAmigos;
        
        System.out.println("A pizza de "+sabor+" custa R$"+valor+ "e cada um vai pagar R$"+valorDividido);
        
        
        

    }
    
}
