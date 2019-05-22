package estruturadecondicao;

import java.util.Scanner;

public class EstruturaDeCondicao {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Entre com um número inteiro: ");
        int n = sc.nextInt();
        
        if (n % 2 == 0){
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
        
        System.out.println("-------------------------");
        
        System.out.println("Que horas são");
        double horas = sc.nextDouble();
        
        if (horas < 12){
            System.out.println("Bom dia!");
        }
        else if (12 <= 18){
            System.out.println("Boa tarde!");
        }
        else if (horas > 18){
            System.out.println("Boa noite!");
        }
        
        System.out.println("-------------------------");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b && a > c){
            System.out.println("Maior = " + a);
        }
        else if (b > c){
            System.out.println("Maior = " + b);
        }
        else {
            System.out.println("Maior = " + c);
        }
        
        
        sc.close();
    }
}
