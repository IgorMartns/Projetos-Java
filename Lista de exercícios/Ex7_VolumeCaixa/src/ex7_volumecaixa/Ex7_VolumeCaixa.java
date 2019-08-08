package ex7_volumecaixa;

import java.util.Scanner;

public class Ex7_VolumeCaixa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Comprimento da caixa: ");
        double comprimento = sc.nextDouble();
        
        System.out.println("Largura da caixa: ");
        double largura = sc.nextDouble();
        
        System.out.println("Altura da caixa: ");
        double altura = sc.nextDouble();
        
        double volume = comprimento * largura * altura;
        
        System.out.println("O volume total da caixa é: "+volume+"m³ \n");
        
        double conversaoLitros = volume * 1000;
        
        System.out.println("A caixa tem um total de "+conversaoLitros+" litros"
                + " de capacidade");
    }
    
}
