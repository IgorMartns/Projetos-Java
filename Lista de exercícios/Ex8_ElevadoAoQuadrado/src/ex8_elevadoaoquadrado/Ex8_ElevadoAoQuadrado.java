package ex8_elevadoaoquadrado;

import java.util.Scanner;

public class Ex8_ElevadoAoQuadrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int valor = sc.nextInt();
        
        System.out.println("O valor elevado ao quadrado é: "+Math.pow(valor, 2));
        
    }
    
}
