package ex2_volumelata;

import java.util.Scanner;

public class Ex2_VolumeLata {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do raio: ");
        double raio = sc.nextDouble();
        
        System.out.println("Entre com o valor da altura: ");
        double altura = sc.nextDouble();
        
        double volume = 3.14159 * Math.pow(raio, 2) * altura;
        
        System.out.println("O volume da lata de óleo é de "+volume);
    }
    
}
