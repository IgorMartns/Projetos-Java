package ex1_conversaograus;

import java.util.Scanner;

public class Ex1_ConversaoGraus {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos °C você quer converter?");
        int ceusius = sc.nextInt();
        
        int conversaoC = (ceusius * 9/5) + 32;
        
        System.out.println("A conversão de "+ceusius+"°C para fahrenheit é"
                + " igual á "+conversaoC+"°F");
        
        System.out.println("Quantos °F você quer converter?");
        double fahrenheit = sc.nextDouble();
        
        double conversaoF = (fahrenheit - 32) * 5 / 9; 
        
        System.out.println("A conversão de "+fahrenheit+"°F para ceusius é"
                + " igual á "+conversaoF+"°C");
        
    }
    
}
